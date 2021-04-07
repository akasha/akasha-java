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
    name = "Object"
)
public interface RTCIceServerStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String url) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).url( url );
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
  void setRelayProtocol(@Nonnull String relayProtocol);

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
  @Nonnull
  String url();

  @JsProperty
  void setUrl(@Nonnull String url);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
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

    @JsOverlay
    @Nonnull
    default Builder url(@Nonnull final String url) {
      setUrl( url );
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
