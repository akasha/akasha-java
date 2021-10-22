package akasha.gpu;

import akasha.core.JsObject;
import akasha.lang.JsArray;
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
    name = "GPULoadOpOrGPUColorUnion"
)
@ApiStatus.Experimental
public interface GPULoadOpOrGPUColorUnion {
  @JsOverlay
  @Nonnull
  static GPULoadOpOrGPUColorUnion of(@GPULoadOp @Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPULoadOpOrGPUColorUnion of(@Nonnull final GPUColor value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPULoadOpOrGPUColorUnion of(@Nonnull final JsArray<Double> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPULoadOpOrGPUColorUnion of(@Nonnull final GPUColorDict value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPULoadOpOrGPUColorUnion of(@Nonnull final double... value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isArray() {
    return ( (Object) this ) instanceof JsArray;
  }

  @JsOverlay
  default JsArray<Double> asArray() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isGPUColorDict() {
    return ( (Object) this ) instanceof JsObject;
  }

  @JsOverlay
  default GPUColorDict asGPUColorDict() {
    return Js.cast( this );
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
