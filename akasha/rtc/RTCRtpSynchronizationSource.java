package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The getSynchronizationSources() method of the RTCRtpReceiver interface returns an array of RTCRtpContributingSource instances, each corresponding to one SSRC (synchronization source) identifier received by the current RTCRtpReceiver in the last ten seconds.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSynchronizationSource">RTCRtpSynchronizationSource - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpreceiver-getsynchronizationsources"># dom-rtcrtpreceiver-getsynchronizationsources</a>
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
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcRtpSynchronizationSource = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpSynchronizationSource.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcRtpSynchronizationSource );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpSynchronizationSource"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 source(int source) {
      Js.<RTCRtpSynchronizationSource>uncheckedCast( this ).setSource( source );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpSynchronizationSource"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder rtpTimestamp(int rtpTimestamp) {
      Js.<RTCRtpSynchronizationSource>uncheckedCast( this ).setRtpTimestamp( rtpTimestamp );
      return Js.uncheckedCast( this );
    }
  }

  /**
   * The getSynchronizationSources() method of the RTCRtpReceiver interface returns an array of RTCRtpContributingSource instances, each corresponding to one SSRC (synchronization source) identifier received by the current RTCRtpReceiver in the last ten seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSynchronizationSource">RTCRtpSynchronizationSource - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpreceiver-getsynchronizationsources"># dom-rtcrtpreceiver-getsynchronizationsources</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpSynchronizationSource"
  )
  interface Builder extends RTCRtpSynchronizationSource {
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
