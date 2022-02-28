package akasha.xr;

import akasha.EventHandler;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XREquirectLayer interface of the WebXR Device API is a layer that maps equirectangular coded data onto the inside of a sphere.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XREquirectLayer">XREquirectLayer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XREquirectLayer"
)
public class XREquirectLayer extends XRCompositionLayer {
  public float centralHorizontalAngle;

  public float lowerVerticalAngle;

  @JsNullable
  public EventHandler onredraw;

  public float radius;

  @JsNonNull
  public XRSpace space;

  @JsNonNull
  public XRRigidTransform transform;

  public float upperVerticalAngle;

  protected XREquirectLayer() {
  }
}
