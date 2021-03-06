package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An object implementing the CSSConditionRule interface represents a single condition CSS at-rule, which consists of a condition and a statement block.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSConditionRule">CSSConditionRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-conditional/#the-cssconditionrule-interface">(CSS Conditional 3) # the-cssconditionrule-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSConditionRule"
)
public class CSSConditionRule extends CSSGroupingRule {
  @JsNonNull
  public String conditionText;

  protected CSSConditionRule() {
  }
}
