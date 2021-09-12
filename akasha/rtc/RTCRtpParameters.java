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
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpCodecParameters[] codecs) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).headerExtensions( headerExtensions ).rtcp( rtcp ).codecs( codecs );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp, @Nonnull final RTCRtpCodecParameters[] codecs) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).headerExtensions( headerExtensions ).rtcp( rtcp ).codecs( codecs );
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
  interface Builder extends RTCRtpParameters {
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
