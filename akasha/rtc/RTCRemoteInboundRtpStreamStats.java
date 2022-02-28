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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRemoteInboundRtpStreamStats"
)
public interface RTCRemoteInboundRtpStreamStats extends RTCReceivedRtpStreamStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcRemoteInboundRtpStreamStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcRemoteInboundRtpStreamStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcRemoteInboundRtpStreamStats );
  }

  @JsProperty(
      name = "fractionLost"
  )
  double fractionLost();

  @JsProperty
  void setFractionLost(double fractionLost);

  @JsProperty(
      name = "localId"
  )
  String localId();

  @JsProperty
  void setLocalId(@JsNonNull String localId);

  @JsProperty(
      name = "reportsReceived"
  )
  int reportsReceived();

  @JsProperty
  void setReportsReceived(int reportsReceived);

  @JsProperty(
      name = "roundTripTime"
  )
  double roundTripTime();

  @JsProperty
  void setRoundTripTime(double roundTripTime);

  @JsProperty(
      name = "roundTripTimeMeasurements"
  )
  int roundTripTimeMeasurements();

  @JsProperty
  void setRoundTripTimeMeasurements(int roundTripTimeMeasurements);

  @JsProperty(
      name = "totalRoundTripTime"
  )
  double totalRoundTripTime();

  @JsProperty
  void setTotalRoundTripTime(double totalRoundTripTime);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRemoteInboundRtpStreamStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCRemoteInboundRtpStreamStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRemoteInboundRtpStreamStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCRemoteInboundRtpStreamStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRemoteInboundRtpStreamStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 ssrc(int ssrc) {
      Js.<RTCRemoteInboundRtpStreamStats>uncheckedCast( this ).setSsrc( ssrc );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRemoteInboundRtpStreamStats"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull String kind) {
      Js.<RTCRemoteInboundRtpStreamStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRemoteInboundRtpStreamStats"
  )
  interface Builder extends RTCRemoteInboundRtpStreamStats {
    @JsOverlay
    @Nonnull
    default Builder fractionLost(final double fractionLost) {
      setFractionLost( fractionLost );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder localId(@Nonnull final String localId) {
      setLocalId( localId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder reportsReceived(final int reportsReceived) {
      setReportsReceived( reportsReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder roundTripTime(final double roundTripTime) {
      setRoundTripTime( roundTripTime );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder roundTripTimeMeasurements(final int roundTripTimeMeasurements) {
      setRoundTripTimeMeasurements( roundTripTimeMeasurements );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalRoundTripTime(final double totalRoundTripTime) {
      setTotalRoundTripTime( totalRoundTripTime );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstDiscardCount(final int burstDiscardCount) {
      setBurstDiscardCount( burstDiscardCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstDiscardRate(final double burstDiscardRate) {
      setBurstDiscardRate( burstDiscardRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstLossCount(final int burstLossCount) {
      setBurstLossCount( burstLossCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstLossRate(final double burstLossRate) {
      setBurstLossRate( burstLossRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstPacketsDiscarded(final int burstPacketsDiscarded) {
      setBurstPacketsDiscarded( burstPacketsDiscarded );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstPacketsLost(final int burstPacketsLost) {
      setBurstPacketsLost( burstPacketsLost );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder framesDropped(final int framesDropped) {
      setFramesDropped( framesDropped );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder fullFramesLost(final int fullFramesLost) {
      setFullFramesLost( fullFramesLost );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder gapDiscardRate(final double gapDiscardRate) {
      setGapDiscardRate( gapDiscardRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder gapLossRate(final double gapLossRate) {
      setGapLossRate( gapLossRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder jitter(final double jitter) {
      setJitter( jitter );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder packetsDiscarded(final int packetsDiscarded) {
      setPacketsDiscarded( packetsDiscarded );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder packetsLost(final int packetsLost) {
      setPacketsLost( packetsLost );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder packetsReceived(final int packetsReceived) {
      setPacketsReceived( packetsReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder packetsRepaired(final int packetsRepaired) {
      setPacketsRepaired( packetsRepaired );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder partialFramesLost(final int partialFramesLost) {
      setPartialFramesLost( partialFramesLost );
      return this;
    }

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
  }
}
