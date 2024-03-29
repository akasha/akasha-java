package akasha.rtc;

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
 * The RTCPeerConnection() constructor returns a newly-created RTCPeerConnection, which represents a connection between the local device and a remote peer.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration">RTCConfiguration - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection"># dom-peerconnection</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCConfiguration"
)
public interface RTCConfiguration {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The RTCConfiguration dictionary's bundlePolicy property is a string value indicating which SDP bundling policy, if any, to use for the underlying RTP streams used by an RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/bundlePolicy">RTCConfiguration.bundlePolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-bundlepolicy">RTCConfiguration.bundlePolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "bundlePolicy"
  )
  @RTCBundlePolicy
  String bundlePolicy();

  /**
   * The RTCConfiguration dictionary's bundlePolicy property is a string value indicating which SDP bundling policy, if any, to use for the underlying RTP streams used by an RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/bundlePolicy">RTCConfiguration.bundlePolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-bundlepolicy">RTCConfiguration.bundlePolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setBundlePolicy(@RTCBundlePolicy @JsNonNull String bundlePolicy);

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-certificates">RTCConfiguration.certificates - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "certificates"
  )
  JsArray<RTCCertificate> certificates();

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-certificates">RTCConfiguration.certificates - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setCertificates(@JsNonNull JsArray<RTCCertificate> certificates);

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-certificates">RTCConfiguration.certificates - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  default void setCertificates(@Nonnull final RTCCertificate... certificates) {
    setCertificates( Js.<JsArray<RTCCertificate>>uncheckedCast( certificates ) );
  }

  @JsProperty(
      name = "iceCandidatePoolSize"
  )
  short iceCandidatePoolSize();

  @JsProperty
  void setIceCandidatePoolSize(short iceCandidatePoolSize);

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-iceservers">RTCConfiguration.iceServers - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "iceServers"
  )
  JsArray<RTCIceServer> iceServers();

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-iceservers">RTCConfiguration.iceServers - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setIceServers(@JsNonNull JsArray<RTCIceServer> iceServers);

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-iceservers">RTCConfiguration.iceServers - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  default void setIceServers(@Nonnull final RTCIceServer... iceServers) {
    setIceServers( Js.<JsArray<RTCIceServer>>uncheckedCast( iceServers ) );
  }

  /**
   * The WebRTC Device API dictionary RTCConfiguration's iceTransportPolicy property is a string indicating the transport selection policy the ICE agent should use during negotiation of connections. Its value must come from the RTCIceTransportPolicy enumerated type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceTransportPolicy">RTCConfiguration.iceTransportPolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-icetransportpolicy">RTCCandidate.iceTransportPolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "iceTransportPolicy"
  )
  @RTCIceTransportPolicy
  String iceTransportPolicy();

  /**
   * The WebRTC Device API dictionary RTCConfiguration's iceTransportPolicy property is a string indicating the transport selection policy the ICE agent should use during negotiation of connections. Its value must come from the RTCIceTransportPolicy enumerated type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceTransportPolicy">RTCConfiguration.iceTransportPolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-icetransportpolicy">RTCCandidate.iceTransportPolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setIceTransportPolicy(@RTCIceTransportPolicy @JsNonNull String iceTransportPolicy);

  @JsProperty(
      name = "rtcpMuxPolicy"
  )
  @RTCRtcpMuxPolicy
  String rtcpMuxPolicy();

  @JsProperty
  void setRtcpMuxPolicy(@RTCRtcpMuxPolicy @JsNonNull String rtcpMuxPolicy);

  @JsProperty(
      name = "peerIdentity"
  )
  String peerIdentity();

  @JsProperty
  void setPeerIdentity(@JsNonNull String peerIdentity);

  /**
   * The RTCPeerConnection() constructor returns a newly-created RTCPeerConnection, which represents a connection between the local device and a remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration">RTCConfiguration - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection"># dom-peerconnection</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCConfiguration"
  )
  interface Builder extends RTCConfiguration {
    /**
     * The RTCConfiguration dictionary's bundlePolicy property is a string value indicating which SDP bundling policy, if any, to use for the underlying RTP streams used by an RTCPeerConnection.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/bundlePolicy">RTCConfiguration.bundlePolicy - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-bundlepolicy">RTCConfiguration.bundlePolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder bundlePolicy(@RTCBundlePolicy @Nonnull final String bundlePolicy) {
      setBundlePolicy( bundlePolicy );
      return this;
    }

    /**
     * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-certificates">RTCConfiguration.certificates - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder certificates(@Nonnull final JsArray<RTCCertificate> certificates) {
      setCertificates( certificates );
      return this;
    }

    /**
     * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-certificates">RTCConfiguration.certificates - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder certificates(@Nonnull final RTCCertificate... certificates) {
      setCertificates( certificates );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder iceCandidatePoolSize(final short iceCandidatePoolSize) {
      setIceCandidatePoolSize( iceCandidatePoolSize );
      return this;
    }

    /**
     *
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-iceservers">RTCConfiguration.iceServers - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder iceServers(@Nonnull final JsArray<RTCIceServer> iceServers) {
      setIceServers( iceServers );
      return this;
    }

    /**
     *
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-iceservers">RTCConfiguration.iceServers - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder iceServers(@Nonnull final RTCIceServer... iceServers) {
      setIceServers( iceServers );
      return this;
    }

    /**
     * The WebRTC Device API dictionary RTCConfiguration's iceTransportPolicy property is a string indicating the transport selection policy the ICE agent should use during negotiation of connections. Its value must come from the RTCIceTransportPolicy enumerated type.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceTransportPolicy">RTCConfiguration.iceTransportPolicy - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-icetransportpolicy">RTCCandidate.iceTransportPolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder iceTransportPolicy(
        @RTCIceTransportPolicy @Nonnull final String iceTransportPolicy) {
      setIceTransportPolicy( iceTransportPolicy );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rtcpMuxPolicy(@RTCRtcpMuxPolicy @Nonnull final String rtcpMuxPolicy) {
      setRtcpMuxPolicy( rtcpMuxPolicy );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder peerIdentity(@Nonnull final String peerIdentity) {
      setPeerIdentity( peerIdentity );
      return this;
    }
  }
}
