package akasha.gpu;

import akasha.StringOrUndefinedUnion;
import akasha.core.JsObject;
import akasha.core.Uint32Array;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUComputePassEncoder"
)
public class GPUComputePassEncoder extends JsObject {
  @JsNonNull
  public StringOrUndefinedUnion label;

  protected GPUComputePassEncoder() {
  }

  public native void dispatch(int workgroupCountX, int workgroupCountY, int workgroupCountZ);

  public native void dispatch(int workgroupCountX, int workgroupCountY);

  public native void dispatch(int workgroupCountX);

  public native void dispatchIndirect(@Nonnull GPUBuffer indirectBuffer, int indirectOffset);

  public native void end();

  public native void setPipeline(@Nonnull GPUComputePipeline pipeline);

  public native void insertDebugMarker(@Nonnull String markerLabel);

  public native void popDebugGroup();

  public native void pushDebugGroup(@Nonnull String groupLabel);

  public native void setBindGroup(int index, @Nonnull GPUBindGroup bindGroup,
      @Nonnull JsArray<Double> dynamicOffsets);

  @JsOverlay
  public final void setBindGroup(final int index, @Nonnull final GPUBindGroup bindGroup,
      @Nonnull final double... dynamicOffsets) {
    _setBindGroup( index, bindGroup, dynamicOffsets );
  }

  @JsMethod(
      name = "setBindGroup"
  )
  private native void _setBindGroup(int index, @Nonnull GPUBindGroup bindGroup,
      @Nonnull double[] dynamicOffsets);

  public native void setBindGroup(int index, @Nonnull GPUBindGroup bindGroup);

  public native void setBindGroup(int index, @Nonnull GPUBindGroup bindGroup,
      @Nonnull Uint32Array dynamicOffsetsData, int dynamicOffsetsDataStart,
      int dynamicOffsetsDataLength);
}
