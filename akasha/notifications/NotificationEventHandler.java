package akasha.notifications;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type NotificationEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface NotificationEventHandler {
  void onInvoke(@Nonnull NotificationEvent event);
}
