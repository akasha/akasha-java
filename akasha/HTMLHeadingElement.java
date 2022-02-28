package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLHeadingElement interface represents the different heading elements, &lt;h1&gt; through &lt;h6&gt;. It inherits methods and properties from the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHeadingElement">HTMLHeadingElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/sections.html#htmlheadingelement"># htmlheadingelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLHeadingElement"
)
public class HTMLHeadingElement extends HTMLElement {
  @JsNonNull
  public String align;

  protected HTMLHeadingElement() {
  }
}
