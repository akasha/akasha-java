package akasha.crypto;

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
 * The EcdhKeyDeriveParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.deriveKey(), when using the ECDH algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EcdhKeyDeriveParams">EcdhKeyDeriveParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-EcdhKeyDeriveParams">SubtleCrypto.EcdhKeyDeriveParams - Web Cryptography API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EcdhKeyDeriveParams"
)
public interface EcdhKeyDeriveParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final CryptoKey public_) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).public_( public_ );
  }

  @JsProperty(
      name = "public"
  )
  @JsNonNull
  CryptoKey public_();

  @JsProperty
  void setPublic(@JsNonNull CryptoKey public_);

  /**
   * The EcdhKeyDeriveParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.deriveKey(), when using the ECDH algorithm.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EcdhKeyDeriveParams">EcdhKeyDeriveParams - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-EcdhKeyDeriveParams">SubtleCrypto.EcdhKeyDeriveParams - Web Cryptography API</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EcdhKeyDeriveParams"
  )
  interface Builder extends EcdhKeyDeriveParams {
    @JsOverlay
    @Nonnull
    default Builder public_(@Nonnull final CryptoKey public_) {
      setPublic( public_ );
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
