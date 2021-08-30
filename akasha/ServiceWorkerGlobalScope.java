package akasha;

import akasha.notifications.NotificationEventHandler;
import akasha.notifications.NotificationEventListener;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The ServiceWorkerGlobalScope interface of the Service Worker API represents the global execution context of a service worker.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope">ServiceWorkerGlobalScope - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#serviceworkerglobalscope-interface"># serviceworkerglobalscope-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ServiceWorkerGlobalScope"
)
public class ServiceWorkerGlobalScope extends WorkerGlobalScope {
  /**
   * The onactivate property of the ServiceWorkerGlobalScope interface is an event handler fired whenever an activate event occurs (when the service worker activates). This happens after installation, when the page to be controlled by the service worker refreshes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope/onactivate">ServiceWorkerGlobalScope.onactivate - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#service-worker-global-scope-event-handlers">Event Handlers - Service Workers</a>
   */
  @JsNullable
  public ExtendableEventHandler onactivate;

  /**
   * The onfetch property of the ServiceWorkerGlobalScope interface is an event handler fired whenever a fetch event occurs (usually when the WindowOrWorkerGlobalScope.fetch() method is called.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope/onfetch">ServiceWorkerGlobalScope.onfetch - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#service-worker-global-scope-event-handlers">Event Handlers - Service Workers</a>
   */
  @JsNullable
  public FetchEventHandler onfetch;

  /**
   * The oninstall property of the ServiceWorkerGlobalScope interface is an event handler fired whenever an install event occurs (when the service worker installs). This happens before activation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope/oninstall">ServiceWorkerGlobalScope.oninstall - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#service-worker-global-scope-event-handlers">Event Handlers - Service Workers</a>
   */
  @JsNullable
  public ExtendableEventHandler oninstall;

  /**
   * The onmessage property of the ServiceWorkerGlobalScope interface is an event handler fired whenever a message event occurs &mdash; when incoming messages are received.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope/onmessage">ServiceWorkerGlobalScope.onmessage - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#service-worker-global-scope-event-handlers">Event Handlers - Service Workers</a>
   */
  @JsNullable
  public ExtendableMessageEventHandler onmessage;

  /**
   * The onmessageerror event handler of the WindowEventHandlers interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on a window&mdash;that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessageerror">WindowEventHandlers.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessageerror">onmessageerror - HTML Living Standard</a>
   */
  @JsNullable
  public MessageEventHandler onmessageerror;

  /**
   * The ServiceWorkerGlobalScope.onnotificationclick property is an event handler called whenever the notificationclick event is dispatched on the ServiceWorkerGlobalScope object, that is when a user clicks on a displayed notification spawned by ServiceWorkerRegistration.showNotification().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope/onnotificationclick">ServiceWorkerGlobalScope.onnotificationclick - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-serviceworkerglobalscope-onnotificationclick">onnotificationclick - Notifications API</a>
   */
  @JsNullable
  public NotificationEventHandler onnotificationclick;

  /**
   * The ServiceWorkerGlobalScope.onnotificationclose property is an event handler called whenever the notificationclose event is dispatched on the ServiceWorkerGlobalScope object, that is when a user closes a displayed notification spawned by ServiceWorkerRegistration.showNotification().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope/onnotificationclose">ServiceWorkerGlobalScope.onnotificationclose - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-serviceworkerglobalscope-onnotificationclose">onnotificationclick - Notifications API</a>
   */
  @JsNullable
  public NotificationEventHandler onnotificationclose;

  /**
   * The ServiceWorkerGlobalScope.onpush event of the ServiceWorkerGlobalScope interface is fired whenever a push message is received by a service worker via a push server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope/onpush">ServiceWorkerGlobalScope.onpush - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-serviceworkerglobalscope-onpush">onpush - Push API</a>
   */
  @JsNullable
  public PushEventHandler onpush;

  /**
   * The ServiceWorkerGlobalScope.onpushsubscriptionchange event of the ServiceWorkerGlobalScope interface is fired to indicate a change in push subscription that was triggered outside the application's control, e.g. when browser refresh the push subscription.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope/onpushsubscriptionchange">ServiceWorkerGlobalScope.onpushsubscriptionchange - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-serviceworkerglobalscope-onpushsubscriptionchange">onpushsubscriptionchange - Push API</a>
   */
  @JsNullable
  public PushSubscriptionChangeEventHandler onpushsubscriptionchange;

  @JsNullable
  public SyncEventHandler onsync;

  protected ServiceWorkerGlobalScope() {
  }

  /**
   * The clients read-only property of the ServiceWorkerGlobalScope interface returns the Clients object associated with the service worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope/clients">ServiceWorkerGlobalScope.clients - MDN</a>
   */
  @JsProperty(
      name = "clients"
  )
  @Nonnull
  public native Clients clients();

  /**
   * The registration read-only property of the ServiceWorkerGlobalScope interface returns a reference to the ServiceWorkerRegistration object, which represents the service worker's registration.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope/registration">ServiceWorkerGlobalScope.registration - MDN</a>
   */
  @JsProperty(
      name = "registration"
  )
  @Nonnull
  public native ServiceWorkerRegistration registration();

  @JsProperty(
      name = "serviceWorker"
  )
  @Nonnull
  public native ServiceWorker serviceWorker();

  /**
   * The ServiceWorkerGlobalScope.skipWaiting() method of the ServiceWorkerGlobalScope forces the waiting service worker to become the active service worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerGlobalScope/skipWaiting">ServiceWorkerGlobalScope.skipWaiting - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-serviceworkerglobalscope-skipwaiting">skipWaiting() - Service Workers</a>
   */
  @JsNonNull
  public native Promise<Void> skipWaiting();

