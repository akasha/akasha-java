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
    name = "FormDataEntryValue"
)
public interface FormDataEntryValue {
  @JsOverlay
  @Nonnull
  static FormDataEntryValue of(@Nonnull final File value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static FormDataEntryValue of(@Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isFile() {
    return ( (Object) this ) instanceof File;
  }

  @JsOverlay
  default File asFile() {
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
