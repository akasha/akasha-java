package akasha.xr;

import akasha.Gamepad;
import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The WebXR Device API's XRInputSource interface describes a single source of control input which is part of the user's WebXR-compatible virtual or augmented reality system. The device is specific to the platform being used, but provides the direction in which it is being aimed and optionally may generate events if the user triggers performs actions using the device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource">XRInputSource - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrinputsource-interface"># xrinputsource-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRInputSource"
)
public class XRInputSource extends JsObject {
  protected XRInputSource() {
  }

  @JsOverlay
  public final boolean isGamepadSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRInputSource_gamepad__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRInputSource_gamepad__supported" ) ) ? false : Js.asPropertyMap( this ).has( "gamepad" );
  }

  @JsProperty(
      name = "gamepad"
  )
  @Nullable
  public native Gamepad gamepad();

  /**
   * The read-only XRInputSource property gripSpace returns an XRSpace whose native origin tracks the pose used to render virtual objects so they appear to be held in (or part of) the user's hand.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource/gripSpace">XRInputSource.gripSpace - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsource-gripspace">XRInputSource.gripSpace - WebXR Device API</a>
   */
  @JsProperty(
      name = "gripSpace"
  )
  @Nullable
  public native XRSpace gripSpace();

  @JsOverlay
  public final boolean isHandSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRInputSource_hand__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRInputSource_hand__supported" ) ) ? false : Js.asPropertyMap( this ).has( "hand" );
  }

  @JsProperty(
      name = "hand"
  )
  @Nullable
  public native XRHand hand();

  /**
   * The read-only XRInputSource property handedness indicates which of the user's hands the WebXR input source is associated with, or if it's not associated with a hand at all.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource/handedness">XRInputSource.handedness - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsource-handedness">XRInputSource.handedness - WebXR Device API</a>
   */
  @JsProperty(
      name = "handedness"
  )
  @Nonnull
  @XRHandedness
  public native String handedness();

  /**
   * The read-only XRInputSource property profiles returns an array of strings, each describing a configuration profile for the input source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource/profiles">XRInputSource.profiles - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsource-profiles">XRInputSource.profiles - WebXR Device API</a>
   */
  @JsProperty(
      name = "profiles"
  )
  @Nonnull
  public native JsArray<String> profiles();

  /**
   * The read-only XRInputSource property targetRayMode indicates the method by which the target ray for the input source should be generated and how it should be presented to the user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource/targetRayMode">XRInputSource.targetRayMode - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsource-targetraymode">XRInputSource.handedness - WebXR Device API</a>
   */
  @JsProperty(
      name = "targetRayMode"
  )
  @Nonnull
  @XRTargetRayMode
  public native String targetRayMode();

  /**
   * The read-only XRInputSource property targetRaySpace returns an XRSpace (typically an XRReferenceSpace) representing the position and orientation of the target ray in the virtual space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource/targetRaySpace">XRInputSource.targetRaySpace - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsource-targetrayspace">XRInputSource.targetRaySpace - WebXR Device API</a>
   */
  @JsProperty(
      name = "targetRaySpace"
  )
  @Nonnull
  public native XRSpace targetRaySpace();
}
