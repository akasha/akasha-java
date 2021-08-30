package akasha;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The ExtendableMessageEvent interface of the Service Worker API represents the event object of a message event fired on a service worker (when a message is received on the ServiceWorkerGlobalScope from another context) &mdash; extends the lifetime of such events.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableMessageEvent">ExtendableMessageEvent - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#extendablemessageevent-interface"># extendablemessageevent-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ExtendableMessageEvent"
)
public class ExtendableMessageEvent extends ExtendableEvent {
  /**
   * The ExtendableMessageEvent() constructor creates a new ExtendableMessageEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableMessageEvent/ExtendableMessageEvent">ExtendableMessageEvent.ExtendableMessageEvent - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-extendablemessageevent-extendablemessageevent">ExtendableMessageEvent() - Service Workers</a>
   */
  public ExtendableMessageEvent(@Nonnull final String type,
      @Nonnull final ExtendableMessageEventInit eventInitDict) {
    super( null );
  }

  /**
   * The ExtendableMessageEvent() constructor creates a new ExtendableMessageEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableMessageEvent/ExtendableMessageEvent">ExtendableMessageEvent.ExtendableMessageEvent - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-extendablemessageevent-extendablemessageevent">ExtendableMessageEvent() - Service Workers</a>
   */
  public ExtendableMessageEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The data read-only property of the ExtendableMessageEvent interface returns the event's data. It can be any data type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableMessageEvent/data">ExtendableMessageEvent.data - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-extendablemessageevent-data">ExtendableMessageEvent.data - Service Workers</a>
   */
  @JsProperty(
      name = "data"
  )
  @Nullable
  public native Any data();

  /**
   * The lastEventID read-only property of the ExtendableMessageEvent interface represents, in server-sent events, the last event ID of the event source. This is an empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableMessageEvent/lastEventId">ExtendableMessageEvent.lastEventId - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-extendablemessageevent-lasteventid">ExtendableMessageEvent.lastEventId - Service Workers</a>
   */
  @JsProperty(
      name = "lastEventId"
  )
  @Nonnull
  public native String lastEventId();

  /**
   * The origin read-only property of the ExtendableMessageEvent interface returns the origin of the Client that sent the message.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableMessageEvent/origin">ExtendableMessageEvent.origin - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-extendablemessageevent-origin">ExtendableMessageEvent.origin - Service Workers</a>
   */
  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  /**
   * The ports read-only property of the ExtendableMessageEvent interface returns the array containing the MessagePort objects representing the ports of the associated message channel (the channel the message is being sent through.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableMessageEvent/ports">ExtendableMessageEvent.ports - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-extendablemessageevent-ports">ExtendableMessageEvent.ports - Service Workers</a>
   */
  @JsProperty(
      name = "ports"
  )
  @Nonnull
  public native JsArray<MessagePort> ports();

  /**
   * The source read-only property of the ExtendableMessageEvent interface returns a reference to the Client object from which the message was sent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ExtendableMessageEvent/source">ExtendableMessageEvent.source - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-extendablemessageevent-source">ExtendableMessageEvent.source - Service Workers</a>
   */
  @JsProperty(
      name = "source"
  )
  @Nullable
  public native ClientOrServiceWorkerOrMessagePortUnion source();
}
