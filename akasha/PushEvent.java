package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PushEvent interface of the Push API represents a push message that has been received. This event is sent to the global scope of a ServiceWorker. It contains the information sent from an application server to a PushSubscription.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushEvent">PushEvent - MDN</a>
 * @see <a href="https://w3c.github.io/push-api/#pushevent-interface"># pushevent-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PushEvent"
)
public class PushEvent extends ExtendableEvent {
  /**
   * The PushEvent() constructor creates a new PushEvent object. Note that the this constructor is exposed only to a service worker context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushEvent/PushEvent">PushEvent.PushEvent - MDN</a>
   */
  public PushEvent(@Nonnull final String type, @Nonnull final PushEventInit eventInitDict) {
    super( null );
  }

  /**
   * The PushEvent() constructor creates a new PushEvent object. Note that the this constructor is exposed only to a service worker context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushEvent/PushEvent">PushEvent.PushEvent - MDN</a>
   */
  public PushEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The data read-only property of the PushEvent interface returns a reference to a PushMessageData object containing data sent to the PushSubscription.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushEvent/data">PushEvent.data - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushevent-data">data - Push API</a>
   */
  @JsProperty(
      name = "data"
  )
  @Nullable
  public native PushMessageData data();
}
