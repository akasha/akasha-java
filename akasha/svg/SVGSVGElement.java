package akasha.svg;

import akasha.DOMMatrix;
import akasha.DOMMatrixReadOnly;
import akasha.DOMPoint;
import akasha.DOMPointReadOnly;
import akasha.DOMRect;
import akasha.DOMRectReadOnly;
import akasha.Element;
import akasha.EventHandler;
import akasha.NodeList;
import akasha.OnBeforeUnloadEventHandler;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGSVGElement interface provides access to the properties of &lt;svg&gt; elements, as well as methods to manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix operations and the ability to control the time of redraw on visual rendering devices.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGSVGElement">SVGSVGElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/struct.html#InterfaceSVGSVGElement">SVGSVGElement - Scalable Vector Graphics (SVG) 2</a>
 * @see <a href="https://www.w3.org/TR/SVG11/struct.html#InterfaceSVGSVGElement">SVGSVGElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
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
  @Nullable
  public EventHandler onafterprint;

  /**
   * The onbeforeprint property of the WindowEventHandlers mixin is the EventHandler for processing beforeprint events for the current window. These events are raised before the print dialog window is opened.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onbeforeprint">WindowEventHandlers.onbeforeprint - MDN</a>
   */
  @Nullable
  public EventHandler onbeforeprint;

  /**
   * The onbeforeunload property of the WindowEventHandlers mixin is the EventHandler for processing beforeunload events. These events fire when a window is about to unload its resources. At this point, the document is still visible and the event is still cancelable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onbeforeunload">WindowEventHandlers.onbeforeunload - MDN</a>
   */
  @Nullable
  public OnBeforeUnloadEventHandler onbeforeunload;

  /**
   * The WindowEventHandlers.onhashchange property of the WindowEventHandlers mixin is the EventHandler for processing hashchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onhashchange">WindowEventHandlers.onhashchange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onhashchange">onhashchange - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">GlobalEventHandlers - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">GlobalEventHandlers - HTML5</a>
   */
  @Nullable
  public EventHandler onhashchange;

  /**
   * The onlanguagechange property of the WindowEventHandlers mixin is the EventHandler for processing languagechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onlanguagechange">WindowEventHandlers.onlanguagechange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onlanguagechange">WindowEventHandler.onlanguagechange - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onlanguagechange;

  /**
   * The onmessage property of the WindowEventHandlers mixin is the EventHandler called whenever an object receives a message event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessage">WindowEventHandlers.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessage">onmessage - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onmessage;

  /**
   * The onmessageerror event handler of the WindowEventHandlers interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on a window&mdash;that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessageerror">WindowEventHandlers.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessageerror">onmessageerror - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onmessageerror;

  @Nullable
  public EventHandler onoffline;

  @Nullable
  public EventHandler ononline;

  @Nullable
  public EventHandler onpagehide;

  @Nullable
  public EventHandler onpageshow;

  /**
   * The onpopstate property of the WindowEventHandlers mixin is the EventHandler for processing popstate events on the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onpopstate">WindowEventHandlers.onpopstate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onpopstate">onpopstate - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onpopstate;

  /**
   * The onrejectionhandled property of the WindowEventHandlers mixin is the EventHandler for processing rejectionhandled events. These events are raised when Promises are rejected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onrejectionhandled">WindowEventHandlers.onrejectionhandled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onrejectionhandled">onrejectionhandled - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onrejectionhandled;

  /**
   * The onstorage property of the WindowEventHandlers mixin is an EventHandler for processing storage events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onstorage">WindowEventHandlers.onstorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onstorage">onstorage - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onstorage;

  /**
   * The onunhandledrejection property of the WindowEventHandlers mixin is the EventHandler for processing unhandledrejection events. These events are raised for unhandled Promise rejections.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onunhandledrejection">WindowEventHandlers.onunhandledrejection - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onunhandledrejection">onunhandledrejection - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onunhandledrejection;

  /**
   * The onunload property of the WindowEventHandlers mixin is the EventHandler for processing unload events. These events fire when the window is unloading its content and resources. The resource removal is processed after the unload event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onunload">WindowEventHandlers.onunload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onunload">onunload - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">GlobalEventHandlers - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">GlobalEventHandlers - HTML5</a>
   */
  @Nullable
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

  @Nonnull
  public native SVGAngle createSVGAngle();

  @Nonnull
  public native SVGLength createSVGLength();

  @Nonnull
  public native DOMMatrix createSVGMatrix();

  @Nonnull
  public native SVGNumber createSVGNumber();

  @Nonnull
  public native DOMPoint createSVGPoint();

  @Nonnull
  public native DOMRect createSVGRect();

  @Nonnull
  public native SVGTransform createSVGTransform();

  @Nonnull
  public native SVGTransform createSVGTransformFromMatrix(@Nonnull DOMMatrixReadOnly matrix);

  public native void deselectAll();

  public native void forceRedraw();

  @HasNoSideEffects
  @Nonnull
  public native Element getElementById(@Nonnull String elementId);

  @Nonnull
  public native NodeList getEnclosureList(@Nonnull DOMRectReadOnly rect,
      @Nullable SVGElement referenceElement);

  @Nonnull
  public native NodeList getIntersectionList(@Nonnull DOMRectReadOnly rect,
      @Nullable SVGElement referenceElement);

  public native int suspendRedraw(int maxWaitMilliseconds);

  public native void unsuspendRedraw(int suspendHandleID);

  public native void unsuspendRedrawAll();
}
