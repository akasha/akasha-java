package akasha.gl;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EXT_frag_depth extension is part of the WebGL API and enables to set a depth value of a fragment from within the fragment shader.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EXT_frag_depth">EXT_frag_depth - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/EXT_frag_depth/">WebGL EXT_frag_depth Khronos Ratified Extension Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EXT_frag_depth"
)
public class EXT_frag_depth extends JsObject implements WebGL1Extension {
  @JsOverlay
  public static final String NAME = "EXT_frag_depth";

  protected EXT_frag_depth() {
  }
}
