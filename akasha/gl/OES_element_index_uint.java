package akasha.gl;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The OES_element_index_uint extension is part of the WebGL API and adds support for gl.UNSIGNED_INT types to WebGLRenderingContext.drawElements().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OES_element_index_uint">OES_element_index_uint - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/OES_element_index_uint/">WebGL OES_element_index_uint Khronos Ratified Extension Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OES_element_index_uint"
)
public class OES_element_index_uint extends JsObject implements WebGL1Extension {
  @JsOverlay
  public static final String NAME = "OES_element_index_uint";

  protected OES_element_index_uint() {
  }
}
