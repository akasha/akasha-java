package akasha.rtc;

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
 * The RTCRtpStreamStats dictionary is returned by the RTCPeerConnection.getStats(), RTCRtpSender.getStats(), and RTCRtpReceiver.getStats() methods to provide detailed statistics about WebRTC connectivity.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats">RTCRtpStreamStats - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-stats/#streamstats-dict*">(WebRTC Statistics) # streamstats-dict*</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpStreamStats"
)
public interface RTCRtpStreamStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Builder create(final double timestamp, @RTCStatsType @Nonnull final String type,
      @Nonnull final String id, @Nonnull final String kind, final int ssrc) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).timestamp( timestamp ).type( type ).id( id ).kind( kind ).ssrc( ssrc );
  }

  /**
   * The RTCRtpStreamStats dictionary's codecId property is a string which uniquely identifies the object that was inspected to produce the data in the RTCCodecStats for the RTP stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/codecId">RTCRtpStreamStats.codecId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-codecid">RTCRtpStreamStats.codecId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "codecId"
  )
  String codecId();

  /**
   * The RTCRtpStreamStats dictionary's codecId property is a string which uniquely identifies the object that was inspected to produce the data in the RTCCodecStats for the RTP stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/codecId">RTCRtpStreamStats.codecId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-codecid">RTCRtpStreamStats.codecId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setCodecId(@JsNonNull String codecId);

  /**
   * The kind property of the RTCRtpStreamStats dictionary is a string indicating whether the described RTP stream contains audio or video media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/kind">RTCRtpStreamStats.kind - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-kind">RTCRtpStreamStats.kind - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "kind"
  )
  @JsNonNull
  String kind();

  /**
   * The kind property of the RTCRtpStreamStats dictionary is a string indicating whether the described RTP stream contains audio or video media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/kind">RTCRtpStreamStats.kind - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-kind">RTCRtpStreamStats.kind - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setKind(@JsNonNull String kind);

  /**
   * The RTCRtpStreamStats dictionary's ssrc property provides the Synchronization Source (SSRC), an integer which uniquely identifies the source of the RTP packets whose statistics are covered by the RTCStatsReport that includes this RTCRtpStreamStats dictionary.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/ssrc">RTCRtpStreamStats.ssrc - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-ssrc">RTCRtpStreamStats.ssrc - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "ssrc"
  )
  int ssrc();

  /**
   * The RTCRtpStreamStats dictionary's ssrc property provides the Synchronization Source (SSRC), an integer which uniquely identifies the source of the RTP packets whose statistics are covered by the RTCStatsReport that includes this RTCRtpStreamStats dictionary.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/ssrc">RTCRtpStreamStats.ssrc - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-ssrc">RTCRtpStreamStats.ssrc - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setSsrc(int ssrc);

  /**
   * The RTCRtpStreamStats dictionary's transportId property is a string which uniquely identifies the object from which the statistics contained in the RTCTransportStats properties in the RTCStatsReport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/transportId">RTCRtpStreamStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-transportid">RTCRtpStreamStats.transportId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "transportId"
  )
  String transportId();

  /**
   * The RTCRtpStreamStats dictionary's transportId property is a string which uniquely identifies the object from which the statistics contained in the RTCTransportStats properties in the RTCStatsReport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/transportId">RTCRtpStreamStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-transportid">RTCRtpStreamStats.transportId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setTransportId(@JsNonNull String transportId);

  @JsProperty(
      name = "averageRTCPInterval"
  )
  double averageRTCPInterval();

  @JsProperty
  void setAverageRTCPInterval(double averageRTCPInterval);

  @JsProperty(
      name = "mediaType"
  )
  String mediaType();

  @JsProperty
  void setMediaType(@JsNonNull String mediaType);

  /**
   * The RTCRtpStreamStats dictionary is returned by the RTCPeerConnection.getStats(), RTCRtpSender.getStats(), and RTCRtpReceiver.getStats() methods to provide detailed statistics about WebRTC connectivity.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats">RTCRtpStreamStats - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#streamstats-dict*">(WebRTC Statistics) # streamstats-dict*</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpStreamStats"
  )
  interface Builder extends RTCRtpStreamStats {
    /**
     * The RTCRtpStreamStats dictionary's codecId property is a string which uniquely identifies the object that was inspected to produce the data in the RTCCodecStats for the RTP stream.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/codecId">RTCRtpStreamStats.codecId - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-codecid">RTCRtpStreamStats.codecId - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder codecId(@Nonnull final String codecId) {
      setCodecId( codecId );
      return this;
    }

    /**
     * The kind property of the RTCRtpStreamStats dictionary is a string indicating whether the described RTP stream contains audio or video media.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/kind">RTCRtpStreamStats.kind - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-kind">RTCRtpStreamStats.kind - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull final String kind) {
      setKind( kind );
      return this;
    }

    /**
     * The RTCRtpStreamStats dictionary's ssrc property provides the Synchronization Source (SSRC), an integer which uniquely identifies the source of the RTP packets whose statistics are covered by the RTCStatsReport that includes this RTCRtpStreamStats dictionary.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/ssrc">RTCRtpStreamStats.ssrc - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-ssrc">RTCRtpStreamStats.ssrc - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder ssrc(final int ssrc) {
      setSsrc( ssrc );
      return this;
    }

    /**
     * The RTCRtpStreamStats dictionary's transportId property is a string which uniquely identifies the object from which the statistics contained in the RTCTransportStats properties in the RTCStatsReport.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/transportId">RTCRtpStreamStats.transportId - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-transportid">RTCRtpStreamStats.transportId - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder transportId(@Nonnull final String transportId) {
      setTransportId( transportId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder averageRTCPInterval(final double averageRTCPInterval) {
      setAverageRTCPInterval( averageRTCPInterval );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mediaType(@Nonnull final String mediaType) {
      setMediaType( mediaType );
      return this;
    }

    /**
     * The timestamp property of the RTCStats dictionary is a DOMHighResTimeStamp object specifying the time at which the data in the object was sampled.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/timestamp">RTCStats.timestamp - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-timestamp">RTCStats.timestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder timestamp(final double timestamp) {
      setTimestamp( timestamp );
      return this;
    }

    /**
     * The RTCStats dictionary's property type is a string which specifies the type of statistic represented by the object, where the permitted values are drawn from the enum type RTCStatsType.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/type">RTCStats.type - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-type">RTCStats.type - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder type(@RTCStatsType @Nonnull final String type) {
      setType( type );
      return this;
    }

    /**
     * The id property of the RTCStats dictionary is a string which uniquely identifies the object for which this RTCStats object provides statistics.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/id">RTCStats.id - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-id">RTCStats.id - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull final String id) {
      setId( id );
      return this;
    }
  }
}
