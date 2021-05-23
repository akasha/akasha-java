package akasha.wasm;

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
    name = "ModuleExportDescriptor"
)
public interface ModuleExportDescriptor {
  @JsOverlay
  @Nonnull
  static Builder create(@ImportExportKind @Nonnull final String kind, @Nonnull final String name) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).kind( kind ).name( name );
  }

  @JsProperty(
      name = "kind"
  )
  @ImportExportKind
  @Nonnull
  String kind();

  @JsProperty
  void setKind(@ImportExportKind @Nonnull String kind);

  @JsProperty(
      name = "name"
  )
  @Nonnull
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ModuleExportDescriptor"
  )
  interface Builder extends ModuleExportDescriptor {
    @JsOverlay
    @Nonnull
    default Builder kind(@ImportExportKind @Nonnull final String kind) {
      setKind( kind );
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
