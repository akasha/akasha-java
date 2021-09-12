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
    name = "AudioDataInit"
)
public interface AudioDataInit {
  @JsOverlay
  @Nonnull
  static Builder create(@AudioSampleFormat @Nonnull final String format, final float sampleRate,
      final int numberOfFrames, final int numberOfChannels, final int timestamp,
      @Nonnull final BufferSource data) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).format( format ).sampleRate( sampleRate ).numberOfFrames( numberOfFrames ).numberOfChannels( numberOfChannels ).timestamp( timestamp ).data( data );
  }

  @JsProperty(
      name = "format"
  )
  @AudioSampleFormat
  @JsNonNull
  String format();

  @JsProperty
  void setFormat(@AudioSampleFormat @JsNonNull String format);

  @JsProperty(
      name = "sampleRate"
  )
  float sampleRate();

  @JsProperty
  void setSampleRate(float sampleRate);

  @JsProperty(
      name = "numberOfFrames"
  )
  int numberOfFrames();

  @JsProperty
  void setNumberOfFrames(int numberOfFrames);

  @JsProperty(
      name = "numberOfChannels"
  )
  int numberOfChannels();

  @JsProperty
  void setNumberOfChannels(int numberOfChannels);

  @JsProperty(
      name = "timestamp"
  )
  int timestamp();

  @JsProperty
  void setTimestamp(int timestamp);

  @JsProperty(
      name = "data"
  )
  @JsNonNull
  BufferSource data();

  @JsProperty
  void setData(@JsNonNull BufferSource data);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDataInit"
  )
  interface Builder extends AudioDataInit {
    @JsOverlay
    @Nonnull
    default Builder format(@AudioSampleFormat @Nonnull final String format) {
      setFormat( format );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleRate(final float sampleRate) {
      setSampleRate( sampleRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder numberOfFrames(final int numberOfFrames) {
      setNumberOfFrames( numberOfFrames );
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
    default Builder timestamp(final int timestamp) {
      setTimestamp( timestamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull final BufferSource data) {
      setData( data );
      return this;
    }
  }
}
