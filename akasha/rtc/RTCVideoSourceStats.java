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
    name = "RTCVideoSourceStats"
)
public interface RTCVideoSourceStats extends RTCMediaSourceStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcVideoSourceStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcVideoSourceStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcVideoSourceStats );
  }

  @JsProperty(
      name = "bitDepth"
  )
  int bitDepth();

  @JsProperty
  void setBitDepth(int bitDepth);

  @JsProperty(
      name = "frames"
  )
  int frames();

  @JsProperty
  void setFrames(int frames);

  @JsProperty(
      name = "framesPerSecond"
  )
  double framesPerSecond();

  @JsProperty
  void setFramesPerSecond(double framesPerSecond);

  @JsProperty(
      name = "height"
  )
  int height();

  @JsProperty
  void setHeight(int height);

  @JsProperty(
      name = "width"
  )
  int width();

  @JsProperty
  void setWidth(int width);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoSourceStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCVideoSourceStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoSourceStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCVideoSourceStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoSourceStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 trackIdentifier(@Nonnull String trackIdentifier) {
      Js.<RTCVideoSourceStats>uncheckedCast( this ).setTrackIdentifier( trackIdentifier );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoSourceStats"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull String kind) {
      Js.<RTCVideoSourceStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCVideoSourceStats"
  )
  interface Builder extends RTCVideoSourceStats {
    @JsOverlay
    @Nonnull
    default Builder bitDepth(final int bitDepth) {
      setBitDepth( bitDepth );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frames(final int frames) {
      setFrames( frames );
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
    default Builder height(final int height) {
      setHeight( height );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder width(final int width) {
      setWidth( width );
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
