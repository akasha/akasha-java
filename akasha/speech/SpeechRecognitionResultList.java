package akasha.speech;

import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechRecognitionResultList interface of the Web Speech API represents a list of SpeechRecognitionResult objects, or a single one if results are being captured in continuous mode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResultList">SpeechRecognitionResultList - MDN</a>
 * @see <a href="https://wicg.github.io/speech-api/#speechreco-resultlist"># speechreco-resultlist</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SpeechRecognitionResultList"
)
public class SpeechRecognitionResultList extends JsObject {
  protected SpeechRecognitionResultList() {
  }

  /**
   * The length read-only property of the SpeechRecognitionResultList interface returns the length of the &quot;array&quot; &mdash; the number of SpeechRecognitionResult objects in the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResultList/length">SpeechRecognitionResultList.length - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognitionresultlist-length">length - Web Speech API</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The item getter of the SpeechRecognitionResultList interface is a standard getter &mdash; it allows SpeechRecognitionResult objects in the list to be accessed via array syntax.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResultList/item">SpeechRecognitionResultList.item - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognitionresultlist-item">item() - Web Speech API</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native SpeechRecognitionResult item(int index);
}
