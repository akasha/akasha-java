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
public interface RTCCodecStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String mimeType,
      final int payloadType, @Nonnull final String transportId) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).mimeType( mimeType ).payloadType( payloadType ).transportId( transportId );
  }

  @JsProperty(
      name = "channels"
  )
  int channels();

  @JsProperty
  void setChannels(int channels);

  @JsProperty(
      name = "clockRate"
  )
  int clockRate();

  @JsProperty
  void setClockRate(int clockRate);

  @JsProperty(
      name = "codecType"
  )
  @RTCCodecType
  String codecType();

  @JsProperty
  void setCodecType(@RTCCodecType @Nonnull String codecType);

  @JsProperty(
      name = "mimeType"
  )
  @Nonnull
  String mimeType();

  @JsProperty
  void setMimeType(@Nonnull String mimeType);

  @JsProperty(
      name = "payloadType"
  )
  int payloadType();

  @JsProperty
  void setPayloadType(int payloadType);

  @JsProperty(
      name = "sdpFmtpLine"
  )
  String sdpFmtpLine();

  @JsProperty
  void setSdpFmtpLine(@Nonnull String sdpFmtpLine);

  @JsProperty(
      name = "transportId"
  )
  @Nonnull
  String transportId();

  @JsProperty
  void setTransportId(@Nonnull String transportId);

  @JsProperty(
      name = "implementation"
  )
  String implementation();

  @JsProperty
  void setImplementation(@Nonnull String implementation);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends RTCCodecStats {
    @JsOverlay
    @Nonnull
    default Builder channels(final int channels) {
      setChannels( channels );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder clockRate(final int clockRate) {
      setClockRate( clockRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder codecType(@RTCCodecType @Nonnull final String codecType) {
      setCodecType( codecType );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mimeType(@Nonnull final String mimeType) {
      setMimeType( mimeType );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder payloadType(final int payloadType) {
      setPayloadType( payloadType );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sdpFmtpLine(@Nonnull final String sdpFmtpLine) {
      setSdpFmtpLine( sdpFmtpLine );
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
    default Builder implementation(@Nonnull final String implementation) {
      setImplementation( implementation );
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
