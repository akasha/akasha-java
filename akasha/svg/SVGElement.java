package akasha.svg;

import akasha.AddEventListenerOptions;
import akasha.AnimationEventHandler;
import akasha.AnimationEventListener;
import akasha.CSSStyleDeclaration;
import akasha.DOMStringMap;
import akasha.DragEventHandler;
import akasha.DragEventListener;
import akasha.Element;
import akasha.ErrorEventListener;
import akasha.EventHandler;
import akasha.EventListenerOptions;
import akasha.FocusEventHandler;
import akasha.FocusOptions;
import akasha.MouseEventHandler;
import akasha.OnErrorEventHandler;
import akasha.PointerEventHandler;
import akasha.PointerEventListener;
import akasha.TouchEventHandler;
import akasha.TransitionEventHandler;
import akasha.TransitionEventListener;
import akasha.WheelEventHandler;
import akasha.clipboard.ClipboardEventHandler;
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
 * All of the SVG DOM interfaces that correspond directly to elements in the SVG language derive from the SVGElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement">SVGElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/types.html#InterfaceSVGElement"># InterfaceSVGElement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGElement"
)
public class SVGElement extends Element {
  public boolean autofocus;

  @JsNonNull
  public String nonce;

  /**
   * The onabort property of the GlobalEventHandlers mixin is the EventHandler for processing abort events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onabort">SVGElement.onabort - MDN</a>
   */
  @JsNullable
  public EventHandler onabort;

  /**
   * The onanimationcancel property of the GlobalEventHandlers mixin is the EventHandler for processing animationcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationcancel">GlobalEventHandlers.onanimationcancel - MDN</a>
   */
  @JsNullable
  public AnimationEventHandler onanimationcancel;

  /**
   * The onanimationend property of the GlobalEventHandlers mixin is the EventHandler for processing animationend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationend">GlobalEventHandlers.onanimationend - MDN</a>
   */
  @JsNullable
  public AnimationEventHandler onanimationend;

  /**
   * The onanimationiteration property of the GlobalEventHandlers mixin is the EventHandler for processing animationiteration events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationiteration">GlobalEventHandlers.onanimationiteration - MDN</a>
   */
  @JsNullable
  public AnimationEventHandler onanimationiteration;

  /**
   * An event handler for the animationstart event. This event is sent when a CSS Animation starts to play.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationstart">GlobalEventHandlers.onanimationstart - MDN</a>
   */
  @JsNullable
  public AnimationEventHandler onanimationstart;

  /**
   * The onauxclick property of the GlobalEventHandlers mixin is an EventHandler for processing auxclick events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onauxclick">GlobalEventHandlers.onauxclick - MDN</a>
   * @see <a href="https://w3c.github.io/uievents/#event-type-auxclick">onauxclick - UI Events</a>
   */
  @JsNullable
  public MouseEventHandler onauxclick;

  @JsNullable
  public EventHandler onbeforexrselect;

  /**
   * The onblur property of the GlobalEventHandlers mixin is the EventHandler for processing blur events. It's available on Element, Document, and Window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onblur">SVGElement.onblur - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onblur">onblur - HTML Living Standard</a>
   */
  @JsNullable
  public FocusEventHandler onblur;

  /**
   * The oncancel property of the GlobalEventHandlers mixin is an EventHandler for processing cancel events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncancel">GlobalEventHandlers.oncancel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncancel">oncancel - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler oncancel;

  /**
   * The oncanplay property of the GlobalEventHandlers mixin is the EventHandler for processing canplay events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplay">GlobalEventHandlers.oncanplay - MDN</a>
   */
  @JsNullable
  public EventHandler oncanplay;

  /**
   * The oncanplaythrough property of the GlobalEventHandlers mixin is the EventHandler for processing canplaythrough events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplaythrough">GlobalEventHandlers.oncanplaythrough - MDN</a>
   */
  @JsNullable
  public EventHandler oncanplaythrough;

  /**
   * The onchange property of the GlobalEventHandlers mixin is an EventHandler for processing change events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onchange">SVGElement.onchange - MDN</a>
   */
  @JsNullable
  public EventHandler onchange;

  /**
   * The onclick property of the GlobalEventHandlers mixin is the EventHandler for processing click events on a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onclick">SVGElement.onclick - MDN</a>
   */
  @JsNullable
  public PointerEventHandler onclick;

