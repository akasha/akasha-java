package akasha.svg;

import akasha.DOMMatrixReadOnly;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The SVGTransformList defines a list of SVGTransform objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGTransformList">SVGTransformList - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/coords.html#InterfaceSVGTransformList">SVGTransformList - Scalable Vector Graphics (SVG) 2</a>
 * @see <a href="https://www.w3.org/TR/SVG11/coords.html#InterfaceSVGTransformList">SVGTransformList - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGTransformList"
)
public class SVGTransformList {
  protected SVGTransformList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "numberOfItems"
  )
  public native int numberOfItems();

  @Nonnull
  public native SVGTransform appendItem(@Nonnull SVGTransform newItem);

  public native void clear();

  @Nullable
  public native SVGTransform consolidate();

  @Nonnull
  public native SVGTransform createSVGTransformFromMatrix(@Nonnull DOMMatrixReadOnly matrix);

  @Nonnull
  public native SVGTransform initialize(@Nonnull SVGTransform newItem);

  @Nonnull
  public native SVGTransform insertItemBefore(@Nonnull SVGTransform newItem, int index);

  @Nonnull
  public native SVGTransform removeItem(int index);

  @Nonnull
  public native SVGTransform replaceItem(@Nonnull SVGTransform newItem, int index);

  @Nonnull
  public native SVGTransform getItem(int index);

  @JsOverlay
  public final void setAt(final int index, @Nonnull final SVGTransform newItem) {
    Js.<JsArrayLike<SVGTransform>>cast( this ).setAt( index, newItem );
  }
}
