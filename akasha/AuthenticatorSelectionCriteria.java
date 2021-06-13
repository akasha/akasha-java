package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
    name = "AuthenticatorSelectionCriteria"
)
public interface AuthenticatorSelectionCriteria {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "authenticatorAttachment"
  )
  String authenticatorAttachment();

  @JsProperty
  void setAuthenticatorAttachment(@Nonnull String authenticatorAttachment);

  @JsProperty(
      name = "requireResidentKey"
  )
  boolean requireResidentKey();

  @JsProperty
  void setRequireResidentKey(boolean requireResidentKey);

  @JsProperty(
      name = "residentKey"
  )
  String residentKey();

  @JsProperty
  void setResidentKey(@Nonnull String residentKey);

  @JsProperty(
      name = "userVerification"
  )
  String userVerification();

  @JsProperty
  void setUserVerification(@Nonnull String userVerification);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AuthenticatorSelectionCriteria"
  )
  interface Builder extends AuthenticatorSelectionCriteria {
    @JsOverlay
    @Nonnull
    default Builder authenticatorAttachment(@Nonnull final String authenticatorAttachment) {
      setAuthenticatorAttachment( authenticatorAttachment );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder requireResidentKey(final boolean requireResidentKey) {
      setRequireResidentKey( requireResidentKey );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder residentKey(@Nonnull final String residentKey) {
      setResidentKey( residentKey );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder userVerification(@Nonnull final String userVerification) {
      setUserVerification( userVerification );
      return this;
    }
  }
}