  /**
   * The onclose property of the GlobalEventHandlers mixin is an EventHandler for processing close events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclose">GlobalEventHandlers.onclose - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onclose">onclose - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler onclose;

  @JsNullable
  public EventHandler oncontextlost;

  /**
   * The oncontextmenu property of the GlobalEventHandlers mixin is an EventHandler that processes contextmenu events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/oncontextmenu">SVGElement.oncontextmenu - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncontextmenu">oncontextmenu - HTML Living Standard</a>
   */
  @JsNullable
  public PointerEventHandler oncontextmenu;

  @JsNullable
  public EventHandler oncontextrestored;

  @JsNullable
  public ClipboardEventHandler oncopy;

  /**
   * The oncuechange property of the GlobalEventHandlers mixin is the EventHandler for processing cuechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncuechange">GlobalEventHandlers.oncuechange - MDN</a>
   */
  @JsNullable
  public EventHandler oncuechange;

  @JsNullable
  public ClipboardEventHandler oncut;

  /**
   * The ondblclick property of the GlobalEventHandlers mixin is an EventHandler that processes dblclick events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/ondblclick">SVGElement.ondblclick - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-ondblclick">ondblclick - HTML Living Standard</a>
   */
  @JsNullable
  public MouseEventHandler ondblclick;

  /**
   * A global event handler for the drag event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrag">GlobalEventHandlers.ondrag - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrag">ondrag - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrag">ondrag - HTML 5.1</a>
   */
  @JsNullable
  public DragEventHandler ondrag;

  /**
   * A global event handler for the dragend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragend">GlobalEventHandlers.ondragend - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragend">ondragend - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragend">ondragend - HTML 5.1</a>
   */
  @JsNullable
  public DragEventHandler ondragend;

  /**
   * A global event handler for the dragenter event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragenter">GlobalEventHandlers.ondragenter - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragenter">ondragenter - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragenter">ondragenter - HTML 5.1</a>
   */
  @JsNullable
  public DragEventHandler ondragenter;

  /**
   * A global event handler for the dragleave event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragleave">GlobalEventHandlers.ondragleave - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragleave">ondragleave - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragleave">ondragleave - HTML 5.1</a>
   */
  @JsNullable
  public DragEventHandler ondragleave;

  /**
   * A global event handler for the dragover event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragover">GlobalEventHandlers.ondragover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragover">ondragover - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragover">ondragover - HTML 5.1</a>
   */
  @JsNullable
  public DragEventHandler ondragover;

  /**
   * A global event handler for the dragstart event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragstart">GlobalEventHandlers.ondragstart - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragstart">ondragstart - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragstart">ondragstart - HTML 5.1</a>
   */
  @JsNullable
  public DragEventHandler ondragstart;

  /**
   * A global event handler for the drop event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrop">GlobalEventHandlers.ondrop - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrop">ondrop - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrop">ondrop - HTML 5.1</a>
   */
  @JsNullable
  public DragEventHandler ondrop;

  /**
   * The ondurationchange property of the GlobalEventHandlers mixin is the EventHandler for processing durationchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondurationchange">GlobalEventHandlers.ondurationchange - MDN</a>
   */
  @JsNullable
  public EventHandler ondurationchange;

  /**
   * The onemptied property sets and returns the event handler for the emptied event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onemptied">GlobalEventHandlers.onemptied - MDN</a>
   */
  @JsNullable
  public EventHandler onemptied;

  /**
   * The onended property of the GlobalEventHandlers mixin is the EventHandler for processing ended events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onended">GlobalEventHandlers.onended - MDN</a>
   */
  @JsNullable
  public EventHandler onended;

  /**
   * The onerror property of the GlobalEventHandlers mixin is an EventHandler that processes error events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onerror">GlobalEventHandlers.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onerror">onerror - HTML Living Standard</a>
   */
  @JsNullable
  public OnErrorEventHandler onerror;

  /**
   * The onfocus property of the GlobalEventHandlers mixin is an EventHandler that processes focus events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onfocus">SVGElement.onfocus - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onfocus">onfocus - HTML Living Standard</a>
   */
  @JsNullable
  public FocusEventHandler onfocus;

  /**
   * The onformdata property of the GlobalEventHandlers mixin is the EventHandler for processing formdata events, fired after the entry list representing the form's data is constructed. This happens when the form is submitted, but can also be triggered by the invocation of a FormData() constructor. onformdata is available on HTMLFormElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onformdata">GlobalEventHandlers.onformdata - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onformdata">onformdata - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler onformdata;

  /**
   * The ongotpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes gotpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ongotpointercapture">GlobalEventHandlers.ongotpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-gotpointercapture-event">ongotpointercapture - Pointer Events &ndash; Level 2</a>
   */
  @JsNullable
  public PointerEventHandler ongotpointercapture;

