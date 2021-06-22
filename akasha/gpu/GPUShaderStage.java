package akasha.gpu;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUShaderStage"
)
public class GPUShaderStage extends JsObject {
  @JsOverlay
  public static final int COMPUTE = 0x4;

  @JsOverlay
  public static final int FRAGMENT = 0x2;

  @JsOverlay
  public static final int VERTEX = 0x1;

  protected GPUShaderStage() {
  }
}
