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
 * A DOMString representing the name of the elliptic curve to use. This may be any of the following names for NIST-approved curves:
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EcKeyImportParams">EcKeyImportParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-EcKeyImportParams">SubtleCrypto.EcKeyImportParams - Web Cryptography API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface EcKeyImportParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final String namedCurve) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).namedCurve( namedCurve );
  }

  @JsProperty(
      name = "namedCurve"
  )
  @Nonnull
  String namedCurve();

  @JsProperty
  void setNamedCurve(@Nonnull String namedCurve);

  /**
   * A DOMString representing the name of the elliptic curve to use. This may be any of the following names for NIST-approved curves:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EcKeyImportParams">EcKeyImportParams - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-EcKeyImportParams">SubtleCrypto.EcKeyImportParams - Web Cryptography API</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends EcKeyImportParams {
    @JsOverlay
    @Nonnull
    default Builder namedCurve(@Nonnull final String namedCurve) {
      setNamedCurve( namedCurve );
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
