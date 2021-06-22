package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
    name = "GPUComputePipelineDescriptor"
)
public interface GPUComputePipelineDescriptor extends GPUPipelineDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUProgrammableStage compute) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).compute( compute );
  }

  @JsProperty(
      name = "compute"
  )
  @Nonnull
  GPUProgrammableStage compute();

  @JsProperty
  void setCompute(@Nonnull GPUProgrammableStage compute);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUComputePipelineDescriptor"
  )
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
