package akasha;

import akasha.core.BufferSource;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The create() method of the CredentialsContainer interface returns a Promise that resolves with a new Credential instance based on the provided options, or null if no Credential object can be created.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions">PublicKeyCredentialCreationOptions - MDN</a>
 * @see <a href="https://w3c.github.io/webappsec-credential-management/#dom-credentialscontainer-create"># dom-credentialscontainer-create</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PublicKeyCredentialCreationOptions"
)
public interface PublicKeyCredentialCreationOptions {
  @JsOverlay
  @Nonnull
  static Step1 challenge(@Nonnull final BufferSource challenge) {
    final Builder $publicKeyCredentialCreationOptions = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $publicKeyCredentialCreationOptions.setChallenge( challenge );
    return Js.uncheckedCast( $publicKeyCredentialCreationOptions );
  }

  /**
   * attestation is an optional property of the PublicKeyCredentialCreationOptions dictionary. This is a string whose value indicates the preference regarding the attestation transport, between the authenticator, the client and the relying party.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/attestation">PublicKeyCredentialCreationOptions.attestation - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-attestation">attestation - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "attestation"
  )
  String attestation();

  /**
   * attestation is an optional property of the PublicKeyCredentialCreationOptions dictionary. This is a string whose value indicates the preference regarding the attestation transport, between the authenticator, the client and the relying party.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/attestation">PublicKeyCredentialCreationOptions.attestation - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-attestation">attestation - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setAttestation(@JsNonNull String attestation);

  /**
   * authenticatorSelection, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object giving criteria to filter out the authenticators to be used for the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/authenticatorSelection">PublicKeyCredentialCreationOptions.authenticatorSelection - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-authenticatorselection">authenticatorSelection - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "authenticatorSelection"
  )
  AuthenticatorSelectionCriteria authenticatorSelection();

  /**
   * authenticatorSelection, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object giving criteria to filter out the authenticators to be used for the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/authenticatorSelection">PublicKeyCredentialCreationOptions.authenticatorSelection - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-authenticatorselection">authenticatorSelection - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setAuthenticatorSelection(@JsNonNull AuthenticatorSelectionCriteria authenticatorSelection);

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-challenge">challenge - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "challenge"
  )
  @JsNonNull
  BufferSource challenge();

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-challenge">challenge - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setChallenge(@JsNonNull BufferSource challenge);

  /**
   * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-excludecredentials">excludeCredentials - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "excludeCredentials"
  )
  JsArray<PublicKeyCredentialDescriptor> excludeCredentials();

  /**
   * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-excludecredentials">excludeCredentials - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setExcludeCredentials(@JsNonNull JsArray<PublicKeyCredentialDescriptor> excludeCredentials);

  /**
   * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-excludecredentials">excludeCredentials - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsOverlay
  default void setExcludeCredentials(
      @Nonnull final PublicKeyCredentialDescriptor... excludeCredentials) {
    setExcludeCredentials( Js.<JsArray<PublicKeyCredentialDescriptor>>uncheckedCast( excludeCredentials ) );
  }

  /**
   * extensions, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/extensions">PublicKeyCredentialCreationOptions.extensions - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-extensions">extensions - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "extensions"
  )
  AuthenticationExtensionsClientInputs extensions();

  /**
   * extensions, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/extensions">PublicKeyCredentialCreationOptions.extensions - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-extensions">extensions - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setExtensions(@JsNonNull AuthenticationExtensionsClientInputs extensions);

  /**
   * The pubKeyCredParams property of the PublicKeyCredentialCreationOptions dictionary is an Array whose elements are objects describing the desired features of the credential to be created. These objects define the type of public-key and the algorithm used for cryptographic signature operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/pubKeyCredParams">PublicKeyCredentialCreationOptions.pubKeyCredParams - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-pubkeycredparams">pubKeyCredParams - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "pubKeyCredParams"
  )
  @JsNonNull
  JsArray<PublicKeyCredentialParameters> pubKeyCredParams();

  /**
   * The pubKeyCredParams property of the PublicKeyCredentialCreationOptions dictionary is an Array whose elements are objects describing the desired features of the credential to be created. These objects define the type of public-key and the algorithm used for cryptographic signature operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/pubKeyCredParams">PublicKeyCredentialCreationOptions.pubKeyCredParams - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-pubkeycredparams">pubKeyCredParams - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setPubKeyCredParams(@JsNonNull JsArray<PublicKeyCredentialParameters> pubKeyCredParams);

  /**
   * The pubKeyCredParams property of the PublicKeyCredentialCreationOptions dictionary is an Array whose elements are objects describing the desired features of the credential to be created. These objects define the type of public-key and the algorithm used for cryptographic signature operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/pubKeyCredParams">PublicKeyCredentialCreationOptions.pubKeyCredParams - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-pubkeycredparams">pubKeyCredParams - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsOverlay
  default void setPubKeyCredParams(
      @Nonnull final PublicKeyCredentialParameters... pubKeyCredParams) {
    setPubKeyCredParams( Js.<JsArray<PublicKeyCredentialParameters>>uncheckedCast( pubKeyCredParams ) );
  }

  /**
   * The rp property of the PublicKeyCredentialCreationOptions dictionary is an object describing the relying party which requested the credential creation (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/rp">PublicKeyCredentialCreationOptions.rp - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-rp">rp - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "rp"
  )
  @JsNonNull
  PublicKeyCredentialRpEntity rp();

  /**
   * The rp property of the PublicKeyCredentialCreationOptions dictionary is an object describing the relying party which requested the credential creation (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/rp">PublicKeyCredentialCreationOptions.rp - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-rp">rp - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setRp(@JsNonNull PublicKeyCredentialRpEntity rp);

  /**
   * The timeout property, of the PublicKeyCredentialCreationOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/timeout">PublicKeyCredentialCreationOptions.timeout - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-timeout">timeout - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "timeout"
  )
  int timeout();

  /**
   * The timeout property, of the PublicKeyCredentialCreationOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/timeout">PublicKeyCredentialCreationOptions.timeout - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-timeout">timeout - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setTimeout(int timeout);

  /**
   * The user property of the PublicKeyCredentialCreationOptions dictionary is an object describing the user account for which the credentials are generated (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/user">PublicKeyCredentialCreationOptions.user - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-user">user - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "user"
  )
  @JsNonNull
  PublicKeyCredentialUserEntity user();

  /**
   * The user property of the PublicKeyCredentialCreationOptions dictionary is an object describing the user account for which the credentials are generated (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/user">PublicKeyCredentialCreationOptions.user - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-user">user - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setUser(@JsNonNull PublicKeyCredentialUserEntity user);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PublicKeyCredentialCreationOptions"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 pubKeyCredParams(
        @Nonnull JsArray<PublicKeyCredentialParameters> pubKeyCredParams) {
      Js.<PublicKeyCredentialCreationOptions>uncheckedCast( this ).setPubKeyCredParams( pubKeyCredParams );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step2 pubKeyCredParams(@Nonnull PublicKeyCredentialParameters... pubKeyCredParams) {
      Js.<PublicKeyCredentialCreationOptions>uncheckedCast( this ).setPubKeyCredParams( pubKeyCredParams );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PublicKeyCredentialCreationOptions"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 rp(@Nonnull PublicKeyCredentialRpEntity rp) {
      Js.<PublicKeyCredentialCreationOptions>uncheckedCast( this ).setRp( rp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PublicKeyCredentialCreationOptions"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Builder user(@Nonnull PublicKeyCredentialUserEntity user) {
      Js.<PublicKeyCredentialCreationOptions>uncheckedCast( this ).setUser( user );
      return Js.uncheckedCast( this );
    }
  }

  /**
   * The create() method of the CredentialsContainer interface returns a Promise that resolves with a new Credential instance based on the provided options, or null if no Credential object can be created.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions">PublicKeyCredentialCreationOptions - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/#dom-credentialscontainer-create"># dom-credentialscontainer-create</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PublicKeyCredentialCreationOptions"
  )
  interface Builder extends PublicKeyCredentialCreationOptions {
    /**
     * attestation is an optional property of the PublicKeyCredentialCreationOptions dictionary. This is a string whose value indicates the preference regarding the attestation transport, between the authenticator, the client and the relying party.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/attestation">PublicKeyCredentialCreationOptions.attestation - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-attestation">attestation - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder attestation(@Nonnull final String attestation) {
      setAttestation( attestation );
      return this;
    }

    /**
     * authenticatorSelection, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object giving criteria to filter out the authenticators to be used for the creation operation.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/authenticatorSelection">PublicKeyCredentialCreationOptions.authenticatorSelection - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-authenticatorselection">authenticatorSelection - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder authenticatorSelection(
        @Nonnull final AuthenticatorSelectionCriteria authenticatorSelection) {
      setAuthenticatorSelection( authenticatorSelection );
      return this;
    }

    /**
     * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-excludecredentials">excludeCredentials - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder excludeCredentials(
        @Nonnull final JsArray<PublicKeyCredentialDescriptor> excludeCredentials) {
      setExcludeCredentials( excludeCredentials );
      return this;
    }

    /**
     * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-excludecredentials">excludeCredentials - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder excludeCredentials(
        @Nonnull final PublicKeyCredentialDescriptor... excludeCredentials) {
      setExcludeCredentials( excludeCredentials );
      return this;
    }

    /**
     * extensions, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object providing the client extensions and their input values.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/extensions">PublicKeyCredentialCreationOptions.extensions - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-extensions">extensions - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder extensions(@Nonnull final AuthenticationExtensionsClientInputs extensions) {
      setExtensions( extensions );
      return this;
    }

    /**
     * The timeout property, of the PublicKeyCredentialCreationOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the creation operation.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/timeout">PublicKeyCredentialCreationOptions.timeout - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-timeout">timeout - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder timeout(final int timeout) {
      setTimeout( timeout );
      return this;
    }
  }
}
