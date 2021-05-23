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
    name = "RTCDataChannelStats"
)
public interface RTCDataChannelStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @RTCDataChannelState @Nonnull final String state) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).state( state );
  }

  @JsProperty(
      name = "bytesReceived"
  )
  int bytesReceived();

  @JsProperty
  void setBytesReceived(int bytesReceived);

  @JsProperty(
      name = "bytesSent"
  )
  int bytesSent();

  @JsProperty
  void setBytesSent(int bytesSent);

  @JsProperty(
      name = "dataChannelIdentifier"
  )
  int dataChannelIdentifier();

  @JsProperty
  void setDataChannelIdentifier(int dataChannelIdentifier);

  @JsProperty(
      name = "label"
  )
  String label();

  @JsProperty
  void setLabel(@Nonnull String label);

  @JsProperty(
      name = "messagesReceived"
  )
  int messagesReceived();

  @JsProperty
  void setMessagesReceived(int messagesReceived);

  @JsProperty(
      name = "messagesSent"
  )
  int messagesSent();

  @JsProperty
  void setMessagesSent(int messagesSent);

  @JsProperty(
      name = "protocol"
  )
  String protocol();

  @JsProperty
  void setProtocol(@Nonnull String protocol);

  @JsProperty(
      name = "state"
  )
  @RTCDataChannelState
  @Nonnull
  String state();

  @JsProperty
  void setState(@RTCDataChannelState @Nonnull String state);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCDataChannelStats"
  )
  interface Builder extends RTCDataChannelStats {
    @JsOverlay
    @Nonnull
    default Builder bytesReceived(final int bytesReceived) {
      setBytesReceived( bytesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bytesSent(final int bytesSent) {
      setBytesSent( bytesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder dataChannelIdentifier(final int dataChannelIdentifier) {
      setDataChannelIdentifier( dataChannelIdentifier );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder messagesReceived(final int messagesReceived) {
      setMessagesReceived( messagesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder messagesSent(final int messagesSent) {
      setMessagesSent( messagesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder protocol(@Nonnull final String protocol) {
      setProtocol( protocol );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder state(@RTCDataChannelState @Nonnull final String state) {
      setState( state );
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
