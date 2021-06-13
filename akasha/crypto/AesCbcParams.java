package akasha.crypto;

import akasha.core.BufferSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The AesCbcParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-CBC algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesCbcParams">AesCbcParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AesCbcParams"
)
public interface AesCbcParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final BufferSource iv) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsProperty(
      name = "iv"
  )
  @Nonnull
  BufferSource iv();

  @JsProperty
  void setIv(@Nonnull BufferSource iv);

  /**
   * The AesCbcParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-CBC algorithm.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesCbcParams">AesCbcParams - MDN</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AesCbcParams"
  )
  interface Builder extends AesCbcParams {
    @JsOverlay
    @Nonnull
    default Builder iv(@Nonnull final BufferSource iv) {
      setIv( iv );
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
