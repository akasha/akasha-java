package akasha.crypto;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AesKeyAlgorithm"
)
public interface AesKeyAlgorithm extends KeyAlgorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final AesKeyAlgorithm $aesKeyAlgorithm = Js.<AesKeyAlgorithm>uncheckedCast( JsPropertyMap.of() );
    $aesKeyAlgorithm.setName( name );
    return Js.uncheckedCast( $aesKeyAlgorithm );
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
      name = "AesKeyAlgorithm"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default AesKeyAlgorithm length(int length) {
      Js.<AesKeyAlgorithm>uncheckedCast( this ).setLength( length );
      return Js.uncheckedCast( this );
    }
  }
}
