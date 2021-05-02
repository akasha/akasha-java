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
public interface RTCLocalSessionDescriptionInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "sdp"
  )
  String sdp();

  @JsProperty
  void setSdp(@Nonnull String sdp);

  @JsProperty(
      name = "type"
  )
  @RTCSdpType
  String type();

  @JsProperty
  void setType(@RTCSdpType @Nonnull String type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
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