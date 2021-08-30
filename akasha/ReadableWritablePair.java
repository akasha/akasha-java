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
    name = "ReadableWritablePair"
)
public interface ReadableWritablePair {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final ReadableStream readable,
      @Nonnull final WritableStream writable) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).readable( readable ).writable( writable );
  }

  @JsProperty(
      name = "readable"
  )
  @JsNonNull
  ReadableStream readable();

  @JsProperty
  void setReadable(@JsNonNull ReadableStream readable);

  @JsProperty(
      name = "writable"
  )
  @JsNonNull
  WritableStream writable();

  @JsProperty
  void setWritable(@JsNonNull WritableStream writable);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ReadableWritablePair"
  )
  interface Builder extends ReadableWritablePair {
    @JsOverlay
    @Nonnull
    default Builder readable(@Nonnull final ReadableStream readable) {
      setReadable( readable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder writable(@Nonnull final WritableStream writable) {
      setWritable( writable );
      return this;
    }
  }
}
