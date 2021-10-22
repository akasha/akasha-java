package akasha;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ReadableStreamDefaultReadResult"
)
public interface ReadableStreamDefaultReadResult {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "value"
  )
  @JsNullable
  Any value();

  @JsProperty
  void setValue(@DoNotAutobox @JsNullable Object value);

  @JsProperty(
      name = "done"
  )
  boolean done();

  @JsProperty
  void setDone(boolean done);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ReadableStreamDefaultReadResult"
  )
  interface Builder extends ReadableStreamDefaultReadResult {
    @JsOverlay
    @Nonnull
    default Builder value(@DoNotAutobox @Nullable final Object value) {
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
