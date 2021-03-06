package akasha.gpu;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUAdapter"
)
public class GPUAdapter extends JsObject {
  protected GPUAdapter() {
  }

  @JsProperty(
      name = "features"
  )
  @Nonnull
  public native GPUSupportedFeatures features();

  @JsProperty(
      name = "isFallbackAdapter"
  )
  public native boolean isFallbackAdapter();

  @JsProperty(
      name = "limits"
  )
  @Nonnull
  public native GPUSupportedLimits limits();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  @JsNonNull
  public native Promise<GPUDevice> requestDevice(@Nonnull GPUDeviceDescriptor descriptor);

  @JsNonNull
  public native Promise<GPUDevice> requestDevice();
}
