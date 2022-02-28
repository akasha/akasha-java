package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The CDATASection interface represents a CDATA section that can be used within XML to include extended portions of unescaped text. When inside a CDATA section, the symbols &lt; and &amp; don't need escaping as they normally do.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CDATASection">CDATASection - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-cdatasection"># interface-cdatasection</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CDATASection"
)
public class CDATASection extends Text {
  protected CDATASection() {
  }
}
