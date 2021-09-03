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
    name = "GPULoadOpOrGPUStencilValueUnion"
)
@ApiStatus.Experimental
public interface GPULoadOpOrGPUStencilValueUnion {
  @JsOverlay
  @Nonnull
  static GPULoadOpOrGPUStencilValueUnion of(@GPULoadOp @Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPULoadOpOrGPUStencilValueUnion of(final int value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isGPULoadOp() {
    return ( (Object) this ) instanceof String;
  }

  @JsOverlay
  @GPULoadOp
  default String asGPULoadOp() {
    return Js.asString( this );
  }

  @JsOverlay
  default boolean isInt() {
    return ( (Object) this ) instanceof Double;
  }

  @JsOverlay
  default int asInt() {
    return Js.asInt( this );
  }
}
