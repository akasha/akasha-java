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
    name = "ConstrainULong"
)
public interface ConstrainULong {
  @JsOverlay
  @Nonnull
  static ConstrainULong of(final int value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainULong of(@Nonnull final ConstrainULongRange value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isConstrainULongRange() {
    return ( (Object) this ) instanceof JsObject;
  }

  @JsOverlay
  default ConstrainULongRange asConstrainULongRange() {
    return Js.cast( this );
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
