package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type PushEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface PushEventHandler {
  void onInvoke(@Nonnull PushEvent event);
}
