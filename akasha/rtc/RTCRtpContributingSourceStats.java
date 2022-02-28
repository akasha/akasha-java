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
    name = "RTCRtpContributingSourceStats"
)
public interface RTCRtpContributingSourceStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcRtpContributingSourceStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpContributingSourceStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcRtpContributingSourceStats );
  }

  @JsProperty(
      name = "contributorSsrc"
  )
  int contributorSsrc();

  @JsProperty
  void setContributorSsrc(int contributorSsrc);

  @JsProperty(
      name = "inboundRtpStreamId"
  )
  @JsNonNull
  String inboundRtpStreamId();

  @JsProperty
  void setInboundRtpStreamId(@JsNonNull String inboundRtpStreamId);

  @JsProperty(
      name = "audioLevel"
  )
  double audioLevel();

  @JsProperty
  void setAudioLevel(double audioLevel);

  @JsProperty(
      name = "packetsContributedTo"
  )
  int packetsContributedTo();

  @JsProperty
  void setPacketsContributedTo(int packetsContributedTo);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpContributingSourceStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCRtpContributingSourceStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpContributingSourceStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCRtpContributingSourceStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpContributingSourceStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 contributorSsrc(int contributorSsrc) {
      Js.<RTCRtpContributingSourceStats>uncheckedCast( this ).setContributorSsrc( contributorSsrc );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpContributingSourceStats"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Builder inboundRtpStreamId(@Nonnull String inboundRtpStreamId) {
      Js.<RTCRtpContributingSourceStats>uncheckedCast( this ).setInboundRtpStreamId( inboundRtpStreamId );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpContributingSourceStats"
  )
  interface Builder extends RTCRtpContributingSourceStats {
    @JsOverlay
    @Nonnull
    default Builder audioLevel(final double audioLevel) {
      setAudioLevel( audioLevel );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder packetsContributedTo(final int packetsContributedTo) {
      setPacketsContributedTo( packetsContributedTo );
      return this;
    }
  }
}
