package akasha.gpu;

import akasha.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
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
