package akasha.gpu;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPULoadOpOrGPUColorUnion"
)
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
  static GPULoadOpOrGPUColorUnion of(@Nonnull final double[] value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPULoadOpOrGPUColorUnion of(@Nonnull final GPUColorDict value) {
    return Js.cast( value );
  }
}
