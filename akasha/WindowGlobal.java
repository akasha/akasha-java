package akasha;

import akasha.clipboard.ClipboardEventListener;
import akasha.core.JsObject;
import akasha.core.Symbol;
import akasha.crypto.Crypto;
import akasha.idb.IDBFactory;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import akasha.speech.SpeechSynthesis;
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
 * The Window interface represents a window containing a DOM document; the document property points to the DOM document loaded in that window.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window">Window - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/window-object.html#the-window-object"># the-window-object</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "goog.global"
)
public final class WindowGlobal {
  /**
   * The Window.name property gets/sets the name of the window's browsing context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/name">Window.name - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-name">Window.name - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-name">Window.name - HTML5</a>
   */
  @JsNonNull
  public static String name;

  /**
   * The onabort property of the GlobalEventHandlers mixin is the EventHandler for processing abort events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onabort">Window.onabort - MDN</a>
   */
  @JsNullable
  public static EventHandler onabort;

  /**
   * The onafterprint property of the WindowEventHandlers mixin is the EventHandler for processing afterprint events for the current window. These events are raised after the user prints, or if they abort the print dialog.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onafterprint">Window.onafterprint - MDN</a>
   */
  @JsNullable
  public static EventHandler onafterprint;

  /**
   * The onanimationcancel property of the GlobalEventHandlers mixin is the EventHandler for processing animationcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationcancel">GlobalEventHandlers.onanimationcancel - MDN</a>
   */
  @JsNullable
  public static AnimationEventHandler onanimationcancel;

  /**
   * The onanimationend property of the GlobalEventHandlers mixin is the EventHandler for processing animationend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationend">GlobalEventHandlers.onanimationend - MDN</a>
   */
  @JsNullable
  public static AnimationEventHandler onanimationend;

  /**
   * The onanimationiteration property of the GlobalEventHandlers mixin is the EventHandler for processing animationiteration events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationiteration">GlobalEventHandlers.onanimationiteration - MDN</a>
   */
  @JsNullable
  public static AnimationEventHandler onanimationiteration;

  /**
   * An event handler for the animationstart event. This event is sent when a CSS Animation starts to play.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationstart">GlobalEventHandlers.onanimationstart - MDN</a>
   */
  @JsNullable
  public static AnimationEventHandler onanimationstart;

  /**
   * The onauxclick property of the GlobalEventHandlers mixin is an EventHandler for processing auxclick events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onauxclick">GlobalEventHandlers.onauxclick - MDN</a>
   * @see <a href="https://w3c.github.io/uievents/#event-type-auxclick">onauxclick - UI Events</a>
   */
  @JsNullable
  public static EventHandler onauxclick;

  /**
   * The onbeforeprint property of the WindowEventHandlers mixin is the EventHandler for processing beforeprint events for the current window. These events are raised before the print dialog window is opened.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onbeforeprint">Window.onbeforeprint - MDN</a>
   */
  @JsNullable
  public static EventHandler onbeforeprint;

  /**
   * The onbeforeunload property of the WindowEventHandlers mixin is the EventHandler for processing beforeunload events. These events fire when a window is about to unload its resources. At this point, the document is still visible and the event is still cancelable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onbeforeunload">Window.onbeforeunload - MDN</a>
   */
  @JsNullable
  public static OnBeforeUnloadEventHandler onbeforeunload;

  @JsNullable
  public static EventHandler onbeforexrselect;

  /**
   * The onblur property of the GlobalEventHandlers mixin is the EventHandler for processing blur events. It's available on Element, Document, and Window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onblur">Window.onblur - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onblur">onblur - HTML Living Standard</a>
   */
  @JsNullable
  public static FocusEventHandler onblur;

  /**
   * The oncancel property of the GlobalEventHandlers mixin is an EventHandler for processing cancel events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncancel">GlobalEventHandlers.oncancel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncancel">oncancel - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler oncancel;

  /**
   * The oncanplay property of the GlobalEventHandlers mixin is the EventHandler for processing canplay events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplay">GlobalEventHandlers.oncanplay - MDN</a>
   */
  @JsNullable
  public static EventHandler oncanplay;

  /**
   * The oncanplaythrough property of the GlobalEventHandlers mixin is the EventHandler for processing canplaythrough events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplaythrough">GlobalEventHandlers.oncanplaythrough - MDN</a>
   */
  @JsNullable
  public static EventHandler oncanplaythrough;

  /**
   * The onchange property of the GlobalEventHandlers mixin is an EventHandler for processing change events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onchange">Window.onchange - MDN</a>
   */
  @JsNullable
  public static EventHandler onchange;

  /**
   * The onclick property of the GlobalEventHandlers mixin is the EventHandler for processing click events on a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onclick">Window.onclick - MDN</a>
   */
  @JsNullable
  public static EventHandler onclick;

  /**
   * The onclose property of the GlobalEventHandlers mixin is an EventHandler for processing close events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclose">GlobalEventHandlers.onclose - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onclose">onclose - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onclose;

  @JsNullable
  public static EventHandler oncompassneedscalibration;

  @JsNullable
  public static EventHandler oncontextlost;

  /**
   * The oncontextmenu property of the GlobalEventHandlers mixin is an EventHandler that processes contextmenu events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/oncontextmenu">Window.oncontextmenu - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncontextmenu">oncontextmenu - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler oncontextmenu;

  @JsNullable
  public static EventHandler oncontextrestored;

  /**
   * The oncuechange property of the GlobalEventHandlers mixin is the EventHandler for processing cuechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncuechange">GlobalEventHandlers.oncuechange - MDN</a>
   */
  @JsNullable
  public static EventHandler oncuechange;

  /**
   * The ondblclick property of the GlobalEventHandlers mixin is an EventHandler that processes dblclick events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondblclick">Window.ondblclick - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-ondblclick">ondblclick - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler ondblclick;

  /**
   * An event handler for the devicemotion events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondevicemotion">Window.ondevicemotion - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @JsNullable
  public static DeviceMotionEventHandler ondevicemotion;

  /**
   * An event handler for the deviceorientation event, which contains information about a relative device orientation change.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondeviceorientation">Window.ondeviceorientation - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @JsNullable
  public static DeviceOrientationEventHandler ondeviceorientation;

  /**
   * An event handler for the deviceorientationabsolute event containing information about an absolute device orientation change.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondeviceorientationabsolute">Window.ondeviceorientationabsolute - MDN</a>
   */
  @JsNullable
  public static EventHandler ondeviceorientationabsolute;

  /**
   * A global event handler for the drag event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrag">GlobalEventHandlers.ondrag - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrag">ondrag - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrag">ondrag - HTML 5.1</a>
   */
  @JsNullable
  public static DragEventHandler ondrag;

  /**
   * A global event handler for the dragend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragend">GlobalEventHandlers.ondragend - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragend">ondragend - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragend">ondragend - HTML 5.1</a>
   */
  @JsNullable
  public static DragEventHandler ondragend;

  /**
   * A global event handler for the dragenter event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragenter">GlobalEventHandlers.ondragenter - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragenter">ondragenter - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragenter">ondragenter - HTML 5.1</a>
   */
  @JsNullable
  public static DragEventHandler ondragenter;

  /**
   * A global event handler for the dragleave event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragleave">GlobalEventHandlers.ondragleave - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragleave">ondragleave - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragleave">ondragleave - HTML 5.1</a>
   */
  @JsNullable
  public static DragEventHandler ondragleave;

  /**
   * A global event handler for the dragover event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragover">GlobalEventHandlers.ondragover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragover">ondragover - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragover">ondragover - HTML 5.1</a>
   */
  @JsNullable
  public static DragEventHandler ondragover;

  /**
   * A global event handler for the dragstart event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragstart">GlobalEventHandlers.ondragstart - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragstart">ondragstart - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragstart">ondragstart - HTML 5.1</a>
   */
  @JsNullable
  public static DragEventHandler ondragstart;

  /**
   * A global event handler for the drop event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrop">GlobalEventHandlers.ondrop - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrop">ondrop - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrop">ondrop - HTML 5.1</a>
   */
  @JsNullable
  public static DragEventHandler ondrop;

  /**
   * The ondurationchange property of the GlobalEventHandlers mixin is the EventHandler for processing durationchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondurationchange">GlobalEventHandlers.ondurationchange - MDN</a>
   */
  @JsNullable
  public static EventHandler ondurationchange;

