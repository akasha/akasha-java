package akasha;

import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A type returned by some APIs which contains a list of DOMString (strings).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMStringList">DOMStringList - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/common-dom-interfaces.html#the-domstringlist-interface"># the-domstringlist-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMStringList"
)
public class DOMStringList extends JsObject {
  protected DOMStringList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @HasNoSideEffects
  public native boolean contains(@Nonnull String string);

  @HasNoSideEffects
  @JsNullable
  public native String item(int index);
}
