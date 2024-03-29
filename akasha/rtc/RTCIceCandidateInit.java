package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCIceCandidate() constructor creates and returns a new RTCIceCandidate object, which can be configured to represent a single ICE candidate.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit">RTCIceCandidateInit - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-constructor"># dom-rtcicecandidate-constructor</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIceCandidateInit"
)
public interface RTCIceCandidateInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The optional property candidate in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's candidate property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/candidate">RTCIceCandidateInit.candidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-candidate">RTCIceCandidateInit.candidate - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "candidate"
  )
  String candidate();

  /**
   * The optional property candidate in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's candidate property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/candidate">RTCIceCandidateInit.candidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-candidate">RTCIceCandidateInit.candidate - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setCandidate(@JsNonNull String candidate);

  /**
   * The optional property sdpMLineIndex in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMLineIndex property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMLineIndex">RTCIceCandidateInit.sdpMLineIndex - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-sdpmlineindex">RTCIceCandidateInit.sdpMLineIndex - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "sdpMLineIndex"
  )
  @JsNullable
  Double sdpMLineIndex();

  /**
   * The optional property sdpMLineIndex in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMLineIndex property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMLineIndex">RTCIceCandidateInit.sdpMLineIndex - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-sdpmlineindex">RTCIceCandidateInit.sdpMLineIndex - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setSdpMLineIndex(@JsNullable Double sdpMLineIndex);

  /**
   * The optional property sdpMid in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMid property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMid">RTCIceCandidateInit.sdpMid - MDN</a>
   */
  @JsProperty(
      name = "sdpMid"
  )
  @JsNullable
  String sdpMid();

  /**
   * The optional property sdpMid in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMid property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMid">RTCIceCandidateInit.sdpMid - MDN</a>
   */
  @JsProperty
  void setSdpMid(@JsNullable String sdpMid);

  /**
   * The optional property usernameFragment in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's usernameFragment property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/usernameFragment">RTCIceCandidateInit.usernameFragment - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-usernamefragment">RTCIceCandidateInit.usernameFragment - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "usernameFragment"
  )
  @JsNullable
  String usernameFragment();

  /**
   * The optional property usernameFragment in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's usernameFragment property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/usernameFragment">RTCIceCandidateInit.usernameFragment - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-usernamefragment">RTCIceCandidateInit.usernameFragment - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setUsernameFragment(@JsNullable String usernameFragment);

  /**
   * The RTCIceCandidate() constructor creates and returns a new RTCIceCandidate object, which can be configured to represent a single ICE candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit">RTCIceCandidateInit - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-constructor"># dom-rtcicecandidate-constructor</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceCandidateInit"
  )
  interface Builder extends RTCIceCandidateInit {
    /**
     * The optional property candidate in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's candidate property.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/candidate">RTCIceCandidateInit.candidate - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-candidate">RTCIceCandidateInit.candidate - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder candidate(@Nonnull final String candidate) {
      setCandidate( candidate );
      return this;
    }

    /**
     * The optional property sdpMLineIndex in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMLineIndex property.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMLineIndex">RTCIceCandidateInit.sdpMLineIndex - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-sdpmlineindex">RTCIceCandidateInit.sdpMLineIndex - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder sdpMLineIndex(@Nullable final Double sdpMLineIndex) {
      setSdpMLineIndex( sdpMLineIndex );
      return this;
    }

    /**
     * The optional property sdpMid in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMid property.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMid">RTCIceCandidateInit.sdpMid - MDN</a>
     */
    @JsOverlay
    @Nonnull
    default Builder sdpMid(@Nullable final String sdpMid) {
      setSdpMid( sdpMid );
      return this;
    }

    /**
     * The optional property usernameFragment in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's usernameFragment property.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/usernameFragment">RTCIceCandidateInit.usernameFragment - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-usernamefragment">RTCIceCandidateInit.usernameFragment - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder usernameFragment(@Nullable final String usernameFragment) {
      setUsernameFragment( usernameFragment );
      return this;
    }
  }
}
