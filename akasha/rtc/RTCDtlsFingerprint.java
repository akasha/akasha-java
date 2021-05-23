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
    name = "RTCDtlsFingerprint"
)
public interface RTCDtlsFingerprint {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "algorithm"
  )
  String algorithm();

  @JsProperty
  void setAlgorithm(@Nonnull String algorithm);

  @JsProperty(
      name = "value"
  )
  String value();

  @JsProperty
  void setValue(@Nonnull String value);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCDtlsFingerprint"
  )
  interface Builder extends RTCDtlsFingerprint {
    @JsOverlay
    @Nonnull
    default Builder algorithm(@Nonnull final String algorithm) {
      setAlgorithm( algorithm );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder value(@Nonnull final String value) {
      setValue( value );
      return this;
    }
  }
}
