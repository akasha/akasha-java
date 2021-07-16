package akasha.gl;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The KHR_parallel_shader_compile extension is part of the WebGL API and enables a non-blocking poll operation, so that compile/link status availability (COMPLETION_STATUS_KHR) can be queried without potentially incurring stalls. In other words you can check the status of your shaders compiling without blocking the runtime.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KHR_parallel_shader_compile">KHR_parallel_shader_compile - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/KHR_parallel_shader_compile/">(WebGL KHR_parallel_shader_compile Extension)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "KHR_parallel_shader_compile"
)
public class KHR_parallel_shader_compile extends JsObject implements WebGLCommonExtension {
  @JsOverlay
  public static final int COMPLETION_STATUS_KHR = 0x91B1;

  @JsOverlay
  public static final String NAME = "KHR_parallel_shader_compile";

  protected KHR_parallel_shader_compile() {
  }
}
