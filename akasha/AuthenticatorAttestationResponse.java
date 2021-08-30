package akasha;

import akasha.core.ArrayBuffer;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AuthenticatorAttestationResponse interface of the Web Authentication API is returned by CredentialsContainer.create() when a PublicKeyCredential is passed, and provides a cryptographic root of trust for the new key pair that has been generated. This response should be sent to the relying party's server to complete the creation of the credential.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AuthenticatorAttestationResponse">AuthenticatorAttestationResponse - MDN</a>
 * @see <a href="https://w3c.github.io/webauthn/#authenticatorattestationresponse">(Web Authentication) # authenticatorattestationresponse</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AuthenticatorAttestationResponse"
)
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
  protected AuthenticatorAttestationResponse() {
  }

  /**
   * The attestationObject property of the AuthenticatorAttestationResponse interface returns an ArrayBuffer containing the new public key, as well as signature over the entire attestationObject with a private key that is stored in the authenticator when it is manufactured.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AuthenticatorAttestationResponse/attestationObject">AuthenticatorAttestationResponse.attestationObject - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-authenticatorattestationresponse-attestationobject">attestationObject - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "attestationObject"
  )
  @Nonnull
  public native ArrayBuffer attestationObject();

  @JsNonNull
  public native ArrayBuffer getAuthenticatorData();

  @JsNullable
  public native ArrayBuffer getPublicKey();

  public native int getPublicKeyAlgorithm();

  /**
   * getTransports() is a method of the AuthenticatorAttestationResponse interface that returns an Array containing strings describing the different transports which may be used by the authenticator.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AuthenticatorAttestationResponse/getTransports">AuthenticatorAttestationResponse.getTransports - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-authenticatorattestationresponse-gettransports">getTransports() - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsNonNull
  public native JsArray<String> getTransports();
}
