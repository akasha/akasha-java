package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type PushSubscriptionChangeEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface PushSubscriptionChangeEventListener {
  /**
   * Handle event of type PushSubscriptionChangeEvent
   */
  void handleEvent(@Nonnull PushSubscriptionChangeEvent event);
}
