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
    name = "RTCAudioReceiverStats"
)
public interface RTCAudioReceiverStats extends RTCAudioHandlerStats {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String kind) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsProperty(
      name = "concealedSamples"
  )
  int concealedSamples();

  @JsProperty
  void setConcealedSamples(int concealedSamples);

  @JsProperty(
      name = "concealmentEvents"
  )
  int concealmentEvents();

  @JsProperty
  void setConcealmentEvents(int concealmentEvents);

  @JsProperty(
      name = "estimatedPlayoutTimestamp"
  )
  double estimatedPlayoutTimestamp();

  @JsProperty
  void setEstimatedPlayoutTimestamp(double estimatedPlayoutTimestamp);

  @JsProperty(
      name = "insertedSamplesForDeceleration"
  )
  int insertedSamplesForDeceleration();

  @JsProperty
  void setInsertedSamplesForDeceleration(int insertedSamplesForDeceleration);

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
      name = "removedSamplesForAcceleration"
  )
  int removedSamplesForAcceleration();

  @JsProperty
  void setRemovedSamplesForAcceleration(int removedSamplesForAcceleration);

  @JsProperty(
      name = "silentConcealedSamples"
  )
  int silentConcealedSamples();

  @JsProperty
  void setSilentConcealedSamples(int silentConcealedSamples);

  @JsProperty(
      name = "totalSamplesReceived"
  )
  int totalSamplesReceived();

  @JsProperty
  void setTotalSamplesReceived(int totalSamplesReceived);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCAudioReceiverStats"
  )
  interface Builder extends RTCAudioReceiverStats {
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
  }
}
