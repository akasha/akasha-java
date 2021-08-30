package akasha;

import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WindowClient interface of the ServiceWorker API represents the scope of a service worker client that is a document in a browsing context, controlled by an active worker. The service worker client independently selects and uses a service worker for its own loading and sub-resources.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowClient">WindowClient - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#windowclient"># windowclient</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WindowClient"
)
public class WindowClient extends Client {
  protected WindowClient() {
  }

  @JsProperty(
      name = "ancestorOrigins"
  )
  @Nonnull
  public native JsArray<String> ancestorOrigins();

  /**
   * The focused read-only property of the WindowClient interface is a Boolean that indicates whether the current client has focus.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowClient/focused">WindowClient.focused - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-windowclient-focused">WindowClient: focused - Service Workers</a>
   */
  @JsProperty(
      name = "focused"
  )
  public native boolean focused();

  /**
   * The visibilityState read-only property of the WindowClient interface indicates the visibility of the current client. This value can be one of &quot;hidden&quot;, &quot;visible&quot;, or &quot;prerender&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowClient/visibilityState">WindowClient.visibilityState - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-windowclient-visibilitystate">visibilityState - Service Workers</a>
   */
  @JsProperty(
      name = "visibilityState"
  )
  @Nonnull
  @VisibilityState
  public native String visibilityState();

  /**
   * The focus() method of the WindowClient interface gives user input focus to the current client and returns a Promise that resolves to the existing WindowClient.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowClient/focus">WindowClient.focus - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-windowclient-focus">focus() - Service Workers</a>
   */
  @JsNonNull
  public native Promise<WindowClient> focus();

  /**
   * The navigate() method of the WindowClient interface loads a specified URL into a controlled client page then returns a Promise that resolves to the existing WindowClient.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowClient/navigate">WindowClient.navigate - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-windowclient-navigate">navigate() - Service Workers</a>
   */
  @JsNonNull
  public native Promise<WindowClient> navigate(@Nonnull String url);
}
