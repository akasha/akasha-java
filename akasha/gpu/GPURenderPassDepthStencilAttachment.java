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
  static Step1 view(@Nonnull final GPUTextureView view) {
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
      name = "depthLoadValue"
  )
  @JsNonNull
  GPULoadOpOrFloatUnion depthLoadValue();

  @JsProperty
  void setDepthLoadValue(@JsNonNull GPULoadOpOrFloatUnion depthLoadValue);

  @JsOverlay
  default void setDepthLoadValue(@Nonnull final String depthLoadValue) {
    setDepthLoadValue( GPULoadOpOrFloatUnion.of( depthLoadValue ) );
  }

  @JsOverlay
  default void setDepthLoadValue(final float depthLoadValue) {
    setDepthLoadValue( GPULoadOpOrFloatUnion.of( depthLoadValue ) );
  }

  @JsProperty(
      name = "depthStoreOp"
  )
  @GPUStoreOp
  @JsNonNull
  String depthStoreOp();

  @JsProperty
  void setDepthStoreOp(@GPUStoreOp @JsNonNull String depthStoreOp);

  @JsProperty(
      name = "stencilLoadValue"
  )
  @JsNonNull
  GPULoadOpOrGPUStencilValueUnion stencilLoadValue();

  @JsProperty
  void setStencilLoadValue(@JsNonNull GPULoadOpOrGPUStencilValueUnion stencilLoadValue);

  @JsOverlay
  default void setStencilLoadValue(@Nonnull final String stencilLoadValue) {
    setStencilLoadValue( GPULoadOpOrGPUStencilValueUnion.of( stencilLoadValue ) );
  }

  @JsOverlay
  default void setStencilLoadValue(final int stencilLoadValue) {
    setStencilLoadValue( GPULoadOpOrGPUStencilValueUnion.of( stencilLoadValue ) );
  }

  @JsProperty(
      name = "stencilStoreOp"
  )
  @GPUStoreOp
  @JsNonNull
  String stencilStoreOp();

  @JsProperty
  void setStencilStoreOp(@GPUStoreOp @JsNonNull String stencilStoreOp);

  @JsProperty(
      name = "depthReadOnly"
  )
  boolean depthReadOnly();

  @JsProperty
  void setDepthReadOnly(boolean depthReadOnly);

  @JsProperty(
      name = "stencilReadOnly"
  )
  boolean stencilReadOnly();

  @JsProperty
  void setStencilReadOnly(boolean stencilReadOnly);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassDepthStencilAttachment"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 depthLoadValue(@Nonnull GPULoadOpOrFloatUnion depthLoadValue) {
      Js.<GPURenderPassDepthStencilAttachment>uncheckedCast( this ).setDepthLoadValue( depthLoadValue );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step2 depthLoadValue(@Nonnull String depthLoadValue) {
      Js.<GPURenderPassDepthStencilAttachment>uncheckedCast( this ).setDepthLoadValue( depthLoadValue );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step2 depthLoadValue(float depthLoadValue) {
      Js.<GPURenderPassDepthStencilAttachment>uncheckedCast( this ).setDepthLoadValue( depthLoadValue );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassDepthStencilAttachment"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 depthStoreOp(@GPUStoreOp @Nonnull String depthStoreOp) {
      Js.<GPURenderPassDepthStencilAttachment>uncheckedCast( this ).setDepthStoreOp( depthStoreOp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassDepthStencilAttachment"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 stencilLoadValue(@Nonnull GPULoadOpOrGPUStencilValueUnion stencilLoadValue) {
      Js.<GPURenderPassDepthStencilAttachment>uncheckedCast( this ).setStencilLoadValue( stencilLoadValue );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step4 stencilLoadValue(@Nonnull String stencilLoadValue) {
      Js.<GPURenderPassDepthStencilAttachment>uncheckedCast( this ).setStencilLoadValue( stencilLoadValue );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step4 stencilLoadValue(int stencilLoadValue) {
      Js.<GPURenderPassDepthStencilAttachment>uncheckedCast( this ).setStencilLoadValue( stencilLoadValue );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassDepthStencilAttachment"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Builder stencilStoreOp(@GPUStoreOp @Nonnull String stencilStoreOp) {
      Js.<GPURenderPassDepthStencilAttachment>uncheckedCast( this ).setStencilStoreOp( stencilStoreOp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassDepthStencilAttachment"
  )
  @ApiStatus.Experimental
  interface Builder extends GPURenderPassDepthStencilAttachment {
    @JsOverlay
    @Nonnull
    default Builder depthReadOnly(final boolean depthReadOnly) {
      setDepthReadOnly( depthReadOnly );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilReadOnly(final boolean stencilReadOnly) {
      setStencilReadOnly( stencilReadOnly );
      return this;
    }
  }
}
