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
 * The USBConfiguration interface of the WebUSB API provides information about a particular configuration of a USB device and the interfaces that it supports.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBConfiguration">USBConfiguration - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#configurations"># configurations</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBConfiguration"
)
public class USBConfiguration extends JsObject {
  public USBConfiguration(@Nonnull final USBDevice device, final short configurationValue) {
  }

  @JsProperty(
      name = "configurationName"
  )
  @Nullable
  public native String configurationName();

  @JsProperty(
      name = "configurationValue"
  )
  public native short configurationValue();

  @JsProperty(
      name = "interfaces"
  )
  @Nonnull
  public native JsArray<USBInterface> interfaces();
}
