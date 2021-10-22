package akasha.rtc;

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
    name = "RTCIdentityProviderOptions"
)
public interface RTCIdentityProviderOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "peerIdentity"
  )
  String peerIdentity();

  @JsProperty
  void setPeerIdentity(@JsNonNull String peerIdentity);

  @JsProperty(
      name = "protocol"
  )
  String protocol();

  @JsProperty
  void setProtocol(@JsNonNull String protocol);

  @JsProperty(
      name = "usernameHint"
  )
  String usernameHint();

  @JsProperty
  void setUsernameHint(@JsNonNull String usernameHint);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIdentityProviderOptions"
  )
  interface Builder extends RTCIdentityProviderOptions {
    @JsOverlay
    @Nonnull
    default Builder peerIdentity(@Nonnull final String peerIdentity) {
      setPeerIdentity( peerIdentity );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder protocol(@Nonnull final String protocol) {
      setProtocol( protocol );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder usernameHint(@Nonnull final String usernameHint) {
      setUsernameHint( usernameHint );
      return this;
    }
  }
}
