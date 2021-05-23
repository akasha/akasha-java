package akasha.crypto;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-EcdsaParams">SubtleCrypto.EcdsaParams - Web Cryptography API</a>
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
  static Builder create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final JsObject hash) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final String hash) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash );
  }

  @JsProperty(
      name = "hash"
  )
  @Nonnull
  AlgorithmIdentifier hash();

  @JsProperty
  void setHash(@Nonnull AlgorithmIdentifier hash);

  @JsOverlay
  default void setHash(@Nonnull final JsObject hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  default void setHash(@Nonnull final String hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  /**
   * The EcdsaParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.sign() or SubtleCrypto.verify() when using the ECDSA algorithm.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EcdsaParams">EcdsaParams - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-EcdsaParams">SubtleCrypto.EcdsaParams - Web Cryptography API</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EcdsaParams"
  )
  interface Builder extends EcdsaParams {
    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull final AlgorithmIdentifier hash) {
      setHash( hash );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull final JsObject hash) {
      setHash( hash );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull final String hash) {
      setHash( hash );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder name(@Nonnull final String name) {
      setName( name );
      return this;
    }
  }
}
