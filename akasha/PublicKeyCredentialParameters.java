package akasha;

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
    name = "PublicKeyCredentialParameters"
)
public interface PublicKeyCredentialParameters {
  @JsOverlay
  @Nonnull
  static Step1 alg(final int alg) {
    final PublicKeyCredentialParameters $publicKeyCredentialParameters = Js.<PublicKeyCredentialParameters>uncheckedCast( JsPropertyMap.of() );
    $publicKeyCredentialParameters.setAlg( alg );
    return Js.uncheckedCast( $publicKeyCredentialParameters );
  }

  @JsProperty(
      name = "alg"
  )
  int alg();

  @JsProperty
  void setAlg(int alg);

  @JsProperty(
      name = "type"
  )
  @JsNonNull
  String type();

  @JsProperty
  void setType(@JsNonNull String type);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PublicKeyCredentialParameters"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default PublicKeyCredentialParameters type(@Nonnull String type) {
      Js.<PublicKeyCredentialParameters>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }
}
