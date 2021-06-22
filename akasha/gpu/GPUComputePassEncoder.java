package akasha.gpu;

import akasha.core.JsObject;
import akasha.core.Uint32Array;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUComputePassEncoder"
)
public class GPUComputePassEncoder extends JsObject {
  @Nullable
  public String label;

  protected GPUComputePassEncoder() {
  }

  public native void beginPipelineStatisticsQuery(@Nonnull GPUQuerySet querySet, int queryIndex);

  public native void dispatch(int x, int y, int z);

  public native void dispatch(int x, int y);

  public native void dispatch(int x);

  public native void dispatchIndirect(@Nonnull GPUBuffer indirectBuffer, int indirectOffset);

  public native void endPass();

  public native void endPipelineStatisticsQuery();

  public native void setPipeline(@Nonnull GPUComputePipeline pipeline);

  public native void writeTimestamp(@Nonnull GPUQuerySet querySet, int queryIndex);

  public native void insertDebugMarker(@Nonnull String markerLabel);

  public native void popDebugGroup();

  public native void pushDebugGroup(@Nonnull String groupLabel);

  public native void setBindGroup(int index, @Nonnull GPUBindGroup bindGroup,
      @Nonnull JsArray<Double> dynamicOffsets);

  public native void setBindGroup(int index, @Nonnull GPUBindGroup bindGroup,
      @Nonnull double[] dynamicOffsets);

  public native void setBindGroup(int index, @Nonnull GPUBindGroup bindGroup);

  public native void setBindGroup(int index, @Nonnull GPUBindGroup bindGroup,
      @Nonnull Uint32Array dynamicOffsetsData, int dynamicOffsetsDataStart,
      int dynamicOffsetsDataLength);
}
