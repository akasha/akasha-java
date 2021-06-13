package akasha;

import akasha.media.BitrateMode;
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
    name = "VideoEncoderConfig"
)
public interface VideoEncoderConfig {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String codec, final int height, final int width) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codec( codec ).height( height ).width( width );
  }

  @JsProperty(
      name = "bitrate"
  )
  int bitrate();

  @JsProperty
  void setBitrate(int bitrate);

  @JsProperty(
      name = "bitrateMode"
  )
  @BitrateMode
  String bitrateMode();

  @JsProperty
  void setBitrateMode(@BitrateMode @Nonnull String bitrateMode);

  @JsProperty(
      name = "codec"
  )
  @Nonnull
  String codec();

  @JsProperty
  void setCodec(@Nonnull String codec);

  @JsProperty(
      name = "displayHeight"
  )
  int displayHeight();

  @JsProperty
  void setDisplayHeight(int displayHeight);

  @JsProperty(
      name = "displayWidth"
  )
  int displayWidth();

  @JsProperty
  void setDisplayWidth(int displayWidth);

  @JsProperty(
      name = "hardwareAcceleration"
  )
  @HardwareAcceleration
  String hardwareAcceleration();

  @JsProperty
  void setHardwareAcceleration(@HardwareAcceleration @Nonnull String hardwareAcceleration);

  @JsProperty(
      name = "height"
  )
  int height();

  @JsProperty
  void setHeight(int height);

  @JsProperty(
      name = "scalabilityMode"
  )
  String scalabilityMode();

  @JsProperty
  void setScalabilityMode(@Nonnull String scalabilityMode);

  @JsProperty(
      name = "width"
  )
  int width();

  @JsProperty
  void setWidth(int width);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoEncoderConfig"
  )
  interface Builder extends VideoEncoderConfig {
    @JsOverlay
    @Nonnull
    default Builder bitrate(final int bitrate) {
      setBitrate( bitrate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bitrateMode(@BitrateMode @Nonnull final String bitrateMode) {
      setBitrateMode( bitrateMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder codec(@Nonnull final String codec) {
      setCodec( codec );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder displayHeight(final int displayHeight) {
      setDisplayHeight( displayHeight );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder displayWidth(final int displayWidth) {
      setDisplayWidth( displayWidth );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder hardwareAcceleration(
        @HardwareAcceleration @Nonnull final String hardwareAcceleration) {
      setHardwareAcceleration( hardwareAcceleration );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder height(final int height) {
      setHeight( height );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder scalabilityMode(@Nonnull final String scalabilityMode) {
      setScalabilityMode( scalabilityMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder width(final int width) {
      setWidth( width );
      return this;
    }
  }
}