  /**
   * The onemptied property sets and returns the event handler for the emptied event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onemptied">GlobalEventHandlers.onemptied - MDN</a>
   */
  @JsNullable
  public static EventHandler onemptied;

  /**
   * The onended property of the GlobalEventHandlers mixin is the EventHandler for processing ended events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onended">GlobalEventHandlers.onended - MDN</a>
   */
  @JsNullable
  public static EventHandler onended;

  /**
   * The onerror property of the GlobalEventHandlers mixin is an EventHandler that processes error events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onerror">GlobalEventHandlers.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onerror">onerror - HTML Living Standard</a>
   */
  @JsNullable
  public static OnErrorEventHandler onerror;

  /**
   * The onfocus property of the GlobalEventHandlers mixin is an EventHandler that processes focus events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onfocus">Window.onfocus - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onfocus">onfocus - HTML Living Standard</a>
   */
  @JsNullable
  public static FocusEventHandler onfocus;

  /**
   * The onformdata property of the GlobalEventHandlers mixin is the EventHandler for processing formdata events, fired after the entry list representing the form's data is constructed. This happens when the form is submitted, but can also be triggered by the invocation of a FormData() constructor. onformdata is available on HTMLFormElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onformdata">GlobalEventHandlers.onformdata - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onformdata">onformdata - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onformdata;

  /**
   * The ongamepadconnected property of the Window interface represents an event handler that will run when a gamepad is connected (when the gamepadconnected event fires).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ongamepadconnected">Window.ongamepadconnected - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#event-gamepadconnected">gamepadconnected event - Gamepad</a>
   */
  @JsNullable
  public static GamepadEventHandler ongamepadconnected;

  /**
   * The ongamepaddisconnected property of the Window interface represents an event handler that will run when a gamepad is disconnected (when the gamepaddisconnected event fires).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ongamepaddisconnected">Window.ongamepaddisconnected - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#event-gamepaddisconnected">gamepaddisconnected event - Gamepad</a>
   */
  @JsNullable
  public static GamepadEventHandler ongamepaddisconnected;

  /**
   * The ongotpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes gotpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ongotpointercapture">GlobalEventHandlers.ongotpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-gotpointercapture-event">ongotpointercapture - Pointer Events &ndash; Level 2</a>
   */
  @JsNullable
  public static PointerEventHandler ongotpointercapture;

  /**
   * The WindowEventHandlers.onhashchange property of the WindowEventHandlers mixin is the EventHandler for processing hashchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onhashchange">Window.onhashchange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onhashchange">onhashchange - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">GlobalEventHandlers - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">GlobalEventHandlers - HTML5</a>
   */
  @JsNullable
  public static HashChangeEventHandler onhashchange;

  /**
   * The onkeydown property of the GlobalEventHandlers mixin is an EventHandler that processes keydown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/oninput">Window.oninput - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeydown">onkeydown - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler oninput;

  /**
   * The oninvalid property of the GlobalEventHandlers mixin is an EventHandler that processes invalid events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oninvalid">GlobalEventHandlers.oninvalid - MDN</a>
   */
  @JsNullable
  public static EventHandler oninvalid;

  /**
   * The onkeydown property of the GlobalEventHandlers mixin is an EventHandler that processes keydown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onkeydown">Window.onkeydown - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeydown">onkeydown - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onkeydown;

  /**
   * The onkeypress property of the GlobalEventHandlers mixin is an EventHandler that processes keypress events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onkeypress">Window.onkeypress - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeypress">onkeypress - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onkeypress;

  /**
   * The onkeyup property of the GlobalEventHandlers mixin is an EventHandler that processes keyup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onkeyup">Window.onkeyup - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeyup">onkeyup - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onkeyup;

  /**
   * The onlanguagechange property of the WindowEventHandlers mixin is the EventHandler for processing languagechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onlanguagechange">Window.onlanguagechange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onlanguagechange">WindowEventHandler.onlanguagechange - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onlanguagechange;

  /**
   * The onload property of the GlobalEventHandlers mixin is an EventHandler that processes load events on a Window, XMLHttpRequest, img element, etc.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onload">Window.onload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onload">onload - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onload;

  /**
   * The onloadeddata property of the GlobalEventHandlers mixin is the EventHandler for processing loadeddata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadeddata">GlobalEventHandlers.onloadeddata - MDN</a>
   */
  @JsNullable
  public static EventHandler onloadeddata;

  /**
   * The onloadedmetadata property of the GlobalEventHandlers mixin is the EventHandler for processing loadedmetadata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadedmetadata">GlobalEventHandlers.onloadedmetadata - MDN</a>
   */
  @JsNullable
  public static EventHandler onloadedmetadata;

  /**
   * The onloadstart property of the GlobalEventHandlers mixin is an EventHandler representing the code to be called when the loadstart event is raised (when progress has begun on the loading of a resource.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadstart">GlobalEventHandlers.onloadstart - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onloadstart">onloadstart - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onloadstart;

  /**
   * The onlostpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes lostpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onlostpointercapture">GlobalEventHandlers.onlostpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-lostpointercapture-event">onlostpointercapture - Pointer Events &ndash; Level 2</a>
   */
  @JsNullable
  public static PointerEventHandler onlostpointercapture;

  /**
   * The onmessageerror event handler of the WindowEventHandlers interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on a window&mdash;that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessageerror">WindowEventHandlers.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessageerror">onmessageerror - HTML Living Standard</a>
   */
  @JsNullable
  public static MessageEventHandler onmessageerror;

  /**
   * The onmousedown property of the GlobalEventHandlers mixin is an EventHandler that processes mousedown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmousedown">Window.onmousedown - MDN</a>
   */
  @JsNullable
  public static EventHandler onmousedown;

  /**
   * The onmouseenter property of the GlobalEventHandlers mixin is the EventHandler for processing mouseenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseenter">GlobalEventHandlers.onmouseenter - MDN</a>
   */
  @JsNullable
  public static EventHandler onmouseenter;

  /**
   * The onmouseleave property of the GlobalEventHandlers mixin is the EventHandler for processing mouseleave events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseleave">GlobalEventHandlers.onmouseleave - MDN</a>
   */
  @JsNullable
  public static EventHandler onmouseleave;

  /**
   * The onmousemove property of the GlobalEventHandlers mixin is an EventHandler that processes mousemove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmousemove">Window.onmousemove - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmousemove">onmousemove - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onmousemove;

  /**
   * The onmouseout property of the GlobalEventHandlers mixin is an EventHandler that processes mouseout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmouseout">Window.onmouseout - MDN</a>
   */
  @JsNullable
  public static EventHandler onmouseout;

  /**
   * The onmouseover property of the GlobalEventHandlers mixin is an EventHandler that processes mouseover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmouseover">Window.onmouseover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmouseover">onmouseover - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onmouseover;

  /**
   * The onmouseup property of the GlobalEventHandlers mixin is an EventHandler that processes mouseup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmouseup">Window.onmouseup - MDN</a>
   */
  @JsNullable
  public static EventHandler onmouseup;

  @JsNullable
  public static EventHandler onoffline;

  @JsNullable
  public static EventHandler ononline;

  @JsNullable
  public static EventHandler onorientationchange;

  @JsNullable
  public static PageTransitionEventHandler onpagehide;

  @JsNullable
  public static PageTransitionEventHandler onpageshow;

  /**
   * The onpause property of the GlobalEventHandlers mixin is the EventHandler for processing pause events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpause">GlobalEventHandlers.onpause - MDN</a>
   */
  @JsNullable
  public static EventHandler onpause;

  /**
   * The onplay property of the GlobalEventHandlers mixin is the EventHandler for processing play events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplay">GlobalEventHandlers.onplay - MDN</a>
   */
  @JsNullable
  public static EventHandler onplay;

  /**
   * The onplaying property of the GlobalEventHandlers mixin is the EventHandler for processing playing events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplaying">GlobalEventHandlers.onplaying - MDN</a>
   */
  @JsNullable
  public static EventHandler onplaying;

  /**
   * The onpointercancel property of the GlobalEventHandlers mixin is an EventHandler that processes pointercancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointercancel">GlobalEventHandlers.onpointercancel - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointercancel">onpointercancel - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointercancel">onpointercancel - Pointer Events</a>
   */
  @JsNullable
  public static PointerEventHandler onpointercancel;

