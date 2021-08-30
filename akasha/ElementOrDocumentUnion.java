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
    name = "ElementOrDocumentUnion"
)
public interface ElementOrDocumentUnion {
  @JsOverlay
  @Nonnull
  static ElementOrDocumentUnion of(@Nonnull final Element value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ElementOrDocumentUnion of(@Nonnull final Document value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isDocument() {
    return ( (Object) this ) instanceof Document;
  }

  @JsOverlay
  default Document asDocument() {
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
