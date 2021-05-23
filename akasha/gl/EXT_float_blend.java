package akasha.gl;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WebGL API's EXT_float_blend extension allows blending and draw buffers with 32-bit floating-point components.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EXT_float_blend">EXT_float_blend - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/EXT_float_blend/">EXT_float_blend</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EXT_float_blend"
)
public class EXT_float_blend extends JsObject implements WebGLCommonExtension {
  @JsOverlay
  public static final String NAME = "EXT_float_blend";

  protected EXT_float_blend() {
  }
}
