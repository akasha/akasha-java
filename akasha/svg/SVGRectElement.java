package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGRectElement interface provides access to the properties of &lt;rect&gt; elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGRectElement">SVGRectElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/shapes.html#InterfaceSVGRectElement"># InterfaceSVGRectElement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGRectElement"
)
public class SVGRectElement extends SVGGeometryElement {
  protected SVGRectElement() {
  }

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "rx"
  )
  @Nonnull
  public native SVGAnimatedLength rx();

  @JsProperty(
      name = "ry"
  )
  @Nonnull
  public native SVGAnimatedLength ry();

  @JsProperty(
      name = "width"
  )
  @Nonnull
  public native SVGAnimatedLength width();

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedLength x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLength y();
}