  @JsOverlay
  public final void addActivateListener(@Nonnull final ExtendableEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "activate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addActivateListener(@Nonnull final ExtendableEventListener callback,
      final boolean useCapture) {
    addEventListener( "activate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addActivateListener(@Nonnull final ExtendableEventListener callback) {
    addEventListener( "activate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeActivateListener(@Nonnull final ExtendableEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "activate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeActivateListener(@Nonnull final ExtendableEventListener callback,
      final boolean useCapture) {
    removeEventListener( "activate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeActivateListener(@Nonnull final ExtendableEventListener callback) {
    removeEventListener( "activate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addInstallListener(@Nonnull final ExtendableEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "install", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addInstallListener(@Nonnull final ExtendableEventListener callback,
      final boolean useCapture) {
    addEventListener( "install", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addInstallListener(@Nonnull final ExtendableEventListener callback) {
    addEventListener( "install", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeInstallListener(@Nonnull final ExtendableEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "install", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeInstallListener(@Nonnull final ExtendableEventListener callback,
      final boolean useCapture) {
    removeEventListener( "install", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeInstallListener(@Nonnull final ExtendableEventListener callback) {
    removeEventListener( "install", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final ExtendableMessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final ExtendableMessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final ExtendableMessageEventListener callback) {
    addEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final ExtendableMessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final ExtendableMessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final ExtendableMessageEventListener callback) {
    removeEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addFetchListener(@Nonnull final FetchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "fetch", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFetchListener(@Nonnull final FetchEventListener callback,
      final boolean useCapture) {
    addEventListener( "fetch", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addFetchListener(@Nonnull final FetchEventListener callback) {
    addEventListener( "fetch", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeFetchListener(@Nonnull final FetchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "fetch", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFetchListener(@Nonnull final FetchEventListener callback,
      final boolean useCapture) {
    removeEventListener( "fetch", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeFetchListener(@Nonnull final FetchEventListener callback) {
    removeEventListener( "fetch", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addNotificationclickListener(@Nonnull final NotificationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "notificationclick", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addNotificationclickListener(@Nonnull final NotificationEventListener callback,
      final boolean useCapture) {
    addEventListener( "notificationclick", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addNotificationclickListener(
      @Nonnull final NotificationEventListener callback) {
    addEventListener( "notificationclick", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeNotificationclickListener(
      @Nonnull final NotificationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "notificationclick", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeNotificationclickListener(
      @Nonnull final NotificationEventListener callback, final boolean useCapture) {
    removeEventListener( "notificationclick", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeNotificationclickListener(
      @Nonnull final NotificationEventListener callback) {
    removeEventListener( "notificationclick", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPushListener(@Nonnull final PushEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "push", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPushListener(@Nonnull final PushEventListener callback,
      final boolean useCapture) {
    addEventListener( "push", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPushListener(@Nonnull final PushEventListener callback) {
    addEventListener( "push", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePushListener(@Nonnull final PushEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "push", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePushListener(@Nonnull final PushEventListener callback,
      final boolean useCapture) {
    removeEventListener( "push", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePushListener(@Nonnull final PushEventListener callback) {
    removeEventListener( "push", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPushsubscriptionchangeListener(
      @Nonnull final PushSubscriptionChangeEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pushsubscriptionchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPushsubscriptionchangeListener(
      @Nonnull final PushSubscriptionChangeEventListener callback, final boolean useCapture) {
    addEventListener( "pushsubscriptionchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPushsubscriptionchangeListener(
      @Nonnull final PushSubscriptionChangeEventListener callback) {
    addEventListener( "pushsubscriptionchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePushsubscriptionchangeListener(
      @Nonnull final PushSubscriptionChangeEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pushsubscriptionchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePushsubscriptionchangeListener(
      @Nonnull final PushSubscriptionChangeEventListener callback, final boolean useCapture) {
    removeEventListener( "pushsubscriptionchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePushsubscriptionchangeListener(
      @Nonnull final PushSubscriptionChangeEventListener callback) {
    removeEventListener( "pushsubscriptionchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "messageerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "messageerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "messageerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "messageerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSyncListener(@Nonnull final SyncEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "sync", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSyncListener(@Nonnull final SyncEventListener callback,
      final boolean useCapture) {
    addEventListener( "sync", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSyncListener(@Nonnull final SyncEventListener callback) {
    addEventListener( "sync", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSyncListener(@Nonnull final SyncEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "sync", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSyncListener(@Nonnull final SyncEventListener callback,
      final boolean useCapture) {
    removeEventListener( "sync", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSyncListener(@Nonnull final SyncEventListener callback) {
    removeEventListener( "sync", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addNotificationcloseListener(@Nonnull final NotificationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "notificationclose", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addNotificationcloseListener(@Nonnull final NotificationEventListener callback,
      final boolean useCapture) {
    addEventListener( "notificationclose", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addNotificationcloseListener(
      @Nonnull final NotificationEventListener callback) {
    addEventListener( "notificationclose", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeNotificationcloseListener(
      @Nonnull final NotificationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "notificationclose", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeNotificationcloseListener(
      @Nonnull final NotificationEventListener callback, final boolean useCapture) {
    removeEventListener( "notificationclose", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeNotificationcloseListener(
      @Nonnull final NotificationEventListener callback) {
    removeEventListener( "notificationclose", Js.cast( callback ) );
  }
}
