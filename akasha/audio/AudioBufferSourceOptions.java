package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
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
    name = "AudioBufferSourceOptions"
)
public interface AudioBufferSourceOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "buffer"
  )
  @JsNullable
  AudioBuffer buffer();

  @JsProperty
  void setBuffer(@JsNullable AudioBuffer buffer);

  @JsProperty(
      name = "detune"
  )
  float detune();

  @JsProperty
  void setDetune(float detune);

  @JsProperty(
      name = "loop"
  )
  boolean loop();

  @JsProperty
  void setLoop(boolean loop);

  @JsProperty(
      name = "loopEnd"
  )
  double loopEnd();

  @JsProperty
  void setLoopEnd(double loopEnd);

  @JsProperty(
      name = "loopStart"
  )
  double loopStart();

  @JsProperty
  void setLoopStart(double loopStart);

  @JsProperty(
      name = "playbackRate"
  )
  float playbackRate();

  @JsProperty
  void setPlaybackRate(float playbackRate);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioBufferSourceOptions"
  )
  interface Builder extends AudioBufferSourceOptions {
    @JsOverlay
    @Nonnull
    default Builder buffer(@Nullable final AudioBuffer buffer) {
      setBuffer( buffer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder detune(final float detune) {
      setDetune( detune );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder loop(final boolean loop) {
      setLoop( loop );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder loopEnd(final double loopEnd) {
      setLoopEnd( loopEnd );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder loopStart(final double loopStart) {
      setLoopStart( loopStart );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder playbackRate(final float playbackRate) {
      setPlaybackRate( playbackRate );
      return this;
    }
  }
}
