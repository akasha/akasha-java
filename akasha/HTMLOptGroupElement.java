package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLOptGroupElement interface provides special properties and methods (beyond the regular HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of &lt;optgroup&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOptGroupElement">HTMLOptGroupElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/form-elements.html#htmloptgroupelement">(HTML) # htmloptgroupelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLOptGroupElement"
)
public class HTMLOptGroupElement extends HTMLElement {
  public boolean disabled;

  @JsNonNull
  public String label;

  protected HTMLOptGroupElement() {
  }
}
