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
  static Step1 name(@Nonnull final String name) {
    final AesCtrParams $aesCtrParams = Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() );
    $aesCtrParams.setName( name );
    return Js.uncheckedCast( $aesCtrParams );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AesCtrParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 counter(@Nonnull BufferSource counter) {
      Js.<AesCtrParams>uncheckedCast( this ).setCounter( counter );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AesCtrParams"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default AesCtrParams length(short length) {
      Js.<AesCtrParams>uncheckedCast( this ).setLength( length );
      return Js.uncheckedCast( this );
    }
  }
}
