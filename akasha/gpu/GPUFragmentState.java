package akasha.gpu;

import akasha.lang.JsArray;
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
    name = "GPUFragmentState"
)
@ApiStatus.Experimental
public interface GPUFragmentState extends GPUProgrammableStage {
  @JsOverlay
  @Nonnull
  static Step1 module(@Nonnull final GPUShaderModule module) {
    final Builder $gpuFragmentState = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuFragmentState.setModule( module );
    return Js.uncheckedCast( $gpuFragmentState );
  }

  @JsProperty(
      name = "targets"
  )
  @JsNonNull
  JsArray<GPUColorTargetState> targets();

  @JsProperty
  void setTargets(@JsNonNull JsArray<GPUColorTargetState> targets);

  @JsOverlay
  default void setTargets(@Nonnull final GPUColorTargetState... targets) {
    setTargets( Js.<JsArray<GPUColorTargetState>>uncheckedCast( targets ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUFragmentState"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 entryPoint(@Nonnull String entryPoint) {
      Js.<GPUFragmentState>uncheckedCast( this ).setEntryPoint( entryPoint );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUFragmentState"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder targets(@Nonnull JsArray<GPUColorTargetState> targets) {
      Js.<GPUFragmentState>uncheckedCast( this ).setTargets( targets );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Builder targets(@Nonnull GPUColorTargetState... targets) {
      Js.<GPUFragmentState>uncheckedCast( this ).setTargets( targets );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUFragmentState"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUFragmentState {
    @JsOverlay
    @Nonnull
    default Builder constants(@Nonnull final JsPropertyMap<Double> constants) {
      setConstants( constants );
      return this;
    }
  }
}
