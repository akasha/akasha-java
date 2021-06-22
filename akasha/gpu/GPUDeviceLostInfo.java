package akasha.gpu;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUDeviceLostInfo"
)
public class GPUDeviceLostInfo extends JsObject {
  protected GPUDeviceLostInfo() {
  }

  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();

  @JsProperty(
      name = "reason"
  )
  @Nonnull
  public native GPUDeviceLostReasonOrUndefinedUnion reason();
}
