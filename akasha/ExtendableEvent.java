package akasha;

import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The ExtendableEvent interface extends the lifetime of the install and activate events dispatched on the global scope as part of the service worker lifecycle. This ensures that any functional events (like FetchEvent) are not dispatched until it upgrades database schemas and deletes the outdated cache entries.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableEvent">ExtendableEvent - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#extendableevent-interface"># extendableevent-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ExtendableEvent"
)
public class ExtendableEvent extends Event {
  /**
   * The ExtendableEvent() constructor creates a new ExtendableEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableEvent/ExtendableEvent">ExtendableEvent.ExtendableEvent - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-extendableevent-extendableevent">ExtendableEvent - Service Workers</a>
   */
  public ExtendableEvent(@Nonnull final String type,
      @Nonnull final ExtendableEventInit eventInitDict) {
    super( null );
  }

  /**
   * The ExtendableEvent() constructor creates a new ExtendableEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableEvent/ExtendableEvent">ExtendableEvent.ExtendableEvent - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-extendableevent-extendableevent">ExtendableEvent - Service Workers</a>
   */
  public ExtendableEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The ExtendableEvent.waitUntil() method tells the event dispatcher that work is ongoing. It can also be used to detect whether that work was successful. In service workers, waitUntil() tells the browser that work is ongoing until the promise settles, and it shouldn't terminate the service worker if it wants that work to complete.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableEvent/waitUntil">ExtendableEvent.waitUntil - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-extendableevent-waituntil">waitUntil() - Service Workers</a>
   */
  public native void waitUntil(@Nonnull Promise<Any> f);
}
