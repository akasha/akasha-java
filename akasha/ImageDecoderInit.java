package akasha;

import akasha.core.BufferSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
  static Builder create(@Nonnull final ImageBufferSource data, @Nonnull final String type) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).data( data ).type( type );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final BufferSource data, @Nonnull final String type) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).data( data ).type( type );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final ReadableStream data, @Nonnull final String type) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).data( data ).type( type );
  }

  @JsProperty(
      name = "colorSpaceConversion"
  )
  @ColorSpaceConversion
  String colorSpaceConversion();

  @JsProperty
  void setColorSpaceConversion(@ColorSpaceConversion @Nonnull String colorSpaceConversion);

  @JsProperty(
      name = "data"
  )
  @Nonnull
  ImageBufferSource data();

  @JsProperty
  void setData(@Nonnull ImageBufferSource data);

  @JsOverlay
  default void setData(@Nonnull final BufferSource data) {
    setData( ImageBufferSource.of( data ) );
  }

  @JsOverlay
  default void setData(@Nonnull final ReadableStream data) {
    setData( ImageBufferSource.of( data ) );
  }

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
  void setPremultiplyAlpha(@PremultiplyAlpha @Nonnull String premultiplyAlpha);

  @JsProperty(
      name = "type"
  )
  @Nonnull
  String type();

  @JsProperty
  void setType(@Nonnull String type);

  @Generated("org.realityforge.webtack")
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
    default Builder data(@Nonnull final ImageBufferSource data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull final BufferSource data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull final ReadableStream data) {
      setData( data );
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

    @JsOverlay
    @Nonnull
    default Builder type(@Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