  /**
   * The GlobalEventHandlers event handler onpointerdown is used to specify the event handler for the pointerdown event, which is fired when the pointing device is initially pressed. This event can be sent to Window, Document, and Element objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerdown">GlobalEventHandlers.onpointerdown - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerdown">onpointerdown - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerdown">onpointerdown - Pointer Events</a>
   */
  @JsNullable
  public static PointerEventHandler onpointerdown;

  /**
   * The onpointerenter property of the GlobalEventHandlers mixin is an EventHandler that processes pointerenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerenter">GlobalEventHandlers.onpointerenter - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerenter">onpointerenter - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerenter">onpointerenter - Pointer Events</a>
   */
  @JsNullable
  public static PointerEventHandler onpointerenter;

  /**
   * The global event handler for the pointerleave event, which is delivered to a Node when the pointer (mouse cursor, fingertip, etc.) exits its hit test area (for example, if the cursor exits an Element or Window's content area). This event is part of the Pointer Events API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerleave">GlobalEventHandlers.onpointerleave - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerleave">onpointerleave - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerleave">onpointerleave - Pointer Events</a>
   */
  @JsNullable
  public static PointerEventHandler onpointerleave;

  /**
   * The onpointermove property of the GlobalEventHandlers mixin is an EventHandler that processes pointermove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointermove">GlobalEventHandlers.onpointermove - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointermove">onpointermove - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointermove">onpointermove - Pointer Events</a>
   */
  @JsNullable
  public static PointerEventHandler onpointermove;

  /**
   * The onpointerout property of the GlobalEventHandlers mixin is an EventHandler that processes pointerout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerout">GlobalEventHandlers.onpointerout - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerout">onpointerout - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerout">onpointerout - Pointer Events</a>
   */
  @JsNullable
  public static PointerEventHandler onpointerout;

  /**
   * The onpointerover property of the GlobalEventHandlers mixin is an EventHandler that processes pointerover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerover">GlobalEventHandlers.onpointerover - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerover">onpointerover - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerover">onpointerover - Pointer Events</a>
   */
  @JsNullable
  public static PointerEventHandler onpointerover;

  /**
   * The onpointerup property of the GlobalEventHandlers mixin is an EventHandler that processes pointerup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerup">GlobalEventHandlers.onpointerup - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerup">onpointerup - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerup">onpointerup - Pointer Events</a>
   */
  @JsNullable
  public static PointerEventHandler onpointerup;

  /**
   * The onpopstate property of the WindowEventHandlers mixin is the EventHandler for processing popstate events on the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onpopstate">Window.onpopstate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onpopstate">onpopstate - HTML Living Standard</a>
   */
  @JsNullable
  public static PopStateEventHandler onpopstate;

  @JsNullable
  public static EventHandler onprogress;

  @JsNullable
  public static EventHandler onratechange;

  /**
   * The onrejectionhandled property of the WindowEventHandlers mixin is the EventHandler for processing rejectionhandled events. These events are raised when Promises are rejected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onrejectionhandled">Window.onrejectionhandled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onrejectionhandled">onrejectionhandled - HTML Living Standard</a>
   */
  @JsNullable
  public static PromiseRejectionEventHandler onrejectionhandled;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onreset">Window.onreset - MDN</a>
   */
  @JsNullable
  public static EventHandler onreset;

  /**
   * The onresize property of the GlobalEventHandlers interface is an EventHandler that processes resize events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onresize">Window.onresize - MDN</a>
   */
  @JsNullable
  public static UIEventHandler onresize;

  /**
   * The onscroll property of the GlobalEventHandlers mixin is an EventHandler that processes scroll events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onscroll">Window.onscroll - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onscroll">onscroll - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#event-type-scroll">onscroll - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  @JsNullable
  public static EventHandler onscroll;

  @JsNullable
  public static EventHandler onsecuritypolicyviolation;

  @JsNullable
  public static EventHandler onseeked;

  @JsNullable
  public static EventHandler onseeking;

  /**
   * The onselect property of the GlobalEventHandlers mixin is an EventHandler that processes select events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onselect">Window.onselect - MDN</a>
   */
  @JsNullable
  public static EventHandler onselect;

  /**
   * The onselectionchange property of the GlobalEventHandlers mixin is an EventHandler that processes selectionchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectionchange">GlobalEventHandlers.onselectionchange - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectionchange">GlobalEventHandlers.onselectionchange - Selection API</a>
   */
  @JsNullable
  public static EventHandler onselectionchange;

  /**
   * The onselectstart property of the GlobalEventHandlers mixin is an EventHandler that processes selectstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectstart">GlobalEventHandlers.onselectstart - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectstart">GlobalEventHandlers.onselectstart - Selection API</a>
   */
  @JsNullable
  public static EventHandler onselectstart;

  @JsNullable
  public static EventHandler onslotchange;

  @JsNullable
  public static EventHandler onstalled;

  /**
   * The onstorage property of the WindowEventHandlers mixin is an EventHandler for processing storage events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onstorage">Window.onstorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onstorage">onstorage - HTML Living Standard</a>
   */
  @JsNullable
  public static StorageEventHandler onstorage;

  /**
   * The onsubmit property of the GlobalEventHandlers mixin is an EventHandler that processes submit events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onsubmit">Window.onsubmit - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onsubmit">onsubmit - HTML Living Standard</a>
   */
  @JsNullable
  public static EventHandler onsubmit;

  @JsNullable
  public static EventHandler onsuspend;

  @JsNullable
  public static EventHandler ontimeupdate;

  @JsNullable
  public static EventHandler ontoggle;

  /**
   * The ontouchcancel property of the GlobalEventHandlers mixin is an EventHandler that processes touchcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchcancel">GlobalEventHandlers.ontouchcancel - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchcancel">Touch Events – Level 2</a>
   */
  @JsNullable
  public static TouchEventHandler ontouchcancel;

  /**
   * A global event handler for the touchend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchend">GlobalEventHandlers.ontouchend - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchend">Touch Events – Level 2</a>
   */
  @JsNullable
  public static TouchEventHandler ontouchend;

  /**
   * A global event handler for the touchmove event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchmove">GlobalEventHandlers.ontouchmove - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchmove">Touch Events – Level 2</a>
   */
  @JsNullable
  public static TouchEventHandler ontouchmove;

  /**
   * The ontouchstart property of the GlobalEventHandlers mixin is an EventHandler that processes touchstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchstart">GlobalEventHandlers.ontouchstart - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchstart">Touch Events – Level 2</a>
   */
  @JsNullable
  public static TouchEventHandler ontouchstart;

  /**
   * The ontransitioncancel property of the GlobalEventHandlers mixin is an EventHandler that processes transitioncancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitioncancel">GlobalEventHandlers.ontransitioncancel - MDN</a>
   */
  @JsNullable
  public static TransitionEventHandler ontransitioncancel;

  /**
   * The ontransitionend property of the GlobalEventHandlers mixin is an EventHandler that processes transitionend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitionend">GlobalEventHandlers.ontransitionend - MDN</a>
   */
  @JsNullable
  public static TransitionEventHandler ontransitionend;

  @JsNullable
  public static TransitionEventHandler ontransitionrun;

  @JsNullable
  public static TransitionEventHandler ontransitionstart;

  /**
   * The onunhandledrejection property of the WindowEventHandlers mixin is the EventHandler for processing unhandledrejection events. These events are raised for unhandled Promise rejections.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onunhandledrejection">Window.onunhandledrejection - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onunhandledrejection">onunhandledrejection - HTML Living Standard</a>
   */
  @JsNullable
  public static PromiseRejectionEventHandler onunhandledrejection;

  /**
   * The onunload property of the WindowEventHandlers mixin is the EventHandler for processing unload events. These events fire when the window is unloading its content and resources. The resource removal is processed after the unload event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onunload">Window.onunload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onunload">onunload - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">GlobalEventHandlers - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">GlobalEventHandlers - HTML5</a>
   */
  @JsNullable
  public static EventHandler onunload;

  @JsNullable
  public static EventHandler onvolumechange;

  @JsNullable
  public static EventHandler onwaiting;

  @JsNullable
  public static EventHandler onwebkitanimationend;

  @JsNullable
  public static EventHandler onwebkitanimationiteration;

  @JsNullable
  public static EventHandler onwebkitanimationstart;

  @JsNullable
  public static EventHandler onwebkittransitionend;

  /**
   * The onwheel property of the GlobalEventHandlers mixin is an EventHandler that processes wheel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onwheel">GlobalEventHandlers.onwheel - MDN</a>
   */
  @JsNullable
  public static EventHandler onwheel;

