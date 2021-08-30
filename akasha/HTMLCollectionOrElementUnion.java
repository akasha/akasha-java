package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLCollectionOrElementUnion"
)
public interface HTMLCollectionOrElementUnion {
  @JsOverlay
  @Nonnull
  static HTMLCollectionOrElementUnion of(@Nonnull final HTMLCollection value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static HTMLCollectionOrElementUnion of(@Nonnull final Element value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isElement() {
    return ( (Object) this ) instanceof Element;
  }

  @JsOverlay
  default Element asElement() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isHTMLCollection() {
    return ( (Object) this ) instanceof HTMLCollection;
  }

  @JsOverlay
  default HTMLCollection asHTMLCollection() {
    return Js.cast( this );
  }
}
