package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@Documented
@MagicConstant(
    valuesFromClass = GPUTextureAspect.class
)
public @interface GPUTextureAspect {
  @Nonnull
  String all = "all";

  @Nonnull
  String depth_only = "depth-only";

  @Nonnull
  String stencil_only = "stencil-only";

  final class Util {
    private Util() {
    }

    @GPUTextureAspect
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUTextureAspect.all.equals( value ) || GPUTextureAspect.depth_only.equals( value ) || GPUTextureAspect.stencil_only.equals( value );
    }
  }
}
