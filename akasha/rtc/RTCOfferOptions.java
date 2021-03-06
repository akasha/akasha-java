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
 * The RTCOfferOptions dictionary is used to provide optional settings when creating an RTCPeerConnection offer with the createOffer() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferOptions">RTCOfferOptions - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcofferoptions">(WebRTC 1.0) # dom-rtcofferoptions</a>
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
  static Builder create() {
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
   * The RTCOfferOptions dictionary is used to provide optional settings when creating an RTCPeerConnection offer with the createOffer() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferOptions">RTCOfferOptions - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcofferoptions">(WebRTC 1.0) # dom-rtcofferoptions</a>
   */
  @Generated("org.realityforge.webtack")
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
