package akasha.rtc;

import akasha.StringOrStringArrayUnion;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCIceServer dictionary defines how to connect to a single ICE server (such as a STUN or TURN server). Objects of this type are provided in the configuration of an RTCPeerConnection, in the iceServers array.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer">RTCIceServer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIceServer"
)
public interface RTCIceServer {
  @JsOverlay
  @Nonnull
  static Builder urls(@Nullable final StringOrStringArrayUnion urls) {
    final Builder $rtcIceServer = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcIceServer.setUrls( urls );
    return Js.uncheckedCast( $rtcIceServer );
  }

  @JsOverlay
  @Nonnull
  static Builder urls(@Nonnull final String urls) {
    final Builder $rtcIceServer = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcIceServer.setUrls( urls );
    return Js.uncheckedCast( $rtcIceServer );
  }

  @JsOverlay
  @Nonnull
  static Builder urls(@Nonnull final JsArray<String> urls) {
    final Builder $rtcIceServer = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcIceServer.setUrls( urls );
    return Js.uncheckedCast( $rtcIceServer );
  }

  @JsOverlay
  @Nonnull
  static Builder urls(@Nonnull final String... urls) {
    final Builder $rtcIceServer = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcIceServer.setUrls( urls );
    return Js.uncheckedCast( $rtcIceServer );
  }

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-urls">RTCIceServer.urls - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "urls"
  )
  @JsNullable
  StringOrStringArrayUnion urls();

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-urls">RTCIceServer.urls - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setUrls(@JsNullable StringOrStringArrayUnion urls);

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-urls">RTCIceServer.urls - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  default void setUrls(@Nonnull final String urls) {
    setUrls( StringOrStringArrayUnion.of( urls ) );
  }

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-urls">RTCIceServer.urls - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  default void setUrls(@Nonnull final JsArray<String> urls) {
    setUrls( StringOrStringArrayUnion.of( urls ) );
  }

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-urls">RTCIceServer.urls - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  default void setUrls(@Nonnull final String... urls) {
    setUrls( StringOrStringArrayUnion.of( urls ) );
  }

  /**
   * The RTCIceServer dictionary's credential property is a string providing the credential to use when connecting to the described server. This is typically a password, key, or other secret.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credential">RTCIceServer.credential - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-credential">RTCIceServer.credential - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "credential"
  )
  String credential();

  /**
   * The RTCIceServer dictionary's credential property is a string providing the credential to use when connecting to the described server. This is typically a password, key, or other secret.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credential">RTCIceServer.credential - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-credential">RTCIceServer.credential - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setCredential(@JsNonNull String credential);

  /**
   * The RTCIceServer dictionary's credentialType property is a string value from the RTCIceCredentialType enum which indicates what type of credential the RTCIceServer.credential value is. The default is password.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credentialType">RTCIceServer.credentialType - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-credential">RTCIceServer.credential - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "credentialType"
  )
  @RTCIceCredentialType
  String credentialType();

  /**
   * The RTCIceServer dictionary's credentialType property is a string value from the RTCIceCredentialType enum which indicates what type of credential the RTCIceServer.credential value is. The default is password.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credentialType">RTCIceServer.credentialType - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-credential">RTCIceServer.credential - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setCredentialType(@RTCIceCredentialType @JsNonNull String credentialType);

  /**
   * The RTCIceServer dictionary's username property is a string which specifies the username to use when authenticating with the ICE server being described.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/username">RTCIceServer.username - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-username">RTCIceServer.username - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "username"
  )
  String username();

  /**
   * The RTCIceServer dictionary's username property is a string which specifies the username to use when authenticating with the ICE server being described.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/username">RTCIceServer.username - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-username">RTCIceServer.username - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setUsername(@JsNonNull String username);

  /**
   * The RTCIceServer dictionary defines how to connect to a single ICE server (such as a STUN or TURN server). Objects of this type are provided in the configuration of an RTCPeerConnection, in the iceServers array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer">RTCIceServer - MDN</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceServer"
  )
  interface Builder extends RTCIceServer {
    /**
     * The RTCIceServer dictionary's credential property is a string providing the credential to use when connecting to the described server. This is typically a password, key, or other secret.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credential">RTCIceServer.credential - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-credential">RTCIceServer.credential - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder credential(@Nonnull final String credential) {
      setCredential( credential );
      return this;
    }

    /**
     * The RTCIceServer dictionary's credentialType property is a string value from the RTCIceCredentialType enum which indicates what type of credential the RTCIceServer.credential value is. The default is password.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credentialType">RTCIceServer.credentialType - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-credential">RTCIceServer.credential - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder credentialType(@RTCIceCredentialType @Nonnull final String credentialType) {
      setCredentialType( credentialType );
      return this;
    }

    /**
     * The RTCIceServer dictionary's username property is a string which specifies the username to use when authenticating with the ICE server being described.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/username">RTCIceServer.username - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtciceserver-username">RTCIceServer.username - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder username(@Nonnull final String username) {
      setUsername( username );
      return this;
    }
  }
}
