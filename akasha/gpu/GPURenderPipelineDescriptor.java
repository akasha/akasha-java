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
    name = "GPURenderPipelineDescriptor"
)
@ApiStatus.Experimental
public interface GPURenderPipelineDescriptor extends GPUPipelineDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder vertex(@Nonnull final GPUVertexState vertex) {
    final Builder $gpuRenderPipelineDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuRenderPipelineDescriptor.setVertex( vertex );
    return Js.uncheckedCast( $gpuRenderPipelineDescriptor );
  }

  @JsProperty(
      name = "vertex"
  )
  @JsNonNull
  GPUVertexState vertex();

  @JsProperty
  void setVertex(@JsNonNull GPUVertexState vertex);

  @JsProperty(
      name = "depthStencil"
  )
  GPUDepthStencilState depthStencil();

  @JsProperty
  void setDepthStencil(@JsNonNull GPUDepthStencilState depthStencil);

  @JsProperty(
      name = "fragment"
  )
  GPUFragmentState fragment();

  @JsProperty
  void setFragment(@JsNonNull GPUFragmentState fragment);

  @JsProperty(
      name = "multisample"
  )
  GPUMultisampleState multisample();

  @JsProperty
  void setMultisample(@JsNonNull GPUMultisampleState multisample);

  @JsProperty(
      name = "primitive"
  )
  GPUPrimitiveState primitive();

  @JsProperty
  void setPrimitive(@JsNonNull GPUPrimitiveState primitive);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPipelineDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPURenderPipelineDescriptor {
    @JsOverlay
    @Nonnull
    default Builder depthStencil(@Nonnull final GPUDepthStencilState depthStencil) {
      setDepthStencil( depthStencil );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder fragment(@Nonnull final GPUFragmentState fragment) {
      setFragment( fragment );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder multisample(@Nonnull final GPUMultisampleState multisample) {
      setMultisample( multisample );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder primitive(@Nonnull final GPUPrimitiveState primitive) {
      setPrimitive( primitive );
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
