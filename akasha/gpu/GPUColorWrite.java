package akasha.gpu;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUColorWrite"
)
public class GPUColorWrite extends JsObject {
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

  protected GPUColorWrite() {
  }
}
