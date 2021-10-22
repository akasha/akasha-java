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

/**
 * The RTCRtpCodecParameters dictionary, part of the WebRTC API, is used to describe the configuration parameters for a single media codec.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpCodecParameters">RTCRtpCodecParameters - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpCodecParameters"
)
public interface RTCRtpCodecParameters {
  @JsOverlay
  @Nonnull
  static Step1 payloadType(final short payloadType) {
    final Builder $rtcRtpCodecParameters = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpCodecParameters.setPayloadType( payloadType );
    return Js.uncheckedCast( $rtcRtpCodecParameters );
  }

  @JsProperty(
      name = "payloadType"
  )
  short payloadType();

  @JsProperty
  void setPayloadType(short payloadType);

  @JsProperty(
      name = "mimeType"
  )
  @JsNonNull
  String mimeType();

  @JsProperty
  void setMimeType(@JsNonNull String mimeType);

  @JsProperty(
      name = "clockRate"
  )
  int clockRate();

  @JsProperty
  void setClockRate(int clockRate);

  @JsProperty(
      name = "channels"
  )
  int channels();

  @JsProperty
  void setChannels(int channels);

  @JsProperty(
      name = "sdpFmtpLine"
  )
  String sdpFmtpLine();

  @JsProperty
  void setSdpFmtpLine(@JsNonNull String sdpFmtpLine);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpCodecParameters"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 mimeType(@Nonnull String mimeType) {
      Js.<RTCRtpCodecParameters>uncheckedCast( this ).setMimeType( mimeType );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpCodecParameters"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder clockRate(int clockRate) {
      Js.<RTCRtpCodecParameters>uncheckedCast( this ).setClockRate( clockRate );
      return Js.uncheckedCast( this );
    }
  }

  /**
   * The RTCRtpCodecParameters dictionary, part of the WebRTC API, is used to describe the configuration parameters for a single media codec.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpCodecParameters">RTCRtpCodecParameters - MDN</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpCodecParameters"
  )
  interface Builder extends RTCRtpCodecParameters {
    @JsOverlay
    @Nonnull
    default Builder channels(final int channels) {
      setChannels( channels );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sdpFmtpLine(@Nonnull final String sdpFmtpLine) {
      setSdpFmtpLine( sdpFmtpLine );
      return this;
    }
  }
}
