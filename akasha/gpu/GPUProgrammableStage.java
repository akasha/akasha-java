package akasha.gpu;

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
    name = "GPUProgrammableStage"
)
@ApiStatus.Experimental
public interface GPUProgrammableStage {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String entryPoint, @Nonnull final GPUShaderModule module) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).entryPoint( entryPoint ).module( module );
  }

  @JsProperty(
      name = "entryPoint"
  )
  @Nonnull
  String entryPoint();

  @JsProperty
  void setEntryPoint(@Nonnull String entryPoint);

  @JsProperty(
      name = "module"
  )
  @Nonnull
  GPUShaderModule module();

  @JsProperty
  void setModule(@Nonnull GPUShaderModule module);

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
    default Builder entryPoint(@Nonnull final String entryPoint) {
      setEntryPoint( entryPoint );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder module(@Nonnull final GPUShaderModule module) {
      setModule( module );
      return this;
    }
  }
}
