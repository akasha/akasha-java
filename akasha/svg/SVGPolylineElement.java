package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGPolylineElement interface provides access to the properties of &lt;polyline&gt; elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGPolylineElement">SVGPolylineElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/shapes.html#InterfaceSVGPolylineElement">(SVG) # InterfaceSVGPolylineElement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGPolylineElement"
)
public class SVGPolylineElement extends SVGGeometryElement {
  protected SVGPolylineElement() {
  }

  @JsProperty(
      name = "animatedPoints"
  )
  @Nonnull
  public native SVGPointList animatedPoints();

  @JsProperty(
      name = "points"
  )
  @Nonnull
  public native SVGPointList points();
}
