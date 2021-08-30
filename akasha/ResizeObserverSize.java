package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ResizeObserverSize interface of the Resize Observer API is used by the ResizeObserverEntry interface to access the box sizing properties of the element being observed.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ResizeObserverSize">ResizeObserverSize - MDN</a>
 * @see <a href="https://drafts.csswg.org/resize-observer/#resizeobserversize"># resizeobserversize</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ResizeObserverSize"
)
public class ResizeObserverSize extends JsObject {
  protected ResizeObserverSize() {
  }

  @JsProperty(
      name = "blockSize"
  )
  public native double blockSize();

  @JsProperty(
      name = "inlineSize"
  )
  public native double inlineSize();
}
