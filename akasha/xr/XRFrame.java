package akasha.xr;

import akasha.core.Float32Array;
import akasha.core.JsObject;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * A WebXR Device API XRFrame object is passed into the requestAnimationFrame() callback function and provides access to the information needed in order to render a single frame of animation for an XRSession describing a VR or AR scene. Events which communicate the tracking state of objects also provide an XRFrame reference as part of their structure.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRFrame">XRFrame - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrframe-interface"># xrframe-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRFrame"
)
public class XRFrame extends JsObject {
  protected XRFrame() {
  }

  @JsProperty(
      name = "predictedDisplayTime"
  )
  public native double predictedDisplayTime();

  /**
   * An XRFrame object's read-only session property returns the XRSession object that generated the frame.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRFrame/session">XRFrame.session - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrframe-session">XRFrame.session - WebXR Device API</a>
   */
  @JsProperty(
      name = "session"
  )
  @Nonnull
  public native XRSession session();

  @JsOverlay
  public final boolean isTrackedAnchorsSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRFrame_trackedAnchors__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRFrame_trackedAnchors__supported" ) ) ? false : Js.asPropertyMap( this ).has( "trackedAnchors" );
  }

  @JsProperty(
      name = "trackedAnchors"
  )
  @Nonnull
  public native XRAnchorSet trackedAnchors();

  /**
   * The XRFrame method getPose() returns the relative position and orientation&mdash;the pose&mdash;of one XRSpace to that of another space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRFrame/getPose">XRFrame.getPose - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrframe-getpose">XRFrame.getPose() - WebXR Device API</a>
   */
  @JsNullable
  public native XRPose getPose(@Nonnull XRSpace space, @Nonnull XRSpace baseSpace);

  /**
   * The getViewerPose() method, a member of the XRFrame interface, returns a XRViewerPose object which describes the viewer's pose (position and orientation) relative to the specified reference space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRFrame/getViewerPose">XRFrame.getViewerPose - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrframe-getviewerpose">XRFrame.getViewerPose() - WebXR Device API</a>
   */
  @JsNullable
  public native XRViewerPose getViewerPose(@Nonnull XRReferenceSpace referenceSpace);

  @JsOverlay
  public final boolean isCreateAnchorSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRFrame_createAnchor__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRFrame_createAnchor__supported" ) ) ? false : Js.asPropertyMap( this ).has( "createAnchor" );
  }

  @JsNonNull
  public native Promise<XRAnchor> createAnchor(@Nonnull XRRigidTransform pose,
      @Nonnull XRSpace space);

  @JsOverlay
  public final boolean isGetDepthInformationSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRFrame_getDepthInformation__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRFrame_getDepthInformation__supported" ) ) ? false : Js.asPropertyMap( this ).has( "getDepthInformation" );
  }

  @JsNullable
  public native XRCPUDepthInformation getDepthInformation(@Nonnull XRView view);

  @JsOverlay
  public final boolean isFillJointRadiiSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRFrame_fillJointRadii__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRFrame_fillJointRadii__supported" ) ) ? false : Js.asPropertyMap( this ).has( "fillJointRadii" );
  }

  public native boolean fillJointRadii(@Nonnull JsArray<XRJointSpace> jointSpaces,
      @Nonnull Float32Array radii);

  public native boolean fillJointRadii(@Nonnull XRJointSpace[] jointSpaces,
      @Nonnull Float32Array radii);

  @JsOverlay
  public final boolean isFillPosesSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRFrame_fillPoses__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRFrame_fillPoses__supported" ) ) ? false : Js.asPropertyMap( this ).has( "fillPoses" );
  }

  public native boolean fillPoses(@Nonnull JsArray<XRSpace> spaces, @Nonnull XRSpace baseSpace,
      @Nonnull Float32Array transforms);

  public native boolean fillPoses(@Nonnull XRSpace[] spaces, @Nonnull XRSpace baseSpace,
      @Nonnull Float32Array transforms);

  @JsOverlay
  public final boolean isGetJointPoseSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRFrame_getJointPose__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRFrame_getJointPose__supported" ) ) ? false : Js.asPropertyMap( this ).has( "getJointPose" );
  }

  @JsNullable
  public native XRJointPose getJointPose(@Nonnull XRJointSpace joint, @Nonnull XRSpace baseSpace);

  @JsOverlay
  public final boolean isGetHitTestResultsSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRFrame_getHitTestResults__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRFrame_getHitTestResults__supported" ) ) ? false : Js.asPropertyMap( this ).has( "getHitTestResults" );
  }

  @JsNonNull
  public native JsArray<XRHitTestResult> getHitTestResults(@Nonnull XRHitTestSource hitTestSource);

  @JsOverlay
  public final boolean isGetHitTestResultsForTransientInputSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRFrame_getHitTestResultsForTransientInput__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRFrame_getHitTestResultsForTransientInput__supported" ) ) ? false : Js.asPropertyMap( this ).has( "getHitTestResultsForTransientInput" );
  }

  @JsNonNull
  public native JsArray<XRTransientInputHitTestResult> getHitTestResultsForTransientInput(
      @Nonnull XRTransientInputHitTestSource hitTestSource);

  @JsOverlay
  public final boolean isGetLightEstimateSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRFrame_getLightEstimate__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRFrame_getLightEstimate__supported" ) ) ? false : Js.asPropertyMap( this ).has( "getLightEstimate" );
  }

  @JsNullable
  public native XRLightEstimate getLightEstimate(@Nonnull XRLightProbe lightProbe);
}
