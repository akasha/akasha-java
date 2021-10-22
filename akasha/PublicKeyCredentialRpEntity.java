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
    name = "PublicKeyCredentialRpEntity"
)
public interface PublicKeyCredentialRpEntity extends PublicKeyCredentialEntity {
  @JsOverlay
  @Nonnull
  static Builder name(@Nonnull final String name) {
    final Builder $publicKeyCredentialRpEntity = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $publicKeyCredentialRpEntity.setName( name );
    return Js.uncheckedCast( $publicKeyCredentialRpEntity );
  }

  @JsProperty(
      name = "id"
  )
  String id();

  @JsProperty
  void setId(@JsNonNull String id);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PublicKeyCredentialRpEntity"
  )
  interface Builder extends PublicKeyCredentialRpEntity {
    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull final String id) {
      setId( id );
      return this;
    }
  }
}
