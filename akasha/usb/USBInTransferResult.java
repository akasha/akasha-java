package akasha.usb;

import akasha.core.DataView;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The USBInTransferResult interface of the WebUSB API provides the result from a call to the transferIn() and controlTransferIn() methods of the USBDevice interface. It represents the result from requesting a transfer of data from the USB device to the USB host.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBInTransferResult">USBInTransferResult - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#usbintransferresult"># usbintransferresult</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBInTransferResult"
)
public class USBInTransferResult extends JsObject {
  public USBInTransferResult(@USBTransferStatus @Nonnull final String status,
      @Nullable final DataView data) {
  }

  public USBInTransferResult(@USBTransferStatus @Nonnull final String status) {
  }

  @JsProperty(
      name = "data"
  )
  @Nullable
  public native DataView data();

  @JsProperty(
      name = "status"
  )
  @Nonnull
  @USBTransferStatus
  public native String status();
}
