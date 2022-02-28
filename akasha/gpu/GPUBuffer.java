package akasha.gpu;

import akasha.StringOrUndefinedUnion;
import akasha.core.ArrayBuffer;
import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUBuffer"
)
public class GPUBuffer extends JsObject {
  @JsNonNull
  public StringOrUndefinedUnion label;

  protected GPUBuffer() {
  }

  public native void destroy();

  @JsNonNull
  public native ArrayBuffer getMappedRange(int offset, int size);

  @JsNonNull
  public native ArrayBuffer getMappedRange(int offset);

  @JsNonNull
  public native ArrayBuffer getMappedRange();

  @JsNonNull
  public native Promise<Void> mapAsync(@GPUMapModeFlags int mode, int offset, int size);

  @JsNonNull
  public native Promise<Void> mapAsync(@GPUMapModeFlags int mode, int offset);

  @JsNonNull
  public native Promise<Void> mapAsync(@GPUMapModeFlags int mode);

  public native void unmap();
}
