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
 * A DOMString. This should be set to ECDSA or ECDH, depending on the algorithm you want to use.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EcKeyImportParams">EcKeyImportParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EcKeyImportParams"
)
public interface EcKeyImportParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final EcKeyImportParams $ecKeyImportParams = Js.<EcKeyImportParams>uncheckedCast( JsPropertyMap.of() );
    $ecKeyImportParams.setName( name );
    return Js.uncheckedCast( $ecKeyImportParams );
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
      name = "EcKeyImportParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default EcKeyImportParams namedCurve(@Nonnull String namedCurve) {
      Js.<EcKeyImportParams>uncheckedCast( this ).setNamedCurve( namedCurve );
      return Js.uncheckedCast( this );
    }
  }
}
