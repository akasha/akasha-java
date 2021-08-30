package akasha;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
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
    name = "UnderlyingSink"
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
  void setStart(@JsNonNull UnderlyingSinkStartCallback start);

  @JsProperty(
      name = "write"
  )
  UnderlyingSinkWriteCallback write();

  @JsProperty
  void setWrite(@JsNonNull UnderlyingSinkWriteCallback write);

  @JsProperty(
      name = "close"
  )
  UnderlyingSinkCloseCallback close();

  @JsProperty
  void setClose(@JsNonNull UnderlyingSinkCloseCallback close);

  @JsProperty(
      name = "abort"
  )
  UnderlyingSinkAbortCallback abort();

  @JsProperty
  void setAbort(@JsNonNull UnderlyingSinkAbortCallback abort);

  @JsProperty(
      name = "type"
  )
  @JsNullable
  Any type();

  @JsProperty
  void setType(@DoNotAutobox @JsNullable Object type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "UnderlyingSink"
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
