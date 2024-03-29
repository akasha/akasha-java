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
    name = "GPURenderBundleEncoder"
)
public class GPURenderBundleEncoder extends JsObject {
  @JsNonNull
  public StringOrUndefinedUnion label;

  protected GPURenderBundleEncoder() {
  }

  @JsNonNull
  public native GPURenderBundle finish(@Nonnull GPURenderBundleDescriptor descriptor);

  @JsNonNull
  public native GPURenderBundle finish();

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

  public native void draw(int vertexCount, int instanceCount, int firstVertex, int firstInstance);

  public native void draw(int vertexCount, int instanceCount, int firstVertex);

  public native void draw(int vertexCount, int instanceCount);

  public native void draw(int vertexCount);

  public native void drawIndexed(int indexCount, int instanceCount, int firstIndex, int baseVertex,
      int firstInstance);

  public native void drawIndexed(int indexCount, int instanceCount, int firstIndex, int baseVertex);

  public native void drawIndexed(int indexCount, int instanceCount, int firstIndex);

  public native void drawIndexed(int indexCount, int instanceCount);

  public native void drawIndexed(int indexCount);

  public native void drawIndexedIndirect(@Nonnull GPUBuffer indirectBuffer, int indirectOffset);

  public native void drawIndirect(@Nonnull GPUBuffer indirectBuffer, int indirectOffset);

  public native void setIndexBuffer(@Nonnull GPUBuffer buffer,
      @GPUIndexFormat @Nonnull String indexFormat, int offset, int size);

  public native void setIndexBuffer(@Nonnull GPUBuffer buffer,
      @GPUIndexFormat @Nonnull String indexFormat, int offset);

  public native void setIndexBuffer(@Nonnull GPUBuffer buffer,
      @GPUIndexFormat @Nonnull String indexFormat);

  public native void setPipeline(@Nonnull GPURenderPipeline pipeline);

  public native void setVertexBuffer(int slot, @Nonnull GPUBuffer buffer, int offset, int size);

  public native void setVertexBuffer(int slot, @Nonnull GPUBuffer buffer, int offset);

  public native void setVertexBuffer(int slot, @Nonnull GPUBuffer buffer);
}
