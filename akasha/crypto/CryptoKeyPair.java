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
 * The CryptoKeyPair dictionary of the Web Crypto API represents a key pair for an asymmetric cryptography algorithm, also known as a public-key algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CryptoKeyPair">CryptoKeyPair - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CryptoKeyPair"
)
public interface CryptoKeyPair {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "privateKey"
  )
  CryptoKey privateKey();

  @JsProperty
  void setPrivateKey(@JsNonNull CryptoKey privateKey);

  @JsProperty(
      name = "publicKey"
  )
  CryptoKey publicKey();

  @JsProperty
  void setPublicKey(@JsNonNull CryptoKey publicKey);

  /**
   * The CryptoKeyPair dictionary of the Web Crypto API represents a key pair for an asymmetric cryptography algorithm, also known as a public-key algorithm.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CryptoKeyPair">CryptoKeyPair - MDN</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "CryptoKeyPair"
  )
  interface Builder extends CryptoKeyPair {
    @JsOverlay
    @Nonnull
    default Builder privateKey(@Nonnull final CryptoKey privateKey) {
      setPrivateKey( privateKey );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder publicKey(@Nonnull final CryptoKey publicKey) {
      setPublicKey( publicKey );
      return this;
    }
  }
}
