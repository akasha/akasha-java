package akasha.gl;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_depth_texture extension is part of the WebGL API and defines 2D depth and depth-stencil textures.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_depth_texture">WEBGL_depth_texture - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_depth_texture/">WebGL WEBGL_depth_texture Khronos Ratified Extension Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WEBGL_depth_texture"
)
public class WEBGL_depth_texture extends JsObject implements WebGLCommonExtension {
  @JsOverlay
  public static final String NAME = "WEBGL_depth_texture";

  @JsOverlay
  public static final int UNSIGNED_INT_24_8_WEBGL = 0x84FA;

  protected WEBGL_depth_texture() {
  }
}
