package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSKeyframesRule interface describes an object representing a complete set of keyframes for a CSS animation. It corresponds to the contents of a whole @keyframes at-rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSKeyframesRule">CSSKeyframesRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-animations/#interface-csskeyframesrule">(CSS Animations 2) # interface-csskeyframesrule</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSKeyframesRule"
)
public class CSSKeyframesRule extends CSSRule {
  @JsNonNull
  public String name;

  protected CSSKeyframesRule() {
  }

  @JsProperty(
      name = "cssRules"
  )
  @Nonnull
  public native CSSRuleList cssRules();

  public native void appendRule(@Nonnull String rule);

  public native void deleteRule(@Nonnull String select);

  @JsNullable
  public native CSSKeyframeRule findRule(@Nonnull String select);
}
