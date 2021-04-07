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
public interface UnderlyingSink {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "start"
  )
  UnderlyingSinkStartCallback start();

  @JsProperty
  void setStart(@Nonnull UnderlyingSinkStartCallback start);

  @JsProperty(
      name = "write"
  )
  UnderlyingSinkWriteCallback write();

  @JsProperty
  void setWrite(@Nonnull UnderlyingSinkWriteCallback write);

  @JsProperty(
      name = "close"
  )
  UnderlyingSinkCloseCallback close();

  @JsProperty
  void setClose(@Nonnull UnderlyingSinkCloseCallback close);

  @JsProperty(
      name = "abort"
  )
  UnderlyingSinkAbortCallback abort();

  @JsProperty
  void setAbort(@Nonnull UnderlyingSinkAbortCallback abort);

  @JsProperty(
      name = "type"
  )
  @Nullable
  Any type();

  @JsProperty
  void setType(@DoNotAutobox @Nullable Object type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends UnderlyingSink {
    @JsOverlay
    @Nonnull
    default Builder start(@Nonnull final UnderlyingSinkStartCallback start) {
      setStart( start );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder write(@Nonnull final UnderlyingSinkWriteCallback write) {
      setWrite( write );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder close(@Nonnull final UnderlyingSinkCloseCallback close) {
      setClose( close );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder abort(@Nonnull final UnderlyingSinkAbortCallback abort) {
      setAbort( abort );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@DoNotAutobox @Nullable final Object type) {
      setType( type );
      return this;
    }
  }
}
