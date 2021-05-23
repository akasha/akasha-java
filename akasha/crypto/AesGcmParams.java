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
 * The AesGcmParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-GCM algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesGcmParams">AesGcmParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-AesGcmParams">SubtleCrypto.AesGcmParams - Web Cryptography API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AesGcmParams"
)
public interface AesGcmParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final BufferSource iv) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsProperty(
      name = "additionalData"
  )
  BufferSource additionalData();

  @JsProperty
  void setAdditionalData(@Nonnull BufferSource additionalData);

  @JsProperty(
      name = "iv"
  )
  @Nonnull
  BufferSource iv();

  @JsProperty
  void setIv(@Nonnull BufferSource iv);

  @JsProperty(
      name = "tagLength"
  )
  short tagLength();

  @JsProperty
  void setTagLength(short tagLength);

  /**
   * The AesGcmParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-GCM algorithm.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesGcmParams">AesGcmParams - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-AesGcmParams">SubtleCrypto.AesGcmParams - Web Cryptography API</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AesGcmParams"
  )
  interface Builder extends AesGcmParams {
    @JsOverlay
    @Nonnull
    default Builder additionalData(@Nonnull final BufferSource additionalData) {
      setAdditionalData( additionalData );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder iv(@Nonnull final BufferSource iv) {
      setIv( iv );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder tagLength(final short tagLength) {
      setTagLength( tagLength );
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
