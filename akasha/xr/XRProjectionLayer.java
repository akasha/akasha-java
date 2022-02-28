package akasha.xr;

import javax.annotation.Generated;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRProjectionLayer interface of the WebXR Device API is a layer that fills the entire view of the observer and is refreshed close to the device's native frame rate.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRProjectionLayer">XRProjectionLayer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRProjectionLayer"
)
public class XRProjectionLayer extends XRCompositionLayer {
  @JsNullable
  public Double fixedFoveation;

  protected XRProjectionLayer() {
  }

  @JsProperty(
      name = "ignoreDepthValues"
  )
  public native boolean ignoreDepthValues();

  @JsProperty(
      name = "textureArrayLength"
  )
  public native int textureArrayLength();

  @JsProperty(
      name = "textureHeight"
  )
  public native int textureHeight();

  @JsProperty(
      name = "textureWidth"
  )
  public native int textureWidth();
}
