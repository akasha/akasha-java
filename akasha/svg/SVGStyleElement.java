package akasha.svg;

import akasha.CSSStyleSheet;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGStyleElement interface corresponds to the SVG &lt;style&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGStyleElement">SVGStyleElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/styling.html#InterfaceSVGStyleElement"># InterfaceSVGStyleElement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGStyleElement"
)
public class SVGStyleElement extends SVGElement {
  @JsNonNull
  public String media;

  @JsNonNull
  public String title;

  @JsNonNull
  public String type;

  protected SVGStyleElement() {
  }

  @JsProperty(
      name = "sheet"
  )
  @Nullable
  public native CSSStyleSheet sheet();
}
