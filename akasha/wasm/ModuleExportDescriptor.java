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
  static Step1 kind(@ImportExportKind @Nonnull final String kind) {
    final ModuleExportDescriptor $moduleExportDescriptor = Js.<ModuleExportDescriptor>uncheckedCast( JsPropertyMap.of() );
    $moduleExportDescriptor.setKind( kind );
    return Js.uncheckedCast( $moduleExportDescriptor );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ModuleExportDescriptor"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default ModuleExportDescriptor name(@Nonnull String name) {
      Js.<ModuleExportDescriptor>uncheckedCast( this ).setName( name );
      return Js.uncheckedCast( this );
    }
  }
}
