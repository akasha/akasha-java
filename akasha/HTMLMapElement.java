package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLMapElement interface provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of map elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMapElement">HTMLMapElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/image-maps.html#htmlmapelement">(HTML) # htmlmapelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLMapElement"
)
public class HTMLMapElement extends HTMLElement {
  @JsNonNull
  public String name;

  protected HTMLMapElement() {
  }

  @JsProperty(
      name = "areas"
  )
  @Nonnull
  public native HTMLCollection areas();
}
