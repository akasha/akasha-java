package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSMediaRule interface represents a single CSS @media rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSMediaRule">CSSMediaRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-conditional-3/#the-cssmediarule-interface"># the-cssmediarule-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSMediaRule"
)
public class CSSMediaRule extends CSSConditionRule {
  protected CSSMediaRule() {
  }

  @JsProperty(
      name = "media"
  )
  @Nonnull
  public native MediaList media();
}
