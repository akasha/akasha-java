package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type PushSubscriptionChangeEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface PushSubscriptionChangeEventHandler {
  void onInvoke(@Nonnull PushSubscriptionChangeEvent event);
}
