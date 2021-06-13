package akasha;

import akasha.lang.JsArray;
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
    name = "AuthenticationExtensionsClientOutputs"
)
public interface AuthenticationExtensionsClientOutputs {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "appid"
  )
  boolean appid();

  @JsProperty
  void setAppid(boolean appid);

  @JsProperty(
      name = "appidExclude"
  )
  boolean appidExclude();

  @JsProperty
  void setAppidExclude(boolean appidExclude);

  @JsProperty(
      name = "uvm"
  )
  JsArray<JsArray<Double>> uvm();

  @JsProperty
  void setUvm(@Nonnull JsArray<JsArray<Double>> uvm);

  @JsOverlay
  @SuppressWarnings("unchecked")
  default void setUvm(@Nonnull final JsArray<Double>... uvm) {
    setUvm( Js.<JsArray<JsArray<Double>>>uncheckedCast( uvm ) );
  }

  @JsProperty(
      name = "credProps"
  )
  CredentialPropertiesOutput credProps();

  @JsProperty
  void setCredProps(@Nonnull CredentialPropertiesOutput credProps);

  @JsProperty(
      name = "largeBlob"
  )
  AuthenticationExtensionsLargeBlobOutputs largeBlob();

  @JsProperty
  void setLargeBlob(@Nonnull AuthenticationExtensionsLargeBlobOutputs largeBlob);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AuthenticationExtensionsClientOutputs"
  )
  interface Builder extends AuthenticationExtensionsClientOutputs {
    @JsOverlay
    @Nonnull
    default Builder appid(final boolean appid) {
      setAppid( appid );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder appidExclude(final boolean appidExclude) {
      setAppidExclude( appidExclude );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder uvm(@Nonnull final JsArray<JsArray<Double>> uvm) {
      setUvm( uvm );
      return this;
    }

    @JsOverlay
    @Nonnull
    @SuppressWarnings("unchecked")
    default Builder uvm(@Nonnull final JsArray<Double>... uvm) {
      setUvm( uvm );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder credProps(@Nonnull final CredentialPropertiesOutput credProps) {
      setCredProps( credProps );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder largeBlob(@Nonnull final AuthenticationExtensionsLargeBlobOutputs largeBlob) {
      setLargeBlob( largeBlob );
      return this;
    }
  }
}
