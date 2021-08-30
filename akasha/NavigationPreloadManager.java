package akasha;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The NavigationPreloadManager interface of the Service Worker API provides methods for managing the preloading of resources with a service worker.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigationPreloadManager">NavigationPreloadManager - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#navigation-preload-manager"># navigation-preload-manager</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NavigationPreloadManager"
)
public class NavigationPreloadManager extends JsObject {
  protected NavigationPreloadManager() {
  }

  @JsNonNull
  public native Promise<Void> disable();

  @JsNonNull
  public native Promise<Void> enable();

  @JsNonNull
  public native Promise<NavigationPreloadState> getState();

  @JsNonNull
  public native Promise<Void> setHeaderValue(@Nonnull String value);
}
