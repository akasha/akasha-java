package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The createAnswer() method on the RTCPeerConnection interface creates an SDP answer to an offer received from a remote peer during the offer/answer negotiation of a WebRTC connection. The answer contains information about any media already attached to the session, codecs and options supported by the browser, and any ICE candidates already gathered. The answer is delivered to the returned Promise, and should then be sent to the source of the offer to continue the negotiation process.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferAnswerOptions">RTCOfferAnswerOptions - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-createanswer"># dom-rtcpeerconnection-createanswer</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCOfferAnswerOptions"
)
public interface RTCOfferAnswerOptions {
  @JsOverlay
  @Nonnull
  static RTCOfferAnswerOptions of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }
}
