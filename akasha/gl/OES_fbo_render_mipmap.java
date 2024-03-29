package akasha.gl;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The OES_fbo_render_mipmap extension is part of the WebGL API and makes it possible to attach any level of a texture to a framebuffer object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OES_fbo_render_mipmap">OES_fbo_render_mipmap - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/OES_fbo_render_mipmap/">WebGL OES_fbo_render_mipmap Extension Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OES_fbo_render_mipmap"
)
public class OES_fbo_render_mipmap extends JsObject implements WebGL1Extension {
  @JsOverlay
  public static final String NAME = "OES_fbo_render_mipmap";

  protected OES_fbo_render_mipmap() {
  }
}
