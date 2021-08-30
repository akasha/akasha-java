package akasha;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Clients interface provides access to Client objects. Access it via self.clients within a service worker.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clients">Clients - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#clients-interface"># clients-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Clients"
)
public class Clients extends JsObject {
  protected Clients() {
  }

  /**
   * The claim() method of the Clients interface allows an active service worker to set itself as the controller for all clients within its scope. This triggers a &quot;controllerchange&quot; event on navigator.serviceWorker in any clients that become controlled by this service worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clients/claim">Clients.claim - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#clients-claim">claim() - Service Workers</a>
   */
  @JsNonNull
  public native Promise<Void> claim();

  /**
   * The get() method of the Clients interface gets a service worker client matching a given id and returns it in a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clients/get">Clients.get - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-clients-get">get() - Service Workers</a>
   */
  @JsNonNull
  public native Promise<ClientOrUndefinedUnion> get(@Nonnull String id);

  /**
   * The matchAll() method of the Clients interface returns a Promise for a list of service worker Client objects. Include the options parameter to return all service worker clients whose origin is the same as the associated service worker's origin. If options are not included, the method returns only the service worker clients controlled by the service worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clients/matchAll">Clients.matchAll - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#clients-matchall">Clients: matchall - Service Workers</a>
   */
  @JsNonNull
  public native Promise<JsArray<Client>> matchAll(@Nonnull ClientQueryOptions options);

  /**
   * The matchAll() method of the Clients interface returns a Promise for a list of service worker Client objects. Include the options parameter to return all service worker clients whose origin is the same as the associated service worker's origin. If options are not included, the method returns only the service worker clients controlled by the service worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clients/matchAll">Clients.matchAll - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#clients-matchall">Clients: matchall - Service Workers</a>
   */
  @JsNonNull
  public native Promise<JsArray<Client>> matchAll();

  /**
   * The openWindow() method of the Clients interface creates a new top level browsing context and loads a given URL. If the calling script doesn't have permission to show popups, openWindow() will throw an InvalidAccessError.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clients/openWindow">Clients.openWindow - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#clients-openwindow">Clients: openWindow - Service Workers</a>
   */
  @JsNonNull
  public native Promise<WindowClient> openWindow(@Nonnull String url);
}
