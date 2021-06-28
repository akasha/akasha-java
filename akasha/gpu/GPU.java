package akasha.gpu;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPU"
)
public class GPU extends JsObject {
  protected GPU() {
  }

  @Nonnull
  public native Promise<GPUAdapter> requestAdapter(@Nonnull GPURequestAdapterOptions options);

  @Nonnull
  public native Promise<GPUAdapter> requestAdapter();
}
