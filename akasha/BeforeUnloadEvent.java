package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The beforeunload event is fired when the window, the document and its resources are about to be unloaded.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BeforeUnloadEvent">BeforeUnloadEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/browsing-the-web.html#the-beforeunloadevent-interface"># the-beforeunloadevent-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BeforeUnloadEvent"
)
public class BeforeUnloadEvent extends Event {
  @JsNonNull
  public String returnValue;

  protected BeforeUnloadEvent() {
    super( null );
  }
}
