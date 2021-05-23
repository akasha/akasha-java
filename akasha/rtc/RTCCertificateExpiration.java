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
    name = "RTCCertificateExpiration"
)
public interface RTCCertificateExpiration {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "expires"
  )
  int expires();

  @JsProperty
  void setExpires(int expires);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCCertificateExpiration"
  )
  interface Builder extends RTCCertificateExpiration {
    @JsOverlay
    @Nonnull
    default Builder expires(final int expires) {
      setExpires( expires );
      return this;
    }
  }
}
