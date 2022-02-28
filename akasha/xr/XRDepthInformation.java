package akasha.xr;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRDepthInformation interface contains information about the distance from the user's device to the real-world geometry in the user's environment.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRDepthInformation">XRDepthInformation - MDN</a>
 * @see <a href="https://immersive-web.github.io/depth-sensing/#xrdepthinformation"># xrdepthinformation</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRDepthInformation"
)
public class XRDepthInformation extends JsObject {
  protected XRDepthInformation() {
  }

  @JsProperty(
      name = "height"
  )
  public native int height();

  @JsProperty(
      name = "normDepthBufferFromNormView"
  )
  @Nonnull
  public native XRRigidTransform normDepthBufferFromNormView();

  @JsProperty(
      name = "rawValueToMeters"
  )
  public native float rawValueToMeters();

  @JsProperty(
      name = "width"
  )
  public native int width();
}
