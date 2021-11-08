package akasha.usb;

import akasha.core.DataView;
import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The USBIsochronousInTransferResult interface of the WebUSB API provides the result from a call to the isochronousTransferIn() method of the USBDevice interface. It represents the result from requesting a transfer of data from the USB device to the USB host.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBIsochronousInTransferResult">USBIsochronousInTransferResult - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#usbisochronousintransferresult"># usbisochronousintransferresult</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBIsochronousInTransferResult"
)
public class USBIsochronousInTransferResult extends JsObject {
  public USBIsochronousInTransferResult(
      @Nonnull final JsArray<USBIsochronousInTransferPacket> packets,
      @Nullable final DataView data) {
  }

  public USBIsochronousInTransferResult(@Nonnull final USBIsochronousInTransferPacket[] packets,
      @Nullable final DataView data) {
  }

  public USBIsochronousInTransferResult(
      @Nonnull final JsArray<USBIsochronousInTransferPacket> packets) {
  }

  public USBIsochronousInTransferResult(@Nonnull final USBIsochronousInTransferPacket[] packets) {
  }

  @JsProperty(
      name = "data"
  )
  @Nullable
  public native DataView data();

  @JsProperty(
      name = "packets"
  )
  @Nonnull
  public native JsArray<USBIsochronousInTransferPacket> packets();
}
