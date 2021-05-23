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
    name = "DocumentOrWindowProxyUnion"
)
public interface DocumentOrWindowProxyUnion {
  @JsOverlay
  @Nonnull
  static DocumentOrWindowProxyUnion of(@Nonnull final Document value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static DocumentOrWindowProxyUnion of(@Nonnull final Window value) {
    return Js.cast( value );
  }

  @JsOverlay
  default Document asDocument() {
    return Js.cast( this );
  }

  @JsOverlay
  default Window asWindowProxy() {
    return Js.cast( this );
  }
}
