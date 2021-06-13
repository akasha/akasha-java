package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type GamepadEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface GamepadEventHandler {
  void onInvoke(@Nonnull GamepadEvent event);
}
