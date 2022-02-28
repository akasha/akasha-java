package akasha.xr;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRTransientInputHitTestResult interface of the WebXR Device API contains an array of results of a hit test for transient input, grouped by input source.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRTransientInputHitTestResult">XRTransientInputHitTestResult - MDN</a>
 * @see <a href="https://immersive-web.github.io/hit-test/#xr-transient-input-hit-test-result-interface"># xr-transient-input-hit-test-result-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRTransientInputHitTestResult"
)
public class XRTransientInputHitTestResult extends JsObject {
  protected XRTransientInputHitTestResult() {
  }

  @JsProperty(
      name = "inputSource"
  )
  @Nonnull
  public native XRInputSource inputSource();

  @JsProperty(
      name = "results"
  )
  @Nonnull
  public native JsArray<XRHitTestResult> results();
}
