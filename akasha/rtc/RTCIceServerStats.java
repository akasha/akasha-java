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
    name = "RTCIceServerStats"
)
public interface RTCIceServerStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcIceServerStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcIceServerStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcIceServerStats );
  }

  @JsProperty(
      name = "port"
  )
  int port();

  @JsProperty
  void setPort(int port);

  @JsProperty(
      name = "relayProtocol"
  )
  String relayProtocol();

  @JsProperty
  void setRelayProtocol(@JsNonNull String relayProtocol);

  @JsProperty(
      name = "totalRequestsSent"
  )
  int totalRequestsSent();

  @JsProperty
  void setTotalRequestsSent(int totalRequestsSent);

  @JsProperty(
      name = "totalResponsesReceived"
  )
  int totalResponsesReceived();

  @JsProperty
  void setTotalResponsesReceived(int totalResponsesReceived);

  @JsProperty(
      name = "totalRoundTripTime"
  )
  double totalRoundTripTime();

  @JsProperty
  void setTotalRoundTripTime(double totalRoundTripTime);

  @JsProperty(
      name = "url"
  )
  @JsNonNull
  String url();

  @JsProperty
  void setUrl(@JsNonNull String url);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceServerStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCIceServerStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceServerStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCIceServerStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceServerStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Builder url(@Nonnull String url) {
      Js.<RTCIceServerStats>uncheckedCast( this ).setUrl( url );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIceServerStats"
  )
  interface Builder extends RTCIceServerStats {
    @JsOverlay
    @Nonnull
    default Builder port(final int port) {
      setPort( port );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder relayProtocol(@Nonnull final String relayProtocol) {
      setRelayProtocol( relayProtocol );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalRequestsSent(final int totalRequestsSent) {
      setTotalRequestsSent( totalRequestsSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalResponsesReceived(final int totalResponsesReceived) {
      setTotalResponsesReceived( totalResponsesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalRoundTripTime(final double totalRoundTripTime) {
      setTotalRoundTripTime( totalRoundTripTime );
      return this;
    }
  }
}
