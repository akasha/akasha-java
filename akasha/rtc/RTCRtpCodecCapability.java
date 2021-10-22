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
 * The WebRTC API's RTCRtpCodecCapability dictionary provides information describing the capabilities of a single media codec.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpCodecCapability">RTCRtpCodecCapability - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpCodecCapability"
)
public interface RTCRtpCodecCapability {
  @JsOverlay
  @Nonnull
  static Step1 mimeType(@Nonnull final String mimeType) {
    final Builder $rtcRtpCodecCapability = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpCodecCapability.setMimeType( mimeType );
    return Js.uncheckedCast( $rtcRtpCodecCapability );
  }

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
      name = "RTCRtpCodecCapability"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder clockRate(int clockRate) {
      Js.<RTCRtpCodecCapability>uncheckedCast( this ).setClockRate( clockRate );
      return Js.uncheckedCast( this );
    }
  }

  /**
   * The WebRTC API's RTCRtpCodecCapability dictionary provides information describing the capabilities of a single media codec.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpCodecCapability">RTCRtpCodecCapability - MDN</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpCodecCapability"
  )
  interface Builder extends RTCRtpCodecCapability {
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
