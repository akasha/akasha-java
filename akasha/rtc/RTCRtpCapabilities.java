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
 * The RTCRtpCapabilities dictionary is a data type used to describe the capabilities of an RTCRtpSender or RTCRtpReceiver in response to a call to the RTCRtpSender.getCapabilities() or RTCRtpReceiver.getCapabilities() static functions, both of which return an array of RTCRtpCapabilities objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpCapabilities">RTCRtpCapabilities - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpCapabilities"
)
public interface RTCRtpCapabilities {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<RTCRtpCodecCapability> codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionCapability> headerExtensions) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final RTCRtpCodecCapability[] codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionCapability> headerExtensions) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<RTCRtpCodecCapability> codecs,
      @Nonnull final RTCRtpHeaderExtensionCapability[] headerExtensions) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final RTCRtpCodecCapability[] codecs,
      @Nonnull final RTCRtpHeaderExtensionCapability[] headerExtensions) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions );
  }

  @JsProperty(
      name = "codecs"
  )
  @Nonnull
  JsArray<RTCRtpCodecCapability> codecs();

  @JsProperty
  void setCodecs(@Nonnull JsArray<RTCRtpCodecCapability> codecs);

  @JsOverlay
  default void setCodecs(@Nonnull final RTCRtpCodecCapability... codecs) {
    setCodecs( Js.<JsArray<RTCRtpCodecCapability>>uncheckedCast( codecs ) );
  }

  @JsProperty(
      name = "headerExtensions"
  )
  @Nonnull
  JsArray<RTCRtpHeaderExtensionCapability> headerExtensions();

  @JsProperty
  void setHeaderExtensions(@Nonnull JsArray<RTCRtpHeaderExtensionCapability> headerExtensions);

  @JsOverlay
  default void setHeaderExtensions(
      @Nonnull final RTCRtpHeaderExtensionCapability... headerExtensions) {
    setHeaderExtensions( Js.<JsArray<RTCRtpHeaderExtensionCapability>>uncheckedCast( headerExtensions ) );
  }

  /**
   * The RTCRtpCapabilities dictionary is a data type used to describe the capabilities of an RTCRtpSender or RTCRtpReceiver in response to a call to the RTCRtpSender.getCapabilities() or RTCRtpReceiver.getCapabilities() static functions, both of which return an array of RTCRtpCapabilities objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpCapabilities">RTCRtpCapabilities - MDN</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpCapabilities"
  )
  interface Builder extends RTCRtpCapabilities {
    @JsOverlay
    @Nonnull
    default Builder codecs(@Nonnull final JsArray<RTCRtpCodecCapability> codecs) {
      setCodecs( codecs );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder codecs(@Nonnull final RTCRtpCodecCapability... codecs) {
      setCodecs( codecs );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder headerExtensions(
        @Nonnull final JsArray<RTCRtpHeaderExtensionCapability> headerExtensions) {
      setHeaderExtensions( headerExtensions );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder headerExtensions(
        @Nonnull final RTCRtpHeaderExtensionCapability... headerExtensions) {
      setHeaderExtensions( headerExtensions );
      return this;
    }
  }
}
