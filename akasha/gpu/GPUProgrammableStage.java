package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUProgrammableStage"
)
@ApiStatus.Experimental
public interface GPUProgrammableStage {
  @JsOverlay
  @Nonnull
  static Step1 module(@Nonnull final GPUShaderModule module) {
    final Builder $gpuProgrammableStage = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuProgrammableStage.setModule( module );
    return Js.uncheckedCast( $gpuProgrammableStage );
  }

  @JsProperty(
      name = "module"
  )
  @JsNonNull
  GPUShaderModule module();

  @JsProperty
  void setModule(@JsNonNull GPUShaderModule module);

  @JsProperty(
      name = "entryPoint"
  )
  @JsNonNull
  String entryPoint();

  @JsProperty
  void setEntryPoint(@JsNonNull String entryPoint);

  @JsProperty(
      name = "constants"
  )
  JsPropertyMap<Double> constants();

  @JsProperty
  void setConstants(@JsNonNull JsPropertyMap<Double> constants);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUProgrammableStage"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder entryPoint(@Nonnull String entryPoint) {
      Js.<GPUProgrammableStage>uncheckedCast( this ).setEntryPoint( entryPoint );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUProgrammableStage"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUProgrammableStage {
    @JsOverlay
    @Nonnull
    default Builder constants(@Nonnull final JsPropertyMap<Double> constants) {
      setConstants( constants );
      return this;
    }
  }
}
