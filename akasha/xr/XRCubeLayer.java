package akasha.xr;

import akasha.DOMPointReadOnly;
import akasha.EventHandler;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XRCubeLayer interface of the WebXR Device API is a layer that renders directly from a cubemap and projects it onto the inside faces of a cube.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRCubeLayer">XRCubeLayer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRCubeLayer"
)
public class XRCubeLayer extends XRCompositionLayer {
  @JsNullable
  public EventHandler onredraw;

  @JsNonNull
  public DOMPointReadOnly orientation;

  @JsNonNull
  public XRSpace space;

  protected XRCubeLayer() {
  }
}
