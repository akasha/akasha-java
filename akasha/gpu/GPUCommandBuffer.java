package akasha.gpu;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUCommandBuffer"
)
public class GPUCommandBuffer extends JsObject {
  @JsNullable
  public String label;

  protected GPUCommandBuffer() {
  }

  @JsProperty(
      name = "executionTime"
  )
  @Nonnull
  public native Promise<Double> executionTime();
}
