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
    name = "RTCSctpTransportStats"
)
public interface RTCSctpTransportStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcSctpTransportStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcSctpTransportStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcSctpTransportStats );
  }

  @JsProperty(
      name = "congestionWindow"
  )
  int congestionWindow();

  @JsProperty
  void setCongestionWindow(int congestionWindow);

  @JsProperty(
      name = "mtu"
  )
  int mtu();

  @JsProperty
  void setMtu(int mtu);

  @JsProperty(
      name = "receiverWindow"
  )
  int receiverWindow();

  @JsProperty
  void setReceiverWindow(int receiverWindow);

  @JsProperty(
      name = "smoothedRoundTripTime"
  )
  double smoothedRoundTripTime();

  @JsProperty
  void setSmoothedRoundTripTime(double smoothedRoundTripTime);

  @JsProperty(
      name = "transportId"
  )
  String transportId();

  @JsProperty
  void setTransportId(@JsNonNull String transportId);

  @JsProperty(
      name = "unackData"
  )
  int unackData();

  @JsProperty
  void setUnackData(int unackData);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSctpTransportStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCSctpTransportStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSctpTransportStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull String id) {
      Js.<RTCSctpTransportStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSctpTransportStats"
  )
  interface Builder extends RTCSctpTransportStats {
    @JsOverlay
    @Nonnull
    default Builder congestionWindow(final int congestionWindow) {
      setCongestionWindow( congestionWindow );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mtu(final int mtu) {
      setMtu( mtu );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder receiverWindow(final int receiverWindow) {
      setReceiverWindow( receiverWindow );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder smoothedRoundTripTime(final double smoothedRoundTripTime) {
      setSmoothedRoundTripTime( smoothedRoundTripTime );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder transportId(@Nonnull final String transportId) {
      setTransportId( transportId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder unackData(final int unackData) {
      setUnackData( unackData );
      return this;
    }
  }
}
