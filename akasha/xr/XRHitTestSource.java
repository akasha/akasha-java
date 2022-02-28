package akasha.xr;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XRHitTestSource interface of the WebXR Device API handles hit test subscriptions. You can get an XRHitTestSource object by using the XRSession.requestHitTestSource() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRHitTestSource">XRHitTestSource - MDN</a>
 * @see <a href="https://immersive-web.github.io/hit-test/#hit-test-source-interface"># hit-test-source-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRHitTestSource"
)
public class XRHitTestSource extends JsObject {
  protected XRHitTestSource() {
  }

  public native void cancel();
}
