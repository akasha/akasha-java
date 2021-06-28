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
    name = "GPUPresentationContext"
)
public class GPUPresentationContext extends JsObject implements RenderingContext {
  protected GPUPresentationContext() {
  }

  public native void configure(@Nonnull GPUPresentationConfiguration configuration);

  @Nonnull
  public native GPUTexture getCurrentTexture();

  @GPUTextureFormat
  @Nonnull
  public native String getPreferredFormat(@Nonnull GPUAdapter adapter);

  public native void unconfigure();
}
