package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ReadableStreamReaderMode.class
)
public @interface ReadableStreamReaderMode {
  @Nonnull
  String byob = "byob";

  final class Util {
    private Util() {
    }

    @ReadableStreamReaderMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ReadableStreamReaderMode.byob.equals( value );
    }
  }
}
