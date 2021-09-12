package akasha.codecs;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AlphaOption.class
)
public @interface AlphaOption {
  @Nonnull
  String discard = "discard";

  @Nonnull
  String keep = "keep";

  final class Util {
    private Util() {
    }

    @AlphaOption
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AlphaOption.discard.equals( value ) || AlphaOption.keep.equals( value );
    }
  }
}
