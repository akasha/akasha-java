package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEMergeNodeElement interface corresponds to the &lt;feMergeNode&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEMergeNodeElement">SVGFEMergeNodeElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEMergeNodeElement"># InterfaceSVGFEMergeNodeElement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEMergeNodeElement"
)
public class SVGFEMergeNodeElement extends SVGElement {
  protected SVGFEMergeNodeElement() {
  }

  @JsProperty(
      name = "in1"
  )
  @Nonnull
  public native SVGAnimatedString in1();
}
