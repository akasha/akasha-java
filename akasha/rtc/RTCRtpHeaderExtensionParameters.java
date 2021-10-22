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
    name = "RTCRtpHeaderExtensionParameters"
)
public interface RTCRtpHeaderExtensionParameters {
  @JsOverlay
  @Nonnull
  static Step1 uri(@Nonnull final String uri) {
    final Builder $rtcRtpHeaderExtensionParameters = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcRtpHeaderExtensionParameters.setUri( uri );
    return Js.uncheckedCast( $rtcRtpHeaderExtensionParameters );
  }

  @JsProperty(
      name = "uri"
  )
  @JsNonNull
  String uri();

  @JsProperty
  void setUri(@JsNonNull String uri);

  @JsProperty(
      name = "id"
  )
  int id();

  @JsProperty
  void setId(int id);

  @JsProperty(
      name = "encrypted"
  )
  boolean encrypted();

  @JsProperty
  void setEncrypted(boolean encrypted);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpHeaderExtensionParameters"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder id(int id) {
      Js.<RTCRtpHeaderExtensionParameters>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpHeaderExtensionParameters"
  )
  interface Builder extends RTCRtpHeaderExtensionParameters {
    @JsOverlay
    @Nonnull
    default Builder encrypted(final boolean encrypted) {
      setEncrypted( encrypted );
      return this;
    }
  }
}
