package akasha.gpu;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUCommandBuffer"
)
public class GPUCommandBuffer extends JsObject {
  @Nullable
  public String label;

  protected GPUCommandBuffer() {
  }

  @JsProperty(
      name = "executionTime"
  )
  @Nonnull
  public native Promise<Double> executionTime();
}
