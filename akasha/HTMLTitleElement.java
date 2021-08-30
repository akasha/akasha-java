package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLTitleElement interface contains the title for a document. This element inherits all of the properties and methods of the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTitleElement">HTMLTitleElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#htmltitleelement">(HTML) # htmltitleelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTitleElement"
)
public class HTMLTitleElement extends HTMLElement {
  @JsNonNull
  public String text;

  protected HTMLTitleElement() {
  }
}
