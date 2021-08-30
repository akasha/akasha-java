package akasha;

import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * This is the event type for fetch events dispatched on the service worker global scope. It contains information about the fetch, including the request and how the receiver will treat the response. It provides the event.respondWith() method, which allows us to provide a response to this fetch.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent">FetchEvent - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#fetchevent-interface"># fetchevent-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FetchEvent"
)
public class FetchEvent extends ExtendableEvent {
  /**
   * The FetchEvent() constructor creates a new FetchEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent/FetchEvent">FetchEvent.FetchEvent - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-fetchevent-fetchevent">FetchEvent() constructor - Service Workers</a>
   */
  public FetchEvent(@Nonnull final String type, @Nonnull final FetchEventInit eventInitDict) {
    super( null );
  }

  /**
   * The clientId read-only property of the FetchEvent interface returns the id of the Client that the current service worker is controlling.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent/clientId">FetchEvent.clientId - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-fetchevent-clientid">clientId - Service Workers</a>
   */
  @JsProperty(
      name = "clientId"
  )
  @Nonnull
  public native String clientId();

  @JsProperty(
      name = "handled"
  )
  @Nonnull
  public native Promise<Void> handled();

  /**
   * The preloadResponse read-only property of the FetchEvent interface returns a Promise that resolves to the navigation preload Response if navigation preload was triggered or undefined otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent/preloadResponse">FetchEvent.preloadResponse - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#fetch-event-preloadresponse">preloadResponse - Service Workers</a>
   */
  @JsProperty(
      name = "preloadResponse"
  )
  @Nonnull
  public native Promise<Any> preloadResponse();

  /**
   * The replacesClientId read-only property of the FetchEvent interface is the id of the client that is being replaced during a page navigation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent/replacesClientId">FetchEvent.replacesClientId - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-fetchevent-replacesclientid">replacesClientId - Service Workers</a>
   */
  @JsProperty(
      name = "replacesClientId"
  )
  @Nonnull
  public native String replacesClientId();

  /**
   * The request read-only property of the FetchEvent interface returns the Request that triggered the event handler.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent/request">FetchEvent.request - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#fetch-event-request">request - Service Workers</a>
   */
  @JsProperty(
      name = "request"
  )
  @Nonnull
  public native Request request();

  /**
   * The resultingClientId read-only property of the FetchEvent interface is the id of the client that replaces the previous client during a page navigation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent/resultingClientId">FetchEvent.resultingClientId - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-fetchevent-resultingclientid">resultingClientId - Service Workers</a>
   */
  @JsProperty(
      name = "resultingClientId"
  )
  @Nonnull
  public native String resultingClientId();

  /**
   * The respondWith() method of FetchEvent prevents the browser's default fetch handling, and allows you to provide a promise for a Response yourself.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FetchEvent/respondWith">FetchEvent.respondWith - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-fetchevent-respondwith">respondWith() - Service Workers</a>
   */
  public native void respondWith(@Nonnull Promise<Response> r);
}
