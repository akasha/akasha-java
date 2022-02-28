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
    name = "GPURenderPassColorAttachment"
)
@ApiStatus.Experimental
public interface GPURenderPassColorAttachment {
  @JsOverlay
  @Nonnull
  static Step1 view(@Nonnull final GPUTextureView view) {
    final Builder $gpuRenderPassColorAttachment = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuRenderPassColorAttachment.setView( view );
    return Js.uncheckedCast( $gpuRenderPassColorAttachment );
  }

  @JsProperty(
      name = "view"
  )
  @JsNonNull
  GPUTextureView view();

  @JsProperty
  void setView(@JsNonNull GPUTextureView view);

  @JsProperty(
      name = "loadOp"
  )
  @GPULoadOp
  @JsNonNull
  String loadOp();

  @JsProperty
  void setLoadOp(@GPULoadOp @JsNonNull String loadOp);

  @JsProperty(
      name = "storeOp"
  )
  @GPUStoreOp
  @JsNonNull
  String storeOp();

  @JsProperty
  void setStoreOp(@GPUStoreOp @JsNonNull String storeOp);

  @JsProperty(
      name = "clearValue"
  )
  GPUColor clearValue();

  @JsProperty
  void setClearValue(@JsNonNull GPUColor clearValue);

  @JsOverlay
  default void setClearValue(@Nonnull final JsArray<Double> clearValue) {
    setClearValue( GPUColor.of( clearValue ) );
  }

  @JsOverlay
  default void setClearValue(@Nonnull final GPUColorDict clearValue) {
    setClearValue( GPUColor.of( clearValue ) );
  }

  @JsOverlay
  default void setClearValue(@Nonnull final double... clearValue) {
    setClearValue( GPUColor.of( clearValue ) );
  }

  @JsProperty(
      name = "resolveTarget"
  )
  GPUTextureView resolveTarget();

  @JsProperty
  void setResolveTarget(@JsNonNull GPUTextureView resolveTarget);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassColorAttachment"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 loadOp(@GPULoadOp @Nonnull String loadOp) {
      Js.<GPURenderPassColorAttachment>uncheckedCast( this ).setLoadOp( loadOp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassColorAttachment"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder storeOp(@GPUStoreOp @Nonnull String storeOp) {
      Js.<GPURenderPassColorAttachment>uncheckedCast( this ).setStoreOp( storeOp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassColorAttachment"
  )
  @ApiStatus.Experimental
  interface Builder extends GPURenderPassColorAttachment {
    @JsOverlay
    @Nonnull
    default Builder clearValue(@Nonnull final GPUColor clearValue) {
      setClearValue( clearValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder clearValue(@Nonnull final JsArray<Double> clearValue) {
      setClearValue( clearValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder clearValue(@Nonnull final GPUColorDict clearValue) {
      setClearValue( clearValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder clearValue(@Nonnull final double... clearValue) {
      setClearValue( clearValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder resolveTarget(@Nonnull final GPUTextureView resolveTarget) {
      setResolveTarget( resolveTarget );
      return this;
    }
  }
}
