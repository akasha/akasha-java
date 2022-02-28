package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGClipPathElement interface provides access to the properties of &lt;clipPath&gt; elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGClipPathElement">SVGClipPathElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/css-masking/#InterfaceSVGClipPathElement"># InterfaceSVGClipPathElement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGClipPathElement"
)
public class SVGClipPathElement extends SVGElement {
  protected SVGClipPathElement() {
  }

  @JsProperty(
      name = "clipPathUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration clipPathUnits();

  @JsProperty(
      name = "transform"
  )
  @Nonnull
  public native SVGAnimatedTransformList transform();
}
