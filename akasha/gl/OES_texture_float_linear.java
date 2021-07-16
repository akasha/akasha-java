package akasha.gl;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The OES_texture_float_linear extension is part of the WebGL API and allows linear filtering with floating-point pixel types for textures.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OES_texture_float_linear">OES_texture_float_linear - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/OES_texture_float_linear/">(WebGL OES_texture_float_linear Khronos Ratified Extension)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OES_texture_float_linear"
)
public class OES_texture_float_linear extends JsObject implements WebGLCommonExtension {
  @JsOverlay
  public static final String NAME = "OES_texture_float_linear";

  protected OES_texture_float_linear() {
  }
}
