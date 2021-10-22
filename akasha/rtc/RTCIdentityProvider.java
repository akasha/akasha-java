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
    name = "RTCIdentityProvider"
)
public interface RTCIdentityProvider {
  @JsOverlay
  @Nonnull
  static Step1 generateAssertion(@Nonnull final GenerateAssertionCallback generateAssertion) {
    final RTCIdentityProvider $rtcIdentityProvider = Js.<RTCIdentityProvider>uncheckedCast( JsPropertyMap.of() );
    $rtcIdentityProvider.setGenerateAssertion( generateAssertion );
    return Js.uncheckedCast( $rtcIdentityProvider );
  }

  @JsProperty(
      name = "generateAssertion"
  )
  @JsNonNull
  GenerateAssertionCallback generateAssertion();

  @JsProperty
  void setGenerateAssertion(@JsNonNull GenerateAssertionCallback generateAssertion);

  @JsProperty(
      name = "validateAssertion"
  )
  @JsNonNull
  ValidateAssertionCallback validateAssertion();

  @JsProperty
  void setValidateAssertion(@JsNonNull ValidateAssertionCallback validateAssertion);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIdentityProvider"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default RTCIdentityProvider validateAssertion(
        @Nonnull ValidateAssertionCallback validateAssertion) {
      Js.<RTCIdentityProvider>uncheckedCast( this ).setValidateAssertion( validateAssertion );
      return Js.uncheckedCast( this );
    }
  }
}
