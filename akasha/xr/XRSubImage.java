package akasha.xr;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRSubImage interface of the WebXR Device API represents what viewport of the GPU texture to use for rendering.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSubImage">XRSubImage - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRSubImage"
)
public class XRSubImage extends JsObject {
  protected XRSubImage() {
  }

  @JsProperty(
      name = "viewport"
  )
  @Nonnull
  public native XRViewport viewport();
}
