package akasha;

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
    name = "CredentialCreationOptions"
)
public interface CredentialCreationOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "signal"
  )
  AbortSignal signal();

  @JsProperty
  void setSignal(@JsNonNull AbortSignal signal);

  @JsProperty(
      name = "password"
  )
  PasswordCredentialInit password();

  @JsProperty
  void setPassword(@JsNonNull PasswordCredentialInit password);

  @JsProperty(
      name = "federated"
  )
  FederatedCredentialInit federated();

  @JsProperty
  void setFederated(@JsNonNull FederatedCredentialInit federated);

  @JsProperty(
      name = "publicKey"
  )
  PublicKeyCredentialCreationOptions publicKey();

  @JsProperty
  void setPublicKey(@JsNonNull PublicKeyCredentialCreationOptions publicKey);

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
