package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUPredefinedColorSpace.class
)
public @interface GPUPredefinedColorSpace {
  @Nonnull
  String srgb = "srgb";

  final class Util {
    private Util() {
    }

    @GPUPredefinedColorSpace
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUPredefinedColorSpace.srgb.equals( value );
    }
  }
}
