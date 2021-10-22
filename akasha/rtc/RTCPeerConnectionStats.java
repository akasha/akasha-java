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
    name = "RTCPeerConnectionStats"
)
public interface RTCPeerConnectionStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcPeerConnectionStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcPeerConnectionStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcPeerConnectionStats );
  }

  @JsProperty(
      name = "dataChannelsAccepted"
  )
  int dataChannelsAccepted();

  @JsProperty
  void setDataChannelsAccepted(int dataChannelsAccepted);

  @JsProperty(
      name = "dataChannelsClosed"
  )
  int dataChannelsClosed();

  @JsProperty
  void setDataChannelsClosed(int dataChannelsClosed);

  @JsProperty(
      name = "dataChannelsOpened"
  )
  int dataChannelsOpened();

  @JsProperty
  void setDataChannelsOpened(int dataChannelsOpened);

  @JsProperty(
      name = "dataChannelsRequested"
  )
  int dataChannelsRequested();

  @JsProperty
  void setDataChannelsRequested(int dataChannelsRequested);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCPeerConnectionStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCPeerConnectionStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCPeerConnectionStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull String id) {
      Js.<RTCPeerConnectionStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCPeerConnectionStats"
  )
  interface Builder extends RTCPeerConnectionStats {
    @JsOverlay
    @Nonnull
    default Builder dataChannelsAccepted(final int dataChannelsAccepted) {
      setDataChannelsAccepted( dataChannelsAccepted );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder dataChannelsClosed(final int dataChannelsClosed) {
      setDataChannelsClosed( dataChannelsClosed );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder dataChannelsOpened(final int dataChannelsOpened) {
      setDataChannelsOpened( dataChannelsOpened );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder dataChannelsRequested(final int dataChannelsRequested) {
      setDataChannelsRequested( dataChannelsRequested );
      return this;
    }
  }
}
