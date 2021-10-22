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
    name = "FederatedCredentialInit"
)
public interface FederatedCredentialInit extends CredentialData {
  @JsOverlay
  @Nonnull
  static Step1 id(@Nonnull final String id) {
    final Builder $federatedCredentialInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $federatedCredentialInit.setId( id );
    return Js.uncheckedCast( $federatedCredentialInit );
  }

  @JsProperty(
      name = "iconURL"
  )
  String iconURL();

  @JsProperty
  void setIconURL(@JsNonNull String iconURL);

  @JsProperty(
      name = "name"
  )
  String name();

  @JsProperty
  void setName(@JsNonNull String name);

  @JsProperty(
      name = "origin"
  )
  @JsNonNull
  String origin();

  @JsProperty
  void setOrigin(@JsNonNull String origin);

  @JsProperty(
      name = "protocol"
  )
  String protocol();

  @JsProperty
  void setProtocol(@JsNonNull String protocol);

  @JsProperty(
      name = "provider"
  )
  @JsNonNull
  String provider();

  @JsProperty
  void setProvider(@JsNonNull String provider);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FederatedCredentialInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 origin(@Nonnull String origin) {
      Js.<FederatedCredentialInit>uncheckedCast( this ).setOrigin( origin );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FederatedCredentialInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder provider(@Nonnull String provider) {
      Js.<FederatedCredentialInit>uncheckedCast( this ).setProvider( provider );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FederatedCredentialInit"
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
    default Builder protocol(@Nonnull final String protocol) {
      setProtocol( protocol );
      return this;
    }
  }
}
