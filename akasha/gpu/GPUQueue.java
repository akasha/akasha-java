package akasha.gpu;

import akasha.core.BufferSource;
import akasha.core.JsObject;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
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

  @JsOverlay
  public final void copyExternalImageToTexture(@Nonnull final GPUImageCopyExternalImage source,
      @Nonnull final GPUImageCopyTextureTagged destination, @Nonnull final double... copySize) {
    _copyExternalImageToTexture( source, destination, copySize );
  }

  @JsMethod(
      name = "copyExternalImageToTexture"
  )
  private native void _copyExternalImageToTexture(@Nonnull GPUImageCopyExternalImage source,
      @Nonnull GPUImageCopyTextureTagged destination, @Nonnull double[] copySize);

  public native void copyExternalImageToTexture(@Nonnull GPUImageCopyExternalImage source,
      @Nonnull GPUImageCopyTextureTagged destination, @Nonnull GPUExtent3DDict copySize);

  @JsNonNull
  public native Promise<Void> onSubmittedWorkDone();

  public native void submit(@Nonnull JsArray<GPUCommandBuffer> commandBuffers);

  @JsOverlay
  public final void submit(@Nonnull final GPUCommandBuffer... commandBuffers) {
    _submit( commandBuffers );
  }

  @JsMethod(
      name = "submit"
  )
  private native void _submit(@Nonnull GPUCommandBuffer[] commandBuffers);

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

  @JsOverlay
  public final void writeTexture(@Nonnull final GPUImageCopyTexture destination,
      @Nonnull final BufferSource data, @Nonnull final GPUImageDataLayout dataLayout,
      @Nonnull final double... size) {
    _writeTexture( destination, data, dataLayout, size );
  }

  @JsMethod(
      name = "writeTexture"
  )
  private native void _writeTexture(@Nonnull GPUImageCopyTexture destination,
      @Nonnull BufferSource data, @Nonnull GPUImageDataLayout dataLayout, @Nonnull double[] size);

  public native void writeTexture(@Nonnull GPUImageCopyTexture destination,
      @Nonnull BufferSource data, @Nonnull GPUImageDataLayout dataLayout,
      @Nonnull GPUExtent3DDict size);
}
