package akasha.rtc;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The WebRTC API's RTCRtpSendParameters dictionary is used to specify the parameters for an RTCRtpSender when calling its setParameters() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSendParameters">RTCRtpSendParameters - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsendparameters">RTCRtpSendParameters - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpSendParameters"
)
public interface RTCRtpSendParameters extends RTCRtpParameters {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp,
      @Nonnull final JsArray<RTCRtpEncodingParameters> encodings,
      @Nonnull final String transactionId) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp,
      @Nonnull final JsArray<RTCRtpEncodingParameters> encodings,
      @Nonnull final String transactionId) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp,
      @Nonnull final JsArray<RTCRtpEncodingParameters> encodings,
      @Nonnull final String transactionId) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp,
      @Nonnull final JsArray<RTCRtpEncodingParameters> encodings,
      @Nonnull final String transactionId) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpEncodingParameters[] encodings,
      @Nonnull final String transactionId) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpEncodingParameters[] encodings,
      @Nonnull final String transactionId) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpEncodingParameters[] encodings,
      @Nonnull final String transactionId) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpEncodingParameters[] encodings,
      @Nonnull final String transactionId) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp ).encodings( encodings ).transactionId( transactionId );
  }

  @JsProperty(
      name = "encodings"
  )
  @Nonnull
  JsArray<RTCRtpEncodingParameters> encodings();

  @JsProperty
  void setEncodings(@Nonnull JsArray<RTCRtpEncodingParameters> encodings);

  @JsOverlay
  default void setEncodings(@Nonnull final RTCRtpEncodingParameters... encodings) {
    setEncodings( Js.<JsArray<RTCRtpEncodingParameters>>uncheckedCast( encodings ) );
  }

  @JsProperty(
      name = "transactionId"
  )
  @Nonnull
  String transactionId();

  @JsProperty
  void setTransactionId(@Nonnull String transactionId);

  /**
   * The WebRTC API's RTCRtpSendParameters dictionary is used to specify the parameters for an RTCRtpSender when calling its setParameters() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSendParameters">RTCRtpSendParameters - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsendparameters">RTCRtpSendParameters - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpSendParameters"
  )
  interface Builder extends RTCRtpSendParameters {
    @JsOverlay
    @Nonnull
    default Builder encodings(@Nonnull final JsArray<RTCRtpEncodingParameters> encodings) {
      setEncodings( encodings );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder encodings(@Nonnull final RTCRtpEncodingParameters... encodings) {
      setEncodings( encodings );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder transactionId(@Nonnull final String transactionId) {
      setTransactionId( transactionId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder codecs(@Nonnull final JsArray<RTCRtpCodecParameters> codecs) {
      setCodecs( codecs );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder codecs(@Nonnull final RTCRtpCodecParameters... codecs) {
      setCodecs( codecs );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder headerExtensions(
        @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions) {
      setHeaderExtensions( headerExtensions );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder headerExtensions(
        @Nonnull final RTCRtpHeaderExtensionParameters... headerExtensions) {
      setHeaderExtensions( headerExtensions );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rtcp(@Nonnull final RTCRtcpParameters rtcp) {
      setRtcp( rtcp );
      return this;
    }
  }
}
