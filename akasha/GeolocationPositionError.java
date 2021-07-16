package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GeolocationPositionError interface represents the reason of an error occurring when using the geolocating device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GeolocationPositionError">GeolocationPositionError - MDN</a>
 * @see <a href="https://w3c.github.io/geolocation-api/#position_error_interface"># position_error_interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GeolocationPositionError"
)
public class GeolocationPositionError extends JsObject {
  @JsOverlay
  public static final int PERMISSION_DENIED = 1;

  @JsOverlay
  public static final int POSITION_UNAVAILABLE = 2;

  @JsOverlay
  public static final int TIMEOUT = 3;

  protected GeolocationPositionError() {
  }

  @JsProperty(
      name = "code"
  )
  @GeolocationPositionErrorCode
  public native int code();

  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();
}
