package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableCaptionElement interface special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating table caption elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableCaptionElement">HTMLTableCaptionElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#htmltablecaptionelement"># htmltablecaptionelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableCaptionElement"
)
public class HTMLTableCaptionElement extends HTMLElement {
  @JsNonNull
  public String align;

  protected HTMLTableCaptionElement() {
  }
}
