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
 * The RTCRtpParameters dictionary is the basic object describing the parameters of an RTP transport. It is extended separately for senders and receivers in the form of the RTCRtpSendParameters and RTCRtpReceiveParameters dictionaries.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpParameters">RTCRtpParameters - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpParameters"
)
public interface RTCRtpParameters {
  @JsOverlay
  @Nonnull
  static Step1 headerExtensions(
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions) {
    final RTCRtpParameters $rtcRtpParameters = Js.<RTCRtpParameters>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpParameters.setHeaderExtensions( headerExtensions );
    return Js.uncheckedCast( $rtcRtpParameters );
  }

  @JsOverlay
  @Nonnull
  static Step1 headerExtensions(
      @Nonnull final RTCRtpHeaderExtensionParameters... headerExtensions) {
    final RTCRtpParameters $rtcRtpParameters = Js.<RTCRtpParameters>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpParameters.setHeaderExtensions( headerExtensions );
    return Js.uncheckedCast( $rtcRtpParameters );
  }

  @JsProperty(
      name = "headerExtensions"
  )
  @JsNonNull
  JsArray<RTCRtpHeaderExtensionParameters> headerExtensions();

  @JsProperty
  void setHeaderExtensions(@JsNonNull JsArray<RTCRtpHeaderExtensionParameters> headerExtensions);

  @JsOverlay
  default void setHeaderExtensions(
      @Nonnull final RTCRtpHeaderExtensionParameters... headerExtensions) {
    setHeaderExtensions( Js.<JsArray<RTCRtpHeaderExtensionParameters>>uncheckedCast( headerExtensions ) );
  }

  @JsProperty(
      name = "rtcp"
  )
  @JsNonNull
  RTCRtcpParameters rtcp();

  @JsProperty
  void setRtcp(@JsNonNull RTCRtcpParameters rtcp);

  @JsProperty(
      name = "codecs"
  )
  @JsNonNull
  JsArray<RTCRtpCodecParameters> codecs();

  @JsProperty
  void setCodecs(@JsNonNull JsArray<RTCRtpCodecParameters> codecs);

  @JsOverlay
  default void setCodecs(@Nonnull final RTCRtpCodecParameters... codecs) {
    setCodecs( Js.<JsArray<RTCRtpCodecParameters>>uncheckedCast( codecs ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpParameters"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 rtcp(@Nonnull RTCRtcpParameters rtcp) {
      Js.<RTCRtpParameters>uncheckedCast( this ).setRtcp( rtcp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpParameters"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default RTCRtpParameters codecs(@Nonnull JsArray<RTCRtpCodecParameters> codecs) {
      Js.<RTCRtpParameters>uncheckedCast( this ).setCodecs( codecs );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default RTCRtpParameters codecs(@Nonnull RTCRtpCodecParameters... codecs) {
      Js.<RTCRtpParameters>uncheckedCast( this ).setCodecs( codecs );
      return Js.uncheckedCast( this );
    }
  }
}
