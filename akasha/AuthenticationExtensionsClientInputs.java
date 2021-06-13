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
    name = "AuthenticationExtensionsClientInputs"
)
public interface AuthenticationExtensionsClientInputs {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "appid"
  )
  String appid();

  @JsProperty
  void setAppid(@Nonnull String appid);

  @JsProperty(
      name = "appidExclude"
  )
  String appidExclude();

  @JsProperty
  void setAppidExclude(@Nonnull String appidExclude);

  @JsProperty(
      name = "uvm"
  )
  boolean uvm();

  @JsProperty
  void setUvm(boolean uvm);

  @JsProperty(
      name = "credProps"
  )
  boolean credProps();

  @JsProperty
  void setCredProps(boolean credProps);

  @JsProperty(
      name = "largeBlob"
  )
  AuthenticationExtensionsLargeBlobInputs largeBlob();

  @JsProperty
  void setLargeBlob(@Nonnull AuthenticationExtensionsLargeBlobInputs largeBlob);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AuthenticationExtensionsClientInputs"
  )
  interface Builder extends AuthenticationExtensionsClientInputs {
    @JsOverlay
    @Nonnull
    default Builder appid(@Nonnull final String appid) {
      setAppid( appid );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder appidExclude(@Nonnull final String appidExclude) {
      setAppidExclude( appidExclude );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder uvm(final boolean uvm) {
      setUvm( uvm );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder credProps(final boolean credProps) {
      setCredProps( credProps );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder largeBlob(@Nonnull final AuthenticationExtensionsLargeBlobInputs largeBlob) {
      setLargeBlob( largeBlob );
      return this;
    }
  }
}
