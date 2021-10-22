package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpDecodingParameters"
)
public interface RTCRtpDecodingParameters extends RTCRtpCodingParameters {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpDecodingParameters"
  )
  interface Builder extends RTCRtpDecodingParameters {
    @JsOverlay
    @Nonnull
    default Builder rid(@Nonnull final String rid) {
      setRid( rid );
      return this;
    }
  }
}
