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
    name = "AesDerivedKeyParams"
)
public interface AesDerivedKeyParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final AesDerivedKeyParams $aesDerivedKeyParams = Js.<AesDerivedKeyParams>uncheckedCast( JsPropertyMap.of() );
    $aesDerivedKeyParams.setName( name );
    return Js.uncheckedCast( $aesDerivedKeyParams );
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
      name = "AesDerivedKeyParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default AesDerivedKeyParams length(int length) {
      Js.<AesDerivedKeyParams>uncheckedCast( this ).setLength( length );
      return Js.uncheckedCast( this );
    }
  }
}
