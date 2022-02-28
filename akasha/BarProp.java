package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The BarProp interface of the Document Object Model represents the web browser user interface elements that are exposed to scripts in web pages. Each of the following interface elements are represented by a BarProp object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BarProp">BarProp - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/window-object.html#barprop"># barprop</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BarProp"
)
public class BarProp extends JsObject {
  protected BarProp() {
  }

  @JsProperty(
      name = "visible"
  )
  public native boolean visible();
}
