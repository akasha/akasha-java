package akasha.usb;

import akasha.EventHandler;
import akasha.EventTarget;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The USB interface of the WebUSB API provides attributes and methods for finding and connecting USB devices from a web page.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USB">USB - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#usb"># usb</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USB"
)
public class USB extends EventTarget {
  @JsNullable
  public EventHandler onconnect;

  @JsNullable
  public EventHandler ondisconnect;

  protected USB() {
  }

  @JsNonNull
  public native Promise<JsArray<USBDevice>> getDevices();

  @JsNonNull
  public native Promise<USBDevice> requestDevice(@Nonnull USBDeviceRequestOptions options);
}
