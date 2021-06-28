package akasha.gpu;

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
    name = "GPUOrigin3D"
)
@ApiStatus.Experimental
public interface GPUOrigin3D {
  @JsOverlay
  @Nonnull
  static GPUOrigin3D of(@Nonnull final JsArray<Double> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPUOrigin3D of(@Nonnull final double[] value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static GPUOrigin3D of(@Nonnull final GPUOrigin3DDict value) {
    return Js.cast( value );
  }
}
