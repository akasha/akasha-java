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
    name = "CredentialRequestOptions"
)
public interface CredentialRequestOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "mediation"
  )
  @CredentialMediationRequirement
  String mediation();

  @JsProperty
  void setMediation(@CredentialMediationRequirement @Nonnull String mediation);

  @JsProperty(
      name = "signal"
  )
  AbortSignal signal();

  @JsProperty
  void setSignal(@Nonnull AbortSignal signal);

  @JsProperty(
      name = "password"
  )
  boolean password();

  @JsProperty
  void setPassword(boolean password);

  @JsProperty(
      name = "federated"
  )
  FederatedCredentialRequestOptions federated();

  @JsProperty
  void setFederated(@Nonnull FederatedCredentialRequestOptions federated);

  @JsProperty(
      name = "publicKey"
  )
  PublicKeyCredentialRequestOptions publicKey();

  @JsProperty
  void setPublicKey(@Nonnull PublicKeyCredentialRequestOptions publicKey);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "CredentialRequestOptions"
  )
  interface Builder extends CredentialRequestOptions {
    @JsOverlay
    @Nonnull
    default Builder mediation(@CredentialMediationRequirement @Nonnull final String mediation) {
      setMediation( mediation );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder signal(@Nonnull final AbortSignal signal) {
      setSignal( signal );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder password(final boolean password) {
      setPassword( password );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder federated(@Nonnull final FederatedCredentialRequestOptions federated) {
      setFederated( federated );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder publicKey(@Nonnull final PublicKeyCredentialRequestOptions publicKey) {
      setPublicKey( publicKey );
      return this;
    }
  }
}
