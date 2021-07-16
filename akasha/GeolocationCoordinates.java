package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GeolocationCoordinates interface represents the position and altitude of the device on Earth, as well as the accuracy with which these properties are calculated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GeolocationCoordinates">GeolocationCoordinates - MDN</a>
 * @see <a href="https://w3c.github.io/geolocation-api/#coordinates_interface"># coordinates_interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GeolocationCoordinates"
)
public class GeolocationCoordinates extends JsObject {
  protected GeolocationCoordinates() {
  }

  @JsProperty(
      name = "accuracy"
  )
  public native double accuracy();

  @JsProperty(
      name = "altitude"
  )
  @Nullable
  public native Double altitude();

  @JsProperty(
      name = "altitudeAccuracy"
  )
  @Nullable
  public native Double altitudeAccuracy();

  @JsProperty(
      name = "heading"
  )
  @Nullable
  public native Double heading();

  @JsProperty(
      name = "latitude"
  )
  public native double latitude();

  @JsProperty(
      name = "longitude"
  )
  public native double longitude();

  @JsProperty(
      name = "speed"
  )
  @Nullable
  public native Double speed();
}
