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
    name = "RTCSenderVideoTrackAttachmentStats"
)
public interface RTCSenderVideoTrackAttachmentStats extends RTCVideoSenderStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcSenderVideoTrackAttachmentStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcSenderVideoTrackAttachmentStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcSenderVideoTrackAttachmentStats );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSenderVideoTrackAttachmentStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCSenderVideoTrackAttachmentStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSenderVideoTrackAttachmentStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCSenderVideoTrackAttachmentStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSenderVideoTrackAttachmentStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull String kind) {
      Js.<RTCSenderVideoTrackAttachmentStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSenderVideoTrackAttachmentStats"
  )
  interface Builder extends RTCSenderVideoTrackAttachmentStats {
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
