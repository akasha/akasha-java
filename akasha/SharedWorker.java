package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The SharedWorker interface represents a specific kind of worker that can be accessed from several browsing contexts, such as several windows, iframes or even workers. They implement an interface different than dedicated workers and have a different global scope, SharedWorkerGlobalScope.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorker">SharedWorker - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/workers.html#shared-workers-and-the-sharedworker-interface"># shared-workers-and-the-sharedworker-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SharedWorker"
)
public class SharedWorker extends EventTarget {
  /**
   * The AbstractWorker.onerror property of the AbstractWorker interface represents an EventHandler, that is a function to be called when the error event occurs and bubbles through the Worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorker/onerror">SharedWorker.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-abstractworker-onerror">AbstractWorker.onerror - HTML Living Standard</a>
   */
  @JsNullable
  public ErrorEventHandler onerror;

  /**
   * The SharedWorker() constructor creates a SharedWorker object that executes the script at the specified URL. This script must obey the same-origin policy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorker/SharedWorker">SharedWorker.SharedWorker - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-sharedworker">SharedWorker() - HTML Living Standard</a>
   */
  public SharedWorker(@Nonnull final String scriptURL, @Nonnull final String options) {
  }

  /**
   * The SharedWorker() constructor creates a SharedWorker object that executes the script at the specified URL. This script must obey the same-origin policy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorker/SharedWorker">SharedWorker.SharedWorker - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-sharedworker">SharedWorker() - HTML Living Standard</a>
   */
  public SharedWorker(@Nonnull final String scriptURL, @Nonnull final WorkerOptions options) {
  }

  /**
   * The SharedWorker() constructor creates a SharedWorker object that executes the script at the specified URL. This script must obey the same-origin policy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorker/SharedWorker">SharedWorker.SharedWorker - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-sharedworker">SharedWorker() - HTML Living Standard</a>
   */
  public SharedWorker(@Nonnull final String scriptURL) {
  }

  /**
   * The port property of the SharedWorker interface returns a MessagePort object used to communicate and control the shared worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorker/port">SharedWorker.port - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-sharedworker-port">AbstractWorker.onerror - HTML Living Standard</a>
   */
  @JsProperty(
      name = "port"
  )
  @Nonnull
  public native MessagePort port();

  @JsOverlay
  public final void addErrorListener(@Nonnull final ErrorEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final ErrorEventListener callback,
      final boolean useCapture) {
    addEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final ErrorEventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ErrorEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ErrorEventListener callback,
      final boolean useCapture) {
    removeEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ErrorEventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }
}
