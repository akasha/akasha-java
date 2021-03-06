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
  static Builder create(@Nonnull final GPUShaderModule module, @Nonnull final String entryPoint) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).module( module ).entryPoint( entryPoint );
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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUProgrammableStage"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUProgrammableStage {
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
