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
 * The AesGcmParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-GCM algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesGcmParams">AesGcmParams - MDN</a>
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
  static Step1 name(@Nonnull final String name) {
    final Builder $aesGcmParams = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $aesGcmParams.setName( name );
    return Js.uncheckedCast( $aesGcmParams );
  }

  @JsProperty(
      name = "iv"
  )
  @JsNonNull
  BufferSource iv();

  @JsProperty
  void setIv(@JsNonNull BufferSource iv);

  @JsProperty(
      name = "additionalData"
  )
  BufferSource additionalData();

  @JsProperty
  void setAdditionalData(@JsNonNull BufferSource additionalData);

  @JsProperty(
      name = "tagLength"
  )
  short tagLength();

  @JsProperty
  void setTagLength(short tagLength);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AesGcmParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder iv(@Nonnull BufferSource iv) {
      Js.<AesGcmParams>uncheckedCast( this ).setIv( iv );
      return Js.uncheckedCast( this );
    }
  }

  /**
   * The AesGcmParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-GCM algorithm.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesGcmParams">AesGcmParams - MDN</a>
   */
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
    default Builder tagLength(final short tagLength) {
      setTagLength( tagLength );
      return this;
    }
  }
}
