package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLEmbedElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating &lt;embed&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLEmbedElement">HTMLEmbedElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/iframe-embed-object.html#htmlembedelement"># htmlembedelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLEmbedElement"
)
public class HTMLEmbedElement extends HTMLElement {
  @JsNonNull
  public String align;

  @JsNonNull
  public String height;

  @JsNonNull
  public String name;

  @JsNonNull
  public String src;

  @JsNonNull
  public String type;

  @JsNonNull
  public String width;

  protected HTMLEmbedElement() {
  }

  @JsNullable
  public native Document getSVGDocument();
}
