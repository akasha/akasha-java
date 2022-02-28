package akasha.xr;

import akasha.DOMPointReadOnly;
import akasha.core.Float32Array;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRLightEstimate interface of the WebXR Device API provides the estimated lighting values for an XRLightProbe at the time represented by an XRFrame.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRLightEstimate">XRLightEstimate - MDN</a>
 * @see <a href="https://immersive-web.github.io/lighting-estimation/#xrlightestimate-interface"># xrlightestimate-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRLightEstimate"
)
public class XRLightEstimate extends JsObject {
  protected XRLightEstimate() {
  }

  @JsProperty(
      name = "primaryLightDirection"
  )
  @Nonnull
  public native DOMPointReadOnly primaryLightDirection();

  @JsProperty(
      name = "primaryLightIntensity"
  )
  @Nonnull
  public native DOMPointReadOnly primaryLightIntensity();

  @JsProperty(
      name = "sphericalHarmonicsCoefficients"
  )
  @Nonnull
  public native Float32Array sphericalHarmonicsCoefficients();
}
