package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLQuoteElement interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating quoting elements, like &lt;blockquote&gt; and &lt;q&gt;, but not the &lt;cite&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLQuoteElement">HTMLQuoteElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#htmlquoteelement">(HTML) # htmlquoteelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLQuoteElement"
)
public class HTMLQuoteElement extends HTMLElement {
  @Nonnull
  public String cite;

  protected HTMLQuoteElement() {
  }
}
