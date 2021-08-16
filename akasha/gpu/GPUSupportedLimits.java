package akasha.gpu;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUSupportedLimits"
)
public class GPUSupportedLimits extends JsObject {
  protected GPUSupportedLimits() {
  }

  @JsProperty(
      name = "maxBindGroups"
  )
  public native int maxBindGroups();

  @JsProperty(
      name = "maxComputeInvocationsPerWorkgroup"
  )
  public native int maxComputeInvocationsPerWorkgroup();

  @JsProperty(
      name = "maxComputeWorkgroupSizeX"
  )
  public native int maxComputeWorkgroupSizeX();

  @JsProperty(
      name = "maxComputeWorkgroupSizeY"
  )
  public native int maxComputeWorkgroupSizeY();

  @JsProperty(
      name = "maxComputeWorkgroupSizeZ"
  )
  public native int maxComputeWorkgroupSizeZ();

  @JsProperty(
      name = "maxComputeWorkgroupStorageSize"
  )
  public native int maxComputeWorkgroupStorageSize();

  @JsProperty(
      name = "maxComputeWorkgroupsPerDimension"
  )
  public native int maxComputeWorkgroupsPerDimension();

  @JsProperty(
      name = "maxDynamicStorageBuffersPerPipelineLayout"
  )
  public native int maxDynamicStorageBuffersPerPipelineLayout();

  @JsProperty(
      name = "maxDynamicUniformBuffersPerPipelineLayout"
  )
  public native int maxDynamicUniformBuffersPerPipelineLayout();

  @JsProperty(
      name = "maxInterStageShaderComponents"
  )
  public native int maxInterStageShaderComponents();

  @JsProperty(
      name = "maxSampledTexturesPerShaderStage"
  )
  public native int maxSampledTexturesPerShaderStage();

  @JsProperty(
      name = "maxSamplersPerShaderStage"
  )
  public native int maxSamplersPerShaderStage();

  @JsProperty(
      name = "maxStorageBufferBindingSize"
  )
  public native int maxStorageBufferBindingSize();

  @JsProperty(
      name = "maxStorageBuffersPerShaderStage"
  )
  public native int maxStorageBuffersPerShaderStage();

  @JsProperty(
      name = "maxStorageTexturesPerShaderStage"
  )
  public native int maxStorageTexturesPerShaderStage();

  @JsProperty(
      name = "maxTextureArrayLayers"
  )
  public native int maxTextureArrayLayers();

  @JsProperty(
      name = "maxTextureDimension1D"
  )
  public native int maxTextureDimension1D();

  @JsProperty(
      name = "maxTextureDimension2D"
  )
  public native int maxTextureDimension2D();

  @JsProperty(
      name = "maxTextureDimension3D"
  )
  public native int maxTextureDimension3D();

  @JsProperty(
      name = "maxUniformBufferBindingSize"
  )
  public native int maxUniformBufferBindingSize();

  @JsProperty(
      name = "maxUniformBuffersPerShaderStage"
  )
  public native int maxUniformBuffersPerShaderStage();

  @JsProperty(
      name = "maxVertexAttributes"
  )
  public native int maxVertexAttributes();

  @JsProperty(
      name = "maxVertexBufferArrayStride"
  )
  public native int maxVertexBufferArrayStride();

  @JsProperty(
      name = "maxVertexBuffers"
  )
  public native int maxVertexBuffers();

  @JsProperty(
      name = "minStorageBufferOffsetAlignment"
  )
  public native int minStorageBufferOffsetAlignment();

  @JsProperty(
      name = "minUniformBufferOffsetAlignment"
  )
  public native int minUniformBufferOffsetAlignment();
}
