package akasha.xr;

import akasha.EventTarget;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XRLayer interface of the WebXR Device API is the base class for WebXR layer types. It inherits methods from EventTarget.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRLayer">XRLayer - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrlayer-interface"># xrlayer-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRLayer"
)
public class XRLayer extends EventTarget {
  protected XRLayer() {
  }
}
