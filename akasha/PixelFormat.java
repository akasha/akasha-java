package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PixelFormat.class
)
public @interface PixelFormat {
  @Nonnull
  String I420 = "I420";

  final class Util {
    private Util() {
    }

    @PixelFormat
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PixelFormat.I420.equals( value );
    }
  }
}
