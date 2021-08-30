package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The CSSCounterStyleRule interface represents an @counter-style at-rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSCounterStyleRule">CSSCounterStyleRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-counter-styles/#the-csscounterstylerule-interface">(CSS Counter Styles 3) # the-csscounterstylerule-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSCounterStyleRule"
)
public class CSSCounterStyleRule extends CSSRule {
  @JsNonNull
  public String additiveSymbols;

  @JsNonNull
  public String fallback;

  @JsNonNull
  public String name;

  @JsNonNull
  public String negative;

  @JsNonNull
  public String pad;

  @JsNonNull
  public String prefix;

  @JsNonNull
  public String range;

  @JsNonNull
  public String speakAs;

  @JsNonNull
  public String suffix;

  @JsNonNull
  public String symbols;

  @JsNonNull
  public String system;

  protected CSSCounterStyleRule() {
  }
}
