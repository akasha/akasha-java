package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type GPUUncapturedErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface GPUUncapturedErrorEventHandler {
  void onInvoke(@Nonnull GPUUncapturedErrorEvent event);
}
