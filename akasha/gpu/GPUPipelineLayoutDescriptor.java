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
    name = "GPUPipelineLayoutDescriptor"
)
@ApiStatus.Experimental
public interface GPUPipelineLayoutDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<GPUBindGroupLayout> bindGroupLayouts) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).bindGroupLayouts( bindGroupLayouts );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUBindGroupLayout[] bindGroupLayouts) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).bindGroupLayouts( bindGroupLayouts );
  }

  @JsProperty(
      name = "bindGroupLayouts"
  )
  @Nonnull
  JsArray<GPUBindGroupLayout> bindGroupLayouts();

  @JsProperty
  void setBindGroupLayouts(@Nonnull JsArray<GPUBindGroupLayout> bindGroupLayouts);

  @JsOverlay
  default void setBindGroupLayouts(@Nonnull final GPUBindGroupLayout... bindGroupLayouts) {
    setBindGroupLayouts( Js.<JsArray<GPUBindGroupLayout>>uncheckedCast( bindGroupLayouts ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUPipelineLayoutDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUPipelineLayoutDescriptor {
    @JsOverlay
    @Nonnull
    default Builder bindGroupLayouts(@Nonnull final JsArray<GPUBindGroupLayout> bindGroupLayouts) {
      setBindGroupLayouts( bindGroupLayouts );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bindGroupLayouts(@Nonnull final GPUBindGroupLayout... bindGroupLayouts) {
      setBindGroupLayouts( bindGroupLayouts );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }
  }
}
