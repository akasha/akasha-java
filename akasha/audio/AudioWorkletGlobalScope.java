package akasha.audio;

import akasha.WorkletGlobalScope;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioWorkletGlobalScope interface of the Web Audio API represents a global execution context for user-supplied code, which defines custom AudioWorkletProcessor-derived classes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletGlobalScope">AudioWorkletGlobalScope - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#AudioWorkletGlobalScope"># AudioWorkletGlobalScope</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioWorkletGlobalScope"
)
public class AudioWorkletGlobalScope extends WorkletGlobalScope {
  protected AudioWorkletGlobalScope() {
  }

  @JsProperty(
      name = "currentFrame"
  )
  public native int currentFrame();

  @JsProperty(
      name = "currentTime"
  )
  public native double currentTime();

  @JsProperty(
      name = "sampleRate"
  )
  public native float sampleRate();

  /**
   * The registerProcessor method of the AudioWorkletGlobalScope interface registers a class constructor derived from AudioWorkletProcessor interface under a specified name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletGlobalScope/registerProcessor">AudioWorkletGlobalScope.registerProcessor - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioworkletglobalscope-registerprocessor">registerProcessor() - Web Audio API</a>
   */
  public native void registerProcessor(@Nonnull String name,
      @Nonnull AudioWorkletProcessorConstructor processorCtor);
}
