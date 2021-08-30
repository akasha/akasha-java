package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "ReadableStreamGetReaderOptions"
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
  void setMode(@ReadableStreamReaderMode @JsNonNull String mode);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ReadableStreamGetReaderOptions"
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
