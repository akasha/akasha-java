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
 * The RsaOaepParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the RSA_OAEP algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RsaOaepParams">RsaOaepParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RsaOaepParams"
)
public interface RsaOaepParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Builder name(@Nonnull final String name) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "label"
  )
  BufferSource label();

  @JsProperty
  void setLabel(@JsNonNull BufferSource label);

  /**
   * The RsaOaepParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the RSA_OAEP algorithm.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RsaOaepParams">RsaOaepParams - MDN</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaOaepParams"
  )
  interface Builder extends RsaOaepParams {
    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final BufferSource label) {
      setLabel( label );
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
