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
    name = "RTCTransportStats"
)
public interface RTCTransportStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type,
      @RTCDtlsTransportState @Nonnull final String dtlsState) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).dtlsState( dtlsState );
  }

  @JsProperty(
      name = "bytesReceived"
  )
  int bytesReceived();

  @JsProperty
  void setBytesReceived(int bytesReceived);

  @JsProperty(
      name = "bytesSent"
  )
  int bytesSent();

  @JsProperty
  void setBytesSent(int bytesSent);

  @JsProperty(
      name = "dtlsCipher"
  )
  String dtlsCipher();

  @JsProperty
  void setDtlsCipher(@Nonnull String dtlsCipher);

  @JsProperty(
      name = "dtlsState"
  )
  @RTCDtlsTransportState
  @Nonnull
  String dtlsState();

  @JsProperty
  void setDtlsState(@RTCDtlsTransportState @Nonnull String dtlsState);

  @JsProperty(
      name = "iceLocalUsernameFragment"
  )
  String iceLocalUsernameFragment();

  @JsProperty
  void setIceLocalUsernameFragment(@Nonnull String iceLocalUsernameFragment);

  @JsProperty(
      name = "iceRole"
  )
  @RTCIceRole
  String iceRole();

  @JsProperty
  void setIceRole(@RTCIceRole @Nonnull String iceRole);

  @JsProperty(
      name = "iceState"
  )
  @RTCIceTransportState
  String iceState();

  @JsProperty
  void setIceState(@RTCIceTransportState @Nonnull String iceState);

  @JsProperty(
      name = "localCertificateId"
  )
  String localCertificateId();

  @JsProperty
  void setLocalCertificateId(@Nonnull String localCertificateId);

  @JsProperty(
      name = "packetsReceived"
  )
  int packetsReceived();

  @JsProperty
  void setPacketsReceived(int packetsReceived);

  @JsProperty(
      name = "packetsSent"
  )
  int packetsSent();

  @JsProperty
  void setPacketsSent(int packetsSent);

  @JsProperty(
      name = "remoteCertificateId"
  )
  String remoteCertificateId();

  @JsProperty
  void setRemoteCertificateId(@Nonnull String remoteCertificateId);

  @JsProperty(
      name = "rtcpTransportStatsId"
  )
  String rtcpTransportStatsId();

  @JsProperty
  void setRtcpTransportStatsId(@Nonnull String rtcpTransportStatsId);

  @JsProperty(
      name = "selectedCandidatePairChanges"
  )
  int selectedCandidatePairChanges();

  @JsProperty
  void setSelectedCandidatePairChanges(int selectedCandidatePairChanges);

  @JsProperty(
      name = "selectedCandidatePairId"
  )
  String selectedCandidatePairId();

  @JsProperty
  void setSelectedCandidatePairId(@Nonnull String selectedCandidatePairId);

  @JsProperty(
      name = "srtpCipher"
  )
  String srtpCipher();

  @JsProperty
  void setSrtpCipher(@Nonnull String srtpCipher);

  @JsProperty(
      name = "tlsGroup"
  )
  String tlsGroup();

  @JsProperty
  void setTlsGroup(@Nonnull String tlsGroup);

  @JsProperty(
      name = "tlsVersion"
  )
  String tlsVersion();

  @JsProperty
  void setTlsVersion(@Nonnull String tlsVersion);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCTransportStats"
  )
  interface Builder extends RTCTransportStats {
    @JsOverlay
    @Nonnull
    default Builder bytesReceived(final int bytesReceived) {
      setBytesReceived( bytesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bytesSent(final int bytesSent) {
      setBytesSent( bytesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder dtlsCipher(@Nonnull final String dtlsCipher) {
      setDtlsCipher( dtlsCipher );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder dtlsState(@RTCDtlsTransportState @Nonnull final String dtlsState) {
      setDtlsState( dtlsState );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder iceLocalUsernameFragment(@Nonnull final String iceLocalUsernameFragment) {
      setIceLocalUsernameFragment( iceLocalUsernameFragment );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder iceRole(@RTCIceRole @Nonnull final String iceRole) {
      setIceRole( iceRole );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder iceState(@RTCIceTransportState @Nonnull final String iceState) {
      setIceState( iceState );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder localCertificateId(@Nonnull final String localCertificateId) {
      setLocalCertificateId( localCertificateId );
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
    default Builder packetsSent(final int packetsSent) {
      setPacketsSent( packetsSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder remoteCertificateId(@Nonnull final String remoteCertificateId) {
      setRemoteCertificateId( remoteCertificateId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rtcpTransportStatsId(@Nonnull final String rtcpTransportStatsId) {
      setRtcpTransportStatsId( rtcpTransportStatsId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder selectedCandidatePairChanges(final int selectedCandidatePairChanges) {
      setSelectedCandidatePairChanges( selectedCandidatePairChanges );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder selectedCandidatePairId(@Nonnull final String selectedCandidatePairId) {
      setSelectedCandidatePairId( selectedCandidatePairId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder srtpCipher(@Nonnull final String srtpCipher) {
      setSrtpCipher( srtpCipher );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder tlsGroup(@Nonnull final String tlsGroup) {
      setTlsGroup( tlsGroup );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder tlsVersion(@Nonnull final String tlsVersion) {
      setTlsVersion( tlsVersion );
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
  }
}
