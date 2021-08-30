package akasha.svg;

import akasha.DOMMatrixReadOnly;
import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
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
 * @see <a href="https://svgwg.org/svg2-draft/coords.html#InterfaceSVGTransformList">(SVG) # InterfaceSVGTransformList</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGTransformList"
)
public class SVGTransformList extends JsObject {
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

  @JsNonNull
  public native SVGTransform appendItem(@Nonnull SVGTransform newItem);

  public native void clear();

  @JsNullable
  public native SVGTransform consolidate();

  @JsNonNull
  public native SVGTransform createSVGTransformFromMatrix(@Nonnull DOMMatrixReadOnly matrix);

  @JsNonNull
  public native SVGTransform initialize(@Nonnull SVGTransform newItem);

  @JsNonNull
  public native SVGTransform insertItemBefore(@Nonnull SVGTransform newItem, int index);

  @JsNonNull
  public native SVGTransform removeItem(int index);

  @JsNonNull
  public native SVGTransform replaceItem(@Nonnull SVGTransform newItem, int index);

  @HasNoSideEffects
  @JsNonNull
  public native SVGTransform getItem(int index);

  @JsOverlay
  public final void setAt(final int index, @Nonnull final SVGTransform newItem) {
    Js.<JsArrayLike<SVGTransform>>cast( this ).setAt( index, newItem );
  }
}
