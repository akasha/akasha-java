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
    name = "StreamPipeOptions"
)
public interface StreamPipeOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "preventClose"
  )
  boolean preventClose();

  @JsProperty
  void setPreventClose(boolean preventClose);

  @JsProperty(
      name = "preventAbort"
  )
  boolean preventAbort();

  @JsProperty
  void setPreventAbort(boolean preventAbort);

  @JsProperty(
      name = "preventCancel"
  )
  boolean preventCancel();

  @JsProperty
  void setPreventCancel(boolean preventCancel);

  @JsProperty(
      name = "signal"
  )
  AbortSignal signal();

  @JsProperty
  void setSignal(@JsNonNull AbortSignal signal);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "StreamPipeOptions"
  )
  interface Builder extends StreamPipeOptions {
    @JsOverlay
    @Nonnull
    default Builder preventClose(final boolean preventClose) {
      setPreventClose( preventClose );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder preventAbort(final boolean preventAbort) {
      setPreventAbort( preventAbort );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder preventCancel(final boolean preventCancel) {
      setPreventCancel( preventCancel );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder signal(@Nonnull final AbortSignal signal) {
      setSignal( signal );
      return this;
    }
  }
}
