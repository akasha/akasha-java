package akasha.rtc;

import akasha.lang.JsArray;
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
    name = "RTCMediaStreamStats"
)
public interface RTCMediaStreamStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcMediaStreamStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcMediaStreamStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcMediaStreamStats );
  }

  @JsProperty(
      name = "streamIdentifier"
  )
  String streamIdentifier();

  @JsProperty
  void setStreamIdentifier(@JsNonNull String streamIdentifier);

  @JsProperty(
      name = "trackIds"
  )
  JsArray<String> trackIds();

  @JsProperty
  void setTrackIds(@JsNonNull JsArray<String> trackIds);

  @JsOverlay
  default void setTrackIds(@Nonnull final String... trackIds) {
    setTrackIds( Js.<JsArray<String>>uncheckedCast( trackIds ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaStreamStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCMediaStreamStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaStreamStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull String id) {
      Js.<RTCMediaStreamStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaStreamStats"
  )
  interface Builder extends RTCMediaStreamStats {
    @JsOverlay
    @Nonnull
    default Builder streamIdentifier(@Nonnull final String streamIdentifier) {
      setStreamIdentifier( streamIdentifier );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder trackIds(@Nonnull final JsArray<String> trackIds) {
      setTrackIds( trackIds );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder trackIds(@Nonnull final String... trackIds) {
      setTrackIds( trackIds );
      return this;
    }
  }
}
