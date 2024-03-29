package akasha;

import akasha.lang.JsArray;
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
    name = "CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion"
)
public interface CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion {
  @JsOverlay
  @Nonnull
  static CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion of(
      @CompositeOperationOrAuto @Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion of(
      @Nonnull final JsArray<String> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion of(
      @Nonnull final String... value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isArray() {
    return ( (Object) this ) instanceof JsArray;
  }

  @JsOverlay
  default JsArray<String> asArray() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isCompositeOperationOrAuto() {
    return ( (Object) this ) instanceof String;
  }

  @JsOverlay
  @CompositeOperationOrAuto
  default String asCompositeOperationOrAuto() {
    return Js.asString( this );
  }
}
