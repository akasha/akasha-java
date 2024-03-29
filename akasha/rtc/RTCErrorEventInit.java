package akasha.rtc;

import akasha.EventInit;
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
    name = "RTCErrorEventInit"
)
public interface RTCErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder error(@Nonnull final RTCError error) {
    final Builder $rtcErrorEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcErrorEventInit.setError( error );
    return Js.uncheckedCast( $rtcErrorEventInit );
  }

  @JsProperty(
      name = "error"
  )
  @JsNonNull
  RTCError error();

  @JsProperty
  void setError(@JsNonNull RTCError error);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCErrorEventInit"
  )
  interface Builder extends RTCErrorEventInit {
    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
