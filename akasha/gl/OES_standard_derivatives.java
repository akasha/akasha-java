package akasha.gl;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The OES_standard_derivatives extension is part of the WebGL API and adds the GLSL derivative functions dFdx, dFdy, and fwidth.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OES_standard_derivatives">OES_standard_derivatives - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/OES_standard_derivatives/">WebGL OES_standard_derivatives Khronos Ratified Extension Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OES_standard_derivatives"
)
public class OES_standard_derivatives extends JsObject implements WebGL1Extension {
  @JsOverlay
  public static final int FRAGMENT_SHADER_DERIVATIVE_HINT_OES = 0x8B8B;

  @JsOverlay
  public static final String NAME = "OES_standard_derivatives";

  protected OES_standard_derivatives() {
  }
}
