package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type ExtendableMessageEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface ExtendableMessageEventHandler {
  void onInvoke(@Nonnull ExtendableMessageEvent event);
}
