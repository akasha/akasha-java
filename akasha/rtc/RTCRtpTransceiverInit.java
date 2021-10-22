package akasha.rtc;

import akasha.lang.JsArray;
import akasha.media.MediaStream;
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
 * The RTCRtpTransceiverInit dictionary is used when calling the WebRTC function RTCPeerConnection.addTransceiver() to provide configuration options for the new transceiver.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiverInit">RTCRtpTransceiverInit - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtptransceiverinit">(WebRTC 1.0) # dom-rtcrtptransceiverinit</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpTransceiverInit"
)
public interface RTCRtpTransceiverInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "direction"
  )
  @RTCRtpTransceiverDirection
  String direction();

  @JsProperty
  void setDirection(@RTCRtpTransceiverDirection @JsNonNull String direction);

  @JsProperty(
      name = "sendEncodings"
  )
  JsArray<RTCRtpEncodingParameters> sendEncodings();

  @JsProperty
  void setSendEncodings(@JsNonNull JsArray<RTCRtpEncodingParameters> sendEncodings);

  @JsOverlay
  default void setSendEncodings(@Nonnull final RTCRtpEncodingParameters... sendEncodings) {
    setSendEncodings( Js.<JsArray<RTCRtpEncodingParameters>>uncheckedCast( sendEncodings ) );
  }

  @JsProperty(
      name = "streams"
  )
  JsArray<MediaStream> streams();

  @JsProperty
  void setStreams(@JsNonNull JsArray<MediaStream> streams);

  @JsOverlay
  default void setStreams(@Nonnull final MediaStream... streams) {
    setStreams( Js.<JsArray<MediaStream>>uncheckedCast( streams ) );
  }

  /**
   * The RTCRtpTransceiverInit dictionary is used when calling the WebRTC function RTCPeerConnection.addTransceiver() to provide configuration options for the new transceiver.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiverInit">RTCRtpTransceiverInit - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtptransceiverinit">(WebRTC 1.0) # dom-rtcrtptransceiverinit</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpTransceiverInit"
  )
  interface Builder extends RTCRtpTransceiverInit {
    @JsOverlay
    @Nonnull
    default Builder direction(@RTCRtpTransceiverDirection @Nonnull final String direction) {
      setDirection( direction );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sendEncodings(@Nonnull final JsArray<RTCRtpEncodingParameters> sendEncodings) {
      setSendEncodings( sendEncodings );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sendEncodings(@Nonnull final RTCRtpEncodingParameters... sendEncodings) {
      setSendEncodings( sendEncodings );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder streams(@Nonnull final JsArray<MediaStream> streams) {
      setStreams( streams );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder streams(@Nonnull final MediaStream... streams) {
      setStreams( streams );
      return this;
    }
  }
}
