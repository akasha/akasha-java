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
    name = "Object"
)
public interface RTCCertificateStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String base64Certificate,
      @Nonnull final String fingerprint, @Nonnull final String fingerprintAlgorithm) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).base64Certificate( base64Certificate ).fingerprint( fingerprint ).fingerprintAlgorithm( fingerprintAlgorithm );
  }

  @JsProperty(
      name = "base64Certificate"
  )
  @Nonnull
  String base64Certificate();

  @JsProperty
  void setBase64Certificate(@Nonnull String base64Certificate);

  @JsProperty(
      name = "fingerprint"
  )
  @Nonnull
  String fingerprint();

  @JsProperty
  void setFingerprint(@Nonnull String fingerprint);

  @JsProperty(
      name = "fingerprintAlgorithm"
  )
  @Nonnull
  String fingerprintAlgorithm();

  @JsProperty
  void setFingerprintAlgorithm(@Nonnull String fingerprintAlgorithm);

  @JsProperty(
      name = "issuerCertificateId"
  )
  String _issuerCertificateId();

  @JsProperty
  void setIssuerCertificateId(@Nonnull String issuerCertificateId);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends RTCCertificateStats {
    @JsOverlay
    @Nonnull
    default Builder base64Certificate(@Nonnull final String base64Certificate) {
      setBase64Certificate( base64Certificate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder fingerprint(@Nonnull final String fingerprint) {
      setFingerprint( fingerprint );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder fingerprintAlgorithm(@Nonnull final String fingerprintAlgorithm) {
      setFingerprintAlgorithm( fingerprintAlgorithm );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder issuerCertificateId(@Nonnull final String issuerCertificateId) {
      setIssuerCertificateId( issuerCertificateId );
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
