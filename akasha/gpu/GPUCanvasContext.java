package akasha.gpu;

import akasha.HTMLCanvasElementOrOffscreenCanvasUnion;
import akasha.OffscreenRenderingContext;
import akasha.RenderingContext;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUCanvasContext"
)
public class GPUCanvasContext extends JsObject implements OffscreenRenderingContext, RenderingContext {
  protected GPUCanvasContext() {
  }

  @JsProperty(
      name = "canvas"
  )
  @Nonnull
  public native HTMLCanvasElementOrOffscreenCanvasUnion canvas();

  public native void configure(@Nonnull GPUCanvasConfiguration configuration);

  @JsNonNull
  public native GPUTexture getCurrentTexture();

  @GPUTextureFormat
  @JsNonNull
  public native String getPreferredFormat(@Nonnull GPUAdapter adapter);

  public native void unconfigure();
}
