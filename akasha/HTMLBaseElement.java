package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLBaseElement interface contains the base URI for a document. This object inherits all of the properties and methods as described in the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBaseElement">HTMLBaseElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#htmlbaseelement"># htmlbaseelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLBaseElement"
)
public class HTMLBaseElement extends HTMLElement {
  @JsNonNull
  public String href;

  @JsNonNull
  public String target;

  protected HTMLBaseElement() {
  }
}
