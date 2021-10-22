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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCVideoSenderStats"
)
public interface RTCVideoSenderStats extends RTCVideoHandlerStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcVideoSenderStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcVideoSenderStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcVideoSenderStats );
  }

  @JsProperty(
      name = "mediaSourceId"
  )
  String mediaSourceId();

  @JsProperty
  void setMediaSourceId(@JsNonNull String mediaSourceId);

  @JsProperty(
      name = "framesCaptured"
  )
  int framesCaptured();

  @JsProperty
  void setFramesCaptured(int framesCaptured);

  @JsProperty(
      name = "framesSent"
  )
  int framesSent();

  @JsProperty
  void setFramesSent(int framesSent);

  @JsProperty(
      name = "hugeFramesSent"
  )
  int hugeFramesSent();

  @JsProperty
  void setHugeFramesSent(int hugeFramesSent);

  @JsProperty(
      name = "keyFramesSent"
  )
  int keyFramesSent();

  @JsProperty
  void setKeyFramesSent(int keyFramesSent);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoSenderStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCVideoSenderStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoSenderStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCVideoSenderStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoSenderStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull String kind) {
      Js.<RTCVideoSenderStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoSenderStats"
  )
  interface Builder extends RTCVideoSenderStats {
    @JsOverlay
    @Nonnull
    default Builder mediaSourceId(@Nonnull final String mediaSourceId) {
      setMediaSourceId( mediaSourceId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder framesCaptured(final int framesCaptured) {
      setFramesCaptured( framesCaptured );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder framesSent(final int framesSent) {
      setFramesSent( framesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder hugeFramesSent(final int hugeFramesSent) {
      setHugeFramesSent( hugeFramesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder keyFramesSent(final int keyFramesSent) {
      setKeyFramesSent( keyFramesSent );
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
