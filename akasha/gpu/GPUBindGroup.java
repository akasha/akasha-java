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
    name = "GPUBindGroup"
)
public class GPUBindGroup extends JsObject {
  @JsNonNull
  public StringOrUndefinedUnion label;

  protected GPUBindGroup() {
  }
}
