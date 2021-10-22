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
    name = "AudioEncoderConfig"
)
public interface AudioEncoderConfig {
  @JsOverlay
  @Nonnull
  static Builder codec(@Nonnull final String codec) {
    final Builder $audioEncoderConfig = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $audioEncoderConfig.setCodec( codec );
    return Js.uncheckedCast( $audioEncoderConfig );
  }

  @JsProperty(
      name = "codec"
  )
  @JsNonNull
  String codec();

  @JsProperty
  void setCodec(@JsNonNull String codec);

  @JsProperty(
      name = "bitrate"
  )
  int bitrate();

  @JsProperty
  void setBitrate(int bitrate);

  @JsProperty(
      name = "numberOfChannels"
  )
  int numberOfChannels();

  @JsProperty
  void setNumberOfChannels(int numberOfChannels);

  @JsProperty(
      name = "sampleRate"
  )
  int sampleRate();

  @JsProperty
  void setSampleRate(int sampleRate);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioEncoderConfig"
  )
  interface Builder extends AudioEncoderConfig {
    @JsOverlay
    @Nonnull
    default Builder bitrate(final int bitrate) {
      setBitrate( bitrate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder numberOfChannels(final int numberOfChannels) {
      setNumberOfChannels( numberOfChannels );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleRate(final int sampleRate) {
      setSampleRate( sampleRate );
      return this;
    }
  }
}
