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
    name = "ResponseOrUndefinedUnion"
)
public interface ResponseOrUndefinedUnion {
  @JsOverlay
  @Nonnull
  static ResponseOrUndefinedUnion of(@Nonnull final Response value) {
    return Js.cast( value );
  }

  @JsOverlay
  static ResponseOrUndefinedUnion of() {
    return Js.cast( Js.undefined() );
  }
}
