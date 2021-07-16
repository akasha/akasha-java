package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLModElement interface provides special properties (beyond the regular methods and properties available through the HTMLElement interface they also have available to them by inheritance) for manipulating modification elements, that is &lt;del&gt; and &lt;ins&gt;.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLModElement">HTMLModElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/edits.html#htmlmodelement">(HTML) # htmlmodelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLModElement"
)
public class HTMLModElement extends HTMLElement {
  @Nonnull
  public String cite;

  @Nonnull
  public String dateTime;

  protected HTMLModElement() {
  }
}
