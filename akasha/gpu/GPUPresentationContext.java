package akasha.gpu;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUPresentationContext"
)
public class GPUPresentationContext extends JsObject {
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
