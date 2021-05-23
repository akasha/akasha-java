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
    name = "WorkerOptions"
)
public interface WorkerOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "credentials"
  )
  @RequestCredentials
  String credentials();

  @JsProperty
  void setCredentials(@RequestCredentials @Nonnull String credentials);

  @JsProperty(
      name = "name"
  )
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsProperty(
      name = "type"
  )
  @WorkerType
  String type();

  @JsProperty
  void setType(@WorkerType @Nonnull String type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "WorkerOptions"
  )
  interface Builder extends WorkerOptions {
    @JsOverlay
    @Nonnull
    default Builder credentials(@RequestCredentials @Nonnull final String credentials) {
      setCredentials( credentials );
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
    default Builder type(@WorkerType @Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
