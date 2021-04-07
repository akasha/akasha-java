package akasha;

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
    name = "Object"
)
public interface ImageBitmapOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "colorSpaceConversion"
  )
  @ColorSpaceConversion
  String colorSpaceConversion();

  @JsProperty
  void setColorSpaceConversion(@ColorSpaceConversion @Nonnull String colorSpaceConversion);

  @JsProperty(
      name = "imageOrientation"
  )
  @ImageOrientation
  String imageOrientation();

  @JsProperty
  void setImageOrientation(@ImageOrientation @Nonnull String imageOrientation);

  @JsProperty(
      name = "premultiplyAlpha"
  )
  @PremultiplyAlpha
  String premultiplyAlpha();

  @JsProperty
  void setPremultiplyAlpha(@PremultiplyAlpha @Nonnull String premultiplyAlpha);

  @JsProperty(
      name = "resizeHeight"
  )
  int resizeHeight();

  @JsProperty
  void setResizeHeight(int resizeHeight);

  @JsProperty(
      name = "resizeQuality"
  )
  @ResizeQuality
  String resizeQuality();

  @JsProperty
  void setResizeQuality(@ResizeQuality @Nonnull String resizeQuality);

  @JsProperty(
      name = "resizeWidth"
  )
  int resizeWidth();

  @JsProperty
  void setResizeWidth(int resizeWidth);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends ImageBitmapOptions {
    @JsOverlay
    @Nonnull
    default Builder colorSpaceConversion(
        @ColorSpaceConversion @Nonnull final String colorSpaceConversion) {
      setColorSpaceConversion( colorSpaceConversion );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder imageOrientation(@ImageOrientation @Nonnull final String imageOrientation) {
      setImageOrientation( imageOrientation );
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
    default Builder resizeHeight(final int resizeHeight) {
      setResizeHeight( resizeHeight );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder resizeQuality(@ResizeQuality @Nonnull final String resizeQuality) {
      setResizeQuality( resizeQuality );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder resizeWidth(final int resizeWidth) {
      setResizeWidth( resizeWidth );
      return this;
    }
  }
}
