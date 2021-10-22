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
 * The EcdsaParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.sign() or SubtleCrypto.verify() when using the ECDSA algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EcdsaParams">EcdsaParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EcdsaParams"
)
public interface EcdsaParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final EcdsaParams $ecdsaParams = Js.<EcdsaParams>uncheckedCast( JsPropertyMap.of() );
    $ecdsaParams.setName( name );
    return Js.uncheckedCast( $ecdsaParams );
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
      name = "EcdsaParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default EcdsaParams hash(@Nonnull AlgorithmIdentifier hash) {
      Js.<EcdsaParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default EcdsaParams hash(@Nonnull JsObject hash) {
      Js.<EcdsaParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default EcdsaParams hash(@Nonnull String hash) {
      Js.<EcdsaParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }
  }
}
