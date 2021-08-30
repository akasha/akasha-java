package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type FetchEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface FetchEventHandler {
  void onInvoke(@Nonnull FetchEvent event);
}
