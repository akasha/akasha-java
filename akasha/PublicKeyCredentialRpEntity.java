package akasha;

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
public interface PublicKeyCredentialRpEntity extends PublicKeyCredentialEntity {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "id"
  )
  String id();

  @JsProperty
  void setId(@Nonnull String id);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends PublicKeyCredentialRpEntity {
    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull final String id) {
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
