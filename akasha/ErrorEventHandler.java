package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type ErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface ErrorEventHandler {
  void onInvoke(@Nonnull ErrorEvent event);
}
