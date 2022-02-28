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
    name = "GPURenderPassDepthStencilAttachment"
)
@ApiStatus.Experimental
public interface GPURenderPassDepthStencilAttachment {
  @JsOverlay
  @Nonnull
  static Builder view(@Nonnull final GPUTextureView view) {
    final Builder $gpuRenderPassDepthStencilAttachment = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuRenderPassDepthStencilAttachment.setView( view );
    return Js.uncheckedCast( $gpuRenderPassDepthStencilAttachment );
  }

  @JsProperty(
      name = "view"
  )
  @JsNonNull
  GPUTextureView view();

  @JsProperty
  void setView(@JsNonNull GPUTextureView view);

  @JsProperty(
      name = "depthClearValue"
  )
  float depthClearValue();

  @JsProperty
  void setDepthClearValue(float depthClearValue);

  @JsProperty(
      name = "depthLoadOp"
  )
  @GPULoadOp
  String depthLoadOp();

  @JsProperty
  void setDepthLoadOp(@GPULoadOp @JsNonNull String depthLoadOp);

  @JsProperty(
      name = "depthReadOnly"
  )
  boolean depthReadOnly();

  @JsProperty
  void setDepthReadOnly(boolean depthReadOnly);

  @JsProperty(
      name = "depthStoreOp"
  )
  @GPUStoreOp
  String depthStoreOp();

  @JsProperty
  void setDepthStoreOp(@GPUStoreOp @JsNonNull String depthStoreOp);

  @JsProperty(
      name = "stencilClearValue"
  )
  int stencilClearValue();

  @JsProperty
  void setStencilClearValue(int stencilClearValue);

  @JsProperty(
      name = "stencilLoadOp"
  )
  @GPULoadOp
  String stencilLoadOp();

  @JsProperty
  void setStencilLoadOp(@GPULoadOp @JsNonNull String stencilLoadOp);

  @JsProperty(
      name = "stencilReadOnly"
  )
  boolean stencilReadOnly();

  @JsProperty
  void setStencilReadOnly(boolean stencilReadOnly);

  @JsProperty(
      name = "stencilStoreOp"
  )
  @GPUStoreOp
  String stencilStoreOp();

  @JsProperty
  void setStencilStoreOp(@GPUStoreOp @JsNonNull String stencilStoreOp);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassDepthStencilAttachment"
  )
  @ApiStatus.Experimental
  interface Builder extends GPURenderPassDepthStencilAttachment {
    @JsOverlay
    @Nonnull
    default Builder depthClearValue(final float depthClearValue) {
      setDepthClearValue( depthClearValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthLoadOp(@GPULoadOp @Nonnull final String depthLoadOp) {
      setDepthLoadOp( depthLoadOp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthReadOnly(final boolean depthReadOnly) {
      setDepthReadOnly( depthReadOnly );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthStoreOp(@GPUStoreOp @Nonnull final String depthStoreOp) {
      setDepthStoreOp( depthStoreOp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilClearValue(final int stencilClearValue) {
      setStencilClearValue( stencilClearValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilLoadOp(@GPULoadOp @Nonnull final String stencilLoadOp) {
      setStencilLoadOp( stencilLoadOp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilReadOnly(final boolean stencilReadOnly) {
      setStencilReadOnly( stencilReadOnly );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilStoreOp(@GPUStoreOp @Nonnull final String stencilStoreOp) {
      setStencilStoreOp( stencilStoreOp );
      return this;
    }
  }
}
