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
public interface RegistrationOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "scope"
  )
  String scope();

  @JsProperty
  void setScope(@Nonnull String scope);

  @JsProperty(
      name = "type"
  )
  @WorkerType
  String type();

  @JsProperty
  void setType(@WorkerType @Nonnull String type);

  @JsProperty(
      name = "updateViaCache"
  )
  @ServiceWorkerUpdateViaCache
  String updateViaCache();

  @JsProperty
  void setUpdateViaCache(@ServiceWorkerUpdateViaCache @Nonnull String updateViaCache);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends RegistrationOptions {
    @JsOverlay
    @Nonnull
    default Builder scope(@Nonnull final String scope) {
      setScope( scope );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@WorkerType @Nonnull final String type) {
      setType( type );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder updateViaCache(
        @ServiceWorkerUpdateViaCache @Nonnull final String updateViaCache) {
      setUpdateViaCache( updateViaCache );
      return this;
    }
  }
}
