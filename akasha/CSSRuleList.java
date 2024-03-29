package akasha;

import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A CSSRuleList represents an ordered collection of read-only CSSRule objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSRuleList">CSSRuleList - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-cssrulelist-interface"># the-cssrulelist-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSRuleList"
)
public class CSSRuleList extends JsObject {
  protected CSSRuleList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @HasNoSideEffects
  @JsNullable
  public native CSSRule item(int index);
}
