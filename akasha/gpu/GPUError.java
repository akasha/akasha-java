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
    name = "GPUError"
)
@ApiStatus.Experimental
public interface GPUError {
  @JsOverlay
  @Nonnull
  static GPUError of(@Nonnull final GPUOutOfMemoryError value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPUError of(@Nonnull final GPUValidationError value) {
    return Js.cast( value );
  }
}
