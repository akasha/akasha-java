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
    name = "RTCLocalSessionDescriptionInit"
)
public interface RTCLocalSessionDescriptionInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "sdp"
  )
  String sdp();

  @JsProperty
  void setSdp(@JsNonNull String sdp);

  @JsProperty(
      name = "type"
  )
  @RTCSdpType
  String type();

  @JsProperty
  void setType(@RTCSdpType @JsNonNull String type);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCLocalSessionDescriptionInit"
  )
  interface Builder extends RTCLocalSessionDescriptionInit {
    @JsOverlay
    @Nonnull
    default Builder sdp(@Nonnull final String sdp) {
      setSdp( sdp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@RTCSdpType @Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
