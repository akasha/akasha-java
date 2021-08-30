package akasha.wasm;

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
    name = "ModuleImportDescriptor"
)
public interface ModuleImportDescriptor {
  @JsOverlay
  @Nonnull
  static Builder create(@ImportExportKind @Nonnull final String kind, @Nonnull final String module,
      @Nonnull final String name) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).kind( kind ).module( module ).name( name );
  }

  @JsProperty(
      name = "kind"
  )
  @ImportExportKind
  @JsNonNull
  String kind();

  @JsProperty
  void setKind(@ImportExportKind @JsNonNull String kind);

  @JsProperty(
      name = "module"
  )
  @JsNonNull
  String module();

  @JsProperty
  void setModule(@JsNonNull String module);

  @JsProperty(
      name = "name"
  )
  @JsNonNull
  String name();

  @JsProperty
  void setName(@JsNonNull String name);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ModuleImportDescriptor"
  )
  interface Builder extends ModuleImportDescriptor {
    @JsOverlay
    @Nonnull
    default Builder kind(@ImportExportKind @Nonnull final String kind) {
      setKind( kind );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder module(@Nonnull final String module) {
      setModule( module );
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
