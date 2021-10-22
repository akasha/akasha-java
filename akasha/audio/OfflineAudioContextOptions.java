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
    name = "OfflineAudioContextOptions"
)
public interface OfflineAudioContextOptions {
  @JsOverlay
  @Nonnull
  static Step1 length(final int length) {
    final Builder $offlineAudioContextOptions = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $offlineAudioContextOptions.setLength( length );
    return Js.uncheckedCast( $offlineAudioContextOptions );
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
      name = "OfflineAudioContextOptions"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder sampleRate(float sampleRate) {
      Js.<OfflineAudioContextOptions>uncheckedCast( this ).setSampleRate( sampleRate );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "OfflineAudioContextOptions"
  )
  interface Builder extends OfflineAudioContextOptions {
    @JsOverlay
    @Nonnull
    default Builder numberOfChannels(final int numberOfChannels) {
      setNumberOfChannels( numberOfChannels );
      return this;
    }
  }
}
