package akasha;

import akasha.core.JsObject;
import akasha.core.Symbol;
import akasha.crypto.Crypto;
import akasha.idb.IDBFactory;
import akasha.lang.JsArray;
import akasha.perf.Performance;
import akasha.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

/**
 * The DedicatedWorkerGlobalScope object (the Worker global scope) is accessible through the self keyword. Some additional global functions, namespaces objects, and constructors, not typically associated with the worker global scope, but available on it, are listed in the JavaScript Reference. See also: Functions available to workers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope">DedicatedWorkerGlobalScope - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/workers.html#dedicated-workers-and-the-dedicatedworkerglobalscope-interface">(HTML) # dedicated-workers-and-the-dedicatedworkerglobalscope-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "goog.global"
)
public final class DedicatedWorkerGlobal {
  /**
   * The onmessageerror event handler of the DedicatedWorkerGlobalScope interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on the worker&mdash;that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/onmessageerror">DedicatedWorkerGlobalScope.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-dedicatedworkerglobalscope-onmessageerror">onmessageerror - HTML Living Standard</a>
   */
  @JsNullable
  public static MessageEventHandler onmessageerror;

  /**
   * The onerror property of the WorkerGlobalScope interface represents an EventHandler to be called when the error event occurs and bubbles through the Worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/onerror">WorkerGlobalScope.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-workerglobalscope-onerror">WorkerGlobalScope.onerror - HTML Living Standard</a>
   */
  @JsNullable
  public static OnErrorEventHandler onerror;

  /**
   * The onlanguagechange property of the WorkerGlobalScope interface represents an EventHandler to be called when the languagechange event occurs and bubbles through the Worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/onlanguagechange">WorkerGlobalScope.onlanguagechange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-workerglobalscope-onlanguagechange">WorkerGlobalScope.onlanguagechange - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onlanguagechange;

  /**
   * The onoffline property of the WorkerGlobalScope interface represents an EventHandler to be called when the offline event occurs and bubbles through the Worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/onoffline">WorkerGlobalScope.onoffline - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-workerglobalscope-onoffline">WorkerGlobalScope.onoffline - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onoffline;

  /**
   * The ononline property of the WorkerGlobalScope interface represents an EventHandler to be called when the online event occurs and bubbles through the Worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/ononline">WorkerGlobalScope.ononline - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-workerglobalscope-ononline">WorkerGlobalScope.ononline - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler ononline;

  @JsNullable
  public static PromiseRejectionEventHandler onrejectionhandled;

  @JsNullable
  public static PromiseRejectionEventHandler onunhandledrejection;

  private DedicatedWorkerGlobal() {
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
  @JsNonNull
  public static native String name();

  /**
   * The onmessage property of the DedicatedWorkerGlobalScope interface represents an EventHandler to be called when the message event occurs and bubbles through the Worker &mdash; i.e. when a message is sent to the worker using the Worker.postMessage method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/onmessage">DedicatedWorkerGlobalScope.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-dedicatedworkerglobalscope-onmessage">DedicatedWorkerGlobalScope.onmessage - HTML Living Standard</a>
   */
  @JsOverlay
  public static final MessageEventHandler onmessage() {
    return Js.uncheckedCast( _onmessage() );
  }

  @JsProperty(
      name = "onmessage"
  )
  @JsNullable
  private static native ExtendableMessageEventHandlerOrMessageEventHandlerUnion _onmessage();

  @JsProperty(
      name = "onmessage"
  )
  public static native void setOnmessage(@JsNullable final MessageEventHandler value);

  /**
   * The close() method of the DedicatedWorkerGlobalScope interface discards any tasks queued in the DedicatedWorkerGlobalScope's event loop, effectively closing this particular scope.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/close">DedicatedWorkerGlobalScope.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dedicatedworkerglobalscope-close">close() - HTML Living Standard</a>
   */
  public static native void close();

  /**
   * The postMessage() method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that spawned it. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/postMessage">DedicatedWorkerGlobalScope.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dedicatedworkerglobalscope-postmessage">DedicatedWorkerGlobalScope.postMessage() - HTML Living Standard</a>
   */
  public static native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull JsArray<Transferable> transfer);

  /**
   * The postMessage() method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that spawned it. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/postMessage">DedicatedWorkerGlobalScope.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dedicatedworkerglobalscope-postmessage">DedicatedWorkerGlobalScope.postMessage() - HTML Living Standard</a>
   */
  public static native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull Transferable[] transfer);

  /**
   * The postMessage() method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that spawned it. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/postMessage">DedicatedWorkerGlobalScope.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dedicatedworkerglobalscope-postmessage">DedicatedWorkerGlobalScope.postMessage() - HTML Living Standard</a>
   */
  public static native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull StructuredSerializeOptions options);

  /**
   * The postMessage() method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that spawned it. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DedicatedWorkerGlobalScope/postMessage">DedicatedWorkerGlobalScope.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dedicatedworkerglobalscope-postmessage">DedicatedWorkerGlobalScope.postMessage() - HTML Living Standard</a>
   */
  public static native void postMessage(@DoNotAutobox @Nullable Object message);

  public static native void cancelAnimationFrame(int handle);

  public static native int requestAnimationFrame(@Nonnull FrameRequestCallback callback);

  @JsOverlay
  public static void addMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addMessageListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeMessageListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "messageerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addMessageerrorListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "messageerror", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "messageerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeMessageerrorListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "messageerror", Js.cast( callback ) );
  }

  /**
   * The caches read-only property of the WindowOrWorkerGlobalScope interface returns the CacheStorage object associated with the current context. This object enables functionality such as storing assets for offline use, and generating custom responses to requests.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/caches">WorkerGlobalScope.caches - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#self-caches">caches - Service Workers</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/">Service Workers</a>
   */
  @JsProperty(
      name = "caches"
  )
  @JsNonNull
  public static native CacheStorage caches();

  /**
   * The crossOriginIsolated read-only property of the WindowOrWorkerGlobalScope interface returns a boolean value that indicates whether a SharedArrayBuffer can be sent via a Window.postMessage() call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/crossOriginIsolated">WindowOrWorkerGlobalScope.crossOriginIsolated - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-crossoriginisolated">crossOriginIsolated - HTML Living Standard</a>
   */
  @JsProperty(
      name = "crossOriginIsolated"
  )
  public static native boolean crossOriginIsolated();

  @JsProperty(
      name = "crypto"
  )
  @JsNonNull
  public static native Crypto crypto();

  @JsOverlay
  public static boolean isIndexedDBSupported() {
    return "true".equals( System.getProperty( "akasha.is__WorkerGlobalScope_indexedDB__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__WorkerGlobalScope_indexedDB__supported" ) ) ? false : Js.global().has( "indexedDB" );
  }

  /**
   * The indexedDB read-only property of the WindowOrWorkerGlobalScope mixin provides a mechanism for applications to asynchronously access the capabilities of indexed databases.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/indexedDB">WorkerGlobalScope.indexedDB - MDN</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-windoworworkerglobalscope-indexeddb">indexedDB - Indexed Database API Draft</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-windoworworkerglobalscope-indexeddb">indexedDB - Indexed Database API 2.0</a>
   */
  @JsProperty(
      name = "indexedDB"
  )
  @JsNonNull
  public static native IDBFactory indexedDB();

  /**
   * The isSecureContext read-only property of the WindowOrWorkerGlobalScope interface returns a boolean indicating whether the current context is secure (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/isSecureContext">WindowOrWorkerGlobalScope.isSecureContext - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-secure-contexts/#dom-windoworworkerglobalscope-issecurecontext">WindowOrWorkerGlobalScope.isSecureContext - Secure Contexts</a>
   */
  @JsProperty(
      name = "isSecureContext"
  )
  public static native boolean isSecureContext();

  /**
   * The location read-only property of the WorkerGlobalScope interface returns the WorkerLocation associated with the worker. It is a specific location object, mostly a subset of the Location for browsing scopes, but adapted to workers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/location">WorkerGlobalScope.location - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-workerglobalscope-location">location - HTML Living Standard</a>
   */
  @JsOverlay
  public static final WorkerLocation location() {
    return Js.uncheckedCast( _location() );
  }

  @JsProperty(
      name = "location"
  )
  @JsNonNull
  private static native LocationOrWorkerLocationUnion _location();

  /**
   * The navigator read-only property of the WorkerGlobalScope interface returns the WorkerNavigator associated with the worker. It is a specific navigator object, mostly a subset of the Navigator for browsing scopes, but adapted to workers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/navigator">WorkerGlobalScope.navigator - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-worker-navigator">navigator - HTML Living Standard</a>
   */
  @JsOverlay
  public static final WorkerNavigator navigator() {
    return Js.uncheckedCast( _navigator() );
  }

  @JsProperty(
      name = "navigator"
  )
  @JsNonNull
  private static native NavigatorOrWorkerNavigatorUnion _navigator();

  /**
   * The origin read-only property of the WindowOrWorkerGlobalScope interface returns the origin of the global scope, serialized as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/origin">WindowOrWorkerGlobalScope.origin - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-origin">WindowOrWorkerGlobalScope.origin - HTML Living Standard</a>
   */
  @JsProperty(
      name = "origin"
  )
  @JsNonNull
  public static native String origin();

  /**
   * The  performance read-only property of the WorkerGlobalScope interface returns a Performance object to be used on the worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/performance">WorkerGlobalScope.performance - MDN</a>
   * @see <a href="https://www.w3.org/TR/hr-time-2/#the-performance-attribute">performance - High Resolution Time Level 2</a>
   */
  @JsProperty(
      name = "performance"
  )
  @JsNonNull
  public static native Performance performance();

  /**
   * The self read-only property of the WorkerGlobalScope interface returns a reference to the WorkerGlobalScope itself. Most of the time it is a specific scope like DedicatedWorkerGlobalScope,  SharedWorkerGlobalScope, or ServiceWorkerGlobalScope.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/self">WorkerGlobalScope.self - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-workerglobalscope-self">self - HTML Living Standard</a>
   */
  @JsOverlay
  public static final WorkerGlobalScope self() {
    return Js.uncheckedCast( _self() );
  }

  @JsProperty(
      name = "self"
  )
  @JsNonNull
  private static native WindowOrWorkerGlobalScopeUnion _self();

  /**
   * The importScripts() method of the WorkerGlobalScope interface synchronously imports one or more scripts into the worker's scope.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/importScripts">WorkerGlobalScope.importScripts - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-workerglobalscope-importscripts">importScripts() - HTML Living Standard</a>
   */
  public static native void importScripts(@Nonnull String... urls);

  /**
   * The WindowOrWorkerGlobalScope.atob() function decodes a string of data which has been encoded using Base64 encoding. You can use the btoa() method to encode and transmit data which may otherwise cause communication problems, then transmit it and use the atob() method to decode the data again. For example, you can encode, transmit, and decode control characters such as ASCII values 0 through 31.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/atob">WorkerGlobalScope.atob - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-atob">WindowOrWorkerGlobalScope.atob() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/#dom-windowbase64-atob">WindowBase64.atob() - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/#dom-windowbase64-atob">WindowBase64.atob() - HTML5</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public static native String atob(@Nonnull String data);

  /**
   * The WindowOrWorkerGlobalScope.btoa() method creates a Base64-encoded ASCII string from a binary string (i.e., a String object in which each character in the string is treated as a byte of binary data).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/btoa">WorkerGlobalScope.btoa - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-btoa">WindowOrWorkerGlobalScope.btoa() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/#dom-windowbase64-btoa">WindowBase64.btoa() - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/#dom-windowbase64-btoa">WindowBase64.btoa() - HTML5</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public static native String btoa(@Nonnull String data);

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/clearInterval">WorkerGlobalScope.clearInterval - MDN</a>
   */
  public static native void clearInterval(int handle);

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/clearInterval">WorkerGlobalScope.clearInterval - MDN</a>
   */
  public static native void clearInterval();

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/clearTimeout">WorkerGlobalScope.clearTimeout - MDN</a>
   */
  public static native void clearTimeout(int handle);

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/clearTimeout">WorkerGlobalScope.clearTimeout - MDN</a>
   */
  public static native void clearTimeout();

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">createImageBitmap - HTML Living Standard</a>
   */
  @JsNonNull
  public static native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">createImageBitmap - HTML Living Standard</a>
   */
  @JsNonNull
  public static native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">createImageBitmap - HTML Living Standard</a>
   */
  @JsNonNull
  public static native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image,
      int sx, int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">createImageBitmap - HTML Living Standard</a>
   */
  @JsNonNull
  public static native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image,
      int sx, int sy, int sw, int sh);

  /**
   * The queueMicrotask() method, which is exposed on the Window or Worker interface, queues a microtask to be executed at a safe time prior to control returning to the browser's event loop.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/queueMicrotask">WindowOrWorkerGlobalScope.queueMicrotask - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#microtask-queuing">self.queueMicrotask() - HTML Living Standard</a>
   */
  public static native void queueMicrotask(@Nonnull VoidFunction callback);

  public static native void reportError(@DoNotAutobox @Nullable Object e);

  @JsNullable
  public static native Any structuredClone(@DoNotAutobox @Nullable Object value,
      @Nonnull StructuredSerializeOptions options);

  @JsNullable
  public static native Any structuredClone(@DoNotAutobox @Nullable Object value);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public static native Promise<Response> fetch(@Nonnull RequestInfo input,
      @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public static native Promise<Response> fetch(@Nonnull Request input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public static native Promise<Response> fetch(@Nonnull String input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public static native Promise<Response> fetch(@Nonnull RequestInfo input);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public static native Promise<Response> fetch(@Nonnull Request input);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public static native Promise<Response> fetch(@Nonnull String input);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/setInterval">WorkerGlobalScope.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowOrWorkerGlobalScope.setInterval() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowTimers.setInterval() - HTML Living Standard</a>
   */
  public static native int setInterval(@Nonnull TimerHandler handler, int timeout);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/setInterval">WorkerGlobalScope.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowOrWorkerGlobalScope.setInterval() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowTimers.setInterval() - HTML Living Standard</a>
   */
  public static native int setInterval(@Nonnull TimerHandler handler);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/setTimeout">WorkerGlobalScope.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowOrWorkerGlobalScope.setTimeout() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowTimers.setTimeout() - HTML Living Standard</a>
   */
  public static native int setTimeout(@Nonnull TimerHandler handler, int timeout);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/setTimeout">WorkerGlobalScope.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowOrWorkerGlobalScope.setTimeout() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowTimers.setTimeout() - HTML Living Standard</a>
   */
  public static native int setTimeout(@Nonnull TimerHandler handler);

  @JsOverlay
  public static void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "unhandledrejection", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    addEventListener( "unhandledrejection", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    addEventListener( "unhandledrejection", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "unhandledrejection", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    removeEventListener( "unhandledrejection", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    removeEventListener( "unhandledrejection", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "rejectionhandled", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    addEventListener( "rejectionhandled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    addEventListener( "rejectionhandled", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "rejectionhandled", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    removeEventListener( "rejectionhandled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    removeEventListener( "rejectionhandled", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addLanguagechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "languagechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addLanguagechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "languagechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addLanguagechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "languagechange", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeLanguagechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "languagechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeLanguagechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "languagechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeLanguagechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "languagechange", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addOfflineListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "offline", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addOfflineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "offline", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addOfflineListener(@Nonnull final EventListener callback) {
    addEventListener( "offline", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeOfflineListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "offline", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeOfflineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "offline", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeOfflineListener(@Nonnull final EventListener callback) {
    removeEventListener( "offline", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addOnlineListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "online", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addOnlineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "online", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addOnlineListener(@Nonnull final EventListener callback) {
    addEventListener( "online", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeOnlineListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "online", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeOnlineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "online", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeOnlineListener(@Nonnull final EventListener callback) {
    removeEventListener( "online", Js.cast( callback ) );
  }

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-addeventlistener">EventTarget.addEventListener() - DOM</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-addeventlistener">EventTarget.addEventListener() - DOM4</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-addEventListener">EventTarget.addEventListener() - Document Object Model (DOM) Level 2 Events Specification</a>
   */
  public static native void addEventListener(@Nonnull String type, @Nullable EventListener callback,
      @Nonnull AddEventListenerOptions options);

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-addeventlistener">EventTarget.addEventListener() - DOM</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-addeventlistener">EventTarget.addEventListener() - DOM4</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-addEventListener">EventTarget.addEventListener() - Document Object Model (DOM) Level 2 Events Specification</a>
   */
  public static native void addEventListener(@Nonnull String type, @Nullable EventListener callback,
      boolean options);

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-addeventlistener">EventTarget.addEventListener() - DOM</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-addeventlistener">EventTarget.addEventListener() - DOM4</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-addEventListener">EventTarget.addEventListener() - Document Object Model (DOM) Level 2 Events Specification</a>
   */
  public static native void addEventListener(@Nonnull String type,
      @Nullable EventListener callback);

  /**
   * Dispatches an Event at the specified EventTarget, (synchronously) invoking the affected EventListeners in the appropriate order. The normal event processing rules (including the capturing and optional bubbling phase) also apply to events dispatched manually with dispatchEvent().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/dispatchEvent">EventTarget.dispatchEvent - MDN</a>
   */
  public static native boolean dispatchEvent(@Nonnull Event event);

  /**
   * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously registered with EventTarget.addEventListener(). The event listener to be removed is identified using a combination of the event type, the event listener function itself, and various optional options that may affect the matching process; see Matching event listeners for removal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">EventTarget.removeEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-removeeventlistener">EventTarget.removeEventListener() - DOM</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-removeeventlistener">EventTarget.removeEventListener() - DOM4</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-removeEventListener">EventTarget.removeEventListener() - Document Object Model (DOM) Level 2 Events Specification</a>
   */
  public static native void removeEventListener(@Nonnull String type,
      @Nullable EventListener callback, @Nonnull EventListenerOptions options);

  /**
   * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously registered with EventTarget.addEventListener(). The event listener to be removed is identified using a combination of the event type, the event listener function itself, and various optional options that may affect the matching process; see Matching event listeners for removal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">EventTarget.removeEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-removeeventlistener">EventTarget.removeEventListener() - DOM</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-removeeventlistener">EventTarget.removeEventListener() - DOM4</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-removeEventListener">EventTarget.removeEventListener() - Document Object Model (DOM) Level 2 Events Specification</a>
   */
  public static native void removeEventListener(@Nonnull String type,
      @Nullable EventListener callback, boolean options);

  /**
   * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously registered with EventTarget.addEventListener(). The event listener to be removed is identified using a combination of the event type, the event listener function itself, and various optional options that may affect the matching process; see Matching event listeners for removal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">EventTarget.removeEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-removeeventlistener">EventTarget.removeEventListener() - DOM</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-removeeventlistener">EventTarget.removeEventListener() - DOM4</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-removeEventListener">EventTarget.removeEventListener() - Document Object Model (DOM) Level 2 Events Specification</a>
   */
  public static native void removeEventListener(@Nonnull String type,
      @Nullable EventListener callback);

  /**
   * The hasOwnProperty() method returns a boolean indicating whether the object has the specified property as its own property (as opposed to inheriting it).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/hasOwnProperty">Object.hasOwnProperty - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.hasownproperty">(ECMAScript) # sec-object.prototype.hasownproperty</a>
   */
  @HasNoSideEffects
  public static native boolean hasOwnProperty(@Nonnull Symbol prop);

  /**
   * The hasOwnProperty() method returns a boolean indicating whether the object has the specified property as its own property (as opposed to inheriting it).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/hasOwnProperty">Object.hasOwnProperty - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.hasownproperty">(ECMAScript) # sec-object.prototype.hasownproperty</a>
   */
  @HasNoSideEffects
  public static native boolean hasOwnProperty(@Nonnull String prop);

  /**
   * The propertyIsEnumerable() method returns a Boolean indicating whether the specified property is enumerable and is the object's own property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/propertyIsEnumerable">Object.propertyIsEnumerable - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.propertyisenumerable">(ECMAScript) # sec-object.prototype.propertyisenumerable</a>
   */
  @HasNoSideEffects
  public static native boolean propertyIsEnumerable(@Nonnull String prop);

  /**
   * The isPrototypeOf() method checks if an object exists in another object's prototype chain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/isPrototypeOf">Object.isPrototypeOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.isprototypeof">(ECMAScript) # sec-object.prototype.isprototypeof</a>
   */
  @HasNoSideEffects
  public static native boolean isPrototypeOf(@Nonnull JsObject obj);

  /**
   * The valueOf() method returns the primitive value of the specified object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/valueOf">Object.valueOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.valueof">(ECMAScript) # sec-object.prototype.valueof</a>
   */
  @JsMethod(
      name = "valueOf"
  )
  @JsNullable
  public static native Any valueOf_();

  /**
   * The toString() method returns a string representing the object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/toString">Object.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.tostring">(ECMAScript) # sec-object.prototype.tostring</a>
   */
  @JsMethod(
      name = "toString"
  )
  @HasNoSideEffects
  @JsNonNull
  public static native String toString_();
}
