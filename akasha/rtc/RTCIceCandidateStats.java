package akasha.rtc;

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
 * The WebRTC API's RTCIceCandidateStats dictionary provides statistics related to an RTCIceCandidate.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats">RTCIceCandidateStats - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-stats/#icecandidate-dict*">(WebRTC Statistics) # icecandidate-dict*</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIceCandidateStats"
)
public interface RTCIceCandidateStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcIceCandidateStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcIceCandidateStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcIceCandidateStats );
  }

  /**
   * The address property of the RTCIceCandidateStats dictionary indicates the address of the ICE candidate. While it's preferred that the address be specified as an IPv4 or IPv6 numeric address, a fully-qualified domain name can be used as well.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/address">RTCIceCandidateStats.address - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-address">RTCIceCandidateStats.address - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "address"
  )
  @JsNullable
  String address();

  /**
   * The address property of the RTCIceCandidateStats dictionary indicates the address of the ICE candidate. While it's preferred that the address be specified as an IPv4 or IPv6 numeric address, a fully-qualified domain name can be used as well.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/address">RTCIceCandidateStats.address - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-address">RTCIceCandidateStats.address - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setAddress(@JsNullable String address);

  /**
   * The RTCIceCandidateStats interface's candidateType property is a string which indicates the type of ICE candidate the object represents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/candidateType">RTCIceCandidateStats.candidateType - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats">RTCIceCandidateStats.candidateType - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "candidateType"
  )
  @RTCIceCandidateType
  @JsNonNull
  String candidateType();

  /**
   * The RTCIceCandidateStats interface's candidateType property is a string which indicates the type of ICE candidate the object represents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/candidateType">RTCIceCandidateStats.candidateType - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats">RTCIceCandidateStats.candidateType - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setCandidateType(@RTCIceCandidateType @JsNonNull String candidateType);

  /**
   * The RTCIceCandidateStats dictionary's port property specifies the network port used by the candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/port">RTCIceCandidateStats.port - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">RTCIceCandidateStats.port - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "port"
  )
  int port();

  /**
   * The RTCIceCandidateStats dictionary's port property specifies the network port used by the candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/port">RTCIceCandidateStats.port - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">RTCIceCandidateStats.port - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPort(int port);

  /**
   * The RTCIceCandidateStats dictionary's priority property is a positive integer value indicating the priority (or desirability) of the described candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/priority">RTCIceCandidateStats.priority - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">RTCIceCandidateStats.port - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "priority"
  )
  int priority();

  /**
   * The RTCIceCandidateStats dictionary's priority property is a positive integer value indicating the priority (or desirability) of the described candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/priority">RTCIceCandidateStats.priority - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">RTCIceCandidateStats.port - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPriority(int priority);

  /**
   * The RTCIceCandidateStats dictionary's protocol  property specifies the protocol the specified candidate would use for communication with the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/protocol">RTCIceCandidateStats.protocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-protocol">RTCIceCandidateStats.protocol - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "protocol"
  )
  String protocol();

  /**
   * The RTCIceCandidateStats dictionary's protocol  property specifies the protocol the specified candidate would use for communication with the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/protocol">RTCIceCandidateStats.protocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-protocol">RTCIceCandidateStats.protocol - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setProtocol(@JsNonNull String protocol);

  /**
   * The RTCIceCandidateStats dictionary's relayProtocol property specifies the protocol being used by a local ICE candidate to communicate with the TURN server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/relayProtocol">RTCIceCandidateStats.relayProtocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-relayprotocol">RTCIceCandidateStats.relayProtocol - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "relayProtocol"
  )
  String relayProtocol();

  /**
   * The RTCIceCandidateStats dictionary's relayProtocol property specifies the protocol being used by a local ICE candidate to communicate with the TURN server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/relayProtocol">RTCIceCandidateStats.relayProtocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-relayprotocol">RTCIceCandidateStats.relayProtocol - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setRelayProtocol(@JsNonNull String relayProtocol);

  /**
   * The RTCIceCandidateStats dictionary's transportId property is a string that uniquely identifies the transport that produced the RTCTransportStats from which information about this candidate was taken.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/transportId">RTCIceCandidateStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-transportid">RTCIceCandidateStats.transportId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "transportId"
  )
  @JsNonNull
  String transportId();

  /**
   * The RTCIceCandidateStats dictionary's transportId property is a string that uniquely identifies the transport that produced the RTCTransportStats from which information about this candidate was taken.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/transportId">RTCIceCandidateStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-transportid">RTCIceCandidateStats.transportId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setTransportId(@JsNonNull String transportId);

  /**
   * The RTCIceCandidateStats dictionary's url property specifies the URL of the ICE server from which the described candidate was obtained. This property is only available for local candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/url">RTCIceCandidateStats.url - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-url">RTCIceCandidateStats.url - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "url"
  )
  String url();

  /**
   * The RTCIceCandidateStats dictionary's url property specifies the URL of the ICE server from which the described candidate was obtained. This property is only available for local candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/url">RTCIceCandidateStats.url - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-url">RTCIceCandidateStats.url - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setUrl(@JsNonNull String url);

  /**
   * The RTCIceCandidateStats dictionary's deleted property indicates whether or not the candidate has been deleted or released.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/deleted">RTCIceCandidateStats.deleted - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-deleted">RTCIceCandidateStats.deleted - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "deleted"
  )
  boolean deleted();

  /**
   * The RTCIceCandidateStats dictionary's deleted property indicates whether or not the candidate has been deleted or released.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/deleted">RTCIceCandidateStats.deleted - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-deleted">RTCIceCandidateStats.deleted - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setDeleted(boolean deleted);

  @JsProperty(
      name = "isRemote"
  )
  boolean isRemote();

  @JsProperty
  void setIsRemote(boolean isRemote);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceCandidateStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCIceCandidateStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceCandidateStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCIceCandidateStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceCandidateStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 candidateType(@RTCIceCandidateType @Nonnull String candidateType) {
      Js.<RTCIceCandidateStats>uncheckedCast( this ).setCandidateType( candidateType );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceCandidateStats"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Builder transportId(@Nonnull String transportId) {
      Js.<RTCIceCandidateStats>uncheckedCast( this ).setTransportId( transportId );
      return Js.uncheckedCast( this );
    }
  }

  /**
   * The WebRTC API's RTCIceCandidateStats dictionary provides statistics related to an RTCIceCandidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats">RTCIceCandidateStats - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#icecandidate-dict*">(WebRTC Statistics) # icecandidate-dict*</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceCandidateStats"
  )
  interface Builder extends RTCIceCandidateStats {
    /**
     * The address property of the RTCIceCandidateStats dictionary indicates the address of the ICE candidate. While it's preferred that the address be specified as an IPv4 or IPv6 numeric address, a fully-qualified domain name can be used as well.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/address">RTCIceCandidateStats.address - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-address">RTCIceCandidateStats.address - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder address(@Nullable final String address) {
      setAddress( address );
      return this;
    }

    /**
     * The RTCIceCandidateStats dictionary's port property specifies the network port used by the candidate.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/port">RTCIceCandidateStats.port - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">RTCIceCandidateStats.port - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder port(final int port) {
      setPort( port );
      return this;
    }

    /**
     * The RTCIceCandidateStats dictionary's priority property is a positive integer value indicating the priority (or desirability) of the described candidate.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/priority">RTCIceCandidateStats.priority - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">RTCIceCandidateStats.port - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder priority(final int priority) {
      setPriority( priority );
      return this;
    }

    /**
     * The RTCIceCandidateStats dictionary's protocol  property specifies the protocol the specified candidate would use for communication with the remote peer.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/protocol">RTCIceCandidateStats.protocol - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-protocol">RTCIceCandidateStats.protocol - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder protocol(@Nonnull final String protocol) {
      setProtocol( protocol );
      return this;
    }

    /**
     * The RTCIceCandidateStats dictionary's relayProtocol property specifies the protocol being used by a local ICE candidate to communicate with the TURN server.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/relayProtocol">RTCIceCandidateStats.relayProtocol - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-relayprotocol">RTCIceCandidateStats.relayProtocol - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder relayProtocol(@Nonnull final String relayProtocol) {
      setRelayProtocol( relayProtocol );
      return this;
    }

    /**
     * The RTCIceCandidateStats dictionary's url property specifies the URL of the ICE server from which the described candidate was obtained. This property is only available for local candidates.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/url">RTCIceCandidateStats.url - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-url">RTCIceCandidateStats.url - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder url(@Nonnull final String url) {
      setUrl( url );
      return this;
    }

    /**
     * The RTCIceCandidateStats dictionary's deleted property indicates whether or not the candidate has been deleted or released.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/deleted">RTCIceCandidateStats.deleted - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-deleted">RTCIceCandidateStats.deleted - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder deleted(final boolean deleted) {
      setDeleted( deleted );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder isRemote(final boolean isRemote) {
      setIsRemote( isRemote );
      return this;
    }
  }
}
