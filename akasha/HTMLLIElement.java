package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLLIElement interface exposes specific properties and methods (beyond those defined by regular HTMLElement interface it also has available to it by inheritance) for manipulating list elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLIElement">HTMLLIElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#htmllielement">(HTML) # htmllielement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLLIElement"
)
public class HTMLLIElement extends HTMLElement {
  @JsNonNull
  public String type;

  public int value;

  protected HTMLLIElement() {
  }
}
