package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The WebRTC API's RTCOfferAnswerOptions dictionary is used to specify options that configure and control the process of creating WebRTC offers or answers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferAnswerOptions">RTCOfferAnswerOptions - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcofferansweroptions">(WebRTC 1.0) # dom-rtcofferansweroptions</a>
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
