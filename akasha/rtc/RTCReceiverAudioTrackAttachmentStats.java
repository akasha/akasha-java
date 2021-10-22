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
    name = "RTCReceiverAudioTrackAttachmentStats"
)
public interface RTCReceiverAudioTrackAttachmentStats extends RTCAudioReceiverStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcReceiverAudioTrackAttachmentStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcReceiverAudioTrackAttachmentStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcReceiverAudioTrackAttachmentStats );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCReceiverAudioTrackAttachmentStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCReceiverAudioTrackAttachmentStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCReceiverAudioTrackAttachmentStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCReceiverAudioTrackAttachmentStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCReceiverAudioTrackAttachmentStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull String kind) {
      Js.<RTCReceiverAudioTrackAttachmentStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCReceiverAudioTrackAttachmentStats"
  )
  interface Builder extends RTCReceiverAudioTrackAttachmentStats {
    @JsOverlay
    @Nonnull
    default Builder concealedSamples(final int concealedSamples) {
      setConcealedSamples( concealedSamples );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder concealmentEvents(final int concealmentEvents) {
      setConcealmentEvents( concealmentEvents );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder estimatedPlayoutTimestamp(final double estimatedPlayoutTimestamp) {
      setEstimatedPlayoutTimestamp( estimatedPlayoutTimestamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder insertedSamplesForDeceleration(final int insertedSamplesForDeceleration) {
      setInsertedSamplesForDeceleration( insertedSamplesForDeceleration );
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
    default Builder removedSamplesForAcceleration(final int removedSamplesForAcceleration) {
      setRemovedSamplesForAcceleration( removedSamplesForAcceleration );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder silentConcealedSamples(final int silentConcealedSamples) {
      setSilentConcealedSamples( silentConcealedSamples );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalSamplesReceived(final int totalSamplesReceived) {
      setTotalSamplesReceived( totalSamplesReceived );
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
