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
    name = "StringOrCanvasFilterUnion"
)
public interface StringOrCanvasFilterUnion {
  @JsOverlay
  @Nonnull
  static StringOrCanvasFilterUnion of(@Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static StringOrCanvasFilterUnion of(@Nonnull final CanvasFilter value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isCanvasFilter() {
    return ( (Object) this ) instanceof CanvasFilter;
  }

  @JsOverlay
  default CanvasFilter asCanvasFilter() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isString() {
    return ( (Object) this ) instanceof String;
  }

  @JsOverlay
  default String asString() {
    return Js.asString( this );
  }
}
