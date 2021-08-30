package akasha.media;

import akasha.core.JsObject;
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
    name = "ConstrainBoolean"
)
public interface ConstrainBoolean {
  @JsOverlay
  @Nonnull
  static ConstrainBoolean of(final boolean value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainBoolean of(@Nonnull final ConstrainBooleanParameters value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isBoolean() {
    return ( (Object) this ) instanceof Boolean;
  }

  @JsOverlay
  default boolean asBoolean() {
    return Js.asBoolean( this );
  }

  @JsOverlay
  default boolean isConstrainBooleanParameters() {
    return ( (Object) this ) instanceof JsObject;
  }

  @JsOverlay
  default ConstrainBooleanParameters asConstrainBooleanParameters() {
    return Js.cast( this );
  }
}
