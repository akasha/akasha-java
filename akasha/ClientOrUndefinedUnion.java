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
    name = "ClientOrUndefinedUnion"
)
public interface ClientOrUndefinedUnion {
  @JsOverlay
  @Nonnull
  static ClientOrUndefinedUnion of(@Nonnull final Client value) {
    return Js.cast( value );
  }

  @JsOverlay
  static ClientOrUndefinedUnion of() {
    return Js.cast( Js.undefined() );
  }

  @JsOverlay
  default boolean isClient() {
    return ( (Object) this ) instanceof Client;
  }

  @JsOverlay
  default Client asClient() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isVoid() {
    return Js.isTripleEqual( Js.undefined(), this );
  }
}
