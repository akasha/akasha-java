package akasha;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLLegendElement is an interface allowing to access properties of the &lt;legend&gt; elements. It inherits properties and methods from the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLegendElement">HTMLLegendElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/form-elements.html#htmllegendelement">(HTML) # htmllegendelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLLegendElement"
)
public class HTMLLegendElement extends HTMLElement {
  @JsNonNull
  public String align;

  protected HTMLLegendElement() {
  }

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();
}
