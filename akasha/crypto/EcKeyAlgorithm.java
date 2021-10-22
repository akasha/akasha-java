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
    name = "EcKeyAlgorithm"
)
public interface EcKeyAlgorithm extends KeyAlgorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final EcKeyAlgorithm $ecKeyAlgorithm = Js.<EcKeyAlgorithm>uncheckedCast( JsPropertyMap.of() );
    $ecKeyAlgorithm.setName( name );
    return Js.uncheckedCast( $ecKeyAlgorithm );
  }

  @JsProperty(
      name = "namedCurve"
  )
  @JsNonNull
  String namedCurve();

  @JsProperty
  void setNamedCurve(@JsNonNull String namedCurve);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EcKeyAlgorithm"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default EcKeyAlgorithm namedCurve(@Nonnull String namedCurve) {
      Js.<EcKeyAlgorithm>uncheckedCast( this ).setNamedCurve( namedCurve );
      return Js.uncheckedCast( this );
    }
  }
}
