package akasha.gpu;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUTexture"
)
public class GPUTexture extends JsObject {
  @Nullable
  public String label;

  protected GPUTexture() {
  }

  @Nonnull
  public native GPUTextureView createView(@Nonnull GPUTextureViewDescriptor descriptor);

  @Nonnull
  public native GPUTextureView createView();

  public native void destroy();
}
