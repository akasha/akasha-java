package akasha.gpu;

import akasha.core.JsObject;
import javax.annotation.Generated;
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
    name = "GPURenderPipeline"
)
public class GPURenderPipeline extends JsObject {
  @JsNullable
  public String label;

  protected GPURenderPipeline() {
  }

  @JsNonNull
  public native GPUBindGroupLayout getBindGroupLayout(int index);
}
