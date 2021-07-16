package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GeolocationPosition interface represents the position of the concerned device at a given time. The position, represented by a GeolocationCoordinates object, comprehends the 2D position of the device, on a spheroid representing the Earth, but also its altitude and its speed.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GeolocationPosition">GeolocationPosition - MDN</a>
 * @see <a href="https://w3c.github.io/geolocation-api/#position_interface"># position_interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GeolocationPosition"
)
public class GeolocationPosition extends JsObject {
  protected GeolocationPosition() {
  }

  @JsProperty(
      name = "coords"
  )
  @Nonnull
  public native GeolocationCoordinates coords();

  @JsProperty(
      name = "timestamp"
  )
  public native int timestamp();
}
