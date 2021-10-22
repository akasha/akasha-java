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
  static Step1 image(@Nonnull final VideoFrame image) {
    final ImageDecodeResult $imageDecodeResult = Js.<ImageDecodeResult>uncheckedCast( JsPropertyMap.of() );
    $imageDecodeResult.setImage( image );
    return Js.uncheckedCast( $imageDecodeResult );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ImageDecodeResult"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default ImageDecodeResult complete(boolean complete) {
      Js.<ImageDecodeResult>uncheckedCast( this ).setComplete( complete );
      return Js.uncheckedCast( this );
    }
  }
}
