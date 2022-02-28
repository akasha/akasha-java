package akasha.gpu;

import akasha.StringOrUndefinedUnion;
import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
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
  @JsNonNull
  public StringOrUndefinedUnion label;

  protected GPURenderPipeline() {
  }

  @JsNonNull
  public native GPUBindGroupLayout getBindGroupLayout(int index);
}
