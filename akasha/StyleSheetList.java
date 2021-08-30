package akasha;

import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The StyleSheetList interface represents a list of CSSStyleSheet objects. An instance of this object can be returned by Document.styleSheets.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StyleSheetList">StyleSheetList - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-stylesheetlist-interface">(CSSOM) # the-stylesheetlist-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "StyleSheetList"
)
public class StyleSheetList extends JsObject {
  protected StyleSheetList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @HasNoSideEffects
  @JsNullable
  public native CSSStyleSheet item(int index);
}
