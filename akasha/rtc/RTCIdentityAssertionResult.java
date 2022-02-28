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
    name = "RTCIdentityAssertionResult"
)
public interface RTCIdentityAssertionResult {
  @JsOverlay
  @Nonnull
  static Step1 idp(@Nonnull final RTCIdentityProviderDetails idp) {
    final RTCIdentityAssertionResult $rtcIdentityAssertionResult = Js.<RTCIdentityAssertionResult>uncheckedCast( JsPropertyMap.of() );
    $rtcIdentityAssertionResult.setIdp( idp );
    return Js.uncheckedCast( $rtcIdentityAssertionResult );
  }

  @JsProperty(
      name = "idp"
  )
  @JsNonNull
  RTCIdentityProviderDetails idp();

  @JsProperty
  void setIdp(@JsNonNull RTCIdentityProviderDetails idp);

  @JsProperty(
      name = "assertion"
  )
  @JsNonNull
  String assertion();

  @JsProperty
  void setAssertion(@JsNonNull String assertion);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIdentityAssertionResult"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default RTCIdentityAssertionResult assertion(@Nonnull String assertion) {
      Js.<RTCIdentityAssertionResult>uncheckedCast( this ).setAssertion( assertion );
      return Js.uncheckedCast( this );
    }
  }
}
