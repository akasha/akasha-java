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
    name = "RTCMediaSourceStats"
)
public interface RTCMediaSourceStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcMediaSourceStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcMediaSourceStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcMediaSourceStats );
  }

  @JsProperty(
      name = "kind"
  )
  @JsNonNull
  String kind();

  @JsProperty
  void setKind(@JsNonNull String kind);

  @JsProperty(
      name = "relayedSource"
  )
  boolean relayedSource();

  @JsProperty
  void setRelayedSource(boolean relayedSource);

  @JsProperty(
      name = "trackIdentifier"
  )
  @JsNonNull
  String trackIdentifier();

  @JsProperty
  void setTrackIdentifier(@JsNonNull String trackIdentifier);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaSourceStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCMediaSourceStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaSourceStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCMediaSourceStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaSourceStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 kind(@Nonnull String kind) {
      Js.<RTCMediaSourceStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaSourceStats"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Builder trackIdentifier(@Nonnull String trackIdentifier) {
      Js.<RTCMediaSourceStats>uncheckedCast( this ).setTrackIdentifier( trackIdentifier );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaSourceStats"
  )
  interface Builder extends RTCMediaSourceStats {
    @JsOverlay
    @Nonnull
    default Builder relayedSource(final boolean relayedSource) {
      setRelayedSource( relayedSource );
      return this;
    }
  }
}
