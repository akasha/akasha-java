package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface ReadableStreamGetReaderOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "mode"
  )
  @ReadableStreamReaderMode
  String mode();

  @JsProperty
  void setMode(@ReadableStreamReaderMode @Nonnull String mode);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends ReadableStreamGetReaderOptions {
    @JsOverlay
    @Nonnull
    default Builder mode(@ReadableStreamReaderMode @Nonnull final String mode) {
      setMode( mode );
      return this;
    }
  }
}
