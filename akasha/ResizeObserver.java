package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The ResizeObserver interface reports changes to the dimensions of an Element's content or border box, or the bounding box of an SVGElement.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ResizeObserver">ResizeObserver - MDN</a>
 * @see <a href="https://drafts.csswg.org/resize-observer/#resize-observer-interface"># resize-observer-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ResizeObserver"
)
public class ResizeObserver extends JsObject {
  public ResizeObserver(@Nonnull final ResizeObserverCallback callback) {
  }

  public native void disconnect();

  public native void observe(@Nonnull Element target, @Nonnull ResizeObserverOptions options);

  public native void observe(@Nonnull Element target);

  public native void unobserve(@Nonnull Element target);
}
