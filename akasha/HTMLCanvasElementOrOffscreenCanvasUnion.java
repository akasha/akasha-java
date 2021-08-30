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
    name = "HTMLCanvasElementOrOffscreenCanvasUnion"
)
public interface HTMLCanvasElementOrOffscreenCanvasUnion {
  @JsOverlay
  @Nonnull
  static HTMLCanvasElementOrOffscreenCanvasUnion of(@Nonnull final HTMLCanvasElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static HTMLCanvasElementOrOffscreenCanvasUnion of(@Nonnull final OffscreenCanvas value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isHTMLCanvasElement() {
    return ( (Object) this ) instanceof HTMLCanvasElement;
  }

  @JsOverlay
  default HTMLCanvasElement asHTMLCanvasElement() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isOffscreenCanvas() {
    return ( (Object) this ) instanceof OffscreenCanvas;
  }

  @JsOverlay
  default OffscreenCanvas asOffscreenCanvas() {
    return Js.cast( this );
  }
}
