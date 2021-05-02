package akasha;

import akasha.core.BufferSource;
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
    name = "Object"
)
public interface PublicKeyCredentialUserEntity extends PublicKeyCredentialEntity {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final String displayName,
      @Nonnull final BufferSource id) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsProperty(
      name = "displayName"
  )
  @Nonnull
  String displayName();

  @JsProperty
  void setDisplayName(@Nonnull String displayName);

  @JsProperty(
      name = "id"
  )
  @Nonnull
  BufferSource id();

  @JsProperty
  void setId(@Nonnull BufferSource id);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends PublicKeyCredentialUserEntity {
    @JsOverlay
    @Nonnull
    default Builder displayName(@Nonnull final String displayName) {
      setDisplayName( displayName );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull final BufferSource id) {
      setId( id );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder icon(@Nonnull final String icon) {
      setIcon( icon );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder name(@Nonnull final String name) {
      setName( name );
      return this;
    }
  }
}