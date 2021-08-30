package akasha;

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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLAllCollection"
)
public class HTMLAllCollection extends JsObject {
  protected HTMLAllCollection() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsNullable
  public native HTMLCollectionOrElementUnion item(@Nonnull String nameOrIndex);

  @JsNullable
  public native HTMLCollectionOrElementUnion item();

  @HasNoSideEffects
  @JsNullable
  public native HTMLCollectionOrElementUnion namedItem(@Nonnull String name);

  @JsOverlay
  @JsNonNull
  public final Element getAt(final int index) {
    return Js.<JsArrayLike<Element>>cast( this ).getAt( index );
  }
}
