package akasha.crypto;

import akasha.core.Uint8Array;
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
    name = "RsaKeyGenParams"
)
public interface RsaKeyGenParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final RsaKeyGenParams $rsaKeyGenParams = Js.<RsaKeyGenParams>uncheckedCast( JsPropertyMap.of() );
    $rsaKeyGenParams.setName( name );
    return Js.uncheckedCast( $rsaKeyGenParams );
  }

  @JsProperty(
      name = "modulusLength"
  )
  int modulusLength();

  @JsProperty
  void setModulusLength(int modulusLength);

  @JsProperty(
      name = "publicExponent"
  )
  @JsNonNull
  Uint8Array publicExponent();

  @JsProperty
  void setPublicExponent(@JsNonNull Uint8Array publicExponent);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaKeyGenParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 modulusLength(int modulusLength) {
      Js.<RsaKeyGenParams>uncheckedCast( this ).setModulusLength( modulusLength );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaKeyGenParams"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default RsaKeyGenParams publicExponent(@Nonnull Uint8Array publicExponent) {
      Js.<RsaKeyGenParams>uncheckedCast( this ).setPublicExponent( publicExponent );
      return Js.uncheckedCast( this );
    }
  }
}
