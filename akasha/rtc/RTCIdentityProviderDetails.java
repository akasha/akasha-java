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
    name = "RTCIdentityProviderDetails"
)
public interface RTCIdentityProviderDetails {
  @JsOverlay
  @Nonnull
  static Builder domain(@Nonnull final String domain) {
    final Builder $rtcIdentityProviderDetails = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcIdentityProviderDetails.setDomain( domain );
    return Js.uncheckedCast( $rtcIdentityProviderDetails );
  }

  @JsProperty(
      name = "domain"
  )
  @JsNonNull
  String domain();

  @JsProperty
  void setDomain(@JsNonNull String domain);

  @JsProperty(
      name = "protocol"
  )
  String protocol();

  @JsProperty
  void setProtocol(@JsNonNull String protocol);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIdentityProviderDetails"
  )
  interface Builder extends RTCIdentityProviderDetails {
    @JsOverlay
    @Nonnull
    default Builder protocol(@Nonnull final String protocol) {
      setProtocol( protocol );
      return this;
    }
  }
}
