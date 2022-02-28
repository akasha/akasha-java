package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The DOMParser interface provides the ability to parse XML or HTML source code from a string into a DOM Document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMParser">DOMParser - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/dynamic-markup-insertion.html#dom-parsing-and-serialization"># dom-parsing-and-serialization</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMParser"
)
public class DOMParser extends JsObject {
  /**
   * The DOMParser() constructor creates a new DOMParser object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMParser/DOMParser">DOMParser.DOMParser - MDN</a>
   */
  public DOMParser() {
  }

  @JsNonNull
  public native Document parseFromString(@Nonnull String string,
      @DOMParserSupportedType @Nonnull String type);
}
