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
    name = "RTCAudioSourceStats"
)
public interface RTCAudioSourceStats extends RTCMediaSourceStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcAudioSourceStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcAudioSourceStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcAudioSourceStats );
  }

  @JsProperty(
      name = "audioLevel"
  )
  double audioLevel();

  @JsProperty
  void setAudioLevel(double audioLevel);

  @JsProperty(
      name = "echoReturnLoss"
  )
  double echoReturnLoss();

  @JsProperty
  void setEchoReturnLoss(double echoReturnLoss);

  @JsProperty(
      name = "echoReturnLossEnhancement"
  )
  double echoReturnLossEnhancement();

  @JsProperty
  void setEchoReturnLossEnhancement(double echoReturnLossEnhancement);

  @JsProperty(
      name = "totalAudioEnergy"
  )
  double totalAudioEnergy();

  @JsProperty
  void setTotalAudioEnergy(double totalAudioEnergy);

  @JsProperty(
      name = "totalSamplesDuration"
  )
  double totalSamplesDuration();

  @JsProperty
  void setTotalSamplesDuration(double totalSamplesDuration);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCAudioSourceStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCAudioSourceStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCAudioSourceStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCAudioSourceStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCAudioSourceStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 trackIdentifier(@Nonnull String trackIdentifier) {
      Js.<RTCAudioSourceStats>uncheckedCast( this ).setTrackIdentifier( trackIdentifier );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCAudioSourceStats"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull String kind) {
      Js.<RTCAudioSourceStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCAudioSourceStats"
  )
  interface Builder extends RTCAudioSourceStats {
    @JsOverlay
    @Nonnull
    default Builder audioLevel(final double audioLevel) {
      setAudioLevel( audioLevel );
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
    default Builder relayedSource(final boolean relayedSource) {
      setRelayedSource( relayedSource );
      return this;
    }
  }
}