  /**
   * The Window interface's opener property returns a reference to the window that opened the window, either with open(), or by navigating a link with a target attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/opener">Window.opener - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-opener">window.opener - HTML Living Standard</a>
   */
  @JsNullable
  public static Any opener;

  /**
   * The status property of the Window interface was originally intended to set the text in the status bar at the bottom of the browser window. However, the HTML standard now requires setting window.status to have no effect on the text displayed in the status bar.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/status">Window.status - MDN</a>
   */
  @JsNonNull
  public static String status;

  private WindowGlobal() {
  }

  /**
   * The caches read-only property of the WindowOrWorkerGlobalScope interface returns the CacheStorage object associated with the current context. This object enables functionality such as storing assets for offline use, and generating custom responses to requests.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/caches">Window.caches - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#self-caches">caches - Service Workers</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/">Service Workers</a>
   */
  @JsProperty(
      name = "caches"
  )
  @JsNonNull
  public static native CacheStorage caches();

  @JsProperty(
      name = "clientInformation"
  )
  @JsNonNull
  public static native Navigator clientInformation();

  /**
   * The Window.closed read-only property indicates whether the referenced window is closed or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/closed">Window.closed - MDN</a>
   */
  @JsProperty(
      name = "closed"
  )
  public static native boolean closed();

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

  /**
   * The read-only Window.crypto property returns the Crypto object associated to the global object. This object allows web pages access to certain cryptographic related services.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/crypto">Window.crypto - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-GlobalCrypto">Window.crypto - Web Cryptography API</a>
   */
  @JsProperty(
      name = "crypto"
  )
  @JsNonNull
  public static native Crypto crypto();

  /**
   * The customElements read-only property of the Window interface returns a reference to the CustomElementRegistry object, which can be used to register new custom elements and get information about previously registered custom elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/customElements">Window.customElements - MDN</a>
   */
  @JsProperty(
      name = "customElements"
  )
  @JsNonNull
  public static native CustomElementRegistry customElements();

  /**
   * The devicePixelRatio of Window interface returns the ratio of the resolution in physical pixels to the resolution in CSS pixels for the current display device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio">Window.devicePixelRatio - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-devicepixelratio">Window.devicePixelRatio - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "devicePixelRatio"
  )
  public static native double devicePixelRatio();

  /**
   * window.document returns a reference to the document contained in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/document">Window.document - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-2">Window.document - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-document-0">Window.document - HTML5</a>
   */
  @JsProperty(
      name = "document"
  )
  @JsNonNull
  public static native Document document();

  /**
   * The read-only Window property event returns the Event which is currently being handled by the site's code. Outside the context of an event handler, the value is always undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/event">Window.event - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-window-event">Window.event - DOM</a>
   */
  @JsProperty(
      name = "event"
  )
  @JsNonNull
  public static native EventOrUndefinedUnion event();

  /**
   * The Window.frameElement property returns the element (such as iframe or object) in which the window is embedded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/frameElement">Window.frameElement - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-frameelement">Window.frameElement - HTML Living Standard</a>
   */
  @JsProperty(
      name = "frameElement"
  )
  @JsNullable
  public static native Element frameElement();

  /**
   * Returns the window itself, which is an array-like object, listing the direct sub-frames of the current window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/frames">Window.frames - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-frames">Window.frames - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-frames">Window.frames - HTML5</a>
   */
  @JsProperty(
      name = "frames"
  )
  @JsNonNull
  public static native Window frames();

  /**
   * The Window.history read-only property returns a reference to the History object, which provides an interface for manipulating the browser session history (pages visited in the tab or frame that the current page is loaded in).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/history">Window.history - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#the-history-interface">The History interface - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#the-history-interface">The History interface - HTML5</a>
   */
  @JsProperty(
      name = "history"
  )
  @JsNonNull
  public static native History history();

  @JsOverlay
  public static boolean isIndexedDBSupported() {
    return "true".equals( System.getProperty( "akasha.is__Window_indexedDB__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Window_indexedDB__supported" ) ) ? false : Js.global().has( "indexedDB" );
  }

  /**
   * The indexedDB read-only property of the WindowOrWorkerGlobalScope mixin provides a mechanism for applications to asynchronously access the capabilities of indexed databases.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/indexedDB">Window.indexedDB - MDN</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-windoworworkerglobalscope-indexeddb">indexedDB - Indexed Database API Draft</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-windoworworkerglobalscope-indexeddb">indexedDB - Indexed Database API 2.0</a>
   */
  @JsProperty(
      name = "indexedDB"
  )
  @JsNonNull
  public static native IDBFactory indexedDB();

  /**
   * The read-only innerHeight property of the Window interface returns the interior height of the window in pixels, including the height of the horizontal scroll bar, if present.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/innerHeight">Window.innerHeight - MDN</a>
   */
  @JsProperty(
      name = "innerHeight"
  )
  public static native int innerHeight();

  /**
   * The read-only Window property innerWidth returns the interior width of the window in pixels. This includes the width of the vertical scroll bar, if one is present.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/innerWidth">Window.innerWidth - MDN</a>
   */
  @JsProperty(
      name = "innerWidth"
  )
  public static native int innerWidth();

  /**
   * The window.isSecureContext read-only property indicates whether a context is capable of using features that require secure contexts.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/isSecureContext">Window.isSecureContext - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-secure-contexts/">Secure Contexts</a>
   */
  @JsProperty(
      name = "isSecureContext"
  )
  public static native boolean isSecureContext();

  /**
   * Returns the number of frames (either frame or iframe elements) in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/length">Window.length - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-length">Window.length - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-length">Window.length - HTML5</a>
   */
  @JsProperty(
      name = "length"
  )
  public static native int length();

  @JsOverlay
  public static boolean isLocalStorageSupported() {
    return "true".equals( System.getProperty( "akasha.is__Window_localStorage__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Window_localStorage__supported" ) ) ? false : Js.global().has( "localStorage" );
  }

  /**
   * The read-only localStorage property allows you to access a Storage object for the Document's origin; the stored data is saved across browser sessions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/localStorage">Window.localStorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-localstorage">localStorage - HTML Living Standard</a>
   */
  @JsProperty(
      name = "localStorage"
  )
  @JsNonNull
  public static native Storage localStorage();

  /**
   * The Window.location read-only property returns a Location object with information about the current location of the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/location">Window.location - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/history.html#the-location-interface">Window.location - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#the-location-interface">Window.location - HTML5</a>
   */
  @JsOverlay
  public static final Location location() {
    return Js.uncheckedCast( _location() );
  }

  @JsProperty(
      name = "location"
  )
  @JsNonNull
  private static native LocationOrWorkerLocationUnion _location();

  /**
   * Returns the locationbar object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/locationbar">Window.locationbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-locationbar">Window.locationbar - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-locationbar">Window.locationbar - HTML5</a>
   */
  @JsProperty(
      name = "locationbar"
  )
  @JsNonNull
  public static native BarProp locationbar();

  /**
   * The Window.menubar property returns the menubar object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/menubar">Window.menubar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-menubar">Window.menubar - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-menubar">Window.menubar - HTML5</a>
   */
  @JsProperty(
      name = "menubar"
  )
  @JsNonNull
  public static native BarProp menubar();

  /**
   * The Window.navigator read-only property returns a reference to the Navigator object, which has methods and properties about the application running the script.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/navigator">Window.navigator - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator">Window: navigator - HTML Living Standard</a>
   */
  @JsOverlay
  public static final Navigator navigator() {
    return Js.uncheckedCast( _navigator() );
  }

  @JsProperty(
      name = "navigator"
  )
  @JsNonNull
  private static native NavigatorOrWorkerNavigatorUnion _navigator();

  /**
   * The onmessage property of the WindowEventHandlers mixin is the EventHandler called whenever an object receives a message event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessage">WindowEventHandlers.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessage">onmessage - HTML Living Standard</a>
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

  @JsProperty(
      name = "orientation"
  )
  public static native short orientation();

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

  @JsProperty(
      name = "originAgentCluster"
  )
  public static native boolean originAgentCluster();

  /**
   * The Window.outerHeight read-only property returns the height in pixels of the whole browser window, including any sidebar, window chrome, and window-resizing borders/handles.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/outerHeight">Window.outerHeight - MDN</a>
   */
  @JsProperty(
      name = "outerHeight"
  )
  public static native int outerHeight();

  /**
   * Window.outerWidth read-only property returns the width of the outside of the browser window. It represents the width of the whole browser window including sidebar (if expanded), window chrome and window resizing borders/handles.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/outerWidth">Window.outerWidth - MDN</a>
   */
  @JsProperty(
      name = "outerWidth"
  )
  public static native int outerWidth();

