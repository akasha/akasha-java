package akasha.gpu;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@JsType(
    isNative = true,
    name = "GPUShaderStage",
    namespace = JsPackage.GLOBAL
)
@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
public final class GPUShaderStage {
  @JsOverlay
  public static final int COMPUTE = 0x4;

  @JsOverlay
  public static final int FRAGMENT = 0x2;

  @JsOverlay
  public static final int VERTEX = 0x1;

  private GPUShaderStage() {
  }
}
