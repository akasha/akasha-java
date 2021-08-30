package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableSectionElement interface provides special properties and methods (beyond the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of sections, that is headers, footers and bodies, in an HTML table.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableSectionElement">HTMLTableSectionElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#htmltablesectionelement">(HTML) # htmltablesectionelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableSectionElement"
)
public class HTMLTableSectionElement extends HTMLElement {
  @JsNonNull
  public String align;

  @JsNonNull
  public String ch;

  @JsNonNull
  public String chOff;

  @JsNonNull
  public String vAlign;

  protected HTMLTableSectionElement() {
  }

  @JsProperty(
      name = "rows"
  )
  @Nonnull
  public native HTMLCollection rows();

  public native void deleteRow(int index);

  @JsNonNull
  public native HTMLTableRowElement insertRow(int index);

  @JsNonNull
  public native HTMLTableRowElement insertRow();
}
