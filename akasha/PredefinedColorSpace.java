package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PredefinedColorSpace.class
)
public @interface PredefinedColorSpace {
  @Nonnull
  String display_p3 = "display-p3";

  @Nonnull
  String srgb = "srgb";

  final class Util {
    private Util() {
    }

    @PredefinedColorSpace
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PredefinedColorSpace.display_p3.equals( value ) || PredefinedColorSpace.srgb.equals( value );
    }
  }
}
