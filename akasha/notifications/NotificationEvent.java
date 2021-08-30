package akasha.notifications;

import akasha.ExtendableEvent;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The parameter passed into the onnotificationclick handler, the NotificationEvent interface represents a notification click event that is dispatched on the ServiceWorkerGlobalScope of a ServiceWorker.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NotificationEvent">NotificationEvent - MDN</a>
 * @see <a href="https://notifications.spec.whatwg.org/#notificationevent">(Notifications API) # notificationevent</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NotificationEvent"
)
public class NotificationEvent extends ExtendableEvent {
  /**
   * The NotificationEvent() constructor creates a new NotificationEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NotificationEvent/NotificationEvent">NotificationEvent.NotificationEvent - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notificationevent-notificationevent">NotificationEvent() constructor - Notifications API</a>
   */
  public NotificationEvent(@Nonnull final String type,
      @Nonnull final NotificationEventInit eventInitDict) {
    super( null );
  }

  /**
   * Returns the string ID of the notification button the user clicked. This value returns an empty string if the user clicked the notification somewhere other than an action button, or the notification does not have a button. The notification id is set during the creation of the Notification via the actions array attribute and can't be modified unless the notification is replaced.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NotificationEvent/action">NotificationEvent.action - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-actions">action - Notifications API</a>
   */
  @JsProperty(
      name = "action"
  )
  @Nonnull
  public native String action();

  /**
   * The notification read-only property of the NotificationEvent interface returns the instance of the Notification that was clicked to fire the event. The Notification provides read-only access to many properties that were set at the instantiation time of the Notification such as tag and data attributes that allow you to store information for defered use in the notificationclick event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NotificationEvent/notification">NotificationEvent.notification - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notificationevent-notification">notification - Notifications API</a>
   */
  @JsProperty(
      name = "notification"
  )
  @Nonnull
  public native Notification notification();
}
