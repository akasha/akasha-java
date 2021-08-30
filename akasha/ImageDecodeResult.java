package akasha;

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
  static Builder create(final boolean complete, @Nonnull final VideoFrame image) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).complete( complete ).image( image );
  }

  @JsProperty(
      name = "complete"
  )
  boolean complete();

  @JsProperty
  void setComplete(boolean complete);

  @JsProperty(
      name = "image"
  )
  @JsNonNull
  VideoFrame image();

  @JsProperty
  void setImage(@JsNonNull VideoFrame image);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ImageDecodeResult"
  )
  interface Builder extends ImageDecodeResult {
    @JsOverlay
    @Nonnull
    default Builder complete(final boolean complete) {
      setComplete( complete );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder image(@Nonnull final VideoFrame image) {
      setImage( image );
      return this;
    }
  }
}
