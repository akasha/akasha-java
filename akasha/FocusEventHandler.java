package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type FocusEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface FocusEventHandler {
  void onInvoke(@Nonnull FocusEvent event);
}
