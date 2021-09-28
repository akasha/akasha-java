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
  static Builder create(@Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final JsArray<RTCRtpCodecParameters> codecs) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).headerExtensions( headerExtensions ).rtcp( rtcp ).codecs( codecs );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final JsArray<RTCRtpCodecParameters> codecs) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).headerExtensions( headerExtensions ).rtcp( rtcp ).codecs( codecs );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpCodecParameters... codecs) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).headerExtensions( headerExtensions ).rtcp( rtcp ).codecs( codecs );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpCodecParameters... codecs) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).headerExtensions( headerExtensions ).rtcp( rtcp ).codecs( codecs );
  }

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
  interface Builder extends RTCRtpReceiveParameters {
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
  }
}
