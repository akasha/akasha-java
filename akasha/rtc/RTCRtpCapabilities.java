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
  static Step1 codecs(@Nonnull final JsArray<RTCRtpCodecCapability> codecs) {
    final RTCRtpCapabilities $rtcRtpCapabilities = Js.<RTCRtpCapabilities>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpCapabilities.setCodecs( codecs );
    return Js.uncheckedCast( $rtcRtpCapabilities );
  }

  @JsOverlay
  @Nonnull
  static Step1 codecs(@Nonnull final RTCRtpCodecCapability... codecs) {
    final RTCRtpCapabilities $rtcRtpCapabilities = Js.<RTCRtpCapabilities>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpCapabilities.setCodecs( codecs );
    return Js.uncheckedCast( $rtcRtpCapabilities );
  }

  @JsProperty(
      name = "codecs"
  )
  @JsNonNull
  JsArray<RTCRtpCodecCapability> codecs();

  @JsProperty
  void setCodecs(@JsNonNull JsArray<RTCRtpCodecCapability> codecs);

  @JsOverlay
  default void setCodecs(@Nonnull final RTCRtpCodecCapability... codecs) {
    setCodecs( Js.<JsArray<RTCRtpCodecCapability>>uncheckedCast( codecs ) );
  }

  @JsProperty(
      name = "headerExtensions"
  )
  @JsNonNull
  JsArray<RTCRtpHeaderExtensionCapability> headerExtensions();

  @JsProperty
  void setHeaderExtensions(@JsNonNull JsArray<RTCRtpHeaderExtensionCapability> headerExtensions);

  @JsOverlay
  default void setHeaderExtensions(
      @Nonnull final RTCRtpHeaderExtensionCapability... headerExtensions) {
    setHeaderExtensions( Js.<JsArray<RTCRtpHeaderExtensionCapability>>uncheckedCast( headerExtensions ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpCapabilities"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default RTCRtpCapabilities headerExtensions(
        @Nonnull JsArray<RTCRtpHeaderExtensionCapability> headerExtensions) {
      Js.<RTCRtpCapabilities>uncheckedCast( this ).setHeaderExtensions( headerExtensions );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default RTCRtpCapabilities headerExtensions(
        @Nonnull RTCRtpHeaderExtensionCapability... headerExtensions) {
      Js.<RTCRtpCapabilities>uncheckedCast( this ).setHeaderExtensions( headerExtensions );
      return Js.uncheckedCast( this );
    }
  }
}
