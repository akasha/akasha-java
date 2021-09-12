package akasha.xr;

import akasha.EventInit;
import akasha.lang.JsArray;
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
 * The XRInputSourcesChangeEvent() constructor creates and returns a new XRInputSourcesChangeEvent object, representing an update to the list of available WebXR input devices. You won't typically call this constructor yourself, as these events are created and sent to you by the WebXR system.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit">XRInputSourcesChangeEventInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeevent-xrinputsourceschangeevent"># dom-xrinputsourceschangeevent-xrinputsourceschangeevent</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRInputSourcesChangeEventInit"
)
public interface XRInputSourcesChangeEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final XRSession session,
      @Nonnull final JsArray<XRInputSource> added, @Nonnull final JsArray<XRInputSource> removed) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).session( session ).added( added ).removed( removed );
  }

  /**
   * The XRInputSourcesChangeEventInit property session specifies the XRSession to which the input source list change event applies.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/session">XRInputSourcesChangeEventInit.session - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-session">XRInputSourcesChangeEventInit.session - WebXR Device API</a>
   */
  @JsProperty(
      name = "session"
  )
  @JsNonNull
  XRSession session();

  /**
   * The XRInputSourcesChangeEventInit property session specifies the XRSession to which the input source list change event applies.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/session">XRInputSourcesChangeEventInit.session - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-session">XRInputSourcesChangeEventInit.session - WebXR Device API</a>
   */
  @JsProperty
  void setSession(@JsNonNull XRSession session);

  /**
   * The XRInputSourcesChangeEventInit property added specifies a list of input sources, each identified using an XRInputSource object, which the represented inputsourceschange event is to indicate are newly available for use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/added">XRInputSourcesChangeEventInit.added - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-added">XRInputSourcesChangeEventInit.added - WebXR Device API</a>
   */
  @JsProperty(
      name = "added"
  )
  @JsNonNull
  JsArray<XRInputSource> added();

  /**
   * The XRInputSourcesChangeEventInit property added specifies a list of input sources, each identified using an XRInputSource object, which the represented inputsourceschange event is to indicate are newly available for use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/added">XRInputSourcesChangeEventInit.added - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-added">XRInputSourcesChangeEventInit.added - WebXR Device API</a>
   */
  @JsProperty
  void setAdded(@JsNonNull JsArray<XRInputSource> added);

  /**
   * The XRInputSourcesChangeEventInit property removed is an array of zero or more XRInputSource objects, each representing one input source which has been removed from the XRSession.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/removed">XRInputSourcesChangeEventInit.removed - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-removed">XRInputSourcesChangeEventInit.removed - WebXR Device API</a>
   */
  @JsProperty(
      name = "removed"
  )
  @JsNonNull
  JsArray<XRInputSource> removed();

  /**
   * The XRInputSourcesChangeEventInit property removed is an array of zero or more XRInputSource objects, each representing one input source which has been removed from the XRSession.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/removed">XRInputSourcesChangeEventInit.removed - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-removed">XRInputSourcesChangeEventInit.removed - WebXR Device API</a>
   */
  @JsProperty
  void setRemoved(@JsNonNull JsArray<XRInputSource> removed);

  /**
   * The XRInputSourcesChangeEvent() constructor creates and returns a new XRInputSourcesChangeEvent object, representing an update to the list of available WebXR input devices. You won't typically call this constructor yourself, as these events are created and sent to you by the WebXR system.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit">XRInputSourcesChangeEventInit - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeevent-xrinputsourceschangeevent"># dom-xrinputsourceschangeevent-xrinputsourceschangeevent</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRInputSourcesChangeEventInit"
  )
  interface Builder extends XRInputSourcesChangeEventInit {
    /**
     * The XRInputSourcesChangeEventInit property session specifies the XRSession to which the input source list change event applies.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/session">XRInputSourcesChangeEventInit.session - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-session">XRInputSourcesChangeEventInit.session - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder session(@Nonnull final XRSession session) {
      setSession( session );
      return this;
    }

    /**
     * The XRInputSourcesChangeEventInit property added specifies a list of input sources, each identified using an XRInputSource object, which the represented inputsourceschange event is to indicate are newly available for use.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/added">XRInputSourcesChangeEventInit.added - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-added">XRInputSourcesChangeEventInit.added - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder added(@Nonnull final JsArray<XRInputSource> added) {
      setAdded( added );
      return this;
    }

    /**
     * The XRInputSourcesChangeEventInit property removed is an array of zero or more XRInputSource objects, each representing one input source which has been removed from the XRSession.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/removed">XRInputSourcesChangeEventInit.removed - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-removed">XRInputSourcesChangeEventInit.removed - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder removed(@Nonnull final JsArray<XRInputSource> removed) {
      setRemoved( removed );
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
