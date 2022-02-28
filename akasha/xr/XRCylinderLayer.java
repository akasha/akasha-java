package akasha.xr;

import akasha.EventHandler;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XRCylinderLayer interface of the WebXR Device API is a layer that takes up a curved rectangular space in the virtual environment. Only the front of the layer is visible.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRCylinderLayer">XRCylinderLayer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRCylinderLayer"
)
public class XRCylinderLayer extends XRCompositionLayer {
  public float aspectRatio;

  public float centralAngle;

  @JsNullable
  public EventHandler onredraw;

  public float radius;

  @JsNonNull
  public XRSpace space;

  @JsNonNull
  public XRRigidTransform transform;

  protected XRCylinderLayer() {
  }
}
