package akasha.gpu;

import akasha.AddEventListenerOptions;
import akasha.EventListenerOptions;
import akasha.EventTarget;
import akasha.StringOrUndefinedUnion;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUDevice"
)
public class GPUDevice extends EventTarget {
  @JsNonNull
  public StringOrUndefinedUnion label;

  @JsNullable
  public GPUUncapturedErrorEventHandler onuncapturederror;

  protected GPUDevice() {
  }

  @JsProperty(
      name = "features"
  )
  @Nonnull
  public native GPUSupportedFeatures features();

  @JsProperty(
      name = "limits"
  )
  @Nonnull
  public native GPUSupportedLimits limits();

  @JsProperty(
      name = "lost"
  )
  @Nonnull
  public native Promise<GPUDeviceLostInfo> lost();

  @JsProperty(
      name = "queue"
  )
  @Nonnull
  public native GPUQueue queue();

  @JsNonNull
  public native GPUBindGroup createBindGroup(@Nonnull GPUBindGroupDescriptor descriptor);

  @JsNonNull
  public native GPUBindGroupLayout createBindGroupLayout(
      @Nonnull GPUBindGroupLayoutDescriptor descriptor);

  @JsNonNull
  public native GPUBuffer createBuffer(@Nonnull GPUBufferDescriptor descriptor);

  @JsNonNull
  public native GPUCommandEncoder createCommandEncoder(
      @Nonnull GPUCommandEncoderDescriptor descriptor);

  @JsNonNull
  public native GPUCommandEncoder createCommandEncoder();

  @JsNonNull
  public native GPUComputePipeline createComputePipeline(
      @Nonnull GPUComputePipelineDescriptor descriptor);

  @JsNonNull
  public native Promise<GPUComputePipeline> createComputePipelineAsync(
      @Nonnull GPUComputePipelineDescriptor descriptor);

  @JsNonNull
  public native GPUPipelineLayout createPipelineLayout(
      @Nonnull GPUPipelineLayoutDescriptor descriptor);

  @JsNonNull
  public native GPUQuerySet createQuerySet(@Nonnull GPUQuerySetDescriptor descriptor);

  @JsNonNull
  public native GPURenderBundleEncoder createRenderBundleEncoder(
      @Nonnull GPURenderBundleEncoderDescriptor descriptor);

  @JsNonNull
  public native GPURenderPipeline createRenderPipeline(
      @Nonnull GPURenderPipelineDescriptor descriptor);

  @JsNonNull
  public native Promise<GPURenderPipeline> createRenderPipelineAsync(
      @Nonnull GPURenderPipelineDescriptor descriptor);

  @JsNonNull
  public native GPUSampler createSampler(@Nonnull GPUSamplerDescriptor descriptor);

  @JsNonNull
  public native GPUSampler createSampler();

  @JsNonNull
  public native GPUShaderModule createShaderModule(@Nonnull GPUShaderModuleDescriptor descriptor);

  @JsNonNull
  public native GPUTexture createTexture(@Nonnull GPUTextureDescriptor descriptor);

  public native void destroy();

  @JsNonNull
  public native GPUExternalTexture importExternalTexture(
      @Nonnull GPUExternalTextureDescriptor descriptor);

  @JsNonNull
  public native Promise<GPUError> popErrorScope();

  public native void pushErrorScope(@GPUErrorFilter @Nonnull String filter);

  @JsOverlay
  public final void addUncapturederrorListener(
      @Nonnull final GPUUncapturedErrorEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "uncapturederror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUncapturederrorListener(
      @Nonnull final GPUUncapturedErrorEventListener callback, final boolean useCapture) {
    addEventListener( "uncapturederror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addUncapturederrorListener(
      @Nonnull final GPUUncapturedErrorEventListener callback) {
    addEventListener( "uncapturederror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeUncapturederrorListener(
      @Nonnull final GPUUncapturedErrorEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "uncapturederror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUncapturederrorListener(
      @Nonnull final GPUUncapturedErrorEventListener callback, final boolean useCapture) {
    removeEventListener( "uncapturederror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeUncapturederrorListener(
      @Nonnull final GPUUncapturedErrorEventListener callback) {
    removeEventListener( "uncapturederror", Js.cast( callback ) );
  }
}
