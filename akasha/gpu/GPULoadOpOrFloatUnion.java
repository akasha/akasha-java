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
    name = "GPULoadOpOrFloatUnion"
)
@ApiStatus.Experimental
public interface GPULoadOpOrFloatUnion {
  @JsOverlay
  @Nonnull
  static GPULoadOpOrFloatUnion of(@GPULoadOp @Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPULoadOpOrFloatUnion of(final float value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isFloat() {
    return ( (Object) this ) instanceof Double;
  }

  @JsOverlay
  default float asFloat() {
    return Js.asFloat( this );
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
}
