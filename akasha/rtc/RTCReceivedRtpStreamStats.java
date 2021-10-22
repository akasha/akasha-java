package akasha.rtc;

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
    name = "RTCReceivedRtpStreamStats"
)
public interface RTCReceivedRtpStreamStats extends RTCRtpStreamStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcReceivedRtpStreamStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcReceivedRtpStreamStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcReceivedRtpStreamStats );
  }

  @JsProperty(
      name = "burstDiscardCount"
  )
  int burstDiscardCount();

  @JsProperty
  void setBurstDiscardCount(int burstDiscardCount);

  @JsProperty(
      name = "burstDiscardRate"
  )
  double burstDiscardRate();

  @JsProperty
  void setBurstDiscardRate(double burstDiscardRate);

  @JsProperty(
      name = "burstLossCount"
  )
  int burstLossCount();

  @JsProperty
  void setBurstLossCount(int burstLossCount);

  @JsProperty(
      name = "burstLossRate"
  )
  double burstLossRate();

  @JsProperty
  void setBurstLossRate(double burstLossRate);

  @JsProperty(
      name = "burstPacketsDiscarded"
  )
  int burstPacketsDiscarded();

  @JsProperty
  void setBurstPacketsDiscarded(int burstPacketsDiscarded);

  @JsProperty(
      name = "burstPacketsLost"
  )
  int burstPacketsLost();

  @JsProperty
  void setBurstPacketsLost(int burstPacketsLost);

  @JsProperty(
      name = "framesDropped"
  )
  int framesDropped();

  @JsProperty
  void setFramesDropped(int framesDropped);

  @JsProperty(
      name = "fullFramesLost"
  )
  int fullFramesLost();

  @JsProperty
  void setFullFramesLost(int fullFramesLost);

  @JsProperty(
      name = "gapDiscardRate"
  )
  double gapDiscardRate();

  @JsProperty
  void setGapDiscardRate(double gapDiscardRate);

  @JsProperty(
      name = "gapLossRate"
  )
  double gapLossRate();

  @JsProperty
  void setGapLossRate(double gapLossRate);

  @JsProperty(
      name = "jitter"
  )
  double jitter();

  @JsProperty
  void setJitter(double jitter);

  @JsProperty(
      name = "packetsDiscarded"
  )
  int packetsDiscarded();

  @JsProperty
  void setPacketsDiscarded(int packetsDiscarded);

  @JsProperty(
      name = "packetsLost"
  )
  int packetsLost();

  @JsProperty
  void setPacketsLost(int packetsLost);

  @JsProperty(
      name = "packetsReceived"
  )
  int packetsReceived();

  @JsProperty
  void setPacketsReceived(int packetsReceived);

  @JsProperty(
      name = "packetsRepaired"
  )
  int packetsRepaired();

  @JsProperty
  void setPacketsRepaired(int packetsRepaired);

  @JsProperty(
      name = "partialFramesLost"
  )
  int partialFramesLost();

  @JsProperty
  void setPartialFramesLost(int partialFramesLost);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCReceivedRtpStreamStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCReceivedRtpStreamStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCReceivedRtpStreamStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCReceivedRtpStreamStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCReceivedRtpStreamStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 kind(@Nonnull String kind) {
      Js.<RTCReceivedRtpStreamStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCReceivedRtpStreamStats"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Builder ssrc(int ssrc) {
      Js.<RTCReceivedRtpStreamStats>uncheckedCast( this ).setSsrc( ssrc );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCReceivedRtpStreamStats"
  )
  interface Builder extends RTCReceivedRtpStreamStats {
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
