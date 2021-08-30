package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type MediaQueryListEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface MediaQueryListEventHandler {
  void onInvoke(@Nonnull MediaQueryListEvent event);
}
