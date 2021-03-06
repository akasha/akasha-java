package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCReceiverVideoTrackAttachmentStats"
)
public interface RTCReceiverVideoTrackAttachmentStats extends RTCVideoReceiverStats {
  @JsOverlay
  @Nonnull
  static Builder create(final double timestamp, @RTCStatsType @Nonnull final String type,
      @Nonnull final String id, @Nonnull final String kind) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).timestamp( timestamp ).type( type ).id( id ).kind( kind );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCReceiverVideoTrackAttachmentStats"
  )
  interface Builder extends RTCReceiverVideoTrackAttachmentStats {
    @JsOverlay
    @Nonnull
    default Builder estimatedPlayoutTimestamp(final double estimatedPlayoutTimestamp) {
      setEstimatedPlayoutTimestamp( estimatedPlayoutTimestamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder framesDecoded(final int framesDecoded) {
      setFramesDecoded( framesDecoded );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder framesDropped(final int framesDropped) {
      setFramesDropped( framesDropped );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder framesReceived(final int framesReceived) {
      setFramesReceived( framesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder fullFramesLost(final int fullFramesLost) {
      setFullFramesLost( fullFramesLost );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder jitterBufferDelay(final double jitterBufferDelay) {
      setJitterBufferDelay( jitterBufferDelay );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder jitterBufferEmittedCount(final int jitterBufferEmittedCount) {
      setJitterBufferEmittedCount( jitterBufferEmittedCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder keyFramesReceived(final int keyFramesReceived) {
      setKeyFramesReceived( keyFramesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder partialFramesLost(final int partialFramesLost) {
      setPartialFramesLost( partialFramesLost );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frameHeight(final int frameHeight) {
      setFrameHeight( frameHeight );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frameWidth(final int frameWidth) {
      setFrameWidth( frameWidth );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder framesPerSecond(final double framesPerSecond) {
      setFramesPerSecond( framesPerSecond );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ended(final boolean ended) {
      setEnded( ended );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull final String kind) {
      setKind( kind );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder trackIdentifier(@Nonnull final String trackIdentifier) {
      setTrackIdentifier( trackIdentifier );
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
    default Builder remoteSource(final boolean remoteSource) {
      setRemoteSource( remoteSource );
      return this;
    }

    /**
     * The timestamp property of the RTCStats dictionary is a DOMHighResTimeStamp object specifying the time at which the data in the object was sampled.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/timestamp">RTCStats.timestamp - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-timestamp">RTCStats.timestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder timestamp(final double timestamp) {
      setTimestamp( timestamp );
      return this;
    }

    /**
     * The RTCStats dictionary's property type is a string which specifies the type of statistic represented by the object, where the permitted values are drawn from the enum type RTCStatsType.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/type">RTCStats.type - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-type">RTCStats.type - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder type(@RTCStatsType @Nonnull final String type) {
      setType( type );
      return this;
    }

    /**
     * The id property of the RTCStats dictionary is a string which uniquely identifies the object for which this RTCStats object provides statistics.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/id">RTCStats.id - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-id">RTCStats.id - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull final String id) {
      setId( id );
      return this;
    }
  }
}
