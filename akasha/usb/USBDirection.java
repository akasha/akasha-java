package akasha.usb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = USBDirection.class
)
public @interface USBDirection {
  @Nonnull
  String in = "in";

  @Nonnull
  String out = "out";

  final class Util {
    private Util() {
    }

    @USBDirection
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return USBDirection.in.equals( value ) || USBDirection.out.equals( value );
    }
  }
}
