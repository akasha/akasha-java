package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AuthenticatorTransport.class
)
public @interface AuthenticatorTransport {
  @Nonnull
  String ble = "ble";

  @Nonnull
  String internal = "internal";

  @Nonnull
  String nfc = "nfc";

  @Nonnull
  String usb = "usb";

  final class Util {
    private Util() {
    }

    @AuthenticatorTransport
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AuthenticatorTransport.ble.equals( value ) || AuthenticatorTransport.internal.equals( value ) || AuthenticatorTransport.nfc.equals( value ) || AuthenticatorTransport.usb.equals( value );
    }
  }
}
