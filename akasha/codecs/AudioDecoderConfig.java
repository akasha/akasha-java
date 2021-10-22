package akasha.codecs;

import akasha.core.BufferSource;
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
    name = "AudioDecoderConfig"
)
public interface AudioDecoderConfig {
  @JsOverlay
  @Nonnull
  static Step1 codec(@Nonnull final String codec) {
    final Builder $audioDecoderConfig = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $audioDecoderConfig.setCodec( codec );
    return Js.uncheckedCast( $audioDecoderConfig );
  }

  @JsProperty(
      name = "codec"
  )
  @JsNonNull
  String codec();

  @JsProperty
  void setCodec(@JsNonNull String codec);

  @JsProperty(
      name = "sampleRate"
  )
  int sampleRate();

  @JsProperty
  void setSampleRate(int sampleRate);

  @JsProperty(
      name = "numberOfChannels"
  )
  int numberOfChannels();

  @JsProperty
  void setNumberOfChannels(int numberOfChannels);

  @JsProperty(
      name = "description"
  )
  BufferSource description();

  @JsProperty
  void setDescription(@JsNonNull BufferSource description);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDecoderConfig"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 sampleRate(int sampleRate) {
      Js.<AudioDecoderConfig>uncheckedCast( this ).setSampleRate( sampleRate );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDecoderConfig"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder numberOfChannels(int numberOfChannels) {
      Js.<AudioDecoderConfig>uncheckedCast( this ).setNumberOfChannels( numberOfChannels );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDecoderConfig"
  )
  interface Builder extends AudioDecoderConfig {
    @JsOverlay
    @Nonnull
    default Builder description(@Nonnull final BufferSource description) {
      setDescription( description );
      return this;
    }
  }
}
