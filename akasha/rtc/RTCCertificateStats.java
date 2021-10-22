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
    name = "RTCCertificateStats"
)
public interface RTCCertificateStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcCertificateStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcCertificateStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcCertificateStats );
  }

  @JsProperty(
      name = "base64Certificate"
  )
  @JsNonNull
  String base64Certificate();

  @JsProperty
  void setBase64Certificate(@JsNonNull String base64Certificate);

  @JsProperty(
      name = "fingerprint"
  )
  @JsNonNull
  String fingerprint();

  @JsProperty
  void setFingerprint(@JsNonNull String fingerprint);

  @JsProperty(
      name = "fingerprintAlgorithm"
  )
  @JsNonNull
  String fingerprintAlgorithm();

  @JsProperty
  void setFingerprintAlgorithm(@JsNonNull String fingerprintAlgorithm);

  @JsProperty(
      name = "issuerCertificateId"
  )
  String _issuerCertificateId();

  @JsProperty
  void setIssuerCertificateId(@JsNonNull String issuerCertificateId);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCertificateStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCCertificateStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCertificateStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCCertificateStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCertificateStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 base64Certificate(@Nonnull String base64Certificate) {
      Js.<RTCCertificateStats>uncheckedCast( this ).setBase64Certificate( base64Certificate );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCertificateStats"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Step5 fingerprint(@Nonnull String fingerprint) {
      Js.<RTCCertificateStats>uncheckedCast( this ).setFingerprint( fingerprint );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCertificateStats"
  )
  interface Step5 {
    @JsOverlay
    @Nonnull
    default Builder fingerprintAlgorithm(@Nonnull String fingerprintAlgorithm) {
      Js.<RTCCertificateStats>uncheckedCast( this ).setFingerprintAlgorithm( fingerprintAlgorithm );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCertificateStats"
  )
  interface Builder extends RTCCertificateStats {
    @JsOverlay
    @Nonnull
    default Builder issuerCertificateId(@Nonnull final String issuerCertificateId) {
      setIssuerCertificateId( issuerCertificateId );
      return this;
    }
  }
}
