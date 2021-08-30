package akasha.audio;

import akasha.MessagePort;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioWorkletProcessor interface of the Web Audio API represents an audio processing code behind a custom AudioWorkletNode. It lives in the AudioWorkletGlobalScope and runs on the Web Audio rendering thread. In turn, an AudioWorkletNode based on it runs on the main thread.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletProcessor">AudioWorkletProcessor - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#AudioWorkletProcessor"># AudioWorkletProcessor</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioWorkletProcessor"
)
public class AudioWorkletProcessor extends JsObject {
  /**
   * The AudioWorkletProcessor() constructor creates a new AudioWorkletProcessor object, which represents an underlying audio processing mechanism of an AudioWorkletNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletProcessor/AudioWorkletProcessor">AudioWorkletProcessor.AudioWorkletProcessor - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioworkletprocessor-audioworkletprocessor">AudioWorkletProcessor() - Web Audio API</a>
   */
  public AudioWorkletProcessor() {
  }

  /**
   * The read-only port property of the AudioWorkletProcessor interface returns the associated MessagePort. It can be used to communicate between the processor and the AudioWorkletNode to which it belongs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletProcessor/port">AudioWorkletProcessor.port - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioworkletprocessor-port">port - Web Audio API</a>
   */
  @JsProperty(
      name = "port"
  )
  @Nonnull
  public native MessagePort port();
}
