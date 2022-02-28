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
 * The createOffer() method of the RTCPeerConnection interface initiates the creation of an SDP offer for the purpose of starting a new WebRTC connection to a remote peer. The SDP offer includes information about any MediaStreamTrack objects already attached to the WebRTC session, codec, and options supported by the browser, and any candidates already gathered by the ICE agent, for the purpose of being sent over the signaling channel to a potential peer to request a connection or to update the configuration of an existing connection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferOptions">RTCOfferOptions - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-createoffer"># dom-rtcpeerconnection-createoffer</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCOfferOptions"
)
public interface RTCOfferOptions extends RTCOfferAnswerOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The iceRestart property of the RTCOfferOptions dictionary is a Boolean value which, when true, tells the RTCPeerConnection to start ICE renegotiation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferOptions/iceRestart">RTCOfferOptions.iceRestart - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcofferoptions-icerestart">RTCOfferOptions.iceRestart - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "iceRestart"
  )
  boolean iceRestart();

  /**
   * The iceRestart property of the RTCOfferOptions dictionary is a Boolean value which, when true, tells the RTCPeerConnection to start ICE renegotiation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferOptions/iceRestart">RTCOfferOptions.iceRestart - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcofferoptions-icerestart">RTCOfferOptions.iceRestart - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setIceRestart(boolean iceRestart);

  @JsProperty(
      name = "offerToReceiveAudio"
  )
  boolean offerToReceiveAudio();

  @JsProperty
  void setOfferToReceiveAudio(boolean offerToReceiveAudio);

  @JsProperty(
      name = "offerToReceiveVideo"
  )
  boolean offerToReceiveVideo();

  @JsProperty
  void setOfferToReceiveVideo(boolean offerToReceiveVideo);

  /**
   * The createOffer() method of the RTCPeerConnection interface initiates the creation of an SDP offer for the purpose of starting a new WebRTC connection to a remote peer. The SDP offer includes information about any MediaStreamTrack objects already attached to the WebRTC session, codec, and options supported by the browser, and any candidates already gathered by the ICE agent, for the purpose of being sent over the signaling channel to a potential peer to request a connection or to update the configuration of an existing connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferOptions">RTCOfferOptions - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-createoffer"># dom-rtcpeerconnection-createoffer</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCOfferOptions"
  )
  interface Builder extends RTCOfferOptions {
    /**
     * The iceRestart property of the RTCOfferOptions dictionary is a Boolean value which, when true, tells the RTCPeerConnection to start ICE renegotiation.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferOptions/iceRestart">RTCOfferOptions.iceRestart - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcofferoptions-icerestart">RTCOfferOptions.iceRestart - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder iceRestart(final boolean iceRestart) {
      setIceRestart( iceRestart );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder offerToReceiveAudio(final boolean offerToReceiveAudio) {
      setOfferToReceiveAudio( offerToReceiveAudio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder offerToReceiveVideo(final boolean offerToReceiveVideo) {
      setOfferToReceiveVideo( offerToReceiveVideo );
      return this;
    }
  }
}
