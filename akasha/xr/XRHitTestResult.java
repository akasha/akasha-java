package akasha.xr;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The XRHitTestResult interface of the WebXR Device API contains a single result of a hit test. You can get an array of XRHitTestResult objects for a frame by calling XRFrame.getHitTestResults().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRHitTestResult">XRHitTestResult - MDN</a>
 * @see <a href="https://immersive-web.github.io/hit-test/#xr-hit-test-result-interface"># xr-hit-test-result-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRHitTestResult"
)
public class XRHitTestResult extends JsObject {
  protected XRHitTestResult() {
  }

  @JsNullable
  public native XRPose getPose(@Nonnull XRSpace baseSpace);

  @JsOverlay
  public final boolean isCreateAnchorSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRHitTestResult_createAnchor__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRHitTestResult_createAnchor__supported" ) ) ? false : Js.asPropertyMap( this ).has( "createAnchor" );
  }

  @JsNonNull
  public native Promise<XRAnchor> createAnchor();
}
