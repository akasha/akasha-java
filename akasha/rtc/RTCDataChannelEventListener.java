package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type RTCDataChannelEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface RTCDataChannelEventListener {
  /**
   * Handle event of type RTCDataChannelEvent
   */
  void handleEvent(@Nonnull RTCDataChannelEvent event);
}
