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
 * The SVGNumberList defines a list of SVGNumber objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGNumberList">SVGNumberList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGNumberList"
)
public class SVGNumberList extends JsObject {
  protected SVGNumberList() {
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
  public native SVGNumber appendItem(@Nonnull SVGNumber newItem);

  public native void clear();

  @JsNonNull
  public native SVGNumber initialize(@Nonnull SVGNumber newItem);

  @JsNonNull
  public native SVGNumber insertItemBefore(@Nonnull SVGNumber newItem, int index);

  @JsNonNull
  public native SVGNumber removeItem(int index);

  @JsNonNull
  public native SVGNumber replaceItem(@Nonnull SVGNumber newItem, int index);

  @HasNoSideEffects
  @JsNonNull
  public native SVGNumber getItem(int index);

  @JsOverlay
  public final void setAt(final int index, @Nonnull final SVGNumber newItem) {
    Js.<JsArrayLike<SVGNumber>>cast( this ).setAt( index, newItem );
  }
}
