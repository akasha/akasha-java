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
    name = "GPURenderPipelineDescriptor"
)
@ApiStatus.Experimental
public interface GPURenderPipelineDescriptor extends GPUPipelineDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUVertexState vertex) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).vertex( vertex );
  }

  @JsProperty(
      name = "vertex"
  )
  @Nonnull
  GPUVertexState vertex();

  @JsProperty
  void setVertex(@Nonnull GPUVertexState vertex);

  @JsProperty(
      name = "depthStencil"
  )
  GPUDepthStencilState depthStencil();

  @JsProperty
  void setDepthStencil(@Nonnull GPUDepthStencilState depthStencil);

  @JsProperty(
      name = "fragment"
  )
  GPUFragmentState fragment();

  @JsProperty
  void setFragment(@Nonnull GPUFragmentState fragment);

  @JsProperty(
      name = "multisample"
  )
  GPUMultisampleState multisample();

  @JsProperty
  void setMultisample(@Nonnull GPUMultisampleState multisample);

  @JsProperty(
      name = "primitive"
  )
  GPUPrimitiveState primitive();

  @JsProperty
  void setPrimitive(@Nonnull GPUPrimitiveState primitive);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPipelineDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPURenderPipelineDescriptor {
    @JsOverlay
    @Nonnull
    default Builder vertex(@Nonnull final GPUVertexState vertex) {
      setVertex( vertex );
      return this;
    }

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
