package akasha;

import akasha.crypto.Crypto;
import akasha.idb.IDBFactory;
import akasha.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

/**
 * The WorkerGlobalScope interface of the Web Workers API is an interface representing the scope of any worker. Workers have no browsing context; this scope contains the information usually conveyed by Window objects &mdash; in this case event handlers, the console or the associated WorkerNavigator object. Each WorkerGlobalScope has its own event loop.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope">WorkerGlobalScope - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/workers.html#the-workerglobalscope-common-interface"># the-workerglobalscope-common-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WorkerGlobalScope"
)
public class WorkerGlobalScope extends EventTarget {
  /**
   * The onerror property of the WorkerGlobalScope interface represents an EventHandler to be called when the error event occurs and bubbles through the Worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/onerror">WorkerGlobalScope.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-workerglobalscope-onerror">WorkerGlobalScope.onerror - HTML Living Standard</a>
   */
  @JsNullable
  public OnErrorEventHandler onerror;

  /**
   * The onlanguagechange property of the WorkerGlobalScope interface represents an EventHandler to be called when the languagechange event occurs and bubbles through the Worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/onlanguagechange">WorkerGlobalScope.onlanguagechange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-workerglobalscope-onlanguagechange">WorkerGlobalScope.onlanguagechange - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler onlanguagechange;

  /**
   * The onoffline property of the WorkerGlobalScope interface represents an EventHandler to be called when the offline event occurs and bubbles through the Worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/onoffline">WorkerGlobalScope.onoffline - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-workerglobalscope-onoffline">WorkerGlobalScope.onoffline - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler onoffline;

  /**
   * The ononline property of the WorkerGlobalScope interface represents an EventHandler to be called when the online event occurs and bubbles through the Worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/ononline">WorkerGlobalScope.ononline - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-workerglobalscope-ononline">WorkerGlobalScope.ononline - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler ononline;

  @JsNullable
  public PromiseRejectionEventHandler onrejectionhandled;

  @JsNullable
  public PromiseRejectionEventHandler onunhandledrejection;

  protected WorkerGlobalScope() {
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
  @Nonnull
  public native CacheStorage caches();

  /**
   * The crossOriginIsolated read-only property of the WindowOrWorkerGlobalScope interface returns a boolean value that indicates whether a SharedArrayBuffer can be sent via a Window.postMessage() call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/crossOriginIsolated">WindowOrWorkerGlobalScope.crossOriginIsolated - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-crossoriginisolated">crossOriginIsolated - HTML Living Standard</a>
   */
  @JsProperty(
      name = "crossOriginIsolated"
  )
  public native boolean crossOriginIsolated();

  @JsProperty(
      name = "crypto"
  )
  @Nonnull
  public native Crypto crypto();

  @JsOverlay
  public final boolean isIndexedDBSupported() {
    return "true".equals( System.getProperty( "akasha.is__WorkerGlobalScope_indexedDB__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__WorkerGlobalScope_indexedDB__supported" ) ) ? false : Js.asPropertyMap( this ).has( "indexedDB" );
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
  @Nonnull
  public native IDBFactory indexedDB();

  /**
   * The isSecureContext read-only property of the WindowOrWorkerGlobalScope interface returns a boolean indicating whether the current context is secure (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/isSecureContext">WindowOrWorkerGlobalScope.isSecureContext - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-secure-contexts/#dom-windoworworkerglobalscope-issecurecontext">WindowOrWorkerGlobalScope.isSecureContext - Secure Contexts</a>
   */
  @JsProperty(
      name = "isSecureContext"
  )
  public native boolean isSecureContext();

  /**
   * The location read-only property of the WorkerGlobalScope interface returns the WorkerLocation associated with the worker. It is a specific location object, mostly a subset of the Location for browsing scopes, but adapted to workers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/location">WorkerGlobalScope.location - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-workerglobalscope-location">location - HTML Living Standard</a>
   */
  @JsProperty(
      name = "location"
  )
  @Nonnull
  public native WorkerLocation location();

  /**
   * The navigator read-only property of the WorkerGlobalScope interface returns the WorkerNavigator associated with the worker. It is a specific navigator object, mostly a subset of the Navigator for browsing scopes, but adapted to workers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/navigator">WorkerGlobalScope.navigator - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-worker-navigator">navigator - HTML Living Standard</a>
   */
  @JsProperty(
      name = "navigator"
  )
  @Nonnull
  public native WorkerNavigator navigator();

  /**
   * The origin read-only property of the WindowOrWorkerGlobalScope interface returns the origin of the global scope, serialized as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/origin">WindowOrWorkerGlobalScope.origin - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-origin">WindowOrWorkerGlobalScope.origin - HTML Living Standard</a>
   */
  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  /**
   * The  performance read-only property of the WorkerGlobalScope interface returns a Performance object to be used on the worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/performance">WorkerGlobalScope.performance - MDN</a>
   * @see <a href="https://www.w3.org/TR/hr-time-2/#the-performance-attribute">performance - High Resolution Time Level 2</a>
   */
  @JsProperty(
      name = "performance"
  )
  @Nonnull
  public native Performance performance();

  /**
   * The self read-only property of the WorkerGlobalScope interface returns a reference to the WorkerGlobalScope itself. Most of the time it is a specific scope like DedicatedWorkerGlobalScope,  SharedWorkerGlobalScope, or ServiceWorkerGlobalScope.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/self">WorkerGlobalScope.self - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-workerglobalscope-self">self - HTML Living Standard</a>
   */
  @JsProperty(
      name = "self"
  )
  @Nonnull
  public native WorkerGlobalScope self();

  /**
   * The importScripts() method of the WorkerGlobalScope interface synchronously imports one or more scripts into the worker's scope.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/importScripts">WorkerGlobalScope.importScripts - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-workerglobalscope-importscripts">importScripts() - HTML Living Standard</a>
   */
  public native void importScripts(@Nonnull String... urls);

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
  public native String atob(@Nonnull String data);

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
  public native String btoa(@Nonnull String data);

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/clearInterval">WorkerGlobalScope.clearInterval - MDN</a>
   */
  public native void clearInterval(int id);

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/clearInterval">WorkerGlobalScope.clearInterval - MDN</a>
   */
  public native void clearInterval();

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/clearTimeout">WorkerGlobalScope.clearTimeout - MDN</a>
   */
  public native void clearTimeout(int id);

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/clearTimeout">WorkerGlobalScope.clearTimeout - MDN</a>
   */
  public native void clearTimeout();

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">createImageBitmap - HTML Living Standard</a>
   */
  @JsNonNull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">createImageBitmap - HTML Living Standard</a>
   */
  @JsNonNull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">createImageBitmap - HTML Living Standard</a>
   */
  @JsNonNull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">createImageBitmap - HTML Living Standard</a>
   */
  @JsNonNull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image, int sx,
      int sy, int sw, int sh);

  /**
   * The queueMicrotask() method, which is exposed on the Window or Worker interface, queues a microtask to be executed at a safe time prior to control returning to the browser's event loop.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/queueMicrotask">WindowOrWorkerGlobalScope.queueMicrotask - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#microtask-queuing">self.queueMicrotask() - HTML Living Standard</a>
   */
  public native void queueMicrotask(@Nonnull VoidFunction callback);

  public native void reportError(@DoNotAutobox @Nullable Object e);

  @JsNullable
  public native Any structuredClone(@DoNotAutobox @Nullable Object value,
      @Nonnull StructuredSerializeOptions options);

  @JsNullable
  public native Any structuredClone(@DoNotAutobox @Nullable Object value);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public native Promise<Response> fetch(@Nonnull RequestInfo input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public native Promise<Response> fetch(@Nonnull Request input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public native Promise<Response> fetch(@Nonnull String input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public native Promise<Response> fetch(@Nonnull RequestInfo input);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public native Promise<Response> fetch(@Nonnull Request input);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/fetch">WorkerGlobalScope.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public native Promise<Response> fetch(@Nonnull String input);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/setInterval">WorkerGlobalScope.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowOrWorkerGlobalScope.setInterval() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowTimers.setInterval() - HTML Living Standard</a>
   */
  public native int setInterval(@Nonnull TimerHandler handler, int timeout);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/setInterval">WorkerGlobalScope.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowOrWorkerGlobalScope.setInterval() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowTimers.setInterval() - HTML Living Standard</a>
   */
  public native int setInterval(@Nonnull TimerHandler handler);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/setTimeout">WorkerGlobalScope.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowOrWorkerGlobalScope.setTimeout() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowTimers.setTimeout() - HTML Living Standard</a>
   */
  public native int setTimeout(@Nonnull TimerHandler handler, int timeout);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/setTimeout">WorkerGlobalScope.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowOrWorkerGlobalScope.setTimeout() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowTimers.setTimeout() - HTML Living Standard</a>
   */
  public native int setTimeout(@Nonnull TimerHandler handler);

  @JsOverlay
  public final void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "unhandledrejection", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    addEventListener( "unhandledrejection", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    addEventListener( "unhandledrejection", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "unhandledrejection", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    removeEventListener( "unhandledrejection", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    removeEventListener( "unhandledrejection", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "rejectionhandled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    addEventListener( "rejectionhandled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    addEventListener( "rejectionhandled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "rejectionhandled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    removeEventListener( "rejectionhandled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    removeEventListener( "rejectionhandled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLanguagechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "languagechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLanguagechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "languagechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLanguagechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "languagechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLanguagechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "languagechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLanguagechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "languagechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLanguagechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "languagechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addOfflineListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "offline", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOfflineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "offline", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addOfflineListener(@Nonnull final EventListener callback) {
    addEventListener( "offline", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeOfflineListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "offline", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOfflineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "offline", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeOfflineListener(@Nonnull final EventListener callback) {
    removeEventListener( "offline", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addOnlineListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "online", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOnlineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "online", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addOnlineListener(@Nonnull final EventListener callback) {
    addEventListener( "online", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeOnlineListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "online", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOnlineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "online", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeOnlineListener(@Nonnull final EventListener callback) {
    removeEventListener( "online", Js.cast( callback ) );
  }
}
