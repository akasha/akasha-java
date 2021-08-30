package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The AudioContext() constructor creates a new AudioContext object which represents an audio-processing graph, built from audio modules linked together, each represented by an AudioNode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions">AudioContextOptions - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-audiocontext"># dom-audiocontext-audiocontext</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioContextOptions"
)
public interface AudioContextOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
   */
  @JsProperty(
      name = "latencyHint"
  )
  AudioContextLatencyCategoryOrDoubleUnion latencyHint();

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
   */
  @JsProperty
  void setLatencyHint(@JsNonNull AudioContextLatencyCategoryOrDoubleUnion latencyHint);

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
   */
  @JsOverlay
  default void setLatencyHint(@Nonnull final String latencyHint) {
    setLatencyHint( AudioContextLatencyCategoryOrDoubleUnion.of( latencyHint ) );
  }

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
   */
  @JsOverlay
  default void setLatencyHint(final double latencyHint) {
    setLatencyHint( AudioContextLatencyCategoryOrDoubleUnion.of( latencyHint ) );
  }

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named sampleRate, which indicates the sample rate to use for the new context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/sampleRate">AudioContextOptions.sampleRate - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-samplerate">AudioContextOptions.sampleRate - Web Audio API</a>
   */
  @JsProperty(
      name = "sampleRate"
  )
  float sampleRate();

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named sampleRate, which indicates the sample rate to use for the new context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/sampleRate">AudioContextOptions.sampleRate - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-samplerate">AudioContextOptions.sampleRate - Web Audio API</a>
   */
  @JsProperty
  void setSampleRate(float sampleRate);

  /**
   * The AudioContext() constructor creates a new AudioContext object which represents an audio-processing graph, built from audio modules linked together, each represented by an AudioNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions">AudioContextOptions - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-audiocontext"># dom-audiocontext-audiocontext</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioContextOptions"
  )
  interface Builder extends AudioContextOptions {
    /**
     * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
     * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder latencyHint(@Nonnull final String latencyHint) {
      setLatencyHint( latencyHint );
      return this;
    }

    /**
     * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
     * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder latencyHint(final double latencyHint) {
      setLatencyHint( latencyHint );
      return this;
    }

    /**
     * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named sampleRate, which indicates the sample rate to use for the new context.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/sampleRate">AudioContextOptions.sampleRate - MDN</a>
     * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-samplerate">AudioContextOptions.sampleRate - Web Audio API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder sampleRate(final float sampleRate) {
      setSampleRate( sampleRate );
      return this;
    }
  }
}
