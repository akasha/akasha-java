package akasha.rtc;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCRtpReceiveParameters dictionary, based upon the RTCRtpParameters dictionary, is returned by the RTCRtpReceiver method getParameters(). It describes the parameters being used by the receiver's RTP connection to the remote peer.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpReceiveParameters">RTCRtpReceiveParameters - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpReceiveParameters"
)
public interface RTCRtpReceiveParameters extends RTCRtpParameters {
  @JsOverlay
  @Nonnull
  static Step1 headerExtensions(
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions) {
    final RTCRtpReceiveParameters $rtcRtpReceiveParameters = Js.<RTCRtpReceiveParameters>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpReceiveParameters.setHeaderExtensions( headerExtensions );
    return Js.uncheckedCast( $rtcRtpReceiveParameters );
  }

  @JsOverlay
  @Nonnull
  static Step1 headerExtensions(
      @Nonnull final RTCRtpHeaderExtensionParameters... headerExtensions) {
    final RTCRtpReceiveParameters $rtcRtpReceiveParameters = Js.<RTCRtpReceiveParameters>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpReceiveParameters.setHeaderExtensions( headerExtensions );
    return Js.uncheckedCast( $rtcRtpReceiveParameters );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpReceiveParameters"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 rtcp(@Nonnull RTCRtcpParameters rtcp) {
      Js.<RTCRtpReceiveParameters>uncheckedCast( this ).setRtcp( rtcp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpReceiveParameters"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default RTCRtpReceiveParameters codecs(@Nonnull JsArray<RTCRtpCodecParameters> codecs) {
      Js.<RTCRtpReceiveParameters>uncheckedCast( this ).setCodecs( codecs );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default RTCRtpReceiveParameters codecs(@Nonnull RTCRtpCodecParameters... codecs) {
      Js.<RTCRtpReceiveParameters>uncheckedCast( this ).setCodecs( codecs );
      return Js.uncheckedCast( this );
    }
  }
}
