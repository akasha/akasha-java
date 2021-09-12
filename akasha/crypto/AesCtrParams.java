package akasha.crypto;

import akasha.core.BufferSource;
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
 * The AesCtrParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-CTR algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesCtrParams">AesCtrParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AesCtrParams"
)
public interface AesCtrParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final BufferSource counter,
      final short length) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsProperty(
      name = "counter"
  )
  @JsNonNull
  BufferSource counter();

  @JsProperty
  void setCounter(@JsNonNull BufferSource counter);

  @JsProperty(
      name = "length"
  )
  short length();

  @JsProperty
  void setLength(short length);

  /**
   * The AesCtrParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-CTR algorithm.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesCtrParams">AesCtrParams - MDN</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AesCtrParams"
  )
  interface Builder extends AesCtrParams {
    @JsOverlay
    @Nonnull
    default Builder counter(@Nonnull final BufferSource counter) {
      setCounter( counter );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder length(final short length) {
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
