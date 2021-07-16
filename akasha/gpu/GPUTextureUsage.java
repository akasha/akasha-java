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
    name = "GPUTextureUsage"
)
public class GPUTextureUsage extends JsObject {
  @JsOverlay
  public static final int COPY_DST = 0x02;

  @JsOverlay
  public static final int COPY_SRC = 0x01;

  @JsOverlay
  public static final int RENDER_ATTACHMENT = 0x10;

  @JsOverlay
  public static final int SHADER_READ = 0x04;

  @JsOverlay
  public static final int STORAGE = 0x08;

  protected GPUTextureUsage() {
  }
}
