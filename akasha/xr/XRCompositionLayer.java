package akasha.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRCompositionLayer interface of the WebXR Device API is a base class that defines a set of common properties and behaviors for WebXR layer types. It is not constructable on its own.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRCompositionLayer">XRCompositionLayer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRCompositionLayer"
)
public class XRCompositionLayer extends XRLayer {
  public boolean blendTextureSourceAlpha;

  @JsNullable
  public Boolean chromaticAberrationCorrection;

  protected XRCompositionLayer() {
  }

  @JsProperty(
      name = "layout"
  )
  @Nonnull
  @XRLayerLayout
  public native String layout();

  @JsProperty(
      name = "mipLevels"
  )
  public native int mipLevels();

  @JsProperty(
      name = "needsRedraw"
  )
  public native boolean needsRedraw();

  public native void destroy();
}
