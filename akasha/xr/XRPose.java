package akasha.xr;

import akasha.DOMPointReadOnly;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * XRPose is a WebXR API interface representing a position and orientation in the 3D space, relative to the XRSpace within which it resides. The XRSpace&mdash;which is either an XRReferenceSpace or an XRBoundedReferenceSpace&mdash;defines the coordinate system used for the pose and, in the case of an XRViewerPose, its underlying views.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPose">XRPose - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrpose-interface"># xrpose-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRPose"
)
public class XRPose extends JsObject {
  protected XRPose() {
  }

  @JsProperty(
      name = "angularVelocity"
  )
  @Nullable
  public native DOMPointReadOnly angularVelocity();

  /**
   * The emulatedPosition read-only attribute of the XRPose interface is a Boolean value indicating whether or not both the the position component of the pose's transform is directly taken from the XR device, or it's simulated or computed based on other sources.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPose/emulatedPosition">XRPose.emulatedPosition - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpose-emulatedposition">XRPose.emulatedPosition - WebXR Device API</a>
   */
  @JsProperty(
      name = "emulatedPosition"
  )
  public native boolean emulatedPosition();

  @JsProperty(
      name = "linearVelocity"
  )
  @Nullable
  public native DOMPointReadOnly linearVelocity();

  /**
   * The transform read-only attribute of the XRPose interface is a XRRigidTransform object providing the position and orientation of the pose relative to the base XRSpace as specified when the pose was obtained by calling XRFrame.getPose().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPose/transform">XRPose.transform - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpose-transform">XRPose.transform - WebXR Device API</a>
   */
  @JsProperty(
      name = "transform"
  )
  @Nonnull
  public native XRRigidTransform transform();
}