  /**
   * The oninput property of the GlobalEventHandlers mixin is an EventHandler that processes input events on the input, select, and textarea elements. It also handles these events on elements where contenteditable or designMode are turned on.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/oninput">SVGElement.oninput - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#ix-handler-oninput">oninput - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler oninput;

  /**
   * The oninvalid property of the GlobalEventHandlers mixin is an EventHandler that processes invalid events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oninvalid">GlobalEventHandlers.oninvalid - MDN</a>
   */
  @JsNullable
  public EventHandler oninvalid;

  /**
   * The onkeydown property of the GlobalEventHandlers mixin is an EventHandler that processes keydown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onkeydown">SVGElement.onkeydown - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeydown">onkeydown - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler onkeydown;

  /**
   * The onkeypress property of the GlobalEventHandlers mixin is an EventHandler that processes keypress events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onkeypress">SVGElement.onkeypress - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeypress">onkeypress - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler onkeypress;

  /**
   * The onkeyup property of the GlobalEventHandlers mixin is an EventHandler that processes keyup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onkeyup">SVGElement.onkeyup - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeyup">onkeyup - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler onkeyup;

  /**
   * The onload property of the GlobalEventHandlers mixin is an EventHandler that processes load events on a Window, XMLHttpRequest, img element, etc.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onload">SVGElement.onload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onload">onload - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler onload;

  /**
   * The onloadeddata property of the GlobalEventHandlers mixin is the EventHandler for processing loadeddata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadeddata">GlobalEventHandlers.onloadeddata - MDN</a>
   */
  @JsNullable
  public EventHandler onloadeddata;

  /**
   * The onloadedmetadata property of the GlobalEventHandlers mixin is the EventHandler for processing loadedmetadata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadedmetadata">GlobalEventHandlers.onloadedmetadata - MDN</a>
   */
  @JsNullable
  public EventHandler onloadedmetadata;

  /**
   * The onloadstart property of the GlobalEventHandlers mixin is an EventHandler representing the code to be called when the loadstart event is raised (when progress has begun on the loading of a resource.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadstart">GlobalEventHandlers.onloadstart - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onloadstart">onloadstart - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler onloadstart;

  /**
   * The onlostpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes lostpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onlostpointercapture">GlobalEventHandlers.onlostpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-lostpointercapture-event">onlostpointercapture - Pointer Events &ndash; Level 2</a>
   */
  @JsNullable
  public PointerEventHandler onlostpointercapture;

  /**
   * The onmousedown property of the GlobalEventHandlers mixin is an EventHandler that processes mousedown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onmousedown">SVGElement.onmousedown - MDN</a>
   */
  @JsNullable
  public MouseEventHandler onmousedown;

  /**
   * The onmouseenter property of the GlobalEventHandlers mixin is the EventHandler for processing mouseenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseenter">GlobalEventHandlers.onmouseenter - MDN</a>
   */
  @JsNullable
  public MouseEventHandler onmouseenter;

  /**
   * The onmouseleave property of the GlobalEventHandlers mixin is the EventHandler for processing mouseleave events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseleave">GlobalEventHandlers.onmouseleave - MDN</a>
   */
  @JsNullable
  public MouseEventHandler onmouseleave;

  /**
   * The onmousemove property of the GlobalEventHandlers mixin is an EventHandler that processes mousemove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onmousemove">SVGElement.onmousemove - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmousemove">onmousemove - HTML Living Standard</a>
   */
  @JsNullable
  public MouseEventHandler onmousemove;

  /**
   * The onmouseout property of the GlobalEventHandlers mixin is an EventHandler that processes mouseout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onmouseout">SVGElement.onmouseout - MDN</a>
   */
  @JsNullable
  public MouseEventHandler onmouseout;

  /**
   * The onmouseover property of the GlobalEventHandlers mixin is an EventHandler that processes mouseover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onmouseover">SVGElement.onmouseover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmouseover">onmouseover - HTML Living Standard</a>
   */
  @JsNullable
  public MouseEventHandler onmouseover;

  /**
   * The onmouseup property of the GlobalEventHandlers mixin is an EventHandler that processes mouseup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onmouseup">SVGElement.onmouseup - MDN</a>
   */
  @JsNullable
  public MouseEventHandler onmouseup;

