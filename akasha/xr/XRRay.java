package akasha.xr;

import akasha.DOMPointInit;
import akasha.DOMPointReadOnly;
import akasha.core.Float32Array;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRRay interface of the WebXR Device API is a geometric ray described by an origin point and a direction vector.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRay">XRRay - MDN</a>
 * @see <a href="https://immersive-web.github.io/hit-test/#xrray-interface"># xrray-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRRay"
)
public class XRRay extends JsObject {
  public XRRay(@Nonnull final DOMPointInit origin, @Nonnull final XRRayDirectionInit direction) {
  }

  public XRRay(@Nonnull final DOMPointInit origin) {
  }

  public XRRay() {
  }

  public XRRay(@Nonnull final XRRigidTransform transform) {
  }

  @JsProperty(
      name = "direction"
  )
  @Nonnull
  public native DOMPointReadOnly direction();

  @JsProperty(
      name = "matrix"
  )
  @Nonnull
  public native Float32Array matrix();

  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native DOMPointReadOnly origin();
}
