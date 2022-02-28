package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableColElement interface provides properties for manipulating single or grouped table column elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableColElement">HTMLTableColElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#htmltablecolelement"># htmltablecolelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableColElement"
)
public class HTMLTableColElement extends HTMLElement {
  @JsNonNull
  public String align;

  @JsNonNull
  public String ch;

  @JsNonNull
  public String chOff;

  public int span;

  @JsNonNull
  public String vAlign;

  @JsNonNull
  public String width;

  protected HTMLTableColElement() {
  }
}
