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
  static Step1 kind(@ImportExportKind @Nonnull final String kind) {
    final ModuleImportDescriptor $moduleImportDescriptor = Js.<ModuleImportDescriptor>uncheckedCast( JsPropertyMap.of() );
    $moduleImportDescriptor.setKind( kind );
    return Js.uncheckedCast( $moduleImportDescriptor );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ModuleImportDescriptor"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 module(@Nonnull String module) {
      Js.<ModuleImportDescriptor>uncheckedCast( this ).setModule( module );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ModuleImportDescriptor"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default ModuleImportDescriptor name(@Nonnull String name) {
      Js.<ModuleImportDescriptor>uncheckedCast( this ).setName( name );
      return Js.uncheckedCast( this );
    }
  }
}
