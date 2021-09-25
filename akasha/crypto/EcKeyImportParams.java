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
  static Builder create(@Nonnull final String name, @Nonnull final String namedCurve) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).namedCurve( namedCurve );
  }

  @JsProperty(
      name = "namedCurve"
  )
  @JsNonNull
  String namedCurve();

  @JsProperty
  void setNamedCurve(@JsNonNull String namedCurve);

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