  /**
   * The read-only Window property pageXOffset is an alias for scrollX.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/pageXOffset">Window.pageXOffset - MDN</a>
   */
  @JsProperty(
      name = "pageXOffset"
  )
  public static native double pageXOffset();

  /**
   * The read-only Window property pageYOffset is an alias for scrollY; as such, it returns the number of pixels the document is currently scrolled along the vertical axis (that is, up or down) with a value of 0.0, indicating that the top edge of the Document is currently aligned with the top edge of the window's content area.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/pageYOffset">Window.pageYOffset - MDN</a>
   */
  @JsProperty(
      name = "pageYOffset"
  )
  public static native double pageYOffset();

  /**
   * The Window.parent property is a reference to the parent of the current window or subframe.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/parent">Window.parent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-parent">window.parent - HTML Living Standard</a>
   */
  @JsProperty(
      name = "parent"
  )
  @JsNullable
  public static native Window parent();

  /**
   * The Window interface's performance property returns a Performance object, which can be used to gather performance information about the current document. It serves as the point of exposure for the Performance Timeline API, the High Resolution Time API, the Navigation Timing API, the User Timing API, and the Resource Timing API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/performance">Window.performance - MDN</a>
   * @see <a href="https://www.w3.org/TR/hr-time-1/#performance">window.performance - High Resolution Time</a>
   */
  @JsProperty(
      name = "performance"
  )
  @JsNonNull
  public static native Performance performance();

  /**
   * Returns the personalbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/personalbar">Window.personalbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-personalbar">Window.personalbar - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-personalbar">Window.personalbar - HTML5</a>
   */
  @JsProperty(
      name = "personalbar"
  )
  @JsNonNull
  public static native BarProp personalbar();

  /**
   * The Window property screen returns a reference to the screen object associated with the window. The screen object, implementing the Screen interface, is a special object for inspecting properties of the screen on which the current window is being rendered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screen">Window.screen - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screen">window.screen - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "screen"
  )
  @JsNonNull
  public static native Screen screen();

  /**
   * The Window.screenLeft read-only property returns the horizontal distance, in CSS pixels, from the left border of the user's browser viewport to the left side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenLeft">Window.screenLeft - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screenx">Window.screenLeft - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "screenLeft"
  )
  public static native int screenLeft();

  /**
   * The Window.screenTop read-only property returns the vertical distance, in CSS pixels, from the top border of the user's browser viewport to the top side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenTop">Window.screenTop - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screeny">Window.screenTop - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "screenTop"
  )
  public static native int screenTop();

  /**
   * The Window.screenX read-only property returns the horizontal distance, in CSS pixels, of the left border of the user's browser viewport to the left side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenX">Window.screenX - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screenx">Window.screenX - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "screenX"
  )
  public static native int screenX();

  /**
   * The Window.screenY read-only property returns the vertical distance, in CSS pixels, of the top border of the user's browser viewport to the top edge of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenY">Window.screenY - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screeny">Window.screenY - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "screenY"
  )
  public static native int screenY();

  /**
   * The read-only scrollX property of the Window interface returns the number of pixels that the document is currently scrolled horizontally. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a whole number. You can get the number of pixels the document is scrolled vertically from the scrollY property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollX">Window.scrollX - MDN</a>
   */
  @JsProperty(
      name = "scrollX"
  )
  public static native double scrollX();

  /**
   * The read-only scrollY property of the Window interface returns the number of pixels that the document is currently scrolled vertically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollY">Window.scrollY - MDN</a>
   */
  @JsProperty(
      name = "scrollY"
  )
  public static native double scrollY();

  /**
   * The Window.scrollbars property returns the scrollbars object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollbars">Window.scrollbars - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-scrollbars">Window.scrollbars - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-scrollbars">Window.scrollbars - HTML5</a>
   */
  @JsProperty(
      name = "scrollbars"
  )
  @JsNonNull
  public static native BarProp scrollbars();

  /**
   * The Window.self read-only property returns the window itself, as a WindowProxy. It can be used with dot notation on a window object (that is, window.self) or standalone (self). The advantage of the standalone notation is that a similar notation exists for non-window contexts, such as in Web Workers. By using self, you can refer to the global scope in a way that will work not only in a window context (self will resolve to window.self) but also in a worker context (self will then resolve to WorkerGlobalScope.self).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/self">Window.self - MDN</a>
   */
  @JsOverlay
  public static final Window self() {
    return Js.uncheckedCast( _self() );
  }

  @JsProperty(
      name = "self"
  )
  @JsNonNull
  private static native WindowOrWorkerGlobalScopeUnion _self();

  @JsOverlay
  public static boolean isSessionStorageSupported() {
    return "true".equals( System.getProperty( "akasha.is__Window_sessionStorage__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Window_sessionStorage__supported" ) ) ? false : Js.global().has( "sessionStorage" );
  }

  /**
   * The read-only sessionStorage property accesses a session Storage object for the current origin. sessionStorage is similar to localStorage; the difference is that while data in localStorage doesn't expire, data in sessionStorage is cleared when the page session ends.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/sessionStorage">Window.sessionStorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-sessionstorage">sessionStorage - HTML Living Standard</a>
   */
  @JsProperty(
      name = "sessionStorage"
  )
  @JsNonNull
  public static native Storage sessionStorage();

  @JsOverlay
  public static boolean isSpeechSynthesisSupported() {
    return "true".equals( System.getProperty( "akasha.is__Window_speechSynthesis__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Window_speechSynthesis__supported" ) ) ? false : Js.global().has( "speechSynthesis" );
  }

  /**
   * The speechSynthesis read-only property of the Window object returns a SpeechSynthesis object, which is the entry point into using Web Speech API speech synthesis functionality.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/speechSynthesis">Window.speechSynthesis - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#tts-section">SpeechSynthesis - Web Speech API</a>
   */
  @JsProperty(
      name = "speechSynthesis"
  )
  @JsNonNull
  public static native SpeechSynthesis speechSynthesis();

  /**
   * The Window.statusbar property returns the statusbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/statusbar">Window.statusbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-statusbar">Window.statusbar - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-statusbar">Window.statusbar - HTML5</a>
   */
  @JsProperty(
      name = "statusbar"
  )
  @JsNonNull
  public static native BarProp statusbar();

  /**
   * The Window.toolbar property returns the toolbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/toolbar">Window.toolbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-toolbar">Window.toolbar - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-toolbar">Window.toolbar - HTML5</a>
   */
  @JsProperty(
      name = "toolbar"
  )
  @JsNonNull
  public static native BarProp toolbar();

  /**
   * Returns a reference to the topmost window in the window hierarchy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/top">Window.top - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-top">window.top - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-top">window.top - HTML5</a>
   */
  @JsProperty(
      name = "top"
  )
  @JsNullable
  public static native Window top();

  /**
   * The visualViewport read-only property of the Window interface returns a VisualViewport object representing the visual viewport for a given window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/visualViewport">Window.visualViewport - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-window-visualviewport">visualViewport - Visual Viewport API</a>
   */
  @JsProperty(
      name = "visualViewport"
  )
  @JsNonNull
  public static native VisualViewport visualViewport();

  /**
   * The window property of a Window object points to the window object itself.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/window">Window.window - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-window">Window.window - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/browsers.html#dom-window">Window.window - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window">Window.window - HTML5</a>
   */
  @JsProperty(
      name = "window"
  )
  @JsNonNull
  public static native Window window();

  /**
   * The Window.alert() method displays an alert dialog with the optional specified content and an OK button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/alert">Window.alert - MDN</a>
   */
  public static native void alert();

  /**
   * The Window.alert() method displays an alert dialog with the optional specified content and an OK button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/alert">Window.alert - MDN</a>
   */
  public static native void alert(@Nonnull String message);

  /**
   * Shifts focus away from the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/blur">Window.blur - MDN</a>
   */
  public static native void blur();

  /**
   * The Window.close() method closes the current window, or the window on which it was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/close">Window.close - MDN</a>
   */
  public static native void close();

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and two buttons: OK and Cancel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/confirm">Window.confirm - MDN</a>
   */
  public static native boolean confirm(@Nonnull String message);

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and two buttons: OK and Cancel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/confirm">Window.confirm - MDN</a>
   */
  public static native boolean confirm();

