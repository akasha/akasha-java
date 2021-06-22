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
    name = "GPUMapMode"
)
public class GPUMapMode extends JsObject {
  @JsOverlay
  public static final int READ = 0x0001;

  @JsOverlay
  public static final int WRITE = 0x0002;

  protected GPUMapMode() {
  }
}
