package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLOptionElement interface represents &lt;option&gt; elements and inherits all properties and methods of the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOptionElement">HTMLOptionElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/form-elements.html#htmloptionelement">(HTML) # htmloptionelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLOptionElement"
)
public class HTMLOptionElement extends HTMLElement {
  public boolean defaultSelected;

  public boolean disabled;

  @Nonnull
  public String label;

  public boolean selected;

  @Nonnull
  public String text;

  @Nonnull
  public String value;

  protected HTMLOptionElement() {
  }

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  @JsProperty(
      name = "index"
  )
  public native int index();
}
