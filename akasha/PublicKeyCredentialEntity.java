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
    name = "PublicKeyCredentialEntity"
)
public interface PublicKeyCredentialEntity {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialEntity name(@Nonnull final String name) {
    final PublicKeyCredentialEntity $publicKeyCredentialEntity = Js.<PublicKeyCredentialEntity>uncheckedCast( JsPropertyMap.of() );
    $publicKeyCredentialEntity.setName( name );
    return Js.uncheckedCast( $publicKeyCredentialEntity );
  }

  @JsProperty(
      name = "name"
  )
  @JsNonNull
  String name();

  @JsProperty
  void setName(@JsNonNull String name);
}
