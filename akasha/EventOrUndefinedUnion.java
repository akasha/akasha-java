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
    name = "EventOrUndefinedUnion"
)
public interface EventOrUndefinedUnion {
  @JsOverlay
  @Nonnull
  static EventOrUndefinedUnion of(@Nonnull final Event value) {
    return Js.cast( value );
  }

  @JsOverlay
  static EventOrUndefinedUnion of() {
    return Js.cast( Js.undefined() );
  }

  @JsOverlay
  default boolean isEvent() {
    return ( (Object) this ) instanceof Event;
  }

  @JsOverlay
  default Event asEvent() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isVoid() {
    return Js.isTripleEqual( Js.undefined(), this );
  }
}
