package akasha;

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
    name = "DoubleOrDoubleArrayUnion"
)
public interface DoubleOrDoubleArrayUnion {
  @JsOverlay
  @Nonnull
  static DoubleOrDoubleArrayUnion of(final double value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static DoubleOrDoubleArrayUnion of(@Nonnull final JsArray<Double> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static DoubleOrDoubleArrayUnion of(@Nonnull final double... value) {
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
  default boolean isDouble() {
    return ( (Object) this ) instanceof Double;
  }

  @JsOverlay
  default double asDouble() {
    return Js.asDouble( this );
  }
}
