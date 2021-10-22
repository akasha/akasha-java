package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCVideoReceiverStats"
)
public interface RTCVideoReceiverStats extends RTCVideoHandlerStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcVideoReceiverStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcVideoReceiverStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcVideoReceiverStats );
  }

  @JsProperty(
      name = "estimatedPlayoutTimestamp"
  )
  double estimatedPlayoutTimestamp();

  @JsProperty
  void setEstimatedPlayoutTimestamp(double estimatedPlayoutTimestamp);

  @JsProperty(
      name = "framesDecoded"
  )
  int framesDecoded();

  @JsProperty
  void setFramesDecoded(int framesDecoded);

  @JsProperty(
      name = "framesDropped"
  )
  int framesDropped();

  @JsProperty
  void setFramesDropped(int framesDropped);

  @JsProperty(
      name = "framesReceived"
  )
  int framesReceived();

  @JsProperty
  void setFramesReceived(int framesReceived);

  @JsProperty(
      name = "fullFramesLost"
  )
  int fullFramesLost();

  @JsProperty
  void setFullFramesLost(int fullFramesLost);

  @JsProperty(
      name = "jitterBufferDelay"
  )
  double jitterBufferDelay();

  @JsProperty
  void setJitterBufferDelay(double jitterBufferDelay);

  @JsProperty(
      name = "jitterBufferEmittedCount"
  )
  int jitterBufferEmittedCount();

  @JsProperty
  void setJitterBufferEmittedCount(int jitterBufferEmittedCount);

  @JsProperty(
      name = "keyFramesReceived"
  )
  int keyFramesReceived();

  @JsProperty
  void setKeyFramesReceived(int keyFramesReceived);

  @JsProperty(
      name = "partialFramesLost"
  )
  int partialFramesLost();

  @JsProperty
  void setPartialFramesLost(int partialFramesLost);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoReceiverStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCVideoReceiverStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoReceiverStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCVideoReceiverStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoReceiverStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull String kind) {
      Js.<RTCVideoReceiverStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoReceiverStats"
  )
  interface Builder extends RTCVideoReceiverStats {
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
  }
}
