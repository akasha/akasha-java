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
  @JsNonNull
  String kind();

  @JsProperty
  void setKind(@ImportExportKind @JsNonNull String kind);

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
