package akasha.usb;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The USBInterface interface of the WebUSB API provides information about an interface provided by the USB device. An interface represents a feature of the device which implements a particular protocol and may contain endpoints for bidirectional communication.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBInterface">USBInterface - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#usbinterface"># usbinterface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBInterface"
)
public class USBInterface extends JsObject {
  public USBInterface(@Nonnull final USBConfiguration configuration, final short interfaceNumber) {
  }

  @JsProperty(
      name = "alternate"
  )
  @Nonnull
  public native USBAlternateInterface alternate();

  @JsProperty(
      name = "alternates"
  )
  @Nonnull
  public native JsArray<USBAlternateInterface> alternates();

  @JsProperty(
      name = "claimed"
  )
  public native boolean claimed();

  @JsProperty(
      name = "interfaceNumber"
  )
  public native short interfaceNumber();
}
