package akasha.xr;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRJointPose interface is an XRPose with additional information about the size of the skeleton joint it represents.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRJointPose">XRJointPose - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRJointPose"
)
public class XRJointPose extends XRPose {
  protected XRJointPose() {
  }

  @JsProperty(
      name = "radius"
  )
  public native float radius();
}
