package akasha.usb;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The USBAlternateInterface interface of the WebUSB API provides information about a particular configuration of an interface provided by the USB device. An interface includes one or more alternate settings which can configure a set of endpoints based on the operating mode of the device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBAlternateInterface">USBAlternateInterface - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#usbalternateinterface"># usbalternateinterface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBAlternateInterface"
)
public class USBAlternateInterface extends JsObject {
  public USBAlternateInterface(@Nonnull final USBInterface deviceInterface,
      final short alternateSetting) {
  }

  @JsProperty(
      name = "alternateSetting"
  )
  public native short alternateSetting();

  @JsProperty(
      name = "endpoints"
  )
  @Nonnull
  public native JsArray<USBEndpoint> endpoints();

  @JsProperty(
      name = "interfaceClass"
  )
  public native short interfaceClass();

  @JsProperty(
      name = "interfaceName"
  )
  @Nullable
  public native String interfaceName();

  @JsProperty(
      name = "interfaceProtocol"
  )
  public native short interfaceProtocol();

  @JsProperty(
      name = "interfaceSubclass"
  )
  public native short interfaceSubclass();
}
