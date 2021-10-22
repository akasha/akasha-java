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
  static Step1 name(@Nonnull final String name) {
    final EcdhKeyDeriveParams $ecdhKeyDeriveParams = Js.<EcdhKeyDeriveParams>uncheckedCast( JsPropertyMap.of() );
    $ecdhKeyDeriveParams.setName( name );
    return Js.uncheckedCast( $ecdhKeyDeriveParams );
  }

  @JsProperty(
      name = "public"
  )
  @JsNonNull
  CryptoKey public_();

  @JsProperty
  void setPublic(@JsNonNull CryptoKey public_);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EcdhKeyDeriveParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default EcdhKeyDeriveParams public_(@Nonnull CryptoKey public_) {
      Js.<EcdhKeyDeriveParams>uncheckedCast( this ).setPublic( public_ );
      return Js.uncheckedCast( this );
    }
  }
}
