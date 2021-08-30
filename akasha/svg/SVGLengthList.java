package akasha.svg;

import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The SVGLengthList defines a list of SVGLength objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGLengthList">SVGLengthList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGLengthList"
)
public class SVGLengthList extends JsObject {
  protected SVGLengthList() {
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
  public native SVGLength appendItem(@Nonnull SVGLength newItem);

  public native void clear();

  @JsNonNull
  public native SVGLength initialize(@Nonnull SVGLength newItem);

  @JsNonNull
  public native SVGLength insertItemBefore(@Nonnull SVGLength newItem, int index);

  @JsNonNull
  public native SVGLength removeItem(int index);

  @JsNonNull
  public native SVGLength replaceItem(@Nonnull SVGLength newItem, int index);

  @HasNoSideEffects
  @JsNonNull
  public native SVGLength getItem(int index);

  @JsOverlay
  public final void setAt(final int index, @Nonnull final SVGLength newItem) {
    Js.<JsArrayLike<SVGLength>>cast( this ).setAt( index, newItem );
  }
}
