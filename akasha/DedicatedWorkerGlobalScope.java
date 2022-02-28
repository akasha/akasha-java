package akasha;

import akasha.lang.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The DedicatedWorkerGlobalScope object (the Worker global scope) is accessible through the self keyword. Some additional global functions, namespaces objects, and constructors, not typically associated with the worker global scope, but available on it, are listed in the JavaScript Reference. See also: Functions available to workers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope">DedicatedWorkerGlobalScope - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/workers.html#dedicated-workers-and-the-dedicatedworkerglobalscope-interface"># dedicated-workers-and-the-dedicatedworkerglobalscope-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DedicatedWorkerGlobalScope"
)
public class DedicatedWorkerGlobalScope extends WorkerGlobalScope {
  /**
   * The onmessage property of the DedicatedWorkerGlobalScope interface represents an EventHandler to be called when the message event occurs and bubbles through the Worker &mdash; i.e. when a message is sent to the worker using the Worker.postMessage method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/onmessage">DedicatedWorkerGlobalScope.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-dedicatedworkerglobalscope-onmessage">DedicatedWorkerGlobalScope.onmessage - HTML Living Standard</a>
   */
  @JsNullable
  public MessageEventHandler onmessage;

  /**
   * The onmessageerror event handler of the DedicatedWorkerGlobalScope interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on the worker&mdash;that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/onmessageerror">DedicatedWorkerGlobalScope.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-dedicatedworkerglobalscope-onmessageerror">onmessageerror - HTML Living Standard</a>
   */
  @JsNullable
  public MessageEventHandler onmessageerror;

  protected DedicatedWorkerGlobalScope() {
  }

  /**
   * The name read-only property of the DedicatedWorkerGlobalScope interface returns the name that the Worker was (optionally) given when it was created. This is the name that the Worker() constructor can pass to get a reference to the DedicatedWorkerGlobalScope.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/name">DedicatedWorkerGlobalScope.name - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dedicatedworkerglobalscope-name">name - HTML Living Standard</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The close() method of the DedicatedWorkerGlobalScope interface discards any tasks queued in the DedicatedWorkerGlobalScope's event loop, effectively closing this particular scope.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/close">DedicatedWorkerGlobalScope.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dedicatedworkerglobalscope-close">close() - HTML Living Standard</a>
   */
  public native void close();

  /**
   * The postMessage() method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that spawned it. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/postMessage">DedicatedWorkerGlobalScope.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dedicatedworkerglobalscope-postmessage">DedicatedWorkerGlobalScope.postMessage() - HTML Living Standard</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull JsArray<Transferable> transfer);

  /**
   * The postMessage() method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that spawned it. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/postMessage">DedicatedWorkerGlobalScope.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dedicatedworkerglobalscope-postmessage">DedicatedWorkerGlobalScope.postMessage() - HTML Living Standard</a>
   */
  @JsOverlay
  public final void postMessage(@DoNotAutobox @Nullable final Object message,
      @Nonnull final Transferable... transfer) {
    _postMessage( message, transfer );
  }

  @JsMethod(
      name = "postMessage"
  )
  private native void _postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull Transferable[] transfer);

  /**
   * The postMessage() method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that spawned it. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/postMessage">DedicatedWorkerGlobalScope.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dedicatedworkerglobalscope-postmessage">DedicatedWorkerGlobalScope.postMessage() - HTML Living Standard</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull StructuredSerializeOptions options);

  /**
   * The postMessage() method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that spawned it. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/postMessage">DedicatedWorkerGlobalScope.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dedicatedworkerglobalscope-postmessage">DedicatedWorkerGlobalScope.postMessage() - HTML Living Standard</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message);

  public native void cancelAnimationFrame(int handle);

  public native int requestAnimationFrame(@Nonnull FrameRequestCallback callback);

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "message", Js.cast( callback ) );
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
}
