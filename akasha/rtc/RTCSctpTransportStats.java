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
  static Builder create(final double timestamp, @RTCStatsType @Nonnull final String type,
      @Nonnull final String id) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).timestamp( timestamp ).type( type ).id( id );
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

  @Generated("org.realityforge.webtack")
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
  }
}
