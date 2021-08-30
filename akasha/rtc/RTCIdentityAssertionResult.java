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
  static Builder create(@Nonnull final String assertion,
      @Nonnull final RTCIdentityProviderDetails idp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).assertion( assertion ).idp( idp );
  }

  @JsProperty(
      name = "assertion"
  )
  @JsNonNull
  String assertion();

  @JsProperty
  void setAssertion(@JsNonNull String assertion);

  @JsProperty(
      name = "idp"
  )
  @JsNonNull
  RTCIdentityProviderDetails idp();

  @JsProperty
  void setIdp(@JsNonNull RTCIdentityProviderDetails idp);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIdentityAssertionResult"
  )
  interface Builder extends RTCIdentityAssertionResult {
    @JsOverlay
    @Nonnull
    default Builder assertion(@Nonnull final String assertion) {
      setAssertion( assertion );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder idp(@Nonnull final RTCIdentityProviderDetails idp) {
      setIdp( idp );
      return this;
    }
  }
}
