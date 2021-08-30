package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type ExtendableEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface ExtendableEventHandler {
  void onInvoke(@Nonnull ExtendableEvent event);
}
