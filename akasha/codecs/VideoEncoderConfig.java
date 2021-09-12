package akasha.codecs;

import akasha.media.BitrateMode;
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
    name = "VideoEncoderConfig"
)
public interface VideoEncoderConfig {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String codec, final int width, final int height) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codec( codec ).width( width ).height( height );
  }

  @JsProperty(
      name = "codec"
  )
  @JsNonNull
  String codec();

  @JsProperty
  void setCodec(@JsNonNull String codec);

  @JsProperty(
      name = "width"
  )
  int width();

  @JsProperty
  void setWidth(int width);

  @JsProperty(
      name = "height"
  )
  int height();

  @JsProperty
  void setHeight(int height);

  @JsProperty(
      name = "alpha"
  )
  @AlphaOption
  String alpha();

  @JsProperty
  void setAlpha(@AlphaOption @JsNonNull String alpha);

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
  void setBitrateMode(@BitrateMode @JsNonNull String bitrateMode);

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
      name = "framerate"
  )
  double framerate();

  @JsProperty
  void setFramerate(double framerate);

  @JsProperty(
      name = "hardwareAcceleration"
  )
  @HardwareAcceleration
  String hardwareAcceleration();

  @JsProperty
  void setHardwareAcceleration(@HardwareAcceleration @JsNonNull String hardwareAcceleration);

  @JsProperty(
      name = "latencyMode"
  )
  @LatencyMode
  String latencyMode();

  @JsProperty
  void setLatencyMode(@LatencyMode @JsNonNull String latencyMode);

  @JsProperty(
      name = "scalabilityMode"
  )
  String scalabilityMode();

  @JsProperty
  void setScalabilityMode(@JsNonNull String scalabilityMode);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoEncoderConfig"
  )
  interface Builder extends VideoEncoderConfig {
    @JsOverlay
    @Nonnull
    default Builder codec(@Nonnull final String codec) {
      setCodec( codec );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder width(final int width) {
      setWidth( width );
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
    default Builder alpha(@AlphaOption @Nonnull final String alpha) {
      setAlpha( alpha );
      return this;
    }

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
    default Builder framerate(final double framerate) {
      setFramerate( framerate );
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
    default Builder latencyMode(@LatencyMode @Nonnull final String latencyMode) {
      setLatencyMode( latencyMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder scalabilityMode(@Nonnull final String scalabilityMode) {
      setScalabilityMode( scalabilityMode );
      return this;
    }
  }
}
