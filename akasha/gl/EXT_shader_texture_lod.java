package akasha.gl;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EXT_shader_texture_lod extension is part of the WebGL API and adds additional texture functions to the OpenGL ES Shading Language which provide the shader writer with explicit control of LOD (Level of detail).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EXT_shader_texture_lod">EXT_shader_texture_lod - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/EXT_shader_texture_lod/">WebGL EXT_shader_texture_lod Khronos Ratified Extension Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EXT_shader_texture_lod"
)
public class EXT_shader_texture_lod extends JsObject implements WebGL1Extension {
  @JsOverlay
  public static final String NAME = "EXT_shader_texture_lod";

  protected EXT_shader_texture_lod() {
  }
}
