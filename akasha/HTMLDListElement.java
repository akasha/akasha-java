package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLDListElement interface provides special properties (beyond those of the regular HTMLElement interface it also has available to it by inheritance) for manipulating definition list (&lt;dl&gt;) elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDListElement">HTMLDListElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#htmldlistelement"># htmldlistelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLDListElement"
)
public class HTMLDListElement extends HTMLElement {
  public boolean compact;

  protected HTMLDListElement() {
  }
}
