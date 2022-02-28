package akasha.xr;

import akasha.EventHandler;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XRQuadLayer interface of the WebXR Device API is a layer that takes up a flat rectangular space in the virtual environment. An XRQuadLayer has no thickness. It is a two-dimensional object positioned and oriented in 3D space. The position of a quad refers to the center of the quad. Only the front of the layer is visible.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRQuadLayer">XRQuadLayer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRQuadLayer"
)
public class XRQuadLayer extends XRCompositionLayer {
  public float height;

  @JsNullable
  public EventHandler onredraw;

  @JsNonNull
  public XRSpace space;

  @JsNonNull
  public XRRigidTransform transform;

  public float width;

  protected XRQuadLayer() {
  }
}
