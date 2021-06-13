package akasha;

import akasha.core.BufferSource;
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
    name = "ImageBufferSource"
)
public interface ImageBufferSource {
  @JsOverlay
  @Nonnull
  static ImageBufferSource of(@Nonnull final BufferSource value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ImageBufferSource of(@Nonnull final ReadableStream value) {
    return Js.cast( value );
  }
}
