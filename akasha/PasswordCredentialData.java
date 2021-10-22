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
    name = "PasswordCredentialData"
)
public interface PasswordCredentialData extends CredentialData, PasswordCredentialInit {
  @JsOverlay
  @Nonnull
  static Step1 id(@Nonnull final String id) {
    final Builder $passwordCredentialData = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $passwordCredentialData.setId( id );
    return Js.uncheckedCast( $passwordCredentialData );
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
      name = "password"
  )
  @JsNonNull
  String password();

  @JsProperty
  void setPassword(@JsNonNull String password);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PasswordCredentialData"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 origin(@Nonnull String origin) {
      Js.<PasswordCredentialData>uncheckedCast( this ).setOrigin( origin );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PasswordCredentialData"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder password(@Nonnull String password) {
      Js.<PasswordCredentialData>uncheckedCast( this ).setPassword( password );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PasswordCredentialData"
  )
  interface Builder extends PasswordCredentialData {
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
  }
}
