package akasha.rtc;

import akasha.EventInit;
import akasha.lang.JsArray;
import akasha.media.MediaStream;
import akasha.media.MediaStreamTrack;
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
 * The WebRTC API's RTCTrackEventInit dictionary is used to provide information describing an RTCTrackEvent when instantiating a new track event using new RTCTrackEvent().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit">RTCTrackEventInit - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit">(WebRTC 1.0) # dom-rtctrackeventinit</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCTrackEventInit"
)
public interface RTCTrackEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final RTCRtpReceiver receiver,
      @Nonnull final MediaStreamTrack track, @Nonnull final RTCRtpTransceiver transceiver) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).receiver( receiver ).track( track ).transceiver( transceiver );
  }

  /**
   * The RTCTrackEventInit dictionary's receiver property specifies the RTCRtpReceiver associated with the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/receiver">RTCTrackEventInit.receiver - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-receiver">RTCTrackEventInit.receiver - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "receiver"
  )
  @JsNonNull
  RTCRtpReceiver receiver();

  /**
   * The RTCTrackEventInit dictionary's receiver property specifies the RTCRtpReceiver associated with the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/receiver">RTCTrackEventInit.receiver - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-receiver">RTCTrackEventInit.receiver - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setReceiver(@JsNonNull RTCRtpReceiver receiver);

  /**
   * The RTCTrackEventInit dictionary's track property specifies the MediaStreamTrack associated with the track event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/track">RTCTrackEventInit.track - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-track">RTCTrackEventInit.track - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "track"
  )
  @JsNonNull
  MediaStreamTrack track();

  /**
   * The RTCTrackEventInit dictionary's track property specifies the MediaStreamTrack associated with the track event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/track">RTCTrackEventInit.track - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-track">RTCTrackEventInit.track - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setTrack(@JsNonNull MediaStreamTrack track);

  @JsProperty(
      name = "transceiver"
  )
  @JsNonNull
  RTCRtpTransceiver transceiver();

  @JsProperty
  void setTransceiver(@JsNonNull RTCRtpTransceiver transceiver);

  /**
   * The RTCTrackEventInit dictionary's optional streams property provides an array containing a MediaStream object for each of the streams associated with the event's track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/streams">RTCTrackEventInit.streams - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-streams">RTCTrackEventInit.streams - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "streams"
  )
  JsArray<MediaStream> streams();

  /**
   * The RTCTrackEventInit dictionary's optional streams property provides an array containing a MediaStream object for each of the streams associated with the event's track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/streams">RTCTrackEventInit.streams - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-streams">RTCTrackEventInit.streams - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setStreams(@JsNonNull JsArray<MediaStream> streams);

  /**
   * The RTCTrackEventInit dictionary's optional streams property provides an array containing a MediaStream object for each of the streams associated with the event's track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/streams">RTCTrackEventInit.streams - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-streams">RTCTrackEventInit.streams - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  default void setStreams(@Nonnull final MediaStream... streams) {
    setStreams( Js.<JsArray<MediaStream>>uncheckedCast( streams ) );
  }

  /**
   * The WebRTC API's RTCTrackEventInit dictionary is used to provide information describing an RTCTrackEvent when instantiating a new track event using new RTCTrackEvent().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit">RTCTrackEventInit - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit">(WebRTC 1.0) # dom-rtctrackeventinit</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCTrackEventInit"
  )
  interface Builder extends RTCTrackEventInit {
    /**
     * The RTCTrackEventInit dictionary's receiver property specifies the RTCRtpReceiver associated with the event.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/receiver">RTCTrackEventInit.receiver - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-receiver">RTCTrackEventInit.receiver - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder receiver(@Nonnull final RTCRtpReceiver receiver) {
      setReceiver( receiver );
      return this;
    }

    /**
     * The RTCTrackEventInit dictionary's track property specifies the MediaStreamTrack associated with the track event.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/track">RTCTrackEventInit.track - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-track">RTCTrackEventInit.track - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder track(@Nonnull final MediaStreamTrack track) {
      setTrack( track );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder transceiver(@Nonnull final RTCRtpTransceiver transceiver) {
      setTransceiver( transceiver );
      return this;
    }

    /**
     * The RTCTrackEventInit dictionary's optional streams property provides an array containing a MediaStream object for each of the streams associated with the event's track.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/streams">RTCTrackEventInit.streams - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-streams">RTCTrackEventInit.streams - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder streams(@Nonnull final JsArray<MediaStream> streams) {
      setStreams( streams );
      return this;
    }

    /**
     * The RTCTrackEventInit dictionary's optional streams property provides an array containing a MediaStream object for each of the streams associated with the event's track.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/streams">RTCTrackEventInit.streams - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-streams">RTCTrackEventInit.streams - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder streams(@Nonnull final MediaStream... streams) {
      setStreams( streams );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
