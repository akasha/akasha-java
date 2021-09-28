package akasha;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HeadersInit"
)
public interface HeadersInit {
  @JsOverlay
  @Nonnull
  static HeadersInit of(@Nonnull final JsArray<JsArray<String>> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  @SuppressWarnings("unchecked")
  static HeadersInit of(@Nonnull final JsArray<String>... value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static HeadersInit of(@Nonnull final JsPropertyMap<String> value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isArray() {
    return ( (Object) this ) instanceof JsArray;
  }

  @JsOverlay
  default JsArray<JsArray<String>> asArray() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isPropertyMap() {
    return ( (Object) this ) instanceof JsObject;
  }

  @JsOverlay
  default JsPropertyMap<String> asPropertyMap() {
    return Js.cast( this );
  }
}
