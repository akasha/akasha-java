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
    name = "RTCCodecStats"
)
public interface RTCCodecStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcCodecStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcCodecStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcCodecStats );
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
  void setCodecType(@RTCCodecType @JsNonNull String codecType);

  @JsProperty(
      name = "mimeType"
  )
  @JsNonNull
  String mimeType();

  @JsProperty
  void setMimeType(@JsNonNull String mimeType);

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
  void setSdpFmtpLine(@JsNonNull String sdpFmtpLine);

  @JsProperty(
      name = "transportId"
  )
  @JsNonNull
  String transportId();

  @JsProperty
  void setTransportId(@JsNonNull String transportId);

  @JsProperty(
      name = "implementation"
  )
  String implementation();

  @JsProperty
  void setImplementation(@JsNonNull String implementation);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCodecStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCCodecStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCodecStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCCodecStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCodecStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 mimeType(@Nonnull String mimeType) {
      Js.<RTCCodecStats>uncheckedCast( this ).setMimeType( mimeType );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCodecStats"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Step5 payloadType(int payloadType) {
      Js.<RTCCodecStats>uncheckedCast( this ).setPayloadType( payloadType );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCodecStats"
  )
  interface Step5 {
    @JsOverlay
    @Nonnull
    default Builder transportId(@Nonnull String transportId) {
      Js.<RTCCodecStats>uncheckedCast( this ).setTransportId( transportId );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCodecStats"
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
    default Builder sdpFmtpLine(@Nonnull final String sdpFmtpLine) {
      setSdpFmtpLine( sdpFmtpLine );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder implementation(@Nonnull final String implementation) {
      setImplementation( implementation );
      return this;
    }
  }
}
