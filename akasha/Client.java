package akasha;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Client interface represents an executable context such as a Worker, or a SharedWorker. Window clients are represented by the more-specific WindowClient. You can get Client/WindowClient objects from methods such as Clients.matchAll() and Clients.get().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Client">Client - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#client-interface"># client-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Client"
)
public class Client extends JsObject {
  protected Client() {
  }

  /**
   * The frameType read-only property of the Client interface indicates the type of browsing context of the current Client. This value can be one of &quot;auxiliary&quot;, &quot;top-level&quot;, &quot;nested&quot;, or &quot;none&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Client/frameType">Client.frameType - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#client-frametype">frameType - Service Workers</a>
   */
  @JsProperty(
      name = "frameType"
  )
  @Nonnull
  @FrameType
  public native String frameType();

  /**
   * The id read-only property of the Client interface returns the universally unique identifier of the Client object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Client/id">Client.id - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#client-id">id - Service Workers</a>
   */
  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  /**
   * The type read-only property of the Client interface indicates the type of client the service worker is controlling.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Client/type">Client.type - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#client-type">type - Service Workers</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  @ClientType
  public native String type();

  /**
   * The url read-only property of the Client interface returns the URL of the current service worker client.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Client/url">Client.url - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#client-url">url - Service Workers</a>
   */
  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();

  /**
   * The postMessage() method of the Client interface allows a service worker to send a message to a client (a Window, Worker, or SharedWorker). The message is received in the &quot;message&quot; event on navigator.serviceWorker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Client/postMessage">Client.postMessage - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-client-postmessage-message-options">postMessage() - Service Workers</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull JsArray<Transferable> transfer);

  /**
   * The postMessage() method of the Client interface allows a service worker to send a message to a client (a Window, Worker, or SharedWorker). The message is received in the &quot;message&quot; event on navigator.serviceWorker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Client/postMessage">Client.postMessage - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-client-postmessage-message-options">postMessage() - Service Workers</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull Transferable[] transfer);

  /**
   * The postMessage() method of the Client interface allows a service worker to send a message to a client (a Window, Worker, or SharedWorker). The message is received in the &quot;message&quot; event on navigator.serviceWorker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Client/postMessage">Client.postMessage - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-client-postmessage-message-options">postMessage() - Service Workers</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull PostMessageOptions options);

  /**
   * The postMessage() method of the Client interface allows a service worker to send a message to a client (a Window, Worker, or SharedWorker). The message is received in the &quot;message&quot; event on navigator.serviceWorker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Client/postMessage">Client.postMessage - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-client-postmessage-message-options">postMessage() - Service Workers</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message);
}
