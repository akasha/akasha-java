package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLBRElement interface represents a HTML line break element (&lt;br&gt;). It inherits from HTMLElement.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBRElement">HTMLBRElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#htmlbrelement">(HTML) # htmlbrelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLBRElement"
)
public class HTMLBRElement extends HTMLElement {
  @JsNonNull
  public String clear;

  protected HTMLBRElement() {
  }
}
