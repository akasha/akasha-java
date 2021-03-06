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
 * A DOMString. This should be set to AES-CBC, AES-CTR, AES-GCM, or AES-KW, depending on the algorithm you want to use.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesKeyGenParams">AesKeyGenParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AesKeyGenParams"
)
public interface AesKeyGenParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, final int length) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).length( length );
  }

  @JsProperty(
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  /**
   * A DOMString. This should be set to AES-CBC, AES-CTR, AES-GCM, or AES-KW, depending on the algorithm you want to use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesKeyGenParams">AesKeyGenParams - MDN</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AesKeyGenParams"
  )
  interface Builder extends AesKeyGenParams {
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
