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
    name = "GPUComputePipelineDescriptor"
)
@ApiStatus.Experimental
public interface GPUComputePipelineDescriptor extends GPUPipelineDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder compute(@Nonnull final GPUProgrammableStage compute) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).compute( compute );
  }

  @JsProperty(
      name = "compute"
  )
  @JsNonNull
  GPUProgrammableStage compute();

  @JsProperty
  void setCompute(@JsNonNull GPUProgrammableStage compute);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUComputePipelineDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUComputePipelineDescriptor {
    @JsOverlay
    @Nonnull
    default Builder compute(@Nonnull final GPUProgrammableStage compute) {
      setCompute( compute );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder layout(@Nonnull final GPUPipelineLayout layout) {
      setLayout( layout );
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
