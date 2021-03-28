package akasha.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EXT_blend_minmax extension is part of the WebGL API and extends blending capabilities by adding two new blend equations: the minimum or maximum color components of the source and destination colors.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EXT_blend_minmax">EXT_blend_minmax - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/EXT_blend_minmax/">EXT_blend_minmax - EXT_blend_minmax</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class EXT_blend_minmax implements WebGL1Extension {
  @JsOverlay
  public static final int MAX_EXT = 0x8008;

  @JsOverlay
  public static final int MIN_EXT = 0x8007;

  @JsOverlay
  public static final String NAME = "EXT_blend_minmax";

  protected EXT_blend_minmax() {
  }
}
