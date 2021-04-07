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
public interface FederatedCredentialInit extends CredentialData {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String id, @Nonnull final String origin,
      @Nonnull final String provider) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id ).origin( origin ).provider( provider );
  }

  @JsProperty(
      name = "iconURL"
  )
  String iconURL();

  @JsProperty
  void setIconURL(@Nonnull String iconURL);

  @JsProperty(
      name = "name"
  )
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsProperty(
      name = "origin"
  )
  @Nonnull
  String origin();

  @JsProperty
  void setOrigin(@Nonnull String origin);

  @JsProperty(
      name = "protocol"
  )
  String protocol();

  @JsProperty
  void setProtocol(@Nonnull String protocol);

  @JsProperty(
      name = "provider"
  )
  @Nonnull
  String provider();

  @JsProperty
  void setProvider(@Nonnull String provider);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends FederatedCredentialInit {
    @JsOverlay
    @Nonnull
    default Builder iconURL(@Nonnull final String iconURL) {
      setIconURL( iconURL );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder name(@Nonnull final String name) {
      setName( name );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder origin(@Nonnull final String origin) {
      setOrigin( origin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder protocol(@Nonnull final String protocol) {
      setProtocol( protocol );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder provider(@Nonnull final String provider) {
      setProvider( provider );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull final String id) {
      setId( id );
      return this;
    }
  }
}
