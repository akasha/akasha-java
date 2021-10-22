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
  static Step1 name(@Nonnull final String name) {
    final AesCbcParams $aesCbcParams = Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() );
    $aesCbcParams.setName( name );
    return Js.uncheckedCast( $aesCbcParams );
  }

  @JsProperty(
      name = "iv"
  )
  @JsNonNull
  BufferSource iv();

  @JsProperty
  void setIv(@JsNonNull BufferSource iv);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AesCbcParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default AesCbcParams iv(@Nonnull BufferSource iv) {
      Js.<AesCbcParams>uncheckedCast( this ).setIv( iv );
      return Js.uncheckedCast( this );
    }
  }
}
