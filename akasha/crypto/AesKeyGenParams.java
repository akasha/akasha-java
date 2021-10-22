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
  static Step1 name(@Nonnull final String name) {
    final AesKeyGenParams $aesKeyGenParams = Js.<AesKeyGenParams>uncheckedCast( JsPropertyMap.of() );
    $aesKeyGenParams.setName( name );
    return Js.uncheckedCast( $aesKeyGenParams );
  }

  @JsProperty(
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AesKeyGenParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default AesKeyGenParams length(int length) {
      Js.<AesKeyGenParams>uncheckedCast( this ).setLength( length );
      return Js.uncheckedCast( this );
    }
  }
}
