package akasha;

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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PublicKeyCredentialUserEntity"
)
public interface PublicKeyCredentialUserEntity extends PublicKeyCredentialEntity {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final PublicKeyCredentialUserEntity $publicKeyCredentialUserEntity = Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() );
    $publicKeyCredentialUserEntity.setName( name );
    return Js.uncheckedCast( $publicKeyCredentialUserEntity );
  }

  @JsProperty(
      name = "displayName"
  )
  @JsNonNull
  String displayName();

  @JsProperty
  void setDisplayName(@JsNonNull String displayName);

  @JsProperty(
      name = "id"
  )
  @JsNonNull
  BufferSource id();

  @JsProperty
  void setId(@JsNonNull BufferSource id);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PublicKeyCredentialUserEntity"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 displayName(@Nonnull String displayName) {
      Js.<PublicKeyCredentialUserEntity>uncheckedCast( this ).setDisplayName( displayName );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PublicKeyCredentialUserEntity"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default PublicKeyCredentialUserEntity id(@Nonnull BufferSource id) {
      Js.<PublicKeyCredentialUserEntity>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }
}
