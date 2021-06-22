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
    name = "GPURenderPipeline"
)
public class GPURenderPipeline extends JsObject {
  @Nullable
  public String label;

  protected GPURenderPipeline() {
  }

  @Nonnull
  public native GPUBindGroupLayout getBindGroupLayout(int index);
}