  @JsNullable
  public ClipboardEventHandler onpaste;

  /**
   * The onpause property of the GlobalEventHandlers mixin is the EventHandler for processing pause events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpause">GlobalEventHandlers.onpause - MDN</a>
   */
  @JsNullable
  public EventHandler onpause;

  /**
   * The onplay property of the GlobalEventHandlers mixin is the EventHandler for processing play events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplay">GlobalEventHandlers.onplay - MDN</a>
   */
  @JsNullable
  public EventHandler onplay;

  /**
   * The onplaying property of the GlobalEventHandlers mixin is the EventHandler for processing playing events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplaying">GlobalEventHandlers.onplaying - MDN</a>
   */
  @JsNullable
  public EventHandler onplaying;

  /**
   * The onpointercancel property of the GlobalEventHandlers mixin is an EventHandler that processes pointercancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointercancel">GlobalEventHandlers.onpointercancel - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointercancel">onpointercancel - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointercancel">onpointercancel - Pointer Events</a>
   */
  @JsNullable
  public PointerEventHandler onpointercancel;

  /**
   * The GlobalEventHandlers event handler onpointerdown is used to specify the event handler for the pointerdown event, which is fired when the pointing device is initially pressed. This event can be sent to Window, Document, and Element objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerdown">GlobalEventHandlers.onpointerdown - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerdown">onpointerdown - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerdown">onpointerdown - Pointer Events</a>
   */
  @JsNullable
  public PointerEventHandler onpointerdown;

  /**
   * The onpointerenter property of the GlobalEventHandlers mixin is an EventHandler that processes pointerenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerenter">GlobalEventHandlers.onpointerenter - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerenter">onpointerenter - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerenter">onpointerenter - Pointer Events</a>
   */
  @JsNullable
  public PointerEventHandler onpointerenter;

  /**
   * The global event handler for the pointerleave event, which is delivered to a Node when the pointer (mouse cursor, fingertip, etc.) exits its hit test area (for example, if the cursor exits an Element or Window's content area). This event is part of the Pointer Events API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerleave">GlobalEventHandlers.onpointerleave - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerleave">onpointerleave - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerleave">onpointerleave - Pointer Events</a>
   */
  @JsNullable
  public PointerEventHandler onpointerleave;

  /**
   * The onpointermove property of the GlobalEventHandlers mixin is an EventHandler that processes pointermove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointermove">GlobalEventHandlers.onpointermove - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointermove">onpointermove - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointermove">onpointermove - Pointer Events</a>
   */
  @JsNullable
  public PointerEventHandler onpointermove;

  /**
   * The onpointerout property of the GlobalEventHandlers mixin is an EventHandler that processes pointerout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerout">GlobalEventHandlers.onpointerout - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerout">onpointerout - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerout">onpointerout - Pointer Events</a>
   */
  @JsNullable
  public PointerEventHandler onpointerout;

  /**
   * The onpointerover property of the GlobalEventHandlers mixin is an EventHandler that processes pointerover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerover">GlobalEventHandlers.onpointerover - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerover">onpointerover - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerover">onpointerover - Pointer Events</a>
   */
  @JsNullable
  public PointerEventHandler onpointerover;

  /**
   * The onpointerup property of the GlobalEventHandlers mixin is an EventHandler that processes pointerup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerup">GlobalEventHandlers.onpointerup - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerup">onpointerup - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerup">onpointerup - Pointer Events</a>
   */
  @JsNullable
  public PointerEventHandler onpointerup;

  @JsNullable
  public EventHandler onprogress;

  @JsNullable
  public EventHandler onratechange;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onreset">SVGElement.onreset - MDN</a>
   */
  @JsNullable
  public EventHandler onreset;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onresize">SVGElement.onresize - MDN</a>
   */
  @JsNullable
  public EventHandler onresize;

  /**
   * The onscroll property of the GlobalEventHandlers mixin is an EventHandler that processes scroll events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onscroll">SVGElement.onscroll - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onscroll">onscroll - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#event-type-scroll">onscroll - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  @JsNullable
  public EventHandler onscroll;

  @JsNullable
  public EventHandler onsecuritypolicyviolation;

  @JsNullable
  public EventHandler onseeked;

  @JsNullable
  public EventHandler onseeking;

  /**
   * The onselect property of the GlobalEventHandlers mixin is an EventHandler that processes select events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onselect">SVGElement.onselect - MDN</a>
   */
  @JsNullable
  public EventHandler onselect;

