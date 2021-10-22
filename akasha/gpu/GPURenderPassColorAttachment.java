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
      name = "resolveTarget"
  )
  GPUTextureView resolveTarget();

  @JsProperty
  void setResolveTarget(@JsNonNull GPUTextureView resolveTarget);

  @JsProperty(
      name = "loadValue"
  )
  @JsNonNull
  GPULoadOpOrGPUColorUnion loadValue();

  @JsProperty
  void setLoadValue(@JsNonNull GPULoadOpOrGPUColorUnion loadValue);

  @JsOverlay
  default void setLoadValue(@Nonnull final String loadValue) {
    setLoadValue( GPULoadOpOrGPUColorUnion.of( loadValue ) );
  }

  @JsOverlay
  default void setLoadValue(@Nonnull final GPUColor loadValue) {
    setLoadValue( GPULoadOpOrGPUColorUnion.of( loadValue ) );
  }

  @JsOverlay
  default void setLoadValue(@Nonnull final JsArray<Double> loadValue) {
    setLoadValue( GPULoadOpOrGPUColorUnion.of( loadValue ) );
  }

  @JsOverlay
  default void setLoadValue(@Nonnull final GPUColorDict loadValue) {
    setLoadValue( GPULoadOpOrGPUColorUnion.of( loadValue ) );
  }

  @JsOverlay
  default void setLoadValue(@Nonnull final double... loadValue) {
    setLoadValue( GPULoadOpOrGPUColorUnion.of( loadValue ) );
  }

  @JsProperty(
      name = "storeOp"
  )
  @GPUStoreOp
  @JsNonNull
  String storeOp();

  @JsProperty
  void setStoreOp(@GPUStoreOp @JsNonNull String storeOp);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassColorAttachment"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 loadValue(@Nonnull GPULoadOpOrGPUColorUnion loadValue) {
      Js.<GPURenderPassColorAttachment>uncheckedCast( this ).setLoadValue( loadValue );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step2 loadValue(@Nonnull String loadValue) {
      Js.<GPURenderPassColorAttachment>uncheckedCast( this ).setLoadValue( loadValue );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step2 loadValue(@Nonnull GPUColor loadValue) {
      Js.<GPURenderPassColorAttachment>uncheckedCast( this ).setLoadValue( loadValue );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step2 loadValue(@Nonnull JsArray<Double> loadValue) {
      Js.<GPURenderPassColorAttachment>uncheckedCast( this ).setLoadValue( loadValue );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step2 loadValue(@Nonnull GPUColorDict loadValue) {
      Js.<GPURenderPassColorAttachment>uncheckedCast( this ).setLoadValue( loadValue );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step2 loadValue(@Nonnull double... loadValue) {
      Js.<GPURenderPassColorAttachment>uncheckedCast( this ).setLoadValue( loadValue );
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
    default Builder resolveTarget(@Nonnull final GPUTextureView resolveTarget) {
      setResolveTarget( resolveTarget );
      return this;
    }
  }
}
