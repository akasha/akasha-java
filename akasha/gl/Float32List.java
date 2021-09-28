package akasha.gl;

import akasha.core.Float32Array;
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
    name = "Float32List"
)
public interface Float32List {
  @JsOverlay
  @Nonnull
  static Float32List of(@Nonnull final Float32Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static Float32List of(@Nonnull final JsArray<Double> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static Float32List of(@Nonnull final double... value) {
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
  default boolean isFloat32Array() {
    return ( (Object) this ) instanceof Float32Array;
  }

  @JsOverlay
  default Float32Array asFloat32Array() {
    return Js.cast( this );
  }
}
