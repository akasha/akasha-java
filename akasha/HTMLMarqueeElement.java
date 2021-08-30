package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLMarqueeElement interface provides methods to manipulate &lt;marquee&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMarqueeElement">HTMLMarqueeElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/obsolete.html#htmlmarqueeelement">(HTML) # htmlmarqueeelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLMarqueeElement"
)
public class HTMLMarqueeElement extends HTMLElement {
  @JsNonNull
  public String behavior;

  @JsNonNull
  public String bgColor;

  @JsNonNull
  public String direction;

  @JsNonNull
  public String height;

  public int hspace;

  public int loop;

  public int scrollAmount;

  public int scrollDelay;

  public boolean trueSpeed;

  public int vspace;

  @JsNonNull
  public String width;

  protected HTMLMarqueeElement() {
  }

  public native void start();

  public native void stop();
}
