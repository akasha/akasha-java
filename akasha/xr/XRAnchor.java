package akasha.xr;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRAnchor interface creates anchors which keep track of the pose that is fixed relative to the real world. With anchors, you can specify poses in the world that need to be updated to correctly reflect the evolving understanding of the world, such that the poses remain aligned with the same place in the physical world. That helps to build an illusion that the placed objects are really present in the user's environment.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRAnchor">XRAnchor - MDN</a>
 * @see <a href="https://immersive-web.github.io/anchors/#xr-anchor"># xr-anchor</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRAnchor"
)
public class XRAnchor extends JsObject {
  protected XRAnchor() {
  }

  @JsProperty(
      name = "anchorSpace"
  )
  @Nonnull
  public native XRSpace anchorSpace();

  public native void delete();
}
