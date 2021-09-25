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
 * The WebXR Device API's XRSessionEvent() constructor creates and returns a new XRSessionEvent object. These objects represent events announcing state changes in an XRSession representing an augmented or virtual reality session.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionEventInit">XRSessionEventInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsessionevent-xrsessionevent"># dom-xrsessionevent-xrsessionevent</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRSessionEventInit"
)
public interface XRSessionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder session(@Nonnull final XRSession session) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).session( session );
  }

  /**
   * The XRSessionEventInit dictionary's session property specifies the XRSession for which the event describes a state change.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionEventInit/session">XRSessionEventInit.session - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsessioneventinit-session">XRSessionEventInit.session - WebXR Device API</a>
   */
  @JsProperty(
      name = "session"
  )
  @JsNonNull
  XRSession session();

  /**
   * The XRSessionEventInit dictionary's session property specifies the XRSession for which the event describes a state change.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionEventInit/session">XRSessionEventInit.session - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsessioneventinit-session">XRSessionEventInit.session - WebXR Device API</a>
   */
  @JsProperty
  void setSession(@JsNonNull XRSession session);

  /**
   * The WebXR Device API's XRSessionEvent() constructor creates and returns a new XRSessionEvent object. These objects represent events announcing state changes in an XRSession representing an augmented or virtual reality session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionEventInit">XRSessionEventInit - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsessionevent-xrsessionevent"># dom-xrsessionevent-xrsessionevent</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRSessionEventInit"
  )
  interface Builder extends XRSessionEventInit {
    /**
     * The XRSessionEventInit dictionary's session property specifies the XRSession for which the event describes a state change.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionEventInit/session">XRSessionEventInit.session - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsessioneventinit-session">XRSessionEventInit.session - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder session(@Nonnull final XRSession session) {
      setSession( session );
      return this;
    }

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
