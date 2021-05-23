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
    name = "CredentialCreationOptions"
)
public interface CredentialCreationOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "signal"
  )
  AbortSignal signal();

  @JsProperty
  void setSignal(@Nonnull AbortSignal signal);

  @JsProperty(
      name = "password"
  )
  PasswordCredentialInit password();

  @JsProperty
  void setPassword(@Nonnull PasswordCredentialInit password);

  @JsOverlay
  default void setPassword(@Nonnull final PasswordCredentialData password) {
    setPassword( PasswordCredentialInit.of( password ) );
  }

  @JsOverlay
  default void setPassword(@Nonnull final HTMLFormElement password) {
    setPassword( PasswordCredentialInit.of( password ) );
  }

  @JsProperty(
      name = "federated"
  )
  FederatedCredentialInit federated();

  @JsProperty
  void setFederated(@Nonnull FederatedCredentialInit federated);

  @JsProperty(
      name = "publicKey"
  )
  PublicKeyCredentialCreationOptions publicKey();

  @JsProperty
  void setPublicKey(@Nonnull PublicKeyCredentialCreationOptions publicKey);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "CredentialCreationOptions"
  )
  interface Builder extends CredentialCreationOptions {
    @JsOverlay
    @Nonnull
    default Builder signal(@Nonnull final AbortSignal signal) {
      setSignal( signal );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder password(@Nonnull final PasswordCredentialInit password) {
      setPassword( password );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder password(@Nonnull final PasswordCredentialData password) {
      setPassword( password );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder password(@Nonnull final HTMLFormElement password) {
      setPassword( password );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder federated(@Nonnull final FederatedCredentialInit federated) {
      setFederated( federated );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder publicKey(@Nonnull final PublicKeyCredentialCreationOptions publicKey) {
      setPublicKey( publicKey );
      return this;
    }
  }
}
