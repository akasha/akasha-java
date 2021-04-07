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
public interface RTCSessionDescriptionInit {
  @JsOverlay
  @Nonnull
  static Builder create(@RTCSdpType @Nonnull final String type) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).type( type );
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
  @Nonnull
  String type();

  @JsProperty
  void setType(@RTCSdpType @Nonnull String type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends RTCSessionDescriptionInit {
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
