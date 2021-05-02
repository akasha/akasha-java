package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcrtpcodeccapability">RTCRtpCodecCapability - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface RTCRtpCodecCapability {
  @JsOverlay
  @Nonnull
  static Builder create(final int clockRate, @Nonnull final String mimeType) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).clockRate( clockRate ).mimeType( mimeType );
  }

  @JsProperty(
      name = "channels"
  )
  int channels();

  @JsProperty
  void setChannels(int channels);

  @JsProperty(
      name = "clockRate"
  )
  int clockRate();

  @JsProperty
  void setClockRate(int clockRate);

  @JsProperty(
      name = "mimeType"
  )
  @Nonnull
  String mimeType();

  @JsProperty
  void setMimeType(@Nonnull String mimeType);

  @JsProperty(
      name = "sdpFmtpLine"
  )
  String sdpFmtpLine();

  @JsProperty
  void setSdpFmtpLine(@Nonnull String sdpFmtpLine);

  /**
   * The WebRTC API's RTCRtpCodecCapability dictionary provides information describing the capabilities of a single media codec.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpCodecCapability">RTCRtpCodecCapability - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#rtcrtpcodeccapability">RTCRtpCodecCapability - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
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
    default Builder clockRate(final int clockRate) {
      setClockRate( clockRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mimeType(@Nonnull final String mimeType) {
      setMimeType( mimeType );
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