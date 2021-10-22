package akasha.crypto;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "HmacKeyAlgorithm"
)
public interface HmacKeyAlgorithm extends KeyAlgorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final HmacKeyAlgorithm $hmacKeyAlgorithm = Js.<HmacKeyAlgorithm>uncheckedCast( JsPropertyMap.of() );
    $hmacKeyAlgorithm.setName( name );
    return Js.uncheckedCast( $hmacKeyAlgorithm );
  }

  @JsProperty(
      name = "hash"
  )
  @JsNonNull
  KeyAlgorithm hash();

  @JsProperty
  void setHash(@JsNonNull KeyAlgorithm hash);

  @JsProperty(
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "HmacKeyAlgorithm"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 hash(@Nonnull KeyAlgorithm hash) {
      Js.<HmacKeyAlgorithm>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "HmacKeyAlgorithm"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default HmacKeyAlgorithm length(int length) {
      Js.<HmacKeyAlgorithm>uncheckedCast( this ).setLength( length );
      return Js.uncheckedCast( this );
    }
  }
}
