package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEDistantLightElement interface corresponds to the &lt;feDistantLight&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEDistantLightElement">SVGFEDistantLightElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEDistantLightElement"># InterfaceSVGFEDistantLightElement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEDistantLightElement"
)
public class SVGFEDistantLightElement extends SVGElement {
  protected SVGFEDistantLightElement() {
  }

  @JsProperty(
      name = "azimuth"
  )
  @Nonnull
  public native SVGAnimatedNumber azimuth();

  @JsProperty(
      name = "elevation"
  )
  @Nonnull
  public native SVGAnimatedNumber elevation();
}
