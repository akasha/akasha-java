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
    name = "RTCRtpTransceiverStats"
)
public interface RTCRtpTransceiverStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcRtpTransceiverStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpTransceiverStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcRtpTransceiverStats );
  }

  @JsProperty(
      name = "senderId"
  )
  @JsNonNull
  String senderId();

  @JsProperty
  void setSenderId(@JsNonNull String senderId);

  @JsProperty(
      name = "receiverId"
  )
  @JsNonNull
  String receiverId();

  @JsProperty
  void setReceiverId(@JsNonNull String receiverId);

  @JsProperty(
      name = "mid"
  )
  String mid();

  @JsProperty
  void setMid(@JsNonNull String mid);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpTransceiverStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCRtpTransceiverStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpTransceiverStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCRtpTransceiverStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpTransceiverStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 senderId(@Nonnull String senderId) {
      Js.<RTCRtpTransceiverStats>uncheckedCast( this ).setSenderId( senderId );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpTransceiverStats"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Builder receiverId(@Nonnull String receiverId) {
      Js.<RTCRtpTransceiverStats>uncheckedCast( this ).setReceiverId( receiverId );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpTransceiverStats"
  )
  interface Builder extends RTCRtpTransceiverStats {
    @JsOverlay
    @Nonnull
    default Builder mid(@Nonnull final String mid) {
      setMid( mid );
      return this;
    }
  }
}
