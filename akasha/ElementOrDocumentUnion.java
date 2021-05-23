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
}
