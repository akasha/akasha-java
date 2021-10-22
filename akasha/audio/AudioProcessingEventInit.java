package akasha.audio;

import akasha.EventInit;
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
    name = "AudioProcessingEventInit"
)
public interface AudioProcessingEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Step1 playbackTime(final double playbackTime) {
    final Builder $audioProcessingEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $audioProcessingEventInit.setPlaybackTime( playbackTime );
    return Js.uncheckedCast( $audioProcessingEventInit );
  }

  @JsProperty(
      name = "playbackTime"
  )
  double playbackTime();

  @JsProperty
  void setPlaybackTime(double playbackTime);

  @JsProperty(
      name = "inputBuffer"
  )
  @JsNonNull
  AudioBuffer inputBuffer();

  @JsProperty
  void setInputBuffer(@JsNonNull AudioBuffer inputBuffer);

  @JsProperty(
      name = "outputBuffer"
  )
  @JsNonNull
  AudioBuffer outputBuffer();

  @JsProperty
  void setOutputBuffer(@JsNonNull AudioBuffer outputBuffer);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioProcessingEventInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 inputBuffer(@Nonnull AudioBuffer inputBuffer) {
      Js.<AudioProcessingEventInit>uncheckedCast( this ).setInputBuffer( inputBuffer );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioProcessingEventInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder outputBuffer(@Nonnull AudioBuffer outputBuffer) {
      Js.<AudioProcessingEventInit>uncheckedCast( this ).setOutputBuffer( outputBuffer );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioProcessingEventInit"
  )
  interface Builder extends AudioProcessingEventInit {
    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
