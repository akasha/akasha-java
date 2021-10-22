package akasha.codecs;

import akasha.ColorSpaceConversion;
import akasha.PremultiplyAlpha;
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
    name = "ImageDecoderInit"
)
public interface ImageDecoderInit {
  @JsOverlay
  @Nonnull
  static Step1 type(@Nonnull final String type) {
    final Builder $imageDecoderInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $imageDecoderInit.setType( type );
    return Js.uncheckedCast( $imageDecoderInit );
  }

  @JsProperty(
      name = "type"
  )
  @JsNonNull
  String type();

  @JsProperty
  void setType(@JsNonNull String type);

  @JsProperty(
      name = "data"
  )
  @JsNonNull
  ImageBufferSource data();

  @JsProperty
  void setData(@JsNonNull ImageBufferSource data);

  @JsProperty(
      name = "colorSpaceConversion"
  )
  @ColorSpaceConversion
  String colorSpaceConversion();

  @JsProperty
  void setColorSpaceConversion(@ColorSpaceConversion @JsNonNull String colorSpaceConversion);

  @JsProperty(
      name = "desiredHeight"
  )
  int desiredHeight();

  @JsProperty
  void setDesiredHeight(int desiredHeight);

  @JsProperty(
      name = "desiredWidth"
  )
  int desiredWidth();

  @JsProperty
  void setDesiredWidth(int desiredWidth);

  @JsProperty(
      name = "preferAnimation"
  )
  boolean preferAnimation();

  @JsProperty
  void setPreferAnimation(boolean preferAnimation);

  @JsProperty(
      name = "premultiplyAlpha"
  )
  @PremultiplyAlpha
  String premultiplyAlpha();

  @JsProperty
  void setPremultiplyAlpha(@PremultiplyAlpha @JsNonNull String premultiplyAlpha);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ImageDecoderInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull ImageBufferSource data) {
      Js.<ImageDecoderInit>uncheckedCast( this ).setData( data );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ImageDecoderInit"
  )
  interface Builder extends ImageDecoderInit {
    @JsOverlay
    @Nonnull
    default Builder colorSpaceConversion(
        @ColorSpaceConversion @Nonnull final String colorSpaceConversion) {
      setColorSpaceConversion( colorSpaceConversion );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder desiredHeight(final int desiredHeight) {
      setDesiredHeight( desiredHeight );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder desiredWidth(final int desiredWidth) {
      setDesiredWidth( desiredWidth );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder preferAnimation(final boolean preferAnimation) {
      setPreferAnimation( preferAnimation );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder premultiplyAlpha(@PremultiplyAlpha @Nonnull final String premultiplyAlpha) {
      setPremultiplyAlpha( premultiplyAlpha );
      return this;
    }
  }
}
