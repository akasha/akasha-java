package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLSourceElement interface provides special properties (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating &lt;source&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSourceElement">HTMLSourceElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#htmlsourceelement">(HTML) # htmlsourceelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLSourceElement"
)
public class HTMLSourceElement extends HTMLElement {
  public int height;

  @JsNonNull
  public String media;

  @JsNonNull
  public String sizes;

  @JsNonNull
  public String src;

  @JsNonNull
  public String srcset;

  @JsNonNull
  public String type;

  public int width;

  protected HTMLSourceElement() {
  }
}
