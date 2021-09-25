package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type GPUUncapturedErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface GPUUncapturedErrorEventListener {
  /**
   * Handle event of type GPUUncapturedErrorEvent
   */
  void handleEvent(@Nonnull GPUUncapturedErrorEvent event);
}
