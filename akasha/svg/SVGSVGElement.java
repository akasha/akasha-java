package akasha.svg;

import akasha.AddEventListenerOptions;
import akasha.BeforeUnloadEventListener;
import akasha.DOMMatrix;
import akasha.DOMMatrixReadOnly;
import akasha.DOMPoint;
import akasha.DOMPointReadOnly;
import akasha.DOMRect;
import akasha.DOMRectReadOnly;
import akasha.Element;
import akasha.EventHandler;
import akasha.EventListenerOptions;
import akasha.HashChangeEventHandler;
import akasha.HashChangeEventListener;
import akasha.MessageEventHandler;
import akasha.MessageEventListener;
import akasha.NodeList;
import akasha.OnBeforeUnloadEventHandler;
import akasha.PageTransitionEventHandler;
import akasha.PageTransitionEventListener;
import akasha.PopStateEventHandler;
import akasha.PopStateEventListener;
import akasha.PromiseRejectionEventHandler;
import akasha.PromiseRejectionEventListener;
import akasha.StorageEventHandler;
import akasha.StorageEventListener;
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
import jsinterop.base.Js;

/**
 * The SVGSVGElement interface provides access to the properties of &lt;svg&gt; elements, as well as methods to manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix operations and the ability to control the time of redraw on visual rendering devices.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGSVGElement">SVGSVGElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/struct.html#InterfaceSVGSVGElement"># InterfaceSVGSVGElement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGSVGElement"
)
public class SVGSVGElement extends SVGGraphicsElement {
  @JsOverlay
  public static final int SVG_ZOOMANDPAN_DISABLE = 1;

  @JsOverlay
  public static final int SVG_ZOOMANDPAN_MAGNIFY = 2;

  @JsOverlay
  public static final int SVG_ZOOMANDPAN_UNKNOWN = 0;

  public float currentScale;

  /**
   * The onafterprint property of the WindowEventHandlers mixin is the EventHandler for processing afterprint events for the current window. These events are raised after the user prints, or if they abort the print dialog.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onafterprint">WindowEventHandlers.onafterprint - MDN</a>
   */
  @JsNullable
  public EventHandler onafterprint;

  /**
   * The onbeforeprint property of the WindowEventHandlers mixin is the EventHandler for processing beforeprint events for the current window. These events are raised before the print dialog window is opened.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onbeforeprint">WindowEventHandlers.onbeforeprint - MDN</a>
   */
  @JsNullable
  public EventHandler onbeforeprint;

  /**
   * The onbeforeunload property of the WindowEventHandlers mixin is the EventHandler for processing beforeunload events. These events fire when a window is about to unload its resources. At this point, the document is still visible and the event is still cancelable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onbeforeunload">WindowEventHandlers.onbeforeunload - MDN</a>
   */
  @JsNullable
  public OnBeforeUnloadEventHandler onbeforeunload;

  @JsNullable
  public EventHandler ongamepadconnected;

  @JsNullable
  public EventHandler ongamepaddisconnected;

  /**
   * The WindowEventHandlers.onhashchange property of the WindowEventHandlers mixin is the EventHandler for processing hashchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onhashchange">WindowEventHandlers.onhashchange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onhashchange">onhashchange - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">GlobalEventHandlers - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">GlobalEventHandlers - HTML5</a>
   */
  @JsNullable
  public HashChangeEventHandler onhashchange;

  /**
   * The onlanguagechange property of the WindowEventHandlers mixin is the EventHandler for processing languagechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onlanguagechange">WindowEventHandlers.onlanguagechange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onlanguagechange">WindowEventHandler.onlanguagechange - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler onlanguagechange;

  /**
   * The onmessage property of the WindowEventHandlers mixin is the EventHandler called whenever an object receives a message event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessage">WindowEventHandlers.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessage">onmessage - HTML Living Standard</a>
   */
  @JsNullable
  public MessageEventHandler onmessage;

  /**
   * The onmessageerror event handler of the WindowEventHandlers interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on a window&mdash;that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessageerror">WindowEventHandlers.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessageerror">onmessageerror - HTML Living Standard</a>
   */
  @JsNullable
  public MessageEventHandler onmessageerror;

  @JsNullable
  public EventHandler onoffline;

  @JsNullable
  public EventHandler ononline;

  @JsNullable
  public PageTransitionEventHandler onpagehide;

  @JsNullable
  public PageTransitionEventHandler onpageshow;

  /**
   * The onpopstate property of the WindowEventHandlers mixin is the EventHandler for processing popstate events on the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onpopstate">WindowEventHandlers.onpopstate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onpopstate">onpopstate - HTML Living Standard</a>
   */
  @JsNullable
  public PopStateEventHandler onpopstate;

  /**
   * The onrejectionhandled property of the WindowEventHandlers mixin is the EventHandler for processing rejectionhandled events. These events are raised when Promises are rejected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onrejectionhandled">WindowEventHandlers.onrejectionhandled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onrejectionhandled">onrejectionhandled - HTML Living Standard</a>
   */
  @JsNullable
  public PromiseRejectionEventHandler onrejectionhandled;

  /**
   * The onstorage property of the WindowEventHandlers mixin is an EventHandler for processing storage events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onstorage">WindowEventHandlers.onstorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onstorage">onstorage - HTML Living Standard</a>
   */
  @JsNullable
  public StorageEventHandler onstorage;

  /**
   * The onunhandledrejection property of the WindowEventHandlers mixin is the EventHandler for processing unhandledrejection events. These events are raised for unhandled Promise rejections.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onunhandledrejection">WindowEventHandlers.onunhandledrejection - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onunhandledrejection">onunhandledrejection - HTML Living Standard</a>
   */
  @JsNullable
  public PromiseRejectionEventHandler onunhandledrejection;

  /**
   * The onunload property of the WindowEventHandlers mixin is the EventHandler for processing unload events. These events fire when the window is unloading its content and resources. The resource removal is processed after the unload event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onunload">WindowEventHandlers.onunload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onunload">onunload - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">GlobalEventHandlers - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">GlobalEventHandlers - HTML5</a>
   */
  @JsNullable
  public EventHandler onunload;

  public int zoomAndPan;

  protected SVGSVGElement() {
  }

  @JsProperty(
      name = "currentTranslate"
  )
  @Nonnull
  public native DOMPointReadOnly currentTranslate();

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "preserveAspectRatio"
  )
  @Nonnull
  public native SVGAnimatedPreserveAspectRatio preserveAspectRatio();

  @JsProperty(
      name = "viewBox"
  )
  @Nonnull
  public native SVGAnimatedRect viewBox();

  @JsProperty(
      name = "width"
  )
  @Nonnull
  public native SVGAnimatedLength width();

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedLength x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLength y();

  public native boolean checkEnclosure(@Nonnull SVGElement element, @Nonnull DOMRectReadOnly rect);

  public native boolean checkIntersection(@Nonnull SVGElement element,
      @Nonnull DOMRectReadOnly rect);

  @JsNonNull
  public native SVGAngle createSVGAngle();

  @JsNonNull
  public native SVGLength createSVGLength();

  @JsNonNull
  public native DOMMatrix createSVGMatrix();

  @JsNonNull
  public native SVGNumber createSVGNumber();

  @JsNonNull
  public native DOMPoint createSVGPoint();

  @JsNonNull
  public native DOMRect createSVGRect();

  @JsNonNull
  public native SVGTransform createSVGTransform();

  @JsNonNull
  public native SVGTransform createSVGTransformFromMatrix(@Nonnull DOMMatrixReadOnly matrix);

  public native void deselectAll();

  public native void forceRedraw();

  @HasNoSideEffects
  @JsNonNull
  public native Element getElementById(@Nonnull String elementId);

  @JsNonNull
  public native NodeList getEnclosureList(@Nonnull DOMRectReadOnly rect,
      @Nullable SVGElement referenceElement);

  @JsNonNull
  public native NodeList getIntersectionList(@Nonnull DOMRectReadOnly rect,
      @Nullable SVGElement referenceElement);

  public native int suspendRedraw(int maxWaitMilliseconds);

  public native void unsuspendRedraw(int suspendHandleID);

  public native void unsuspendRedrawAll();

  @JsOverlay
  public final void addPopstateListener(@Nonnull final PopStateEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "popstate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPopstateListener(@Nonnull final PopStateEventListener callback,
      final boolean useCapture) {
    addEventListener( "popstate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPopstateListener(@Nonnull final PopStateEventListener callback) {
    addEventListener( "popstate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePopstateListener(@Nonnull final PopStateEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "popstate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePopstateListener(@Nonnull final PopStateEventListener callback,
      final boolean useCapture) {
    removeEventListener( "popstate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePopstateListener(@Nonnull final PopStateEventListener callback) {
    removeEventListener( "popstate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPageshowListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pageshow", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPageshowListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "pageshow", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPageshowListener(@Nonnull final PageTransitionEventListener callback) {
    addEventListener( "pageshow", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePageshowListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pageshow", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePageshowListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pageshow", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePageshowListener(@Nonnull final PageTransitionEventListener callback) {
    removeEventListener( "pageshow", Js.cast( callback ) );
  }

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
  public final void addStorageListener(@Nonnull final StorageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "storage", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addStorageListener(@Nonnull final StorageEventListener callback,
      final boolean useCapture) {
    addEventListener( "storage", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addStorageListener(@Nonnull final StorageEventListener callback) {
    addEventListener( "storage", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeStorageListener(@Nonnull final StorageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "storage", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeStorageListener(@Nonnull final StorageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "storage", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeStorageListener(@Nonnull final StorageEventListener callback) {
    removeEventListener( "storage", Js.cast( callback ) );
  }

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
  public final void addBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "beforeunload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback,
      final boolean useCapture) {
    addEventListener( "beforeunload", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback) {
    addEventListener( "beforeunload", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "beforeunload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback,
      final boolean useCapture) {
    removeEventListener( "beforeunload", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback) {
    removeEventListener( "beforeunload", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPagehideListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pagehide", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPagehideListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "pagehide", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPagehideListener(@Nonnull final PageTransitionEventListener callback) {
    addEventListener( "pagehide", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePagehideListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pagehide", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePagehideListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pagehide", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePagehideListener(@Nonnull final PageTransitionEventListener callback) {
    removeEventListener( "pagehide", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addHashchangeListener(@Nonnull final HashChangeEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "hashchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addHashchangeListener(@Nonnull final HashChangeEventListener callback,
      final boolean useCapture) {
    addEventListener( "hashchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addHashchangeListener(@Nonnull final HashChangeEventListener callback) {
    addEventListener( "hashchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeHashchangeListener(@Nonnull final HashChangeEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "hashchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeHashchangeListener(@Nonnull final HashChangeEventListener callback,
      final boolean useCapture) {
    removeEventListener( "hashchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeHashchangeListener(@Nonnull final HashChangeEventListener callback) {
    removeEventListener( "hashchange", Js.cast( callback ) );
  }
}
