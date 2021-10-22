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
 * The PublicKeyCredentialRequestOptions dictionary of the Web Authentication API holds the options passed to navigator.credentials.get() in order to fetch a given PublicKeyCredential.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions">PublicKeyCredentialRequestOptions - MDN</a>
 * @see <a href="https://w3c.github.io/webauthn/#dictdef-publickeycredentialrequestoptions">(Web Authentication) # dictdef-publickeycredentialrequestoptions</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PublicKeyCredentialRequestOptions"
)
public interface PublicKeyCredentialRequestOptions {
  @JsOverlay
  @Nonnull
  static Builder challenge(@Nonnull final BufferSource challenge) {
    final Builder $publicKeyCredentialRequestOptions = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $publicKeyCredentialRequestOptions.setChallenge( challenge );
    return Js.uncheckedCast( $publicKeyCredentialRequestOptions );
  }

  /**
   * allowCredentials is an optional property of the PublicKeyCredentialRequestOptions dictionary which indicates the existing credentials acceptable for retrieval. This is an Array of credential descriptors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/allowCredentials">PublicKeyCredentialRequestOptions.allowCredentials - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-allowcredentials">allowCredentials - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "allowCredentials"
  )
  JsArray<PublicKeyCredentialDescriptor> allowCredentials();

  /**
   * allowCredentials is an optional property of the PublicKeyCredentialRequestOptions dictionary which indicates the existing credentials acceptable for retrieval. This is an Array of credential descriptors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/allowCredentials">PublicKeyCredentialRequestOptions.allowCredentials - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-allowcredentials">allowCredentials - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setAllowCredentials(@JsNonNull JsArray<PublicKeyCredentialDescriptor> allowCredentials);

  /**
   * allowCredentials is an optional property of the PublicKeyCredentialRequestOptions dictionary which indicates the existing credentials acceptable for retrieval. This is an Array of credential descriptors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/allowCredentials">PublicKeyCredentialRequestOptions.allowCredentials - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-allowcredentials">allowCredentials - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsOverlay
  default void setAllowCredentials(
      @Nonnull final PublicKeyCredentialDescriptor... allowCredentials) {
    setAllowCredentials( Js.<JsArray<PublicKeyCredentialDescriptor>>uncheckedCast( allowCredentials ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-challenge">challenge - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "challenge"
  )
  @JsNonNull
  BufferSource challenge();

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-challenge">challenge - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setChallenge(@JsNonNull BufferSource challenge);

  /**
   * extensions, an optional property of the PublicKeyCredentialRequestOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/extensions">PublicKeyCredentialRequestOptions.extensions - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-extensions">extensions - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "extensions"
  )
  AuthenticationExtensionsClientInputs extensions();

  /**
   * extensions, an optional property of the PublicKeyCredentialRequestOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/extensions">PublicKeyCredentialRequestOptions.extensions - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-extensions">extensions - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setExtensions(@JsNonNull AuthenticationExtensionsClientInputs extensions);

  /**
   * The rpId property, of the PublicKeyCredentialRequestOptions dictionary, is an optional property which indicates the relying party's identifier as a USVString. Its value can only be a suffix of the current origin's domain. For example, if you are browsing on foo.example.com, the rpId value may be &quot;example.com&quot; but not &quot;bar.org&quot; or &quot;baz.example.com&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/rpId">PublicKeyCredentialRequestOptions.rpId - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-rpid">rpId - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "rpId"
  )
  String rpId();

  /**
   * The rpId property, of the PublicKeyCredentialRequestOptions dictionary, is an optional property which indicates the relying party's identifier as a USVString. Its value can only be a suffix of the current origin's domain. For example, if you are browsing on foo.example.com, the rpId value may be &quot;example.com&quot; but not &quot;bar.org&quot; or &quot;baz.example.com&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/rpId">PublicKeyCredentialRequestOptions.rpId - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-rpid">rpId - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setRpId(@JsNonNull String rpId);

  /**
   * The timeout property, of the PublicKeyCredentialRequestOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the retrieval operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/timeout">PublicKeyCredentialRequestOptions.timeout - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-timeout">timeout - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "timeout"
  )
  int timeout();

  /**
   * The timeout property, of the PublicKeyCredentialRequestOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the retrieval operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/timeout">PublicKeyCredentialRequestOptions.timeout - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-timeout">timeout - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setTimeout(int timeout);

  /**
   * userVerification is an optional property of the PublicKeyCredentialRequestOptions. This is a string which indicates how the user verification should be part of the authentication process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/userVerification">PublicKeyCredentialRequestOptions.userVerification - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-userverification">userVerification - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "userVerification"
  )
  String userVerification();

  /**
   * userVerification is an optional property of the PublicKeyCredentialRequestOptions. This is a string which indicates how the user verification should be part of the authentication process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/userVerification">PublicKeyCredentialRequestOptions.userVerification - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-userverification">userVerification - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty
  void setUserVerification(@JsNonNull String userVerification);

  /**
   * The PublicKeyCredentialRequestOptions dictionary of the Web Authentication API holds the options passed to navigator.credentials.get() in order to fetch a given PublicKeyCredential.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions">PublicKeyCredentialRequestOptions - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dictdef-publickeycredentialrequestoptions">(Web Authentication) # dictdef-publickeycredentialrequestoptions</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PublicKeyCredentialRequestOptions"
  )
  interface Builder extends PublicKeyCredentialRequestOptions {
    /**
     * allowCredentials is an optional property of the PublicKeyCredentialRequestOptions dictionary which indicates the existing credentials acceptable for retrieval. This is an Array of credential descriptors.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/allowCredentials">PublicKeyCredentialRequestOptions.allowCredentials - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-allowcredentials">allowCredentials - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder allowCredentials(
        @Nonnull final JsArray<PublicKeyCredentialDescriptor> allowCredentials) {
      setAllowCredentials( allowCredentials );
      return this;
    }

    /**
     * allowCredentials is an optional property of the PublicKeyCredentialRequestOptions dictionary which indicates the existing credentials acceptable for retrieval. This is an Array of credential descriptors.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/allowCredentials">PublicKeyCredentialRequestOptions.allowCredentials - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-allowcredentials">allowCredentials - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder allowCredentials(
        @Nonnull final PublicKeyCredentialDescriptor... allowCredentials) {
      setAllowCredentials( allowCredentials );
      return this;
    }

    /**
     * extensions, an optional property of the PublicKeyCredentialRequestOptions dictionary, is an object providing the client extensions and their input values.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/extensions">PublicKeyCredentialRequestOptions.extensions - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-extensions">extensions - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder extensions(@Nonnull final AuthenticationExtensionsClientInputs extensions) {
      setExtensions( extensions );
      return this;
    }

    /**
     * The rpId property, of the PublicKeyCredentialRequestOptions dictionary, is an optional property which indicates the relying party's identifier as a USVString. Its value can only be a suffix of the current origin's domain. For example, if you are browsing on foo.example.com, the rpId value may be &quot;example.com&quot; but not &quot;bar.org&quot; or &quot;baz.example.com&quot;.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/rpId">PublicKeyCredentialRequestOptions.rpId - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-rpid">rpId - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder rpId(@Nonnull final String rpId) {
      setRpId( rpId );
      return this;
    }

    /**
     * The timeout property, of the PublicKeyCredentialRequestOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the retrieval operation.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/timeout">PublicKeyCredentialRequestOptions.timeout - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-timeout">timeout - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder timeout(final int timeout) {
      setTimeout( timeout );
      return this;
    }

    /**
     * userVerification is an optional property of the PublicKeyCredentialRequestOptions. This is a string which indicates how the user verification should be part of the authentication process.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/userVerification">PublicKeyCredentialRequestOptions.userVerification - MDN</a>
     * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-userverification">userVerification - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
     */
    @JsOverlay
    @Nonnull
    default Builder userVerification(@Nonnull final String userVerification) {
      setUserVerification( userVerification );
      return this;
    }
  }
}
