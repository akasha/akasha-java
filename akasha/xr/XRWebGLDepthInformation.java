package akasha.xr;

import akasha.gl.WebGLTexture;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRWebGLDepthInformation interface contains depth information from the GPU/WebGL (returned by XRWebGLBinding.getDepthInformation()).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLDepthInformation">XRWebGLDepthInformation - MDN</a>
 * @see <a href="https://immersive-web.github.io/depth-sensing/#xrwebgldepthinformation"># xrwebgldepthinformation</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRWebGLDepthInformation"
)
public class XRWebGLDepthInformation extends XRDepthInformation {
  protected XRWebGLDepthInformation() {
  }

  @JsProperty(
      name = "texture"
  )
  @Nonnull
  public native WebGLTexture texture();
}
