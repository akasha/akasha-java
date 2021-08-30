package akasha.gpu;

import akasha.core.BufferSource;
import akasha.core.JsObject;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUQueue"
)
public class GPUQueue extends JsObject {
  @JsNullable
  public String label;

  protected GPUQueue() {
  }

  public native void copyExternalImageToTexture(@Nonnull GPUImageCopyExternalImage source,
      @Nonnull GPUImageCopyTextureTagged destination, @Nonnull GPUExtent3D copySize);

  public native void copyExternalImageToTexture(@Nonnull GPUImageCopyExternalImage source,
      @Nonnull GPUImageCopyTextureTagged destination, @Nonnull JsArray<Double> copySize);

  public native void copyExternalImageToTexture(@Nonnull GPUImageCopyExternalImage source,
      @Nonnull GPUImageCopyTextureTagged destination, @Nonnull double[] copySize);

  public native void copyExternalImageToTexture(@Nonnull GPUImageCopyExternalImage source,
      @Nonnull GPUImageCopyTextureTagged destination, @Nonnull GPUExtent3DDict copySize);

  @JsNonNull
  public native Promise<Void> onSubmittedWorkDone();

  public native void submit(@Nonnull JsArray<GPUCommandBuffer> commandBuffers);

  public native void submit(@Nonnull GPUCommandBuffer[] commandBuffers);

  public native void writeBuffer(@Nonnull GPUBuffer buffer, int bufferOffset,
      @Nonnull BufferSource data, int dataOffset, int size);

  public native void writeBuffer(@Nonnull GPUBuffer buffer, int bufferOffset,
      @Nonnull BufferSource data, int dataOffset);

  public native void writeBuffer(@Nonnull GPUBuffer buffer, int bufferOffset,
      @Nonnull BufferSource data);

  public native void writeTexture(@Nonnull GPUImageCopyTexture destination,
      @Nonnull BufferSource data, @Nonnull GPUImageDataLayout dataLayout,
      @Nonnull GPUExtent3D size);

  public native void writeTexture(@Nonnull GPUImageCopyTexture destination,
      @Nonnull BufferSource data, @Nonnull GPUImageDataLayout dataLayout,
      @Nonnull JsArray<Double> size);

  public native void writeTexture(@Nonnull GPUImageCopyTexture destination,
      @Nonnull BufferSource data, @Nonnull GPUImageDataLayout dataLayout, @Nonnull double[] size);

  public native void writeTexture(@Nonnull GPUImageCopyTexture destination,
      @Nonnull BufferSource data, @Nonnull GPUImageDataLayout dataLayout,
      @Nonnull GPUExtent3DDict size);
}
