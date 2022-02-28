package akasha.xr;

import akasha.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRCPUDepthInformation interface contains depth information from the CPU (returned by XRFrame.getDepthInformation()).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRCPUDepthInformation">XRCPUDepthInformation - MDN</a>
 * @see <a href="https://immersive-web.github.io/depth-sensing/#xr-cpu-depth-info-section"># xr-cpu-depth-info-section</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRCPUDepthInformation"
)
public class XRCPUDepthInformation extends XRDepthInformation {
  protected XRCPUDepthInformation() {
  }

  @JsProperty(
      name = "data"
  )
  @Nonnull
  public native ArrayBuffer data();

  public native float getDepthInMeters(float x, float y);
}