  /**
   * The onselectionchange property of the GlobalEventHandlers mixin is an EventHandler that processes selectionchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectionchange">GlobalEventHandlers.onselectionchange - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectionchange">GlobalEventHandlers.onselectionchange - Selection API</a>
   */
  @JsNullable
  public EventHandler onselectionchange;

  /**
   * The onselectstart property of the GlobalEventHandlers mixin is an EventHandler that processes selectstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectstart">GlobalEventHandlers.onselectstart - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectstart">GlobalEventHandlers.onselectstart - Selection API</a>
   */
  @JsNullable
  public EventHandler onselectstart;

  @JsNullable
  public EventHandler onslotchange;

  @JsNullable
  public EventHandler onstalled;

  /**
   * The onsubmit property of the GlobalEventHandlers mixin is an EventHandler that processes submit events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onsubmit">SVGElement.onsubmit - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onsubmit">onsubmit - HTML Living Standard</a>
   */
  @JsNullable
  public EventHandler onsubmit;

  @JsNullable
  public EventHandler onsuspend;

  @JsNullable
  public EventHandler ontimeupdate;

  @JsNullable
  public EventHandler ontoggle;

  /**
   * The ontouchcancel property of the GlobalEventHandlers mixin is an EventHandler that processes touchcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchcancel">GlobalEventHandlers.ontouchcancel - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchcancel">Touch Events – Level 2</a>
   */
  @JsNullable
  public TouchEventHandler ontouchcancel;

  /**
   * A global event handler for the touchend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchend">GlobalEventHandlers.ontouchend - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchend">Touch Events – Level 2</a>
   */
  @JsNullable
  public TouchEventHandler ontouchend;

  /**
   * A global event handler for the touchmove event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchmove">GlobalEventHandlers.ontouchmove - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchmove">Touch Events – Level 2</a>
   */
  @JsNullable
  public TouchEventHandler ontouchmove;

  /**
   * The ontouchstart property of the GlobalEventHandlers mixin is an EventHandler that processes touchstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchstart">GlobalEventHandlers.ontouchstart - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchstart">Touch Events – Level 2</a>
   */
  @JsNullable
  public TouchEventHandler ontouchstart;

  /**
   * The ontransitioncancel property of the GlobalEventHandlers mixin is an EventHandler that processes transitioncancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitioncancel">GlobalEventHandlers.ontransitioncancel - MDN</a>
   */
  @JsNullable
  public TransitionEventHandler ontransitioncancel;

  /**
   * The ontransitionend property of the GlobalEventHandlers mixin is an EventHandler that processes transitionend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitionend">GlobalEventHandlers.ontransitionend - MDN</a>
   */
  @JsNullable
  public TransitionEventHandler ontransitionend;

  @JsNullable
  public TransitionEventHandler ontransitionrun;

  @JsNullable
  public TransitionEventHandler ontransitionstart;

  @JsNullable
  public EventHandler onvolumechange;

  @JsNullable
  public EventHandler onwaiting;

  @JsNullable
  public EventHandler onwebkitanimationend;

  @JsNullable
  public EventHandler onwebkitanimationiteration;

  @JsNullable
  public EventHandler onwebkitanimationstart;

  @JsNullable
  public EventHandler onwebkittransitionend;

  /**
   * The onwheel property of the GlobalEventHandlers mixin is an EventHandler that processes wheel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onwheel">GlobalEventHandlers.onwheel - MDN</a>
   */
  @JsNullable
  public WheelEventHandler onwheel;

  public int tabIndex;

  protected SVGElement() {
  }

  @JsProperty(
      name = "className"
  )
  @Nonnull
  public native SVGAnimatedString className();

  @JsProperty(
      name = "correspondingElement"
  )
  @Nullable
  public native SVGElement correspondingElement();

  @JsProperty(
      name = "correspondingUseElement"
  )
  @Nullable
  public native SVGUseElement correspondingUseElement();

  /**
   * The dataset read-only property of the HTMLOrForeignElement interface provides read/write access to custom data attributes (data-*) on elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/dataset">SVGElement.dataset - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/dom.html#dom-dataset">HTMLElement.dataset - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/dom.html#dom-dataset">HTMLElement.dataset - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/dom.html#dom-dataset">HTMLElement.dataset - HTML5</a>
   */
  @JsProperty(
      name = "dataset"
  )
  @Nonnull
  public native DOMStringMap dataset();

  @JsProperty(
      name = "ownerSVGElement"
  )
  @Nullable
  public native SVGSVGElement ownerSVGElement();

