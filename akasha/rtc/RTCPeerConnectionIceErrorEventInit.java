package akasha.rtc;

import akasha.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
    name = "Object"
)
public interface RTCPeerConnectionIceErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(final int errorCode) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).errorCode( errorCode );
  }

  @JsProperty(
      name = "address"
  )
  @Nullable
  String address();

  @JsProperty
  void setAddress(@Nullable String address);

  @JsProperty(
      name = "errorCode"
  )
  int errorCode();

  @JsProperty
  void setErrorCode(int errorCode);

  @JsProperty(
      name = "errorText"
  )
  String errorText();

  @JsProperty
  void setErrorText(@Nonnull String errorText);

  @JsProperty(
      name = "port"
  )
  @Nullable
  Double port();

  @JsProperty
  void setPort(@Nullable Double port);

  @JsProperty(
      name = "url"
  )
  String url();

  @JsProperty
  void setUrl(@Nonnull String url);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends RTCPeerConnectionIceErrorEventInit {
    @JsOverlay
    @Nonnull
    default Builder address(@Nullable final String address) {
      setAddress( address );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder errorCode(final int errorCode) {
      setErrorCode( errorCode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder errorText(@Nonnull final String errorText) {
      setErrorText( errorText );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder port(@Nullable final Double port) {
      setPort( port );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder url(@Nonnull final String url) {
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