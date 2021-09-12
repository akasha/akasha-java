package akasha.gpu;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@JsType(
    isNative = true,
    name = "GPUMapMode",
    namespace = JsPackage.GLOBAL
)
@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
public final class GPUMapMode {
  @JsOverlay
  public static final int READ = 0x0001;

  @JsOverlay
  public static final int WRITE = 0x0002;

  private GPUMapMode() {
  }
}
