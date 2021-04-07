package akasha;

import akasha.core.BufferSource;
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
    name = "Object"
)
public interface PublicKeyCredentialDescriptor {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final BufferSource id,
      @PublicKeyCredentialType @Nonnull final String type) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsProperty(
      name = "id"
  )
  @Nonnull
  BufferSource id();

  @JsProperty
  void setId(@Nonnull BufferSource id);

  @JsProperty(
      name = "transports"
  )
  JsArray<String> transports();

  @JsProperty
  void setTransports(@Nonnull JsArray<String> transports);

  @JsOverlay
  default void setTransports(@Nonnull final String... transports) {
    setTransports( Js.<JsArray<String>>uncheckedCast( transports ) );
  }

  @JsProperty(
      name = "type"
  )
  @PublicKeyCredentialType
  @Nonnull
  String type();

  @JsProperty
  void setType(@PublicKeyCredentialType @Nonnull String type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends PublicKeyCredentialDescriptor {
    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull final BufferSource id) {
      setId( id );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder transports(@Nonnull final JsArray<String> transports) {
      setTransports( transports );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder transports(@Nonnull final String... transports) {
      setTransports( transports );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@PublicKeyCredentialType @Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
