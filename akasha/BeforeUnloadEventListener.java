package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type BeforeUnloadEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface BeforeUnloadEventListener {
  /**
   * Handle event of type BeforeUnloadEvent
   */
  void handleEvent(@Nonnull BeforeUnloadEvent event);
}
