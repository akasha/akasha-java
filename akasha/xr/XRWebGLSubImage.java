package akasha.xr;

import akasha.gl.WebGLTexture;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRWebGLSubImage interface is used during rendering of WebGL layers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLSubImage">XRWebGLSubImage - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRWebGLSubImage"
)
public class XRWebGLSubImage extends XRSubImage {
  protected XRWebGLSubImage() {
  }

  @JsProperty(
      name = "colorTexture"
  )
  @Nonnull
  public native WebGLTexture colorTexture();

  @JsProperty(
      name = "depthStencilTexture"
  )
  @Nullable
  public native WebGLTexture depthStencilTexture();

  @JsProperty(
      name = "imageIndex"
  )
  @Nullable
  public native Double imageIndex();

  @JsProperty(
      name = "textureHeight"
  )
  public native int textureHeight();

  @JsProperty(
      name = "textureWidth"
  )
  public native int textureWidth();
}
