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
 * The RTCIceCandidatePair dictionary describes a pair of ICE candidates which together comprise a description of a viable connection between two WebRTC endpoints. It is used as the return value from RTCIceTransport.getSelectedCandidatePair() to identify the currently-selected candidate pair identified by the ICE agent.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair">RTCIceCandidatePair - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIceCandidatePair"
)
public interface RTCIceCandidatePair {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The local property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate which describes the configuration of the local end of a viable WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/local">RTCIceCandidatePair.local - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidatepair-local">RTCIceCandidatePair.local - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "local"
  )
  RTCIceCandidate local();

  /**
   * The local property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate which describes the configuration of the local end of a viable WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/local">RTCIceCandidatePair.local - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidatepair-local">RTCIceCandidatePair.local - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setLocal(@JsNonNull RTCIceCandidate local);

  /**
   * The remote property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate describing the configuration of the remote end of a viable WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/remote">RTCIceCandidatePair.remote - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidatepair-remote">RTCIceCandidatePair.remote - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "remote"
  )
  RTCIceCandidate remote();

  /**
   * The remote property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate describing the configuration of the remote end of a viable WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/remote">RTCIceCandidatePair.remote - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidatepair-remote">RTCIceCandidatePair.remote - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setRemote(@JsNonNull RTCIceCandidate remote);

  /**
   * The RTCIceCandidatePair dictionary describes a pair of ICE candidates which together comprise a description of a viable connection between two WebRTC endpoints. It is used as the return value from RTCIceTransport.getSelectedCandidatePair() to identify the currently-selected candidate pair identified by the ICE agent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair">RTCIceCandidatePair - MDN</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceCandidatePair"
  )
  interface Builder extends RTCIceCandidatePair {
    /**
     * The local property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate which describes the configuration of the local end of a viable WebRTC connection.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/local">RTCIceCandidatePair.local - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidatepair-local">RTCIceCandidatePair.local - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder local(@Nonnull final RTCIceCandidate local) {
      setLocal( local );
      return this;
    }

    /**
     * The remote property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate describing the configuration of the remote end of a viable WebRTC connection.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/remote">RTCIceCandidatePair.remote - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidatepair-remote">RTCIceCandidatePair.remote - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder remote(@Nonnull final RTCIceCandidate remote) {
      setRemote( remote );
      return this;
    }
  }
}
