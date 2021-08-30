package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type AnimationPlaybackEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface AnimationPlaybackEventHandler {
  void onInvoke(@Nonnull AnimationPlaybackEvent event);
}
