package akasha;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ResizeObserverEntry interface represents the object passed to the ResizeObserver() constructor's callback function, which allows you to access the new dimensions of the Element or SVGElement being observed.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ResizeObserverEntry">ResizeObserverEntry - MDN</a>
 * @see <a href="https://drafts.csswg.org/resize-observer/#resize-observer-entry-interface"># resize-observer-entry-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ResizeObserverEntry"
)
public class ResizeObserverEntry extends JsObject {
  protected ResizeObserverEntry() {
  }

  @JsProperty(
      name = "borderBoxSize"
  )
  @Nonnull
  public native JsArray<ResizeObserverSize> borderBoxSize();

  @JsProperty(
      name = "contentBoxSize"
  )
  @Nonnull
  public native JsArray<ResizeObserverSize> contentBoxSize();

  @JsProperty(
      name = "contentRect"
  )
  @Nonnull
  public native DOMRectReadOnly contentRect();

  @JsProperty(
      name = "devicePixelContentBoxSize"
  )
  @Nonnull
  public native JsArray<ResizeObserverSize> devicePixelContentBoxSize();

  @JsProperty(
      name = "target"
  )
  @Nonnull
  public native Element target();
}
