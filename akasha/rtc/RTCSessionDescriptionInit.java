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
    name = "RTCSessionDescriptionInit"
)
public interface RTCSessionDescriptionInit {
  @JsOverlay
  @Nonnull
  static Builder type(@RTCSdpType @Nonnull final String type) {
    final Builder $rtcSessionDescriptionInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcSessionDescriptionInit.setType( type );
    return Js.uncheckedCast( $rtcSessionDescriptionInit );
  }

  @JsProperty(
      name = "type"
  )
  @RTCSdpType
  @JsNonNull
  String type();

  @JsProperty
  void setType(@RTCSdpType @JsNonNull String type);

  @JsProperty(
      name = "sdp"
  )
  String sdp();

  @JsProperty
  void setSdp(@JsNonNull String sdp);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCSessionDescriptionInit"
  )
  interface Builder extends RTCSessionDescriptionInit {
    @JsOverlay
    @Nonnull
    default Builder sdp(@Nonnull final String sdp) {
      setSdp( sdp );
      return this;
    }
  }
}
