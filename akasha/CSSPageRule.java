package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * CSSPageRule represents a single CSS @page rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSPageRule">CSSPageRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-csspagerule-interface">(CSSOM) # the-csspagerule-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSPageRule"
)
public class CSSPageRule extends CSSGroupingRule {
  @JsNonNull
  public String selectorText;

  protected CSSPageRule() {
  }

  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();
}
