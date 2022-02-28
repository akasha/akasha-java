package akasha.xr;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XRTransientInputHitTestSource interface of the WebXR Device API handles transient input hit test subscriptions. You can get an XRTransientInputHitTestSource object by calling the XRSession.requestHitTestSourceForTransientInput().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRTransientInputHitTestSource">XRTransientInputHitTestSource - MDN</a>
 * @see <a href="https://immersive-web.github.io/hit-test/#transient-input-hit-test-source-interface"># transient-input-hit-test-source-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRTransientInputHitTestSource"
)
public class XRTransientInputHitTestSource extends JsObject {
  protected XRTransientInputHitTestSource() {
  }

  public native void cancel();
}
