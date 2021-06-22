package akasha.gpu;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUShaderModule"
)
public class GPUShaderModule extends JsObject {
  @Nullable
  public String label;

  protected GPUShaderModule() {
  }

  @Nonnull
  public native Promise<GPUCompilationInfo> compilationInfo();
}
