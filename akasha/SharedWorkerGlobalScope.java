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
 * The SharedWorkerGlobalScope object (the SharedWorker global scope) is accessible through the self keyword. Some additional global functions, namespaces objects, and constructors, not typically associated with the worker global scope, but available on it, are listed in the JavaScript Reference. See the complete list of functions available to workers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorkerGlobalScope">SharedWorkerGlobalScope - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/workers.html#shared-workers-and-the-sharedworkerglobalscope-interface"># shared-workers-and-the-sharedworkerglobalscope-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SharedWorkerGlobalScope"
)
public class SharedWorkerGlobalScope extends WorkerGlobalScope {
  /**
   * The onconnect property of the SharedWorkerGlobalScope interface is an event handler representing the code to be called when the connect event is raised &mdash; that is, when a MessagePort connection is opened between the associated SharedWorker and the main thread.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorkerGlobalScope/onconnect">SharedWorkerGlobalScope.onconnect - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-sharedworkerglobalscope-onconnect">onconnect - HTML Living Standard</a>
   */
  @JsNullable
  public MessageEventHandler onconnect;

  protected SharedWorkerGlobalScope() {
  }

  /**
   * The name read-only property of the SharedWorkerGlobalScope interface returns the name that the SharedWorker was (optionally) given when it was created. This is the name that the SharedWorker() constructor can pass to get a reference to the SharedWorkerGlobalScope.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorkerGlobalScope/name">SharedWorkerGlobalScope.name - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-sharedworkerglobalscope-name">name - HTML Living Standard</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The close() method of the SharedWorkerGlobalScope interface discards any tasks queued in the SharedWorkerGlobalScope's event loop, effectively closing this particular scope.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorkerGlobalScope/close">SharedWorkerGlobalScope.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-sharedworkerglobalscope-close">close() - HTML Living Standard</a>
   */
  public native void close();

  @JsOverlay
  public final void addConnectListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "connect", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addConnectListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "connect", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addConnectListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "connect", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeConnectListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "connect", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeConnectListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "connect", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeConnectListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "connect", Js.cast( callback ) );
  }
}