  /**
   * The style property is used to get as well as set the inline style of an element. When getting, it returns a CSSStyleDeclaration object that contains a list of all styles properties for that element with values assigned for the attributes that are defined in the element's inline style attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ElementCSSInlineStyle/style">ElementCSSInlineStyle.style - MDN</a>
   */
  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();

  @JsProperty(
      name = "viewportElement"
  )
  @Nullable
  public native SVGElement viewportElement();

  public native void blur();

  public native void focus(@Nonnull FocusOptions options);

  public native void focus();

  @JsOverlay
  public final void addDragListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "drag", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "drag", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDragListener(@Nonnull final DragEventListener callback) {
    addEventListener( "drag", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "drag", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "drag", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDragListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "drag", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDragleaveListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragleaveListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "dragleave", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDragleaveListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragleave", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragleaveListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragleaveListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "dragleave", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDragleaveListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragleave", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDragstartListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragstartListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "dragstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDragstartListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragstartListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragstartListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "dragstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDragstartListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDropListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "drop", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDropListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "drop", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDropListener(@Nonnull final DragEventListener callback) {
    addEventListener( "drop", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDropListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "drop", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDropListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "drop", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDropListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "drop", Js.cast( callback ) );
  }

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

  @JsOverlay
  public final void addDragendListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragendListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "dragend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDragendListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragendListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragendListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "dragend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDragendListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDragenterListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragenterListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "dragenter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDragenterListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragenter", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragenterListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragenterListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "dragenter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDragenterListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragenter", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDragoverListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragoverListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "dragover", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDragoverListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragover", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragoverListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragoverListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    removeEventListener( "dragover", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDragoverListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragover", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationstartListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationstartListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAnimationstartListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationstartListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationstartListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    removeEventListener( "animationstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAnimationstartListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationcancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAnimationcancelListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    removeEventListener( "animationcancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationendListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationendListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAnimationendListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationendListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationendListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    removeEventListener( "animationend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAnimationendListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationiteration", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationiteration", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAnimationiterationListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationiteration", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationiteration", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    removeEventListener( "animationiteration", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAnimationiterationListener(
      @Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationiteration", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitionrunListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionrun", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionrunListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitionrun", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTransitionrunListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionrun", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitionrunListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionrun", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionrunListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitionrun", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTransitionrunListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionrun", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitioncancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitioncancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTransitioncancelListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitioncancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitioncancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitioncancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTransitioncancelListener(
      @Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitioncancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitionstartListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionstartListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitionstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTransitionstartListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitionstartListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionstartListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitionstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTransitionstartListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitionendListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionendListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitionend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTransitionendListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitionendListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionendListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitionend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTransitionendListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointerdownListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerdown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerdownListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerdown", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPointerdownListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerdown", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointerdownListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerdown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerdownListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerdown", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePointerdownListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerdown", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "gotpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "gotpointercapture", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addGotpointercaptureListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "gotpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "gotpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "gotpointercapture", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeGotpointercaptureListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "gotpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "lostpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "lostpointercapture", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLostpointercaptureListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "lostpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "lostpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "lostpointercapture", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLostpointercaptureListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "lostpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointerenterListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerenterListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerenter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPointerenterListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerenter", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointerenterListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerenterListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerenter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePointerenterListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerenter", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointeroutListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointeroutListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerout", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPointeroutListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerout", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointeroutListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointeroutListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerout", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePointeroutListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerout", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointerupListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerupListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerup", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPointerupListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerup", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointerupListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerupListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerup", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePointerupListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerup", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointermoveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointermove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointermoveListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointermove", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPointermoveListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointermove", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointermoveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointermove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointermoveListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointermove", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePointermoveListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointermove", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointerleaveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerleaveListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerleave", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPointerleaveListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerleave", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointerleaveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerleaveListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerleave", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePointerleaveListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerleave", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointeroverListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointeroverListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointerover", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPointeroverListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerover", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointeroverListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointeroverListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointerover", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePointeroverListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerover", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointercancelListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointercancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointercancelListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    addEventListener( "pointercancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPointercancelListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointercancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointercancelListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointercancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointercancelListener(@Nonnull final PointerEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pointercancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePointercancelListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointercancel", Js.cast( callback ) );
  }
}
