package akasha.crypto;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The HmacKeyGenParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.generateKey(), when generating a key for the HMAC algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HmacKeyGenParams">HmacKeyGenParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-HmacKeyGenParams">SubtleCrypto.HmacKeyGenParams - Web Cryptography API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface HmacKeyGenParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final Object hash) {
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
  default void setHash(@Nonnull final Object hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  default void setHash(@Nonnull final String hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsProperty(
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  /**
   * The HmacKeyGenParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.generateKey(), when generating a key for the HMAC algorithm.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HmacKeyGenParams">HmacKeyGenParams - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-HmacKeyGenParams">SubtleCrypto.HmacKeyGenParams - Web Cryptography API</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends HmacKeyGenParams {
    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull final AlgorithmIdentifier hash) {
      setHash( hash );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull final Object hash) {
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
    default Builder length(final int length) {
      setLength( length );
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
