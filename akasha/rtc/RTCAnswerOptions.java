package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCAnswerOptions dictionary is used to provide optional settings when creating an SDP answer using RTCPeerConnection.createOffer() after receiving an offer from a remote peer.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCAnswerOptions">RTCAnswerOptions - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcansweroptions">(WebRTC 1.0) # dom-rtcansweroptions</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCAnswerOptions"
)
public interface RTCAnswerOptions extends RTCOfferAnswerOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The RTCAnswerOptions dictionary is used to provide optional settings when creating an SDP answer using RTCPeerConnection.createOffer() after receiving an offer from a remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCAnswerOptions">RTCAnswerOptions - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcansweroptions">(WebRTC 1.0) # dom-rtcansweroptions</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCAnswerOptions"
  )
  interface Builder extends RTCAnswerOptions {
  }
}
