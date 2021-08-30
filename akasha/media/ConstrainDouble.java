package akasha.media;

import akasha.core.JsObject;
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
    name = "ConstrainDouble"
)
public interface ConstrainDouble {
  @JsOverlay
  @Nonnull
  static ConstrainDouble of(final double value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainDouble of(@Nonnull final ConstrainDoubleRange value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isConstrainDoubleRange() {
    return ( (Object) this ) instanceof JsObject;
  }

  @JsOverlay
  default ConstrainDoubleRange asConstrainDoubleRange() {
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
