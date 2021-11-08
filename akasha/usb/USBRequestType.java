package akasha.usb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = USBRequestType.class
)
public @interface USBRequestType {
  @Nonnull
  String class_ = "class";

  @Nonnull
  String standard = "standard";

  @Nonnull
  String vendor = "vendor";

  final class Util {
    private Util() {
    }

    @USBRequestType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return USBRequestType.class_.equals( value ) || USBRequestType.standard.equals( value ) || USBRequestType.vendor.equals( value );
    }
  }
}
