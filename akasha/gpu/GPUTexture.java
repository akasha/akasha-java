package akasha.gpu;

import akasha.StringOrUndefinedUnion;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUTexture"
)
public class GPUTexture extends JsObject {
  @JsNonNull
  public StringOrUndefinedUnion label;

  protected GPUTexture() {
  }

  @JsNonNull
  public native GPUTextureView createView(@Nonnull GPUTextureViewDescriptor descriptor);

  @JsNonNull
  public native GPUTextureView createView();

  public native void destroy();
}
