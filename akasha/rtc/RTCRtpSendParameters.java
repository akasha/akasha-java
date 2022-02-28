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
 * The WebRTC API's RTCRtpSendParameters dictionary is used to specify the parameters for an RTCRtpSender when calling its setParameters() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSendParameters">RTCRtpSendParameters - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsendparameters"># dom-rtcrtpsendparameters</a>
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
  static Step1 headerExtensions(
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions) {
    final RTCRtpSendParameters $rtcRtpSendParameters = Js.<RTCRtpSendParameters>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpSendParameters.setHeaderExtensions( headerExtensions );
    return Js.uncheckedCast( $rtcRtpSendParameters );
  }

  @JsOverlay
  @Nonnull
  static Step1 headerExtensions(
      @Nonnull final RTCRtpHeaderExtensionParameters... headerExtensions) {
    final RTCRtpSendParameters $rtcRtpSendParameters = Js.<RTCRtpSendParameters>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpSendParameters.setHeaderExtensions( headerExtensions );
    return Js.uncheckedCast( $rtcRtpSendParameters );
  }

  @JsProperty(
      name = "transactionId"
  )
  @JsNonNull
  String transactionId();

  @JsProperty
  void setTransactionId(@JsNonNull String transactionId);

  @JsProperty(
      name = "encodings"
  )
  @JsNonNull
  JsArray<RTCRtpEncodingParameters> encodings();

  @JsProperty
  void setEncodings(@JsNonNull JsArray<RTCRtpEncodingParameters> encodings);

  @JsOverlay
  default void setEncodings(@Nonnull final RTCRtpEncodingParameters... encodings) {
    setEncodings( Js.<JsArray<RTCRtpEncodingParameters>>uncheckedCast( encodings ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpSendParameters"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 rtcp(@Nonnull RTCRtcpParameters rtcp) {
      Js.<RTCRtpSendParameters>uncheckedCast( this ).setRtcp( rtcp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpSendParameters"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 codecs(@Nonnull JsArray<RTCRtpCodecParameters> codecs) {
      Js.<RTCRtpSendParameters>uncheckedCast( this ).setCodecs( codecs );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step3 codecs(@Nonnull RTCRtpCodecParameters... codecs) {
      Js.<RTCRtpSendParameters>uncheckedCast( this ).setCodecs( codecs );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpSendParameters"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 transactionId(@Nonnull String transactionId) {
      Js.<RTCRtpSendParameters>uncheckedCast( this ).setTransactionId( transactionId );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpSendParameters"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default RTCRtpSendParameters encodings(@Nonnull JsArray<RTCRtpEncodingParameters> encodings) {
      Js.<RTCRtpSendParameters>uncheckedCast( this ).setEncodings( encodings );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default RTCRtpSendParameters encodings(@Nonnull RTCRtpEncodingParameters... encodings) {
      Js.<RTCRtpSendParameters>uncheckedCast( this ).setEncodings( encodings );
      return Js.uncheckedCast( this );
    }
  }
}
