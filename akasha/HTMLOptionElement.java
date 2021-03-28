package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLOptionElement interface represents &lt;option&gt; elements and inherits all classes and methods of the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOptionElement">HTMLOptionElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmloptionelement">HTMLOptionElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-option-element">HTMLOptionElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-70901257">HTMLOptionElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-70901257">HTMLOptionElement - Document Object Model (DOM) Level 1 Specification</a>
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
