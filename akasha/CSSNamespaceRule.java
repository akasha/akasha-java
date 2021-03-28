package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSNamespaceRule interface describes an object representing a single CSS @namespace at-rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSNamespaceRule">CSSNamespaceRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-cssnamespacerule-interface">CSSNamespaceRule - CSS Object Model (CSSOM)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSNamespaceRule"
)
public class CSSNamespaceRule extends CSSRule {
  protected CSSNamespaceRule() {
  }

  /**
   * The CSSNamespaceRule.namespaceURI read-only property returns a DOMString containing the text of the URI of the given namespace.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSNamespaceRule/namespaceURI">CSSNamespaceRule.namespaceURI - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssnamespacerule-namespaceuri">namespaceURI - CSS Object Model (CSSOM)</a>
   */
  @JsProperty(
      name = "namespaceURI"
  )
  @Nonnull
  public native String namespaceURI();

  /**
   * The CSSNamespaceRule.prefix read-only property returns a DOMString with the name of the prefix associated to this namespace. If there is no such prefix, returns  null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSNamespaceRule/prefix">CSSNamespaceRule.prefix - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssnamespacerule-namespaceuri">namespaceURI - CSS Object Model (CSSOM)</a>
   */
  @JsProperty(
      name = "prefix"
  )
  @Nonnull
  public native String prefix();
}
