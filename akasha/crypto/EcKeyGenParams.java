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
 * The EcKeyGenParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.generateKey(), when generating any elliptic-curve-based key pair: that is, when the algorithm is identified as either of ECDSA or ECDH.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EcKeyGenParams">EcKeyGenParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EcKeyGenParams"
)
public interface EcKeyGenParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final EcKeyGenParams $ecKeyGenParams = Js.<EcKeyGenParams>uncheckedCast( JsPropertyMap.of() );
    $ecKeyGenParams.setName( name );
    return Js.uncheckedCast( $ecKeyGenParams );
  }

  @JsProperty(
      name = "namedCurve"
  )
  @JsNonNull
  String namedCurve();

  @JsProperty
  void setNamedCurve(@JsNonNull String namedCurve);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EcKeyGenParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default EcKeyGenParams namedCurve(@Nonnull String namedCurve) {
      Js.<EcKeyGenParams>uncheckedCast( this ).setNamedCurve( namedCurve );
      return Js.uncheckedCast( this );
    }
  }
}
