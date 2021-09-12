package akasha.xr;

import akasha.core.Float32Array;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API's XRView interface describes a single view into the XR scene for a specific frame, providing orientation and position information for the viewpoint. You can think of it as a description of a specific eye or camera and how it views the world. A 3D frame will involve two views, one for each eye, separated by an appropriate distance which approximates the distance between the viewer's eyes. This allows the two views, when projected in isolation into the appropriate eyes, to simulate a 3D world.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRView">XRView - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrview-interface"># xrview-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRView"
)
public class XRView extends JsObject {
  protected XRView() {
  }

  /**
   * The XRView interface's read-only eye property is a string taken from the XREye enumerated type, indicating which eye's viewpoint the XRView represents: left or right. For views which represent neither eye, such as monoscopic views, this property's value is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRView/eye">XRView.eye - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrview-eye">XRView.eye - WebXR Device API</a>
   */
  @JsProperty(
      name = "eye"
  )
  @Nonnull
  @XREye
  public native String eye();

  /**
   * The XRView interface's read-only projectionMatrix property specifies the projection matrix to apply to the underlying view. This should be used to integrate perspective to everything in the scene, in order to ensure the result is consistent with what the eye expects to see.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRView/projectionMatrix">XRView.projectionMatrix - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrview-projectionmatrix">XRView.projectionMatrix - WebXR Device API</a>
   */
  @JsProperty(
      name = "projectionMatrix"
  )
  @Nonnull
  public native Float32Array projectionMatrix();

  @JsProperty(
      name = "recommendedViewportScale"
  )
  @Nullable
  public native Double recommendedViewportScale();

  /**
   * The read-only transform property of the XRView interface is an XRRigidTransform object which provides the position and orientation of the viewpoint relative to the XRReferenceSpace specified when the XRFrame.getViewerPose() method was called to obtain the view object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRView/transform">XRView.transform - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrview-transform">XRView.transform - WebXR Device API</a>
   */
  @JsProperty(
      name = "transform"
  )
  @Nonnull
  public native XRRigidTransform transform();

  public native void requestViewportScale(@Nullable Double scale);
}
