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
    valuesFromClass = GPUFrontFace.class
)
public @interface GPUFrontFace {
  @Nonnull
  String ccw = "ccw";

  @Nonnull
  String cw = "cw";

  final class Util {
    private Util() {
    }

    @GPUFrontFace
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUFrontFace.ccw.equals( value ) || GPUFrontFace.cw.equals( value );
    }
  }
}
