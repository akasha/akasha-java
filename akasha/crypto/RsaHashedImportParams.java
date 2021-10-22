package akasha.crypto;

import akasha.core.JsObject;
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
 * The RsaHashedImportParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.importKey() or SubtleCrypto.unwrapKey(), when importing any RSA-based key pair: that is, when the algorithm is identified as any of RSASSA-PKCS1-v1_5, RSA-PSS, or RSA-OAEP.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RsaHashedImportParams">RsaHashedImportParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RsaHashedImportParams"
)
public interface RsaHashedImportParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final RsaHashedImportParams $rsaHashedImportParams = Js.<RsaHashedImportParams>uncheckedCast( JsPropertyMap.of() );
    $rsaHashedImportParams.setName( name );
    return Js.uncheckedCast( $rsaHashedImportParams );
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
      name = "RsaHashedImportParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default RsaHashedImportParams hash(@Nonnull AlgorithmIdentifier hash) {
      Js.<RsaHashedImportParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default RsaHashedImportParams hash(@Nonnull JsObject hash) {
      Js.<RsaHashedImportParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default RsaHashedImportParams hash(@Nonnull String hash) {
      Js.<RsaHashedImportParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }
  }
}
