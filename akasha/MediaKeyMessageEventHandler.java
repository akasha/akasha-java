package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type MediaKeyMessageEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface MediaKeyMessageEventHandler {
  void onInvoke(@Nonnull MediaKeyMessageEvent event);
}
