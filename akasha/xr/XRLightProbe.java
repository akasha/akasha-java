package akasha.xr;

import akasha.EventHandler;
import akasha.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRLightProbe interface of the WebXR Device API contains lighting information at a given point in the user's environment. You can get an XRLighting object using the XRSession.requestLightProbe() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRLightProbe">XRLightProbe - MDN</a>
 * @see <a href="https://immersive-web.github.io/lighting-estimation/#xrlightprobe-interface"># xrlightprobe-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRLightProbe"
)
public class XRLightProbe extends EventTarget {
  @JsNullable
  public EventHandler onreflectionchange;

  protected XRLightProbe() {
  }

  @JsProperty(
      name = "probeSpace"
  )
  @Nonnull
  public native XRSpace probeSpace();
}
