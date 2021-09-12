package akasha.gpu;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@JsType(
    isNative = true,
    name = "GPUTextureUsage",
    namespace = JsPackage.GLOBAL
)
@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
public final class GPUTextureUsage {
  @JsOverlay
  public static final int COPY_DST = 0x02;

  @JsOverlay
  public static final int COPY_SRC = 0x01;

  @JsOverlay
  public static final int RENDER_ATTACHMENT = 0x10;

  @JsOverlay
  public static final int STORAGE_BINDING = 0x08;

  @JsOverlay
  public static final int TEXTURE_BINDING = 0x04;

  private GPUTextureUsage() {
  }
}
