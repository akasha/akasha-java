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
  static Step1 format(@AudioSampleFormat @Nonnull final String format) {
    final AudioDataInit $audioDataInit = Js.<AudioDataInit>uncheckedCast( JsPropertyMap.of() );
    $audioDataInit.setFormat( format );
    return Js.uncheckedCast( $audioDataInit );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDataInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 sampleRate(float sampleRate) {
      Js.<AudioDataInit>uncheckedCast( this ).setSampleRate( sampleRate );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDataInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 numberOfFrames(int numberOfFrames) {
      Js.<AudioDataInit>uncheckedCast( this ).setNumberOfFrames( numberOfFrames );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDataInit"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 numberOfChannels(int numberOfChannels) {
      Js.<AudioDataInit>uncheckedCast( this ).setNumberOfChannels( numberOfChannels );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDataInit"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Step5 timestamp(int timestamp) {
      Js.<AudioDataInit>uncheckedCast( this ).setTimestamp( timestamp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDataInit"
  )
  interface Step5 {
    @JsOverlay
    @Nonnull
    default AudioDataInit data(@Nonnull BufferSource data) {
      Js.<AudioDataInit>uncheckedCast( this ).setData( data );
      return Js.uncheckedCast( this );
    }
  }
}
