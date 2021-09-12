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
  static Builder create(final short payloadType, @Nonnull final String mimeType,
      final int clockRate) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).payloadType( payloadType ).mimeType( mimeType ).clockRate( clockRate );
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
  interface Builder extends RTCRtpCodecParameters {
    @JsOverlay
    @Nonnull
    default Builder payloadType(final short payloadType) {
      setPayloadType( payloadType );
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
    default Builder clockRate(final int clockRate) {
      setClockRate( clockRate );
      return this;
    }

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
