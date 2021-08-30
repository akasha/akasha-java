package akasha;

import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * This interface inherits the methods of its parent, HTMLCollection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOptionsCollection">HTMLOptionsCollection - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/common-dom-interfaces.html#the-htmloptionscollection-interface">(HTML) # the-htmloptionscollection-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLOptionsCollection"
)
public class HTMLOptionsCollection extends HTMLCollection {
  public int length;

  public int selectedIndex;

  protected HTMLOptionsCollection() {
  }

  public native void add(@Nonnull HTMLOptionElement element, @Nonnull HTMLElement before);

  public native void add(@Nonnull HTMLOptGroupElement element, @Nonnull HTMLElement before);

  public native void add(@Nonnull HTMLOptionElement element, int before);

  public native void add(@Nonnull HTMLOptGroupElement element, int before);

  public native void add(@Nonnull HTMLOptionElement element);

  public native void add(@Nonnull HTMLOptGroupElement element);

  public native void remove(int index);

  @JsOverlay
  public final void setAt(final int index, @Nullable final HTMLOptionElement option) {
    Js.<JsArrayLike<HTMLOptionElement>>cast( this ).setAt( index, option );
  }

  @HasNoSideEffects
  @JsNullable
  public native HTMLOptionElement item(int index);

  @HasNoSideEffects
  @JsNullable
  public native HTMLOptionElement namedItem(@Nonnull String name);
}
