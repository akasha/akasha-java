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
    name = "AddEventListenerOptions"
)
public interface AddEventListenerOptions extends EventListenerOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "once"
  )
  boolean once();

  @JsProperty
  void setOnce(boolean once);

  @JsProperty(
      name = "passive"
  )
  boolean passive();

  @JsProperty
  void setPassive(boolean passive);

  @JsProperty(
      name = "signal"
  )
  AbortSignal signal();

  @JsProperty
  void setSignal(@JsNonNull AbortSignal signal);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AddEventListenerOptions"
  )
  interface Builder extends AddEventListenerOptions {
    @JsOverlay
    @Nonnull
    default Builder once(final boolean once) {
      setOnce( once );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder passive(final boolean passive) {
      setPassive( passive );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder signal(@Nonnull final AbortSignal signal) {
      setSignal( signal );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder capture(final boolean capture) {
      setCapture( capture );
      return this;
    }
  }
}
