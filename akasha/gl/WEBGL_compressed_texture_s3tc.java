package akasha.gl;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_compressed_texture_s3tc extension is part of the WebGL API and exposes four S3TC compressed texture formats.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_compressed_texture_s3tc">WEBGL_compressed_texture_s3tc - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_s3tc/">WebGL WEBGL_compressed_texture_s3tc Khronos Ratified Extension Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WEBGL_compressed_texture_s3tc"
)
public class WEBGL_compressed_texture_s3tc extends JsObject implements WebGLCommonExtension {
  @JsOverlay
  public static final int COMPRESSED_RGBA_S3TC_DXT1_EXT = 0x83F1;

  @JsOverlay
  public static final int COMPRESSED_RGBA_S3TC_DXT3_EXT = 0x83F2;

  @JsOverlay
  public static final int COMPRESSED_RGBA_S3TC_DXT5_EXT = 0x83F3;

  @JsOverlay
  public static final int COMPRESSED_RGB_S3TC_DXT1_EXT = 0x83F0;

  @JsOverlay
  public static final String NAME = "WEBGL_compressed_texture_s3tc";

  protected WEBGL_compressed_texture_s3tc() {
  }
}
