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
    name = "CustomElementConstructorOrUndefinedUnion"
)
public interface CustomElementConstructorOrUndefinedUnion {
  @JsOverlay
  @Nonnull
  static CustomElementConstructorOrUndefinedUnion of(
      @Nonnull final CustomElementConstructor value) {
    return Js.cast( value );
  }

  @JsOverlay
  static CustomElementConstructorOrUndefinedUnion of() {
    return Js.cast( Js.undefined() );
  }

  @JsOverlay
  default boolean isCustomElementConstructor() {
    return ( (Object) this ) instanceof CustomElementConstructor;
  }

  @JsOverlay
  default CustomElementConstructor asCustomElementConstructor() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isVoid() {
    return Js.isTripleEqual( Js.undefined(), this );
  }
}
