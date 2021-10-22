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
    name = "RTCMediaHandlerStats"
)
public interface RTCMediaHandlerStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcMediaHandlerStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcMediaHandlerStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcMediaHandlerStats );
  }

  @JsProperty(
      name = "ended"
  )
  boolean ended();

  @JsProperty
  void setEnded(boolean ended);

  @JsProperty(
      name = "kind"
  )
  @JsNonNull
  String kind();

  @JsProperty
  void setKind(@JsNonNull String kind);

  @JsProperty(
      name = "trackIdentifier"
  )
  String trackIdentifier();

  @JsProperty
  void setTrackIdentifier(@JsNonNull String trackIdentifier);

  @JsProperty(
      name = "priority"
  )
  @RTCPriorityType
  String priority();

  @JsProperty
  void setPriority(@RTCPriorityType @JsNonNull String priority);

  @JsProperty(
      name = "remoteSource"
  )
  boolean remoteSource();

  @JsProperty
  void setRemoteSource(boolean remoteSource);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaHandlerStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCMediaHandlerStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaHandlerStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCMediaHandlerStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaHandlerStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull String kind) {
      Js.<RTCMediaHandlerStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCMediaHandlerStats"
  )
  interface Builder extends RTCMediaHandlerStats {
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
