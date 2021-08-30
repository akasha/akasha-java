package akasha.xr;

import akasha.AddEventListenerOptions;
import akasha.EventListenerOptions;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The WebXR Device API's XRReferenceSpace interface describes the coordinate system for a specific tracked entity or object within the virtual world using a specified tracking behavior. The tracking behavior is defined by the selected reference space type. It expands upon the base class, XRSpace, by adding support for several different tracking behaviors as well as to request a new reference space which describes the offset transform between the tracked object and another location in the world.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpace">XRReferenceSpace - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrreferencespace-interface"># xrreferencespace-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRReferenceSpace"
)
public class XRReferenceSpace extends XRSpace {
  /**
   * The XRReferenceSpace interface's onreset event handler property can be set to a function which is called when the XRReferenceSpace receives a reset event, signaling that the  XR device has experienced a discontinuity large enough to require that the position and/or orientation of the origin be significantly altered to compensate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpace/onreset">XRReferenceSpace.onreset - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespace-onreset">onreset - WebXR Device API</a>
   */
  @JsNullable
  public XRReferenceSpaceEventHandler onreset;

  protected XRReferenceSpace() {
  }

  /**
   * The XRReferenceSpace interface's getOffsetReferenceSpace() method returns a new reference space object which describes the relative difference in position between the object on which the method is called and a given point in 3D space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpace/getOffsetReferenceSpace">XRReferenceSpace.getOffsetReferenceSpace - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespace-getoffsetreferencespace">getOffsetReferenceSpace() - WebXR Device API</a>
   */
  @JsNonNull
  public native XRReferenceSpace getOffsetReferenceSpace(@Nonnull XRRigidTransform originOffset);

  @JsOverlay
  public final void addResetListener(@Nonnull final XRReferenceSpaceEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "reset", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addResetListener(@Nonnull final XRReferenceSpaceEventListener callback,
      final boolean useCapture) {
    addEventListener( "reset", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addResetListener(@Nonnull final XRReferenceSpaceEventListener callback) {
    addEventListener( "reset", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeResetListener(@Nonnull final XRReferenceSpaceEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "reset", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeResetListener(@Nonnull final XRReferenceSpaceEventListener callback,
      final boolean useCapture) {
    removeEventListener( "reset", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeResetListener(@Nonnull final XRReferenceSpaceEventListener callback) {
    removeEventListener( "reset", Js.cast( callback ) );
  }
}
