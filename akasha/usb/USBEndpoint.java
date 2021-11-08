package akasha.usb;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The USBEndpoint interface of the WebUSB API provides information about an endpoint provided by the USB device. An endpoint represents a unidirectional data stream into or out of a device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBEndpoint">USBEndpoint - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#endpoints"># endpoints</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBEndpoint"
)
public class USBEndpoint extends JsObject {
  public USBEndpoint(@Nonnull final USBAlternateInterface alternate, final short endpointNumber,
      @USBDirection @Nonnull final String direction) {
  }

  @JsProperty(
      name = "direction"
  )
  @Nonnull
  @USBDirection
  public native String direction();

  @JsProperty(
      name = "endpointNumber"
  )
  public native short endpointNumber();

  @JsProperty(
      name = "packetSize"
  )
  public native int packetSize();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  @USBEndpointType
  public native String type();
}
