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
    name = "GPUValidationError"
)
public class GPUValidationError extends JsObject {
  public GPUValidationError(@Nonnull final String message) {
  }

  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();
}
