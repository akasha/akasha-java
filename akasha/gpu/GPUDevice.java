package akasha.gpu;

import akasha.EventHandler;
import akasha.EventTarget;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUDevice"
)
public class GPUDevice extends EventTarget {
  @Nullable
  public String label;

  @Nullable
  public EventHandler onuncapturederror;

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

  @Nonnull
  public native GPUBindGroup createBindGroup(@Nonnull GPUBindGroupDescriptor descriptor);

  @Nonnull
  public native GPUBindGroupLayout createBindGroupLayout(
      @Nonnull GPUBindGroupLayoutDescriptor descriptor);

  @Nonnull
  public native GPUBuffer createBuffer(@Nonnull GPUBufferDescriptor descriptor);

  @Nonnull
  public native GPUCommandEncoder createCommandEncoder(
      @Nonnull GPUCommandEncoderDescriptor descriptor);

  @Nonnull
  public native GPUCommandEncoder createCommandEncoder();

  @Nonnull
  public native GPUComputePipeline createComputePipeline(
      @Nonnull GPUComputePipelineDescriptor descriptor);

  @Nonnull
  public native Promise<GPUComputePipeline> createComputePipelineAsync(
      @Nonnull GPUComputePipelineDescriptor descriptor);

  @Nonnull
  public native GPUPipelineLayout createPipelineLayout(
      @Nonnull GPUPipelineLayoutDescriptor descriptor);

  @Nonnull
  public native GPUQuerySet createQuerySet(@Nonnull GPUQuerySetDescriptor descriptor);

  @Nonnull
  public native GPURenderBundleEncoder createRenderBundleEncoder(
      @Nonnull GPURenderBundleEncoderDescriptor descriptor);

  @Nonnull
  public native GPURenderPipeline createRenderPipeline(
      @Nonnull GPURenderPipelineDescriptor descriptor);

  @Nonnull
  public native Promise<GPURenderPipeline> createRenderPipelineAsync(
      @Nonnull GPURenderPipelineDescriptor descriptor);

  @Nonnull
  public native GPUSampler createSampler(@Nonnull GPUSamplerDescriptor descriptor);

  @Nonnull
  public native GPUSampler createSampler();

  @Nonnull
  public native GPUShaderModule createShaderModule(@Nonnull GPUShaderModuleDescriptor descriptor);

  @Nonnull
  public native GPUTexture createTexture(@Nonnull GPUTextureDescriptor descriptor);

  public native void destroy();

  @Nonnull
  public native GPUExternalTexture importExternalTexture(
      @Nonnull GPUExternalTextureDescriptor descriptor);

  @Nonnull
  public native Promise<GPUError> popErrorScope();

  public native void pushErrorScope(@GPUErrorFilter @Nonnull String filter);
}
