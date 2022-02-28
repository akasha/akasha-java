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
    name = "ElementOrCSSPseudoElementUnion"
)
public interface ElementOrCSSPseudoElementUnion {
  @JsOverlay
  @Nonnull
  static ElementOrCSSPseudoElementUnion of(@Nonnull final Element value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ElementOrCSSPseudoElementUnion of(@Nonnull final CSSPseudoElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isCSSPseudoElement() {
    return ( (Object) this ) instanceof CSSPseudoElement;
  }

  @JsOverlay
  default CSSPseudoElement asCSSPseudoElement() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isElement() {
    return ( (Object) this ) instanceof Element;
  }

  @JsOverlay
  default Element asElement() {
    return Js.cast( this );
  }
}
