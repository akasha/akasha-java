package akasha.usb;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The USBIsochronousOutTransferResult interface of the WebUSB API provides the result from a call to the isochronousTransferOut() method of the USBDevice interface. It represents the result from requesting a transfer of data from the USB host to the USB device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBIsochronousOutTransferResult">USBIsochronousOutTransferResult - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#usbisochronousouttransferresult"># usbisochronousouttransferresult</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBIsochronousOutTransferResult"
)
public class USBIsochronousOutTransferResult extends JsObject {
  public USBIsochronousOutTransferResult(
      @Nonnull final JsArray<USBIsochronousOutTransferPacket> packets) {
  }

  public USBIsochronousOutTransferResult(@Nonnull final USBIsochronousOutTransferPacket[] packets) {
  }

  @JsProperty(
      name = "packets"
  )
  @Nonnull
  public native JsArray<USBIsochronousOutTransferPacket> packets();
}
