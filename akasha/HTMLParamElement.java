package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLParamElement interface provides special properties (beyond those of the regular HTMLElement object interface it inherits) for manipulating &lt;param&gt; elements, representing a pair of a key and a value that acts as a parameter for an &lt;object&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLParamElement">HTMLParamElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/iframe-embed-object.html#htmlparamelement"># htmlparamelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLParamElement"
)
public class HTMLParamElement extends HTMLElement {
  @JsNonNull
  public String name;

  @JsNonNull
  public String type;

  @JsNonNull
  public String value;

  @JsNonNull
  public String valueType;

  protected HTMLParamElement() {
  }
}
