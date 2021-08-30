package akasha;

import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TouchList interface represents a list of contact points on a touch surface. For example, if the user has three fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch object for each finger, for a total of three entries.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchList">TouchList - MDN</a>
 * @see <a href="https://w3c.github.io/touch-events/#touchlist-interface"># touchlist-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TouchList"
)
public class TouchList extends JsObject {
  protected TouchList() {
  }

  /**
   * The length read-only property indicates the number of items (touch points) in a given TouchList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchList/length">TouchList.length - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touchlist-length">Touch Events – Level 2</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-TouchList-length">Touch Events</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The item() method returns the Touch object at the specified index in the TouchList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchList/item">TouchList.item - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touchlist-item">Touch Events – Level 2</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-TouchList-item-getter-Touch-unsigned-long-index">Touch Events</a>
   */
  @HasNoSideEffects
  @JsNullable
  public native Touch item(int index);
}
