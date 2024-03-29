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
    name = "GPUPipelineLayoutDescriptor"
)
@ApiStatus.Experimental
public interface GPUPipelineLayoutDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder bindGroupLayouts(@Nonnull final JsArray<GPUBindGroupLayout> bindGroupLayouts) {
    final Builder $gpuPipelineLayoutDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuPipelineLayoutDescriptor.setBindGroupLayouts( bindGroupLayouts );
    return Js.uncheckedCast( $gpuPipelineLayoutDescriptor );
  }

  @JsOverlay
  @Nonnull
  static Builder bindGroupLayouts(@Nonnull final GPUBindGroupLayout... bindGroupLayouts) {
    final Builder $gpuPipelineLayoutDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuPipelineLayoutDescriptor.setBindGroupLayouts( bindGroupLayouts );
    return Js.uncheckedCast( $gpuPipelineLayoutDescriptor );
  }

  @JsProperty(
      name = "bindGroupLayouts"
  )
  @JsNonNull
  JsArray<GPUBindGroupLayout> bindGroupLayouts();

  @JsProperty
  void setBindGroupLayouts(@JsNonNull JsArray<GPUBindGroupLayout> bindGroupLayouts);

  @JsOverlay
  default void setBindGroupLayouts(@Nonnull final GPUBindGroupLayout... bindGroupLayouts) {
    setBindGroupLayouts( Js.<JsArray<GPUBindGroupLayout>>uncheckedCast( bindGroupLayouts ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUPipelineLayoutDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUPipelineLayoutDescriptor {
    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }
  }
}
