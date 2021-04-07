package akasha;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
    name = "Object"
)
public interface ReadableStreamDefaultReadResult {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "value"
  )
  @Nullable
  Any value();

  @JsProperty
  void setValue(@DoNotAutobox @Nullable Object value);

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
      name = "Object"
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
