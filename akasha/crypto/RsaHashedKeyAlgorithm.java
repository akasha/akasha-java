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
    name = "RsaHashedKeyAlgorithm"
)
public interface RsaHashedKeyAlgorithm extends RsaKeyAlgorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final RsaHashedKeyAlgorithm $rsaHashedKeyAlgorithm = Js.<RsaHashedKeyAlgorithm>uncheckedCast( JsPropertyMap.of() );
    $rsaHashedKeyAlgorithm.setName( name );
    return Js.uncheckedCast( $rsaHashedKeyAlgorithm );
  }

  @JsProperty(
      name = "hash"
  )
  @JsNonNull
  KeyAlgorithm hash();

  @JsProperty
  void setHash(@JsNonNull KeyAlgorithm hash);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaHashedKeyAlgorithm"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 modulusLength(int modulusLength) {
      Js.<RsaHashedKeyAlgorithm>uncheckedCast( this ).setModulusLength( modulusLength );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaHashedKeyAlgorithm"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 publicExponent(@Nonnull Uint8Array publicExponent) {
      Js.<RsaHashedKeyAlgorithm>uncheckedCast( this ).setPublicExponent( publicExponent );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaHashedKeyAlgorithm"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default RsaHashedKeyAlgorithm hash(@Nonnull KeyAlgorithm hash) {
      Js.<RsaHashedKeyAlgorithm>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }
  }
}
