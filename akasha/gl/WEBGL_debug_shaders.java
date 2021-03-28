package akasha.gl;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_debug_shaders extension is part of the WebGL API and exposes a method to debug shaders from privileged contexts.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_debug_shaders">WEBGL_debug_shaders - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_debug_shaders/">WEBGL_debug_shaders - WEBGL_debug_shaders</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class WEBGL_debug_shaders implements WebGLCommonExtension {
  @JsOverlay
  public static final String NAME = "WEBGL_debug_shaders";

  protected WEBGL_debug_shaders() {
  }

  /**
   * The WEBGL_debug_shaders.getTranslatedShaderSource() method is part of the WebGL API and allows you to debug a translated shader.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_debug_shaders/getTranslatedShaderSource">WEBGL_debug_shaders.getTranslatedShaderSource - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_debug_shaders/">WEBGL_debug_shaders.getTranslatedShaderSource - WEBGL_debug_shaders</a>
   */
  @Nonnull
  public native String getTranslatedShaderSource(@Nonnull WebGLShader shader);
}
