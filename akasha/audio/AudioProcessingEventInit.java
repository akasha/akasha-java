package akasha.audio;

import akasha.EventInit;
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
    name = "Object"
)
public interface AudioProcessingEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final AudioBuffer inputBuffer,
      @Nonnull final AudioBuffer outputBuffer, final double playbackTime) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).inputBuffer( inputBuffer ).outputBuffer( outputBuffer ).playbackTime( playbackTime );
  }

  @JsProperty(
      name = "inputBuffer"
  )
  @Nonnull
  AudioBuffer inputBuffer();

  @JsProperty
  void setInputBuffer(@Nonnull AudioBuffer inputBuffer);

  @JsProperty(
      name = "outputBuffer"
  )
  @Nonnull
  AudioBuffer outputBuffer();

  @JsProperty
  void setOutputBuffer(@Nonnull AudioBuffer outputBuffer);

  @JsProperty(
      name = "playbackTime"
  )
  double playbackTime();

  @JsProperty
  void setPlaybackTime(double playbackTime);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends AudioProcessingEventInit {
    @JsOverlay
    @Nonnull
    default Builder inputBuffer(@Nonnull final AudioBuffer inputBuffer) {
      setInputBuffer( inputBuffer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder outputBuffer(@Nonnull final AudioBuffer outputBuffer) {
      setOutputBuffer( outputBuffer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder playbackTime(final double playbackTime) {
      setPlaybackTime( playbackTime );
      return this;
    }

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
