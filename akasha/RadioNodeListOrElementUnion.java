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
    name = "RadioNodeListOrElementUnion"
)
public interface RadioNodeListOrElementUnion {
  @JsOverlay
  @Nonnull
  static RadioNodeListOrElementUnion of(@Nonnull final RadioNodeList value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static RadioNodeListOrElementUnion of(@Nonnull final Element value) {
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
  default boolean isRadioNodeList() {
    return ( (Object) this ) instanceof RadioNodeList;
  }

  @JsOverlay
  default RadioNodeList asRadioNodeList() {
    return Js.cast( this );
  }
}
