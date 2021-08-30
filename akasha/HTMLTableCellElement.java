package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableCellElement interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of table cells, either header or data cells, in an HTML document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableCellElement">HTMLTableCellElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#htmltablecellelement">(HTML) # htmltablecellelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableCellElement"
)
public class HTMLTableCellElement extends HTMLElement {
  @JsNonNull
  public String abbr;

  @JsNonNull
  public String align;

  @JsNonNull
  public String axis;

  @JsNonNull
  public String bgColor;

  @JsNonNull
  public String ch;

  @JsNonNull
  public String chOff;

  public int colSpan;

  @JsNonNull
  public String headers;

  @JsNonNull
  public String height;

  public boolean noWrap;

  public int rowSpan;

  @JsNonNull
  @ScopeType
  public String scope;

  @JsNonNull
  public String vAlign;

  @JsNonNull
  public String width;

  protected HTMLTableCellElement() {
  }

  @JsProperty(
      name = "cellIndex"
  )
  public native int cellIndex();
}
