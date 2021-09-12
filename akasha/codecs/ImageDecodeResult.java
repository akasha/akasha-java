package akasha.codecs;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ImageDecodeResult"
)
public interface ImageDecodeResult {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final VideoFrame image, final boolean complete) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).image( image ).complete( complete );
  }

  @JsProperty(
      name = "image"
  )
  @JsNonNull
  VideoFrame image();

  @JsProperty
  void setImage(@JsNonNull VideoFrame image);

  @JsProperty(
      name = "complete"
  )
  boolean complete();

  @JsProperty
  void setComplete(boolean complete);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ImageDecodeResult"
  )
  interface Builder extends ImageDecodeResult {
    @JsOverlay
    @Nonnull
    default Builder image(@Nonnull final VideoFrame image) {
      setImage( image );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder complete(final boolean complete) {
      setComplete( complete );
      return this;
    }
  }
}
