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
    name = "BlobPart"
)
public interface BlobPart {
  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final BufferSource value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final Blob value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final String value) {
    return Js.cast( value );
  }
}
