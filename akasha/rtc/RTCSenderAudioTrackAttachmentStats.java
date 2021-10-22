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
    name = "RTCSenderAudioTrackAttachmentStats"
)
public interface RTCSenderAudioTrackAttachmentStats extends RTCAudioSenderStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcSenderAudioTrackAttachmentStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcSenderAudioTrackAttachmentStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcSenderAudioTrackAttachmentStats );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSenderAudioTrackAttachmentStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCSenderAudioTrackAttachmentStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSenderAudioTrackAttachmentStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCSenderAudioTrackAttachmentStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSenderAudioTrackAttachmentStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull String kind) {
      Js.<RTCSenderAudioTrackAttachmentStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSenderAudioTrackAttachmentStats"
  )
  interface Builder extends RTCSenderAudioTrackAttachmentStats {
    @JsOverlay
    @Nonnull
    default Builder mediaSourceId(@Nonnull final String mediaSourceId) {
      setMediaSourceId( mediaSourceId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder echoReturnLoss(final double echoReturnLoss) {
      setEchoReturnLoss( echoReturnLoss );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder echoReturnLossEnhancement(final double echoReturnLossEnhancement) {
      setEchoReturnLossEnhancement( echoReturnLossEnhancement );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalSamplesSent(final int totalSamplesSent) {
      setTotalSamplesSent( totalSamplesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder audioLevel(final double audioLevel) {
      setAudioLevel( audioLevel );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalAudioEnergy(final double totalAudioEnergy) {
      setTotalAudioEnergy( totalAudioEnergy );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalSamplesDuration(final double totalSamplesDuration) {
      setTotalSamplesDuration( totalSamplesDuration );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder voiceActivityFlag(final boolean voiceActivityFlag) {
      setVoiceActivityFlag( voiceActivityFlag );
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
