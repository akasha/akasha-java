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
public interface RTCPeerConnectionStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type );
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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
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
