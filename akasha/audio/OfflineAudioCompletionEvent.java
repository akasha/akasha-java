package akasha.audio;

import akasha.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Web Audio API OfflineAudioCompletionEvent interface represents events that occur when the processing of an OfflineAudioContext is terminated. The complete event implements this interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OfflineAudioCompletionEvent">OfflineAudioCompletionEvent - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#OfflineAudioCompletionEvent">OfflineAudioCompletionEvent - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OfflineAudioCompletionEvent"
)
public class OfflineAudioCompletionEvent extends Event {
  /**
   * The OfflineAudioCompletionEvent() constructor of the Web Audio API creates a new OfflineAudioCompletionEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OfflineAudioCompletionEvent/OfflineAudioCompletionEvent">OfflineAudioCompletionEvent.OfflineAudioCompletionEvent - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-offlineaudiocompletionevent-offlineaudiocompletionevent">OfflineAudioCompletionEvent() - Web Audio API</a>
   */
  public OfflineAudioCompletionEvent(@Nonnull final String type,
      @Nonnull final OfflineAudioCompletionEventInit eventInitDict) {
    super( null );
  }

  /**
   * The renderedBuffer read-only property of the OfflineAudioCompletionEvent interface is an AudioBuffer containing the result of processing an OfflineAudioContext.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OfflineAudioCompletionEvent/renderedBuffer">OfflineAudioCompletionEvent.renderedBuffer - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-offlineaudiocompletionevent-renderedbuffer">renderedBuffer - Web Audio API</a>
   */
  @JsProperty(
      name = "renderedBuffer"
  )
  @Nonnull
  public native AudioBuffer renderedBuffer();
}
