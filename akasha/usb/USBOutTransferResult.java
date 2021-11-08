package akasha.usb;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The USBOutTransferResult interface of the WebUSB API provides the result from a call to the transferOut() and controlTransferOut() methods of the USBDevice interface. It represents the result from requesting a transfer of data from the USB host to the USB device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBOutTransferResult">USBOutTransferResult - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#usbouttransferresult"># usbouttransferresult</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBOutTransferResult"
)
public class USBOutTransferResult extends JsObject {
  public USBOutTransferResult(@USBTransferStatus @Nonnull final String status,
      final int bytesWritten) {
  }

  public USBOutTransferResult(@USBTransferStatus @Nonnull final String status) {
  }

  @JsProperty(
      name = "bytesWritten"
  )
  public native int bytesWritten();

  @JsProperty(
      name = "status"
  )
  @Nonnull
  @USBTransferStatus
  public native String status();
}
