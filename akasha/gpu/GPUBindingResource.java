package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUBindingResource"
)
@ApiStatus.Experimental
public interface GPUBindingResource {
  @JsOverlay
  @Nonnull
  static GPUBindingResource of(@Nonnull final GPUSampler value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPUBindingResource of(@Nonnull final GPUTextureView value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPUBindingResource of(@Nonnull final GPUBufferBinding value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPUBindingResource of(@Nonnull final GPUExternalTexture value) {
    return Js.cast( value );
  }
}
