package akasha.usb;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The USBIsochronousOutTransferPacket interface of the WebUSB API is part of the response from a call to the isochronousTransferOut() method of the USBDevice interface. It represents the status of an individual packet from a request to transfer data from the USB host to the USB device over an isochronous endpoint.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBIsochronousOutTransferPacket">USBIsochronousOutTransferPacket - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#usbisochronousouttransferpacket"># usbisochronousouttransferpacket</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBIsochronousOutTransferPacket"
)
public class USBIsochronousOutTransferPacket extends JsObject {
  public USBIsochronousOutTransferPacket(@USBTransferStatus @Nonnull final String status,
      final int bytesWritten) {
  }

  public USBIsochronousOutTransferPacket(@USBTransferStatus @Nonnull final String status) {
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
