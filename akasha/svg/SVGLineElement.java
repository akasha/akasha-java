package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGLineElement interface provides access to the properties of &lt;line&gt; elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGLineElement">SVGLineElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/shapes.html#InterfaceSVGLineElement"># InterfaceSVGLineElement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGLineElement"
)
public class SVGLineElement extends SVGGeometryElement {
  protected SVGLineElement() {
  }

  @JsProperty(
      name = "x1"
  )
  @Nonnull
  public native SVGAnimatedLength x1();

  @JsProperty(
      name = "x2"
  )
  @Nonnull
  public native SVGAnimatedLength x2();

  @JsProperty(
      name = "y1"
  )
  @Nonnull
  public native SVGAnimatedLength y1();

  @JsProperty(
      name = "y2"
  )
  @Nonnull
  public native SVGAnimatedLength y2();
}
