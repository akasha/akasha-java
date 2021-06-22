package akasha.gpu;

import akasha.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUUncapturedErrorEvent"
)
public class GPUUncapturedErrorEvent extends Event {
  public GPUUncapturedErrorEvent(@Nonnull final String type,
      @Nonnull final GPUUncapturedErrorEventInit gpuUncapturedErrorEventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "error"
  )
  @Nonnull
  public native GPUError error();
}
