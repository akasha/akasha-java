package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLMetaElement interface contains descriptive metadata about a document. It inherits all of the properties and methods described in the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMetaElement">HTMLMetaElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#htmlmetaelement">(HTML) # htmlmetaelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLMetaElement"
)
public class HTMLMetaElement extends HTMLElement {
  @JsNonNull
  public String content;

  @JsNonNull
  public String httpEquiv;

  @JsNonNull
  public String media;

  @JsNonNull
  public String name;

  @JsNonNull
  public String scheme;

  protected HTMLMetaElement() {
  }
}
