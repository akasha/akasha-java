package akasha.gpu;

import akasha.StringOrUndefinedUnion;
import akasha.core.JsObject;
import akasha.promise.Promise;
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
    name = "GPUShaderModule"
)
public class GPUShaderModule extends JsObject {
  @JsNonNull
  public StringOrUndefinedUnion label;

  protected GPUShaderModule() {
  }

  @JsNonNull
  public native Promise<GPUCompilationInfo> compilationInfo();
}
