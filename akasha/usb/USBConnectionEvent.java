package akasha.usb;

import akasha.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The USBConnectionEvent interface of the WebUSB API is the event type passed to USB.onconnect and USB.ondisconnect when the user agent detects that a new USB device has been connected or disconnected.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBConnectionEvent">USBConnectionEvent - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#usbconnectionevent"># usbconnectionevent</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBConnectionEvent"
)
public class USBConnectionEvent extends Event {
  public USBConnectionEvent(@Nonnull final String type,
      @Nonnull final USBConnectionEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "device"
  )
  @Nonnull
  public native USBDevice device();
}
