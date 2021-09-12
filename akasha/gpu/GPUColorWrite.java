package akasha.gpu;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@JsType(
    isNative = true,
    name = "GPUColorWrite",
    namespace = JsPackage.GLOBAL
)
@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
public final class GPUColorWrite {
  @JsOverlay
  public static final int ALL = 0xF;

  @JsOverlay
  public static final int ALPHA = 0x8;

  @JsOverlay
  public static final int BLUE = 0x4;

  @JsOverlay
  public static final int GREEN = 0x2;

  @JsOverlay
  public static final int RED = 0x1;

  private GPUColorWrite() {
  }
}
