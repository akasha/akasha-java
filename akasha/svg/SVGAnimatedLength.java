package akasha.svg;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedLength interface represents attributes of type &lt;length&gt; which can be animated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedLength">SVGAnimatedLength - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/types.html#InterfaceSVGAnimatedLength"># InterfaceSVGAnimatedLength</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedLength"
)
public class SVGAnimatedLength extends JsObject {
  protected SVGAnimatedLength() {
  }

  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native SVGLength animVal();

  @JsProperty(
      name = "baseVal"
  )
  @Nonnull
  public native SVGLength baseVal();
}
