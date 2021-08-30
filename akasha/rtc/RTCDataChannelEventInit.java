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
    name = "RTCDataChannelEventInit"
)
public interface RTCDataChannelEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final RTCDataChannel channel) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).channel( channel );
  }

  @JsProperty(
      name = "channel"
  )
  @JsNonNull
  RTCDataChannel channel();

  @JsProperty
  void setChannel(@JsNonNull RTCDataChannel channel);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCDataChannelEventInit"
  )
  interface Builder extends RTCDataChannelEventInit {
    @JsOverlay
    @Nonnull
    default Builder channel(@Nonnull final RTCDataChannel channel) {
      setChannel( channel );
      return this;
    }

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
