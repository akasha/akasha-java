package akasha;

import akasha.core.ArrayBufferView;
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
    name = "ReadableStreamBYOBReadResult"
)
public interface ReadableStreamBYOBReadResult {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "value"
  )
  ArrayBufferView value();

  @JsProperty
  void setValue(@JsNonNull ArrayBufferView value);

  @JsProperty(
      name = "done"
  )
  boolean done();

  @JsProperty
  void setDone(boolean done);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ReadableStreamBYOBReadResult"
  )
  interface Builder extends ReadableStreamBYOBReadResult {
    @JsOverlay
    @Nonnull
    default Builder value(@Nonnull final ArrayBufferView value) {
      setValue( value );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder done(final boolean done) {
      setDone( done );
      return this;
    }
  }
}
