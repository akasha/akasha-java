package akasha;

import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLFormControlsCollection interface represents a collection of HTML form control elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormControlsCollection">HTMLFormControlsCollection - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/common-dom-interfaces.html#htmlformcontrolscollection"># htmlformcontrolscollection</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLFormControlsCollection"
)
public class HTMLFormControlsCollection extends JsObject {
  protected HTMLFormControlsCollection() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @HasNoSideEffects
  @JsNonNull
  public native HTMLFormControl item(int index);

  /**
   * The HTMLFormControlsCollection.namedItem() method returns the RadioNodeList or the Element in the collection whose name or id match the specified name, or null if no node matches.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormControlsCollection/namedItem">HTMLFormControlsCollection.namedItem - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-htmlformcontrolscollection-nameditem">HTMLFormControlsCollection.namedItem() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/infrastructure.html#htmlformcontrolscollection">HTMLFormControlsCollection - HTML5</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native HTMLFormControl namedItem(@Nonnull String name);
}
