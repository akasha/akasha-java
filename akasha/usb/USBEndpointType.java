package akasha.usb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = USBEndpointType.class
)
public @interface USBEndpointType {
  @Nonnull
  String bulk = "bulk";

  @Nonnull
  String interrupt = "interrupt";

  @Nonnull
  String isochronous = "isochronous";

  final class Util {
    private Util() {
    }

    @USBEndpointType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return USBEndpointType.bulk.equals( value ) || USBEndpointType.interrupt.equals( value ) || USBEndpointType.isochronous.equals( value );
    }
  }
}
