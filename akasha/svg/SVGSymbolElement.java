package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGSymbolElement interface corresponds to the &lt;symbol&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGSymbolElement">SVGSymbolElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/struct.html#InterfaceSVGSymbolElement"># InterfaceSVGSymbolElement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGSymbolElement"
)
public class SVGSymbolElement extends SVGGraphicsElement {
  protected SVGSymbolElement() {
  }

  @JsProperty(
      name = "preserveAspectRatio"
  )
  @Nonnull
  public native SVGAnimatedPreserveAspectRatio preserveAspectRatio();

  @JsProperty(
      name = "viewBox"
  )
  @Nonnull
  public native SVGAnimatedRect viewBox();
}
