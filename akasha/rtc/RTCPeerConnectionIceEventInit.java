package akasha.rtc;

import akasha.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
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
    name = "RTCPeerConnectionIceEventInit"
)
public interface RTCPeerConnectionIceEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "candidate"
  )
  @JsNullable
  RTCIceCandidate candidate();

  @JsProperty
  void setCandidate(@JsNullable RTCIceCandidate candidate);

  @JsProperty(
      name = "url"
  )
  @JsNullable
  String url();

  @JsProperty
  void setUrl(@JsNullable String url);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCPeerConnectionIceEventInit"
  )
  interface Builder extends RTCPeerConnectionIceEventInit {
    @JsOverlay
    @Nonnull
    default Builder candidate(@Nullable final RTCIceCandidate candidate) {
      setCandidate( candidate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder url(@Nullable final String url) {
      setUrl( url );
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
