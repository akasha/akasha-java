package akasha.gpu;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@JsType(
    isNative = true,
    name = "GPUBufferUsage",
    namespace = JsPackage.GLOBAL
)
@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
public final class GPUBufferUsage {
  @JsOverlay
  public static final int COPY_DST = 0x0008;

  @JsOverlay
  public static final int COPY_SRC = 0x0004;

  @JsOverlay
  public static final int INDEX = 0x0010;

  @JsOverlay
  public static final int INDIRECT = 0x0100;

  @JsOverlay
  public static final int MAP_READ = 0x0001;

  @JsOverlay
  public static final int MAP_WRITE = 0x0002;

  @JsOverlay
  public static final int QUERY_RESOLVE = 0x0200;

  @JsOverlay
  public static final int STORAGE = 0x0080;

  @JsOverlay
  public static final int UNIFORM = 0x0040;

  @JsOverlay
  public static final int VERTEX = 0x0020;

  private GPUBufferUsage() {
  }
}
