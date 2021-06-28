package akasha.gpu;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUCommandEncoder"
)
public class GPUCommandEncoder extends JsObject {
  @Nullable
  public String label;

  protected GPUCommandEncoder() {
  }

  @Nonnull
  public native GPUComputePassEncoder beginComputePass(
      @Nonnull GPUComputePassDescriptor descriptor);

  @Nonnull
  public native GPUComputePassEncoder beginComputePass();

  @Nonnull
  public native GPURenderPassEncoder beginRenderPass(@Nonnull GPURenderPassDescriptor descriptor);

  public native void copyBufferToBuffer(@Nonnull GPUBuffer source, int sourceOffset,
      @Nonnull GPUBuffer destination, int destinationOffset, int size);

  public native void copyBufferToTexture(@Nonnull GPUImageCopyBuffer source,
      @Nonnull GPUImageCopyTexture destination, @Nonnull GPUExtent3D copySize);

  public native void copyBufferToTexture(@Nonnull GPUImageCopyBuffer source,
      @Nonnull GPUImageCopyTexture destination, @Nonnull JsArray<Double> copySize);

  public native void copyBufferToTexture(@Nonnull GPUImageCopyBuffer source,
      @Nonnull GPUImageCopyTexture destination, @Nonnull double[] copySize);

  public native void copyBufferToTexture(@Nonnull GPUImageCopyBuffer source,
      @Nonnull GPUImageCopyTexture destination, @Nonnull GPUExtent3DDict copySize);

  public native void copyTextureToBuffer(@Nonnull GPUImageCopyTexture source,
      @Nonnull GPUImageCopyBuffer destination, @Nonnull GPUExtent3D copySize);

  public native void copyTextureToBuffer(@Nonnull GPUImageCopyTexture source,
      @Nonnull GPUImageCopyBuffer destination, @Nonnull JsArray<Double> copySize);

  public native void copyTextureToBuffer(@Nonnull GPUImageCopyTexture source,
      @Nonnull GPUImageCopyBuffer destination, @Nonnull double[] copySize);

  public native void copyTextureToBuffer(@Nonnull GPUImageCopyTexture source,
      @Nonnull GPUImageCopyBuffer destination, @Nonnull GPUExtent3DDict copySize);

  public native void copyTextureToTexture(@Nonnull GPUImageCopyTexture source,
      @Nonnull GPUImageCopyTexture destination, @Nonnull GPUExtent3D copySize);

  public native void copyTextureToTexture(@Nonnull GPUImageCopyTexture source,
      @Nonnull GPUImageCopyTexture destination, @Nonnull JsArray<Double> copySize);

  public native void copyTextureToTexture(@Nonnull GPUImageCopyTexture source,
      @Nonnull GPUImageCopyTexture destination, @Nonnull double[] copySize);

  public native void copyTextureToTexture(@Nonnull GPUImageCopyTexture source,
      @Nonnull GPUImageCopyTexture destination, @Nonnull GPUExtent3DDict copySize);

  @Nonnull
  public native GPUCommandBuffer finish(@Nonnull GPUCommandBufferDescriptor descriptor);

  @Nonnull
  public native GPUCommandBuffer finish();

  public native void insertDebugMarker(@Nonnull String markerLabel);

  public native void popDebugGroup();

  public native void pushDebugGroup(@Nonnull String groupLabel);

  public native void resolveQuerySet(@Nonnull GPUQuerySet querySet, int firstQuery, int queryCount,
      @Nonnull GPUBuffer destination, int destinationOffset);

  public native void writeTimestamp(@Nonnull GPUQuerySet querySet, int queryIndex);
}
