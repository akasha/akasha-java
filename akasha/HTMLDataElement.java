package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLDataElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating &lt;data&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDataElement">HTMLDataElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#htmldataelement"># htmldataelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLDataElement"
)
public class HTMLDataElement extends HTMLElement {
  /**
   * The value property of the HTMLDataElement interface returns a DOMString reflecting the value HTML attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDataElement/value">HTMLDataElement.value - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-data-value">HTMLDataElement.value - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/text-level-semantics.html#dom-data-value">value - HTML5</a>
   */
  @JsNonNull
  public String value;

  protected HTMLDataElement() {
  }
}
