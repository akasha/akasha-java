package akasha.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRJointSpace interface is an XRSpace and represents the position and orientation of an XRHand joint.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRJointSpace">XRJointSpace - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRJointSpace"
)
public class XRJointSpace extends XRSpace {
  protected XRJointSpace() {
  }

  @JsProperty(
      name = "jointName"
  )
  @Nonnull
  @XRHandJoint
  public native String jointName();
}
