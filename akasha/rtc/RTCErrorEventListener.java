package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type RTCErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface RTCErrorEventListener {
  /**
   * Handle event of type RTCErrorEvent
   */
  void handleEvent(@Nonnull RTCErrorEvent event);
}
