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
  static Step1 readable(@Nonnull final ReadableStream readable) {
    final ReadableWritablePair $readableWritablePair = Js.<ReadableWritablePair>uncheckedCast( JsPropertyMap.of() );
    $readableWritablePair.setReadable( readable );
    return Js.uncheckedCast( $readableWritablePair );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ReadableWritablePair"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default ReadableWritablePair writable(@Nonnull WritableStream writable) {
      Js.<ReadableWritablePair>uncheckedCast( this ).setWritable( writable );
      return Js.uncheckedCast( this );
    }
  }
}
