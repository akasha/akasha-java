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
  static Builder create(@Nonnull final String codec, final int sampleRate,
      final int numberOfChannels) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codec( codec ).sampleRate( sampleRate ).numberOfChannels( numberOfChannels );
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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDecoderConfig"
  )
  interface Builder extends AudioDecoderConfig {
    @JsOverlay
    @Nonnull
    default Builder codec(@Nonnull final String codec) {
      setCodec( codec );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleRate(final int sampleRate) {
      setSampleRate( sampleRate );
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
    default Builder description(@Nonnull final BufferSource description) {
      setDescription( description );
      return this;
    }
  }
}
