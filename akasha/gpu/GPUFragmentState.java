package akasha.gpu;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
  static Builder create(@Nonnull final GPUShaderModule module, @Nonnull final String entryPoint,
      @Nonnull final JsArray<GPUColorTargetState> targets) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).module( module ).entryPoint( entryPoint ).targets( targets );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUShaderModule module, @Nonnull final String entryPoint,
      @Nonnull final GPUColorTargetState[] targets) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).module( module ).entryPoint( entryPoint ).targets( targets );
  }

  @JsProperty(
      name = "targets"
  )
  @Nonnull
  JsArray<GPUColorTargetState> targets();

  @JsProperty
  void setTargets(@Nonnull JsArray<GPUColorTargetState> targets);

  @JsOverlay
  default void setTargets(@Nonnull final GPUColorTargetState... targets) {
    setTargets( Js.<JsArray<GPUColorTargetState>>uncheckedCast( targets ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUFragmentState"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUFragmentState {
    @JsOverlay
    @Nonnull
    default Builder targets(@Nonnull final JsArray<GPUColorTargetState> targets) {
      setTargets( targets );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder targets(@Nonnull final GPUColorTargetState... targets) {
      setTargets( targets );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder module(@Nonnull final GPUShaderModule module) {
      setModule( module );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder entryPoint(@Nonnull final String entryPoint) {
      setEntryPoint( entryPoint );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder constants(@Nonnull final JsPropertyMap<Double> constants) {
      setConstants( constants );
      return this;
    }
  }
}
