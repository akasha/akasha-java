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
    name = "RTCRtpCodingParameters"
)
public interface RTCRtpCodingParameters {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "rid"
  )
  String rid();

  @JsProperty
  void setRid(@JsNonNull String rid);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpCodingParameters"
  )
  interface Builder extends RTCRtpCodingParameters {
    @JsOverlay
    @Nonnull
    default Builder rid(@Nonnull final String rid) {
      setRid( rid );
      return this;
    }
  }
}
