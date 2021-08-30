package akasha.svg;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The SVGUnitTypes interface defines a commonly used set of constants used for reflecting gradientUnits, patternContentUnits and other similar attributes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGUnitTypes">SVGUnitTypes - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/types.html#InterfaceSVGUnitTypes">(SVG) # InterfaceSVGUnitTypes</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGUnitTypes"
)
public class SVGUnitTypes extends JsObject {
  @JsOverlay
  public static final int SVG_UNIT_TYPE_OBJECTBOUNDINGBOX = 2;

  @JsOverlay
  public static final int SVG_UNIT_TYPE_UNKNOWN = 0;

  @JsOverlay
  public static final int SVG_UNIT_TYPE_USERSPACEONUSE = 1;

  protected SVGUnitTypes() {
  }
}
