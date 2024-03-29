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
 * An instance of the WebRTC API's RTCRtpEncodingParameters dictionary describes a single configuration of a codec for an RTCRtpSender.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters">RTCRtpEncodingParameters - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpencodingparameters"># dom-rtcrtpencodingparameters</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpEncodingParameters"
)
public interface RTCRtpEncodingParameters extends RTCRtpCodingParameters {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "active"
  )
  boolean active();

  @JsProperty
  void setActive(boolean active);

  /**
   * The RTCRtpEncodingParameters dictionary's maxBitrate property specifies the maximum number of bits per second to allow a track encoded with this encoding to use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/maxBitrate">RTCRtpEncodingParameters.maxBitrate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpencodingparameters-maxbitrate">RTCRtpEncodingParameters.maxBitrate - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "maxBitrate"
  )
  int maxBitrate();

  /**
   * The RTCRtpEncodingParameters dictionary's maxBitrate property specifies the maximum number of bits per second to allow a track encoded with this encoding to use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/maxBitrate">RTCRtpEncodingParameters.maxBitrate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpencodingparameters-maxbitrate">RTCRtpEncodingParameters.maxBitrate - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setMaxBitrate(int maxBitrate);

  /**
   * The RTCRtpEncodingParameters dictionary's scaleResolutionDownBy property can be used to specify a factor by which to reduce the size of a video track during encoding.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/scaleResolutionDownBy">RTCRtpEncodingParameters.scaleResolutionDownBy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpencodingparameters-scaleresolutiondownby">RTCRtpEncodingParameters.scaleResolutionDownBy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "scaleResolutionDownBy"
  )
  double scaleResolutionDownBy();

  /**
   * The RTCRtpEncodingParameters dictionary's scaleResolutionDownBy property can be used to specify a factor by which to reduce the size of a video track during encoding.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/scaleResolutionDownBy">RTCRtpEncodingParameters.scaleResolutionDownBy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpencodingparameters-scaleresolutiondownby">RTCRtpEncodingParameters.scaleResolutionDownBy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setScaleResolutionDownBy(double scaleResolutionDownBy);

  @JsProperty(
      name = "networkPriority"
  )
  @RTCPriorityType
  String networkPriority();

  @JsProperty
  void setNetworkPriority(@RTCPriorityType @JsNonNull String networkPriority);

  @JsProperty(
      name = "priority"
  )
  @RTCPriorityType
  String priority();

  @JsProperty
  void setPriority(@RTCPriorityType @JsNonNull String priority);

  /**
   * An instance of the WebRTC API's RTCRtpEncodingParameters dictionary describes a single configuration of a codec for an RTCRtpSender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters">RTCRtpEncodingParameters - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpencodingparameters"># dom-rtcrtpencodingparameters</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpEncodingParameters"
  )
  interface Builder extends RTCRtpEncodingParameters {
    @JsOverlay
    @Nonnull
    default Builder active(final boolean active) {
      setActive( active );
      return this;
    }

    /**
     * The RTCRtpEncodingParameters dictionary's maxBitrate property specifies the maximum number of bits per second to allow a track encoded with this encoding to use.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/maxBitrate">RTCRtpEncodingParameters.maxBitrate - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpencodingparameters-maxbitrate">RTCRtpEncodingParameters.maxBitrate - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder maxBitrate(final int maxBitrate) {
      setMaxBitrate( maxBitrate );
      return this;
    }

    /**
     * The RTCRtpEncodingParameters dictionary's scaleResolutionDownBy property can be used to specify a factor by which to reduce the size of a video track during encoding.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/scaleResolutionDownBy">RTCRtpEncodingParameters.scaleResolutionDownBy - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpencodingparameters-scaleresolutiondownby">RTCRtpEncodingParameters.scaleResolutionDownBy - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder scaleResolutionDownBy(final double scaleResolutionDownBy) {
      setScaleResolutionDownBy( scaleResolutionDownBy );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder networkPriority(@RTCPriorityType @Nonnull final String networkPriority) {
      setNetworkPriority( networkPriority );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder priority(@RTCPriorityType @Nonnull final String priority) {
      setPriority( priority );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rid(@Nonnull final String rid) {
      setRid( rid );
      return this;
    }
  }
}
