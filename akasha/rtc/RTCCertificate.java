package akasha.rtc;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The interface of the WebRTC API provides an object represents a certificate that an RTCPeerConnection uses to authenticate.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCCertificate">RTCCertificate - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtccertificate">(WebRTC 1.0) # dom-rtccertificate</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCCertificate"
)
public class RTCCertificate extends JsObject {
  protected RTCCertificate() {
  }

  @JsProperty(
      name = "expires"
  )
  public native int expires();

  @Nonnull
  public native JsArray<RTCDtlsFingerprint> getFingerprints();
}
