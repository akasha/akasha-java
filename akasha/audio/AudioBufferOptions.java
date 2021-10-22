package akasha.audio;

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
    name = "AudioBufferOptions"
)
public interface AudioBufferOptions {
  @JsOverlay
  @Nonnull
  static Step1 length(final int length) {
    final Builder $audioBufferOptions = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $audioBufferOptions.setLength( length );
    return Js.uncheckedCast( $audioBufferOptions );
  }

  @JsProperty(
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  @JsProperty(
      name = "sampleRate"
  )
  float sampleRate();

  @JsProperty
  void setSampleRate(float sampleRate);

  @JsProperty(
      name = "numberOfChannels"
  )
  int numberOfChannels();

  @JsProperty
  void setNumberOfChannels(int numberOfChannels);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioBufferOptions"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder sampleRate(float sampleRate) {
      Js.<AudioBufferOptions>uncheckedCast( this ).setSampleRate( sampleRate );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioBufferOptions"
  )
  interface Builder extends AudioBufferOptions {
    @JsOverlay
    @Nonnull
    default Builder numberOfChannels(final int numberOfChannels) {
      setNumberOfChannels( numberOfChannels );
      return this;
    }
  }
}
