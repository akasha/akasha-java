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
  static Builder create(@Nonnull final GenerateAssertionCallback generateAssertion,
      @Nonnull final ValidateAssertionCallback validateAssertion) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).generateAssertion( generateAssertion ).validateAssertion( validateAssertion );
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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIdentityProvider"
  )
  interface Builder extends RTCIdentityProvider {
    @JsOverlay
    @Nonnull
    default Builder generateAssertion(@Nonnull final GenerateAssertionCallback generateAssertion) {
      setGenerateAssertion( generateAssertion );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder validateAssertion(@Nonnull final ValidateAssertionCallback validateAssertion) {
      setValidateAssertion( validateAssertion );
      return this;
    }
  }
}
