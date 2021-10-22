package akasha.crypto;

import akasha.core.JsObject;
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

/**
 * The RsaHashedKeyGenParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.generateKey(), when generating any RSA-based key pair: that is, when the algorithm is identified as any of RSASSA-PKCS1-v1_5, RSA-PSS, or RSA-OAEP.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RsaHashedKeyGenParams">RsaHashedKeyGenParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RsaHashedKeyGenParams"
)
public interface RsaHashedKeyGenParams extends RsaKeyGenParams {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final RsaHashedKeyGenParams $rsaHashedKeyGenParams = Js.<RsaHashedKeyGenParams>uncheckedCast( JsPropertyMap.of() );
    $rsaHashedKeyGenParams.setName( name );
    return Js.uncheckedCast( $rsaHashedKeyGenParams );
  }

  @JsProperty(
      name = "hash"
  )
  @JsNonNull
  AlgorithmIdentifier hash();

  @JsProperty
  void setHash(@JsNonNull AlgorithmIdentifier hash);

  @JsOverlay
  default void setHash(@Nonnull final JsObject hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  default void setHash(@Nonnull final String hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaHashedKeyGenParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 modulusLength(int modulusLength) {
      Js.<RsaHashedKeyGenParams>uncheckedCast( this ).setModulusLength( modulusLength );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaHashedKeyGenParams"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 publicExponent(@Nonnull Uint8Array publicExponent) {
      Js.<RsaHashedKeyGenParams>uncheckedCast( this ).setPublicExponent( publicExponent );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaHashedKeyGenParams"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default RsaHashedKeyGenParams hash(@Nonnull AlgorithmIdentifier hash) {
      Js.<RsaHashedKeyGenParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default RsaHashedKeyGenParams hash(@Nonnull JsObject hash) {
      Js.<RsaHashedKeyGenParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default RsaHashedKeyGenParams hash(@Nonnull String hash) {
      Js.<RsaHashedKeyGenParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }
  }
}
