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
    name = "MediaListOrStringUnion"
)
public interface MediaListOrStringUnion {
  @JsOverlay
  @Nonnull
  static MediaListOrStringUnion of(@Nonnull final MediaList value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static MediaListOrStringUnion of(@Nonnull final String value) {
    return Js.cast( value );
  }
}