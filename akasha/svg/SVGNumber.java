package akasha.svg;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The SVGNumber interface corresponds to the &lt;number&gt; basic data type.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGNumber">SVGNumber - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/types.html#InterfaceSVGNumber"># InterfaceSVGNumber</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGNumber"
)
public class SVGNumber extends JsObject {
  public float value;

  protected SVGNumber() {
  }
}
