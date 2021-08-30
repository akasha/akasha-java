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
    name = "RequestInfo"
)
public interface RequestInfo {
  @JsOverlay
  @Nonnull
  static RequestInfo of(@Nonnull final Request value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static RequestInfo of(@Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isRequest() {
    return ( (Object) this ) instanceof Request;
  }

  @JsOverlay
  default Request asRequest() {
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
