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
 * The USBIsochronousInTransferPacket interface of the WebUSB API is part of the response from a call to the isochronousTransferIn() method of the USBDevice interface. It represents the status of an individual packet from a request to transfer data from the USB device to the USB host over an isochronous endpoint.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBIsochronousInTransferPacket">USBIsochronousInTransferPacket - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#usbisochronousintransferpacket"># usbisochronousintransferpacket</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBIsochronousInTransferPacket"
)
public class USBIsochronousInTransferPacket extends JsObject {
  public USBIsochronousInTransferPacket(@USBTransferStatus @Nonnull final String status,
      @Nullable final DataView data) {
  }

  public USBIsochronousInTransferPacket(@USBTransferStatus @Nonnull final String status) {
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
