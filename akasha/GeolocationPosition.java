package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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
