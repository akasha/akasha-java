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
 * The RsaPssParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.sign() or SubtleCrypto.verify(), when using the RSA-PSS algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RsaPssParams">RsaPssParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RsaPssParams"
)
public interface RsaPssParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final RsaPssParams $rsaPssParams = Js.<RsaPssParams>uncheckedCast( JsPropertyMap.of() );
    $rsaPssParams.setName( name );
    return Js.uncheckedCast( $rsaPssParams );
  }

  @JsProperty(
      name = "saltLength"
  )
  int saltLength();

  @JsProperty
  void setSaltLength(int saltLength);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaPssParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default RsaPssParams saltLength(int saltLength) {
      Js.<RsaPssParams>uncheckedCast( this ).setSaltLength( saltLength );
      return Js.uncheckedCast( this );
    }
  }
}
