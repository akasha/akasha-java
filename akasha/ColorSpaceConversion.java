package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ColorSpaceConversion.class
)
public @interface ColorSpaceConversion {
  @Nonnull
  String default_ = "default";

  @Nonnull
  String none = "none";

  final class Util {
    private Util() {
    }

    @ColorSpaceConversion
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ColorSpaceConversion.default_.equals( value ) || ColorSpaceConversion.none.equals( value );
    }
  }
}
