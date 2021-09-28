package akasha.media;

import akasha.core.JsObject;
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
    name = "ConstrainDOMString"
)
public interface ConstrainDOMString {
  @JsOverlay
  @Nonnull
  static ConstrainDOMString of(@Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainDOMString of(@Nonnull final JsArray<String> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainDOMString of(@Nonnull final String... value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainDOMString of(@Nonnull final ConstrainDOMStringParameters value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isArray() {
    return ( (Object) this ) instanceof JsArray;
  }

  @JsOverlay
  default JsArray<String> asArray() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isConstrainDOMStringParameters() {
    return ( (Object) this ) instanceof JsObject;
  }

  @JsOverlay
  default ConstrainDOMStringParameters asConstrainDOMStringParameters() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isString() {
    return ( (Object) this ) instanceof String;
  }

  @JsOverlay
  default String asString() {
    return Js.asString( this );
  }
}
