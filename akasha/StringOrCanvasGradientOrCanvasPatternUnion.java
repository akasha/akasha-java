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
    name = "StringOrCanvasGradientOrCanvasPatternUnion"
)
public interface StringOrCanvasGradientOrCanvasPatternUnion {
  @JsOverlay
  @Nonnull
  static StringOrCanvasGradientOrCanvasPatternUnion of(@Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static StringOrCanvasGradientOrCanvasPatternUnion of(@Nonnull final CanvasGradient value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static StringOrCanvasGradientOrCanvasPatternUnion of(@Nonnull final CanvasPattern value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isCanvasGradient() {
    return ( (Object) this ) instanceof CanvasGradient;
  }

  @JsOverlay
  default CanvasGradient asCanvasGradient() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isCanvasPattern() {
    return ( (Object) this ) instanceof CanvasPattern;
  }

  @JsOverlay
  default CanvasPattern asCanvasPattern() {
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
