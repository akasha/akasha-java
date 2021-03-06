package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCRtpSynchronizationSource dictionary of the WebRTC API is used by getSynchronizationSources() to describe a particular synchronization source (SSRC).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSynchronizationSource">RTCRtpSynchronizationSource - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsynchronizationsource">(WebRTC 1.0) # dom-rtcrtpsynchronizationsource</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpSynchronizationSource"
)
public interface RTCRtpSynchronizationSource extends RTCRtpContributingSource {
  @JsOverlay
  @Nonnull
  static Builder create(final double timestamp, final int source, final int rtpTimestamp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).timestamp( timestamp ).source( source ).rtpTimestamp( rtpTimestamp );
  }

  /**
   * The RTCRtpSynchronizationSource dictionary of the WebRTC API is used by getSynchronizationSources() to describe a particular synchronization source (SSRC).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSynchronizationSource">RTCRtpSynchronizationSource - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsynchronizationsource">(WebRTC 1.0) # dom-rtcrtpsynchronizationsource</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpSynchronizationSource"
  )
  interface Builder extends RTCRtpSynchronizationSource {
    /**
     * The read-only timestamp property of the RTCRtpContributingSource interface returns a DOMHighResTimeStamp indicating the most recent time of playout of an RTP packet from the source.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/timestamp">RTCRtpContributingSource.timestamp - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-timestamp">timestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder timestamp(final double timestamp) {
      setTimestamp( timestamp );
      return this;
    }

    /**
     * The read-only source property of the RTCRtpContributingSource interface returns the source identifier of a particular stream of RTP packets.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/source">RTCRtpContributingSource.source - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-source">source - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder source(final int source) {
      setSource( source );
      return this;
    }

    /**
     * The read-only rtpTimestamp property of the RTCRtpContributingSource interface returns a DOMHighResTimeStamp indicating the source-generated time at which the media contained int he packet was first sampled or obtained.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/rtpTimestamp">RTCRtpContributingSource.rtpTimestamp - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsynchronizationsource-rtptimestamp">rtpTimestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder rtpTimestamp(final int rtpTimestamp) {
      setRtpTimestamp( rtpTimestamp );
      return this;
    }

    /**
     * The read-only audioLevel property of the RTCRtpContributingSource interface indicates the audio level contained in the last RTP packet played from the described source.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/audioLevel">RTCRtpContributingSource.audioLevel - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-audiolevel">audioLevel - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder audioLevel(final double audioLevel) {
      setAudioLevel( audioLevel );
      return this;
    }
  }
}
