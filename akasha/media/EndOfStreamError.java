package akasha.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = EndOfStreamError.class
)
public @interface EndOfStreamError {
  @Nonnull
  String decode = "decode";

  @Nonnull
  String network = "network";

  final class Util {
    private Util() {
    }

    @EndOfStreamError
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return EndOfStreamError.decode.equals( value ) || EndOfStreamError.network.equals( value );
    }
  }
}
