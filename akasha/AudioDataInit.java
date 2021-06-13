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
    name = "AudioDataInit"
)
public interface AudioDataInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final BufferSource data,
      @AudioSampleFormat @Nonnull final String format, final int numberOfChannels,
      final int numberOfFrames, final float sampleRate, final int timestamp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).data( data ).format( format ).numberOfChannels( numberOfChannels ).numberOfFrames( numberOfFrames ).sampleRate( sampleRate ).timestamp( timestamp );
  }

  @JsProperty(
      name = "data"
  )
  @Nonnull
  BufferSource data();

  @JsProperty
  void setData(@Nonnull BufferSource data);

  @JsProperty(
      name = "format"
  )
  @AudioSampleFormat
  @Nonnull
  String format();

  @JsProperty
  void setFormat(@AudioSampleFormat @Nonnull String format);

  @JsProperty(
      name = "numberOfChannels"
  )
  int numberOfChannels();

  @JsProperty
  void setNumberOfChannels(int numberOfChannels);

  @JsProperty(
      name = "numberOfFrames"
  )
  int numberOfFrames();

  @JsProperty
  void setNumberOfFrames(int numberOfFrames);

  @JsProperty(
      name = "sampleRate"
  )
  float sampleRate();

  @JsProperty
  void setSampleRate(float sampleRate);

  @JsProperty(
      name = "timestamp"
  )
  int timestamp();

  @JsProperty
  void setTimestamp(int timestamp);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDataInit"
  )
  interface Builder extends AudioDataInit {
    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull final BufferSource data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder format(@AudioSampleFormat @Nonnull final String format) {
      setFormat( format );
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
    default Builder numberOfFrames(final int numberOfFrames) {
      setNumberOfFrames( numberOfFrames );
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
    default Builder timestamp(final int timestamp) {
      setTimestamp( timestamp );
      return this;
    }
  }
}
