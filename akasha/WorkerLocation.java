package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WorkerLocation interface defines the absolute location of the script executed by the Worker. Such an object is initialized for each worker and is available via the WorkerGlobalScope.location property obtained by calling self.location.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerLocation">WorkerLocation - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/workers.html#worker-locations"># worker-locations</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WorkerLocation"
)
public class WorkerLocation extends JsObject {
  protected WorkerLocation() {
  }

  /**
   * The URLUtilsReadOnly.hash read-only property returns a DOMString containing a '#' followed by the fragment identifier of the URL. The hash is not percent encoded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerLocation/hash">WorkerLocation.hash - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-url-hash">URLUtilsReadOnly.hash - URL</a>
   */
  @JsProperty(
      name = "hash"
  )
  @Nonnull
  public native String hash();

  /**
   * The URLUtilsReadOnly.host read-only property returns a DOMString containing the host, that is the hostname, a ':', and the port of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerLocation/host">WorkerLocation.host - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-url-host">URLUtilsReadOnly.host - URL</a>
   */
  @JsProperty(
      name = "host"
  )
  @Nonnull
  public native String host();

  /**
   * The URLUtilsReadOnly.hostname read-only property returns a DOMString containing the domain of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerLocation/hostname">WorkerLocation.hostname - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-url-hostname">URLUtilsReadOnly.hostname - URL</a>
   */
  @JsProperty(
      name = "hostname"
  )
  @Nonnull
  public native String hostname();

  /**
   * The URLUtilsReadOnly.href read-only property is a stringifier that returns a DOMString containing the whole URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerLocation/href">WorkerLocation.href - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-url-href">URLUtilsReadOnly.href - URL</a>
   */
  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native String href();

  /**
   * The URLUtilsReadOnly.origin read-only property is a DOMString containing the Unicode serialization of the origin of the represented URL, that is, for http and https, the scheme followed by '://', followed by the domain, followed by ':', followed by the port (the default port, 80 and 443 respectively, if explicitely specified). For URL using file: scheme, the value is browser dependant.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerLocation/origin">WorkerLocation.origin - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-url-origin">URLUtilsReadOnly.origin - URL</a>
   */
  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  /**
   * The URLUtilsReadOnly.pathname read-only property returns a DOMString containing an initial '/' followed by the path of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerLocation/pathname">WorkerLocation.pathname - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-url-pathname">URLUtilsReadOnly.pathname - URL</a>
   */
  @JsProperty(
      name = "pathname"
  )
  @Nonnull
  public native String pathname();

  /**
   * The URLUtilsReadOnly.port read-only property returns a DOMString containing the port number of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerLocation/port">WorkerLocation.port - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-url-port">URLUtilsReadOnly.port - URL</a>
   */
  @JsProperty(
      name = "port"
  )
  @Nonnull
  public native String port();

  /**
   * The URLUtilsReadOnly.protocol read-only property returns a DOMString containing the protocol scheme of the URL, including the final ':'.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerLocation/protocol">WorkerLocation.protocol - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-url-protocol">URLUtilsReadOnly.protocol - URL</a>
   */
  @JsProperty(
      name = "protocol"
  )
  @Nonnull
  public native String protocol();

  /**
   * The URLUtilsReadOnly.search read-only property returns a DOMString containing a '?' followed by the parameters of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerLocation/search">WorkerLocation.search - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-url-search">URLUtilsReadOnly.search - URL</a>
   */
  @JsProperty(
      name = "search"
  )
  @Nonnull
  public native String search();
}
