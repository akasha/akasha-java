package akasha.svg;

import akasha.HTMLOrSVGScriptElement;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGScriptElement interface corresponds to the SVG &lt;script&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGScriptElement">SVGScriptElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/interact.html#InterfaceSVGScriptElement">(SVG) # InterfaceSVGScriptElement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGScriptElement"
)
public class SVGScriptElement extends SVGElement implements HTMLOrSVGScriptElement {
  @JsNullable
  public String crossOrigin;

  @JsNonNull
  public String type;

  protected SVGScriptElement() {
  }

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native SVGAnimatedString href();
}
