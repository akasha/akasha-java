package akasha.usb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = USBTransferStatus.class
)
public @interface USBTransferStatus {
  @Nonnull
  String babble = "babble";

  @Nonnull
  String ok = "ok";

  @Nonnull
  String stall = "stall";

  final class Util {
    private Util() {
    }

    @USBTransferStatus
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return USBTransferStatus.babble.equals( value ) || USBTransferStatus.ok.equals( value ) || USBTransferStatus.stall.equals( value );
    }
  }
}
