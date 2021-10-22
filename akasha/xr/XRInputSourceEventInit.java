package akasha.xr;

import akasha.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The XRInputSourceEvent() constructor creates and returns a new XRInputSourceEvent object describing an event (state change) which has occurred on a WebXR user input device represented by an XRInputSource.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit">XRInputSourceEventInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceevent-xrinputsourceevent"># dom-xrinputsourceevent-xrinputsourceevent</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRInputSourceEventInit"
)
public interface XRInputSourceEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Step1 frame(@Nonnull final XRFrame frame) {
    final Builder $xrInputSourceEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrInputSourceEventInit.setFrame( frame );
    return Js.uncheckedCast( $xrInputSourceEventInit );
  }

  /**
   * The XRInputSourceEventInit dictionary's property frame specifies an XRFrame providing information about the timestamp at which the new input source event took place, as well as access to the XRFrame method getPose() which can be used to map the coordinates of any XRReferenceSpace to the space in which the event took place.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit/frame">XRInputSourceEventInit.frame - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceeventinit-frame">XRInputSourceEventInit.frame - WebXR Device API</a>
   */
  @JsProperty(
      name = "frame"
  )
  @JsNonNull
  XRFrame frame();

  /**
   * The XRInputSourceEventInit dictionary's property frame specifies an XRFrame providing information about the timestamp at which the new input source event took place, as well as access to the XRFrame method getPose() which can be used to map the coordinates of any XRReferenceSpace to the space in which the event took place.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit/frame">XRInputSourceEventInit.frame - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceeventinit-frame">XRInputSourceEventInit.frame - WebXR Device API</a>
   */
  @JsProperty
  void setFrame(@JsNonNull XRFrame frame);

  /**
   * The XRInputSourceEventInit dictionary's inputSource property is used when calling the XRInputSourceEvent() constructor to specify the XRInputSource from which the newly-created event is being sent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit/inputSource">XRInputSourceEventInit.inputSource - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceeventinit-inputsource">XRInputSourceEventInit.inputSource - WebXR Device API</a>
   */
  @JsProperty(
      name = "inputSource"
  )
  @JsNonNull
  XRInputSource inputSource();

  /**
   * The XRInputSourceEventInit dictionary's inputSource property is used when calling the XRInputSourceEvent() constructor to specify the XRInputSource from which the newly-created event is being sent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit/inputSource">XRInputSourceEventInit.inputSource - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceeventinit-inputsource">XRInputSourceEventInit.inputSource - WebXR Device API</a>
   */
  @JsProperty
  void setInputSource(@JsNonNull XRInputSource inputSource);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRInputSourceEventInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder inputSource(@Nonnull XRInputSource inputSource) {
      Js.<XRInputSourceEventInit>uncheckedCast( this ).setInputSource( inputSource );
      return Js.uncheckedCast( this );
    }
  }

  /**
   * The XRInputSourceEvent() constructor creates and returns a new XRInputSourceEvent object describing an event (state change) which has occurred on a WebXR user input device represented by an XRInputSource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit">XRInputSourceEventInit - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceevent-xrinputsourceevent"># dom-xrinputsourceevent-xrinputsourceevent</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRInputSourceEventInit"
  )
  interface Builder extends XRInputSourceEventInit {
    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
