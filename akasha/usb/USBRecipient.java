package akasha.usb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = USBRecipient.class
)
public @interface USBRecipient {
  @Nonnull
  String device = "device";

  @Nonnull
  String endpoint = "endpoint";

  @Nonnull
  String interface_ = "interface";

  @Nonnull
  String other = "other";

  final class Util {
    private Util() {
    }

    @USBRecipient
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return USBRecipient.device.equals( value ) || USBRecipient.endpoint.equals( value ) || USBRecipient.interface_.equals( value ) || USBRecipient.other.equals( value );
    }
  }
}
