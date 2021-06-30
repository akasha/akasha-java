package akasha.gpu;

import akasha.RenderingContext;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUCanvasContext"
)
public class GPUCanvasContext extends JsObject implements RenderingContext {
  protected GPUCanvasContext() {
  }

  @Nonnull
  public native GPUSwapChain configureSwapChain(@Nonnull GPUSwapChainDescriptor descriptor);

  @GPUTextureFormat
  @Nonnull
  public native String getSwapChainPreferredFormat(@Nonnull GPUAdapter adapter);
}
