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
    name = "RTCTransportStats"
)
public interface RTCTransportStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcTransportStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcTransportStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcTransportStats );
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
  void setDtlsCipher(@JsNonNull String dtlsCipher);

  @JsProperty(
      name = "dtlsState"
  )
  @RTCDtlsTransportState
  @JsNonNull
  String dtlsState();

  @JsProperty
  void setDtlsState(@RTCDtlsTransportState @JsNonNull String dtlsState);

  @JsProperty(
      name = "iceLocalUsernameFragment"
  )
  String iceLocalUsernameFragment();

  @JsProperty
  void setIceLocalUsernameFragment(@JsNonNull String iceLocalUsernameFragment);

  @JsProperty(
      name = "iceRole"
  )
  @RTCIceRole
  String iceRole();

  @JsProperty
  void setIceRole(@RTCIceRole @JsNonNull String iceRole);

  @JsProperty(
      name = "iceState"
  )
  @RTCIceTransportState
  String iceState();

  @JsProperty
  void setIceState(@RTCIceTransportState @JsNonNull String iceState);

  @JsProperty(
      name = "localCertificateId"
  )
  String localCertificateId();

  @JsProperty
  void setLocalCertificateId(@JsNonNull String localCertificateId);

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
  void setRemoteCertificateId(@JsNonNull String remoteCertificateId);

  @JsProperty(
      name = "rtcpTransportStatsId"
  )
  String rtcpTransportStatsId();

  @JsProperty
  void setRtcpTransportStatsId(@JsNonNull String rtcpTransportStatsId);

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
  void setSelectedCandidatePairId(@JsNonNull String selectedCandidatePairId);

  @JsProperty(
      name = "srtpCipher"
  )
  String srtpCipher();

  @JsProperty
  void setSrtpCipher(@JsNonNull String srtpCipher);

  @JsProperty(
      name = "tlsGroup"
  )
  String tlsGroup();

  @JsProperty
  void setTlsGroup(@JsNonNull String tlsGroup);

  @JsProperty(
      name = "tlsVersion"
  )
  String tlsVersion();

  @JsProperty
  void setTlsVersion(@JsNonNull String tlsVersion);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCTransportStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCTransportStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCTransportStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCTransportStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCTransportStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Builder dtlsState(@RTCDtlsTransportState @Nonnull String dtlsState) {
      Js.<RTCTransportStats>uncheckedCast( this ).setDtlsState( dtlsState );
      return Js.uncheckedCast( this );
    }
  }

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
  }
}
