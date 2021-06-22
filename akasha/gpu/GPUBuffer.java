package akasha.gpu;

import akasha.core.ArrayBuffer;
import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUBuffer"
)
public class GPUBuffer extends JsObject {
  @Nullable
  public String label;

  protected GPUBuffer() {
  }

  public native void destroy();

  @Nonnull
  public native ArrayBuffer getMappedRange(int offset, int size);

  @Nonnull
  public native ArrayBuffer getMappedRange(int offset);

  @Nonnull
  public native ArrayBuffer getMappedRange();

  @Nonnull
  public native Promise<Void> mapAsync(int mode, int offset, int size);

  @Nonnull
  public native Promise<Void> mapAsync(int mode, int offset);

  @Nonnull
  public native Promise<Void> mapAsync(int mode);

  public native void unmap();
}