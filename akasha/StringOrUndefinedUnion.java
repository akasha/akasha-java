package akasha;

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
    name = "StringOrUndefinedUnion"
)
public interface StringOrUndefinedUnion {
  @JsOverlay
  @Nonnull
  static StringOrUndefinedUnion of(@Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  static StringOrUndefinedUnion of() {
    return Js.cast( Js.undefined() );
  }

  @JsOverlay
  default boolean isString() {
    return ( (Object) this ) instanceof String;
  }

  @JsOverlay
  default String asString() {
    return Js.asString( this );
  }

  @JsOverlay
  default boolean isVoid() {
    return Js.isTripleEqual( Js.undefined(), this );
  }
}
