package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLHRElement interface provides special properties (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating &lt;hr&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHRElement">HTMLHRElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#htmlhrelement">(HTML) # htmlhrelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLHRElement"
)
public class HTMLHRElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String color;

  public boolean noShade;

  @Nonnull
  public String size;

  @Nonnull
  public String width;

  protected HTMLHRElement() {
  }
}
