package akasha.gl;

import akasha.core.Uint32Array;
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
    name = "Uint32List"
)
public interface Uint32List {
  @JsOverlay
  @Nonnull
  static Uint32List of(@Nonnull final Uint32Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static Uint32List of(@Nonnull final JsArray<Double> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static Uint32List of(@Nonnull final double... value) {
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
  default boolean isUint32Array() {
    return ( (Object) this ) instanceof Uint32Array;
  }

  @JsOverlay
  default Uint32Array asUint32Array() {
    return Js.cast( this );
  }
}