  /**
   * Makes a request to bring the window to the front. It may fail due to user settings and the window isn't guaranteed to be frontmost before this method returns.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/focus">Window.focus - MDN</a>
   */
  public static native void focus();

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @JsNullable
  public static native Window open(@Nonnull String url, @Nonnull String target,
      @Nonnull String features);

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @JsNullable
  public static native Window open(@Nonnull String url, @Nonnull String target);

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @JsNullable
  public static native Window open(@Nonnull String url);

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @JsNullable
  public static native Window open();

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">postMessage() - HTML Living Standard</a>
   */
  public static native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin, @Nonnull JsArray<Transferable> transfer);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">postMessage() - HTML Living Standard</a>
   */
  @JsOverlay
  public static final void postMessage(@DoNotAutobox @Nullable final Object message,
      @Nonnull final String targetOrigin, @Nonnull final Transferable... transfer) {
    _postMessage( message, targetOrigin, transfer );
  }

  @JsMethod(
      name = "postMessage"
  )
  private static native void _postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin, @Nonnull Transferable[] transfer);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">postMessage() - HTML Living Standard</a>
   */
  public static native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">postMessage() - HTML Living Standard</a>
   */
  public static native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull WindowPostMessageOptions options);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">postMessage() - HTML Living Standard</a>
   */
  public static native void postMessage(@DoNotAutobox @Nullable Object message);

  /**
   * Opens the Print Dialog to print the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/print">Window.print - MDN</a>
   */
  public static native void print();

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @JsNullable
  public static native String prompt(@Nonnull String message, @Nonnull String default_);

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @JsNullable
  public static native String prompt(@Nonnull String message);

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @JsNullable
  public static native String prompt();

  /**
   * The window.stop() stops further resource loading in the current browsing context, equivalent to the stop button in the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/stop">Window.stop - MDN</a>
   */
  public static native void stop();

  /**
   * The Window.getComputedStyle() method returns an object containing the values of all CSS properties of an element, after applying active stylesheets and resolving any basic computation those values may contain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getComputedStyle">Window.getComputedStyle - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-window-getcomputedstyle">getComputedStyle() - CSS Object Model (CSSOM)</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/#CSS-CSSview-getComputedStyle">getComputedStyle() - Document Object Model (DOM) Level 2 Style Specification</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public static native CSSStyleDeclaration getComputedStyle(@Nonnull Element elt,
      @Nonnull String pseudoElt);

  /**
   * The Window.getComputedStyle() method returns an object containing the values of all CSS properties of an element, after applying active stylesheets and resolving any basic computation those values may contain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getComputedStyle">Window.getComputedStyle - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-window-getcomputedstyle">getComputedStyle() - CSS Object Model (CSSOM)</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/#CSS-CSSview-getComputedStyle">getComputedStyle() - Document Object Model (DOM) Level 2 Style Specification</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public static native CSSStyleDeclaration getComputedStyle(@Nonnull Element elt);

  /**
   * The Window interface's matchMedia() method returns a new MediaQueryList object that can then be used to determine if the document matches the media query string, as well as to monitor the document to detect when it matches (or stops matching) that media query.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/matchMedia">Window.matchMedia - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-matchmedia">Window.matchMedia() - CSS Object Model (CSSOM) View Module</a>
   */
  @JsNonNull
  public static native MediaQueryList matchMedia(@Nonnull String query);

  /**
   * The moveBy() method of the Window interface moves the current window by a specified amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/moveBy">Window.moveBy - MDN</a>
   */
  public static native void moveBy(int x, int y);

  /**
   * The moveTo() method of the Window interface moves the current window to the specified coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/moveTo">Window.moveTo - MDN</a>
   */
  public static native void moveTo(int x, int y);

  /**
   * The Window.resizeBy() method resizes the current window by a specified amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/resizeBy">Window.resizeBy - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-resizeby">window.resizeBy() - CSS Object Model (CSSOM) View Module</a>
   */
  public static native void resizeBy(int x, int y);

  /**
   * The Window.resizeTo() method dynamically resizes the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/resizeTo">Window.resizeTo - MDN</a>
   */
  public static native void resizeTo(int width, int height);

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public static native void scroll(@Nonnull ScrollToOptions options);

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public static native void scroll();

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public static native void scroll(double x, double y);

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public static native void scrollBy(@Nonnull ScrollToOptions options);

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public static native void scrollBy();

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public static native void scrollBy(double x, double y);

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">window.scroll() - CSS Object Model (CSSOM) View Module</a>
   */
  public static native void scrollTo(@Nonnull ScrollToOptions options);

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">window.scroll() - CSS Object Model (CSSOM) View Module</a>
   */
  public static native void scrollTo();

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">window.scroll() - CSS Object Model (CSSOM) View Module</a>
   */
  public static native void scrollTo(double x, double y);

  /**
   * The window.cancelIdleCallback() method cancels a callback previously scheduled with window.requestIdleCallback().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/cancelIdleCallback">Window.cancelIdleCallback - MDN</a>
   * @see <a href="https://www.w3.org/TR/requestidlecallback/">Cooperative Scheduling of Background Tasks</a>
   */
  public static native void cancelIdleCallback(int handle);

  /**
   * The window.requestIdleCallback() method queues a function to be called during a browser's idle periods. This enables developers to perform background and low priority work on the main event loop, without impacting latency-critical events such as animation and input response. Functions are generally called in first-in-first-out order; however, callbacks which have a timeout specified may be called out-of-order if necessary in order to run them before the timeout elapses.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/requestIdleCallback">Window.requestIdleCallback - MDN</a>
   * @see <a href="https://www.w3.org/TR/requestidlecallback/">Cooperative Scheduling of Background Tasks</a>
   */
  public static native int requestIdleCallback(@Nonnull IdleRequestCallback callback,
      @Nonnull IdleRequestOptions options);

  /**
   * The window.requestIdleCallback() method queues a function to be called during a browser's idle periods. This enables developers to perform background and low priority work on the main event loop, without impacting latency-critical events such as animation and input response. Functions are generally called in first-in-first-out order; however, callbacks which have a timeout specified may be called out-of-order if necessary in order to run them before the timeout elapses.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/requestIdleCallback">Window.requestIdleCallback - MDN</a>
   * @see <a href="https://www.w3.org/TR/requestidlecallback/">Cooperative Scheduling of Background Tasks</a>
   */
  public static native int requestIdleCallback(@Nonnull IdleRequestCallback callback);

  /**
   * The Window.getSelection() method returns a Selection object representing the range of text selected by the user or the current position of the caret.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getSelection">Window.getSelection - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#extensions-to-window-interface">Window.getSelection() - Selection API</a>
   */
  @HasNoSideEffects
  @JsNullable
  public static native Selection getSelection();

  /**
   * The WindowOrWorkerGlobalScope.atob() function decodes a string of data which has been encoded using Base64 encoding. You can use the btoa() method to encode and transmit data which may otherwise cause communication problems, then transmit it and use the atob() method to decode the data again. For example, you can encode, transmit, and decode control characters such as ASCII values 0 through 31.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/atob">Window.atob - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/btoa">Window.btoa - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearInterval">Window.clearInterval - MDN</a>
   */
  public static native void clearInterval(int id);

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearInterval">Window.clearInterval - MDN</a>
   */
  public static native void clearInterval();

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearTimeout">Window.clearTimeout - MDN</a>
   */
  public static native void clearTimeout(int id);

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearTimeout">Window.clearTimeout - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public static native Promise<Response> fetch(@Nonnull Request input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public static native Promise<Response> fetch(@Nonnull String input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public static native Promise<Response> fetch(@Nonnull RequestInfo input);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public static native Promise<Response> fetch(@Nonnull Request input);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">fetch() - Fetch</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">fetch() - Fetch</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsNonNull
  public static native Promise<Response> fetch(@Nonnull String input);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowOrWorkerGlobalScope.setInterval() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowTimers.setInterval() - HTML Living Standard</a>
   */
  public static native int setInterval(@Nonnull TimerHandler handler, int timeout);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowOrWorkerGlobalScope.setInterval() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">WindowTimers.setInterval() - HTML Living Standard</a>
   */
  public static native int setInterval(@Nonnull TimerHandler handler);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowOrWorkerGlobalScope.setTimeout() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowTimers.setTimeout() - HTML Living Standard</a>
   */
  public static native int setTimeout(@Nonnull TimerHandler handler, int timeout);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowOrWorkerGlobalScope.setTimeout() - HTML Living Standard</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">WindowTimers.setTimeout() - HTML Living Standard</a>
   */
  public static native int setTimeout(@Nonnull TimerHandler handler);

  /**
   * The window.cancelAnimationFrame() method cancels an animation frame request previously scheduled through a call to window.requestAnimationFrame().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/cancelAnimationFrame">Window.cancelAnimationFrame - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#animationframeprovider-cancelanimationframe">cancelAnimationFrame() - HTML Living Standard</a>
   */
  public static native void cancelAnimationFrame(int handle);

  /**
   * The window.requestAnimationFrame() method tells the browser that you wish to perform an animation and requests that the browser calls a specified function to update an animation before the next repaint. The method takes a callback as an argument to be invoked before the repaint.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/requestAnimationFrame">Window.requestAnimationFrame - MDN</a>
   */
  public static native int requestAnimationFrame(@Nonnull FrameRequestCallback callback);

  @JsOverlay
  public static void addHashchangeListener(@Nonnull final HashChangeEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "hashchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addHashchangeListener(@Nonnull final HashChangeEventListener callback,
      final boolean useCapture) {
    addEventListener( "hashchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addHashchangeListener(@Nonnull final HashChangeEventListener callback) {
    addEventListener( "hashchange", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeHashchangeListener(@Nonnull final HashChangeEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "hashchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeHashchangeListener(@Nonnull final HashChangeEventListener callback,
      final boolean useCapture) {
    removeEventListener( "hashchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeHashchangeListener(@Nonnull final HashChangeEventListener callback) {
    removeEventListener( "hashchange", Js.cast( callback ) );
  }

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

  @JsOverlay
  public static void addPagehideListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pagehide", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPagehideListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "pagehide", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPagehideListener(@Nonnull final PageTransitionEventListener callback) {
    addEventListener( "pagehide", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePagehideListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pagehide", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePagehideListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pagehide", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePagehideListener(@Nonnull final PageTransitionEventListener callback) {
    removeEventListener( "pagehide", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addPageshowListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pageshow", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPageshowListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "pageshow", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPageshowListener(@Nonnull final PageTransitionEventListener callback) {
    addEventListener( "pageshow", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePageshowListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pageshow", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePageshowListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pageshow", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePageshowListener(@Nonnull final PageTransitionEventListener callback) {
    removeEventListener( "pageshow", Js.cast( callback ) );
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
  public static void addStorageListener(@Nonnull final StorageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "storage", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addStorageListener(@Nonnull final StorageEventListener callback,
      final boolean useCapture) {
    addEventListener( "storage", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addStorageListener(@Nonnull final StorageEventListener callback) {
    addEventListener( "storage", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeStorageListener(@Nonnull final StorageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "storage", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeStorageListener(@Nonnull final StorageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "storage", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeStorageListener(@Nonnull final StorageEventListener callback) {
    removeEventListener( "storage", Js.cast( callback ) );
  }

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
  public static void addPopstateListener(@Nonnull final PopStateEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "popstate", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPopstateListener(@Nonnull final PopStateEventListener callback,
      final boolean useCapture) {
    addEventListener( "popstate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPopstateListener(@Nonnull final PopStateEventListener callback) {
    addEventListener( "popstate", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePopstateListener(@Nonnull final PopStateEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "popstate", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePopstateListener(@Nonnull final PopStateEventListener callback,
      final boolean useCapture) {
    removeEventListener( "popstate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePopstateListener(@Nonnull final PopStateEventListener callback) {
    removeEventListener( "popstate", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "beforeunload", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback,
      final boolean useCapture) {
    addEventListener( "beforeunload", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback) {
    addEventListener( "beforeunload", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "beforeunload", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback,
      final boolean useCapture) {
    removeEventListener( "beforeunload", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeBeforeunloadListener(@Nonnull final BeforeUnloadEventListener callback) {
    removeEventListener( "beforeunload", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addDragListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "drag", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addDragListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "drag", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addDragListener(@Nonnull final DragEventListener callback) {
    addEventListener( "drag", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeDragListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "drag", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeDragListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "drag", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeDragListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "drag", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addDragleaveListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addDragleaveListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "dragleave", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addDragleaveListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragleave", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeDragleaveListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeDragleaveListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "dragleave", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeDragleaveListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragleave", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addDragstartListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addDragstartListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "dragstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addDragstartListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragstart", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeDragstartListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeDragstartListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "dragstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeDragstartListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragstart", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addDropListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "drop", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addDropListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "drop", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addDropListener(@Nonnull final DragEventListener callback) {
    addEventListener( "drop", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeDropListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "drop", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeDropListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "drop", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeDropListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "drop", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addErrorListener(@Nonnull final ErrorEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addErrorListener(@Nonnull final ErrorEventListener callback,
      final boolean useCapture) {
    addEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addErrorListener(@Nonnull final ErrorEventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeErrorListener(@Nonnull final ErrorEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeErrorListener(@Nonnull final ErrorEventListener callback,
      final boolean useCapture) {
    removeEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeErrorListener(@Nonnull final ErrorEventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addDragendListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragend", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addDragendListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "dragend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addDragendListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragend", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeDragendListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragend", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeDragendListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "dragend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeDragendListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragend", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addDragenterListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addDragenterListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "dragenter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addDragenterListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragenter", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeDragenterListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeDragenterListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "dragenter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeDragenterListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragenter", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addDragoverListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragover", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addDragoverListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "dragover", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addDragoverListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragover", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeDragoverListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragover", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeDragoverListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "dragover", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeDragoverListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragover", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addAnimationstartListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addAnimationstartListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addAnimationstartListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationstart", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeAnimationstartListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeAnimationstartListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    removeEventListener( "animationstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeAnimationstartListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationstart", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationcancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addAnimationcancelListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    removeEventListener( "animationcancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addAnimationendListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationend", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addAnimationendListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addAnimationendListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationend", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeAnimationendListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationend", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeAnimationendListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    removeEventListener( "animationend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeAnimationendListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationend", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationiteration", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationiteration", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addAnimationiterationListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationiteration", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeAnimationiterationListener(
      @Nonnull final AnimationEventListener callback, @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationiteration", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeAnimationiterationListener(
      @Nonnull final AnimationEventListener callback, final boolean useCapture) {
    removeEventListener( "animationiteration", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeAnimationiterationListener(
      @Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationiteration", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addTransitionrunListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionrun", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addTransitionrunListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitionrun", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addTransitionrunListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionrun", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeTransitionrunListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionrun", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeTransitionrunListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitionrun", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeTransitionrunListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionrun", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitioncancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitioncancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addTransitioncancelListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitioncancel", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitioncancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitioncancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeTransitioncancelListener(
      @Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitioncancel", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addTransitionstartListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addTransitionstartListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitionstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addTransitionstartListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionstart", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeTransitionstartListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeTransitionstartListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitionstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeTransitionstartListener(
      @Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionstart", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addTransitionendListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addTransitionendListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitionend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addTransitionendListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionend", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeTransitionendListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeTransitionendListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitionend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeTransitionendListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionend", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addPointerdownListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerdown", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPointerdownListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerdown", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPointerdownListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerdown", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePointerdownListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerdown", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePointerdownListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerdown", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePointerdownListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerdown", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "gotpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "gotpointercapture", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addGotpointercaptureListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "gotpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "gotpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "gotpointercapture", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeGotpointercaptureListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "gotpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "lostpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "lostpointercapture", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addLostpointercaptureListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "lostpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "lostpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "lostpointercapture", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeLostpointercaptureListener(
      @Nonnull final PointerEventListener callback) {
    removeEventListener( "lostpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addPointerenterListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPointerenterListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerenter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPointerenterListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerenter", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePointerenterListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePointerenterListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerenter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePointerenterListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerenter", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addPointeroutListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerout", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPointeroutListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerout", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPointeroutListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerout", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePointeroutListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerout", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePointeroutListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerout", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePointeroutListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerout", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addPointerupListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerup", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPointerupListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerup", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPointerupListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerup", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePointerupListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerup", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePointerupListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerup", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePointerupListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerup", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addPointermoveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointermove", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPointermoveListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointermove", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPointermoveListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointermove", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePointermoveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointermove", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePointermoveListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointermove", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePointermoveListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointermove", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addPointerleaveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPointerleaveListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerleave", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPointerleaveListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerleave", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePointerleaveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePointerleaveListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerleave", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePointerleaveListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerleave", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addPointeroverListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerover", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPointeroverListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerover", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPointeroverListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerover", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePointeroverListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerover", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePointeroverListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerover", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePointeroverListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerover", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addPointercancelListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointercancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPointercancelListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointercancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPointercancelListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointercancel", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePointercancelListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointercancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePointercancelListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointercancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePointercancelListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointercancel", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addTouchendListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchend", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addTouchendListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    addEventListener( "touchend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addTouchendListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchend", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeTouchendListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchend", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeTouchendListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    removeEventListener( "touchend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeTouchendListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchend", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addTouchmoveListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchmove", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addTouchmoveListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    addEventListener( "touchmove", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addTouchmoveListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchmove", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeTouchmoveListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchmove", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeTouchmoveListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    removeEventListener( "touchmove", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeTouchmoveListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchmove", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addTouchcancelListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addTouchcancelListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    addEventListener( "touchcancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addTouchcancelListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeTouchcancelListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeTouchcancelListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    removeEventListener( "touchcancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeTouchcancelListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addTouchstartListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addTouchstartListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    addEventListener( "touchstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addTouchstartListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchstart", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeTouchstartListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeTouchstartListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    removeEventListener( "touchstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeTouchstartListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchstart", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addDOMContentLoadedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "DOMContentLoaded", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addDOMContentLoadedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "DOMContentLoaded", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addDOMContentLoadedListener(@Nonnull final EventListener callback) {
    addEventListener( "DOMContentLoaded", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeDOMContentLoadedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "DOMContentLoaded", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeDOMContentLoadedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "DOMContentLoaded", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeDOMContentLoadedListener(@Nonnull final EventListener callback) {
    removeEventListener( "DOMContentLoaded", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addAfterprintListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "afterprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addAfterprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "afterprint", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addAfterprintListener(@Nonnull final EventListener callback) {
    addEventListener( "afterprint", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeAfterprintListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "afterprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeAfterprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "afterprint", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeAfterprintListener(@Nonnull final EventListener callback) {
    removeEventListener( "afterprint", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addAppinstalledListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "appinstalled", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addAppinstalledListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "appinstalled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addAppinstalledListener(@Nonnull final EventListener callback) {
    addEventListener( "appinstalled", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeAppinstalledListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "appinstalled", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeAppinstalledListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "appinstalled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeAppinstalledListener(@Nonnull final EventListener callback) {
    removeEventListener( "appinstalled", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addBeforeprintListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "beforeprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addBeforeprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "beforeprint", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addBeforeprintListener(@Nonnull final EventListener callback) {
    addEventListener( "beforeprint", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeBeforeprintListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "beforeprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeBeforeprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "beforeprint", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeBeforeprintListener(@Nonnull final EventListener callback) {
    removeEventListener( "beforeprint", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addBlurListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "blur", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addBlurListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    addEventListener( "blur", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addBlurListener(@Nonnull final FocusEventListener callback) {
    addEventListener( "blur", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeBlurListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "blur", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeBlurListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    removeEventListener( "blur", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeBlurListener(@Nonnull final FocusEventListener callback) {
    removeEventListener( "blur", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "clipboardchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "clipboardchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "clipboardchange", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "clipboardchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    removeEventListener( "clipboardchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "clipboardchange", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addCopyListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "copy", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addCopyListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "copy", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addCopyListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "copy", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeCopyListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "copy", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeCopyListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    removeEventListener( "copy", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeCopyListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "copy", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addCutListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "cut", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addCutListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "cut", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addCutListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "cut", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeCutListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "cut", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeCutListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    removeEventListener( "cut", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeCutListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "cut", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "devicemotion", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      final boolean useCapture) {
    addEventListener( "devicemotion", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback) {
    addEventListener( "devicemotion", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "devicemotion", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "devicemotion", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback) {
    removeEventListener( "devicemotion", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "deviceorientation", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback, final boolean useCapture) {
    addEventListener( "deviceorientation", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback) {
    addEventListener( "deviceorientation", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "deviceorientation", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback, final boolean useCapture) {
    removeEventListener( "deviceorientation", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback) {
    removeEventListener( "deviceorientation", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addFocusListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "focus", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addFocusListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    addEventListener( "focus", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addFocusListener(@Nonnull final FocusEventListener callback) {
    addEventListener( "focus", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeFocusListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "focus", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeFocusListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    removeEventListener( "focus", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeFocusListener(@Nonnull final FocusEventListener callback) {
    removeEventListener( "focus", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "gamepadconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    addEventListener( "gamepadconnected", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback) {
    addEventListener( "gamepadconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "gamepadconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    removeEventListener( "gamepadconnected", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback) {
    removeEventListener( "gamepadconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "gamepaddisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    addEventListener( "gamepaddisconnected", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback) {
    addEventListener( "gamepaddisconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "gamepaddisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    removeEventListener( "gamepaddisconnected", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeGamepaddisconnectedListener(
      @Nonnull final GamepadEventListener callback) {
    removeEventListener( "gamepaddisconnected", Js.cast( callback ) );
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
  public static void addLoadListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addLoadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "load", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addLoadListener(@Nonnull final EventListener callback) {
    addEventListener( "load", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeLoadListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeLoadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "load", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeLoadListener(@Nonnull final EventListener callback) {
    removeEventListener( "load", Js.cast( callback ) );
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

  @JsOverlay
  public static void addOrientationchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "orientationchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addOrientationchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "orientationchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addOrientationchangeListener(@Nonnull final EventListener callback) {
    addEventListener( "orientationchange", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeOrientationchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "orientationchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeOrientationchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "orientationchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeOrientationchangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "orientationchange", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addPasteListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addPasteListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "paste", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addPasteListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "paste", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removePasteListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removePasteListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    removeEventListener( "paste", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removePasteListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "paste", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addResizeListener(@Nonnull final UIEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "resize", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addResizeListener(@Nonnull final UIEventListener callback,
      final boolean useCapture) {
    addEventListener( "resize", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addResizeListener(@Nonnull final UIEventListener callback) {
    addEventListener( "resize", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeResizeListener(@Nonnull final UIEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "resize", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeResizeListener(@Nonnull final UIEventListener callback,
      final boolean useCapture) {
    removeEventListener( "resize", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeResizeListener(@Nonnull final UIEventListener callback) {
    removeEventListener( "resize", Js.cast( callback ) );
  }

  @JsOverlay
  public static void addUnloadListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "unload", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void addUnloadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "unload", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void addUnloadListener(@Nonnull final EventListener callback) {
    addEventListener( "unload", Js.cast( callback ) );
  }

  @JsOverlay
  public static void removeUnloadListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "unload", Js.cast( callback ), options );
  }

  @JsOverlay
  public static void removeUnloadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "unload", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public static void removeUnloadListener(@Nonnull final EventListener callback) {
    removeEventListener( "unload", Js.cast( callback ) );
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
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.hasownproperty"># sec-object.prototype.hasownproperty</a>
   */
  @HasNoSideEffects
  public static native boolean hasOwnProperty(@Nonnull Symbol prop);

  /**
   * The hasOwnProperty() method returns a boolean indicating whether the object has the specified property as its own property (as opposed to inheriting it).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/hasOwnProperty">Object.hasOwnProperty - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.hasownproperty"># sec-object.prototype.hasownproperty</a>
   */
  @HasNoSideEffects
  public static native boolean hasOwnProperty(@Nonnull String prop);

  /**
   * The propertyIsEnumerable() method returns a Boolean indicating whether the specified property is enumerable and is the object's own property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/propertyIsEnumerable">Object.propertyIsEnumerable - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.propertyisenumerable"># sec-object.prototype.propertyisenumerable</a>
   */
  @HasNoSideEffects
  public static native boolean propertyIsEnumerable(@Nonnull String prop);

  /**
   * The isPrototypeOf() method checks if an object exists in another object's prototype chain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/isPrototypeOf">Object.isPrototypeOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.isprototypeof"># sec-object.prototype.isprototypeof</a>
   */
  @HasNoSideEffects
  public static native boolean isPrototypeOf(@Nonnull JsObject obj);

  /**
   * The valueOf() method returns the primitive value of the specified object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/valueOf">Object.valueOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.valueof"># sec-object.prototype.valueof</a>
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
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.tostring"># sec-object.prototype.tostring</a>
   */
  @JsMethod(
      name = "toString"
  )
  @HasNoSideEffects
  @JsNonNull
  public static native String toString_();
}
