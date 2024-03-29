package akasha.rtc;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The RTCIdentityAssertion interface of the WebRTC API represents the identity of a remote peer of the current connection. If no peer has yet been set and verified, then this interface returns null. Once set it can't be changed.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIdentityAssertion">RTCIdentityAssertion - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-identity/#rtcidentityassertion-interface"># rtcidentityassertion-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIdentityAssertion"
)
public class RTCIdentityAssertion extends JsObject {
  @JsNonNull
  public String idp;

  @JsNonNull
  public String name;

  public RTCIdentityAssertion(@Nonnull final String idp, @Nonnull final String name) {
  }
}
