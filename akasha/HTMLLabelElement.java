package akasha;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLLabelElement interface gives access to properties specific to &lt;label&gt; elements. It inherits methods and properties from the base HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLabelElement">HTMLLabelElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#htmllabelelement"># htmllabelelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLLabelElement"
)
public class HTMLLabelElement extends HTMLElement {
  /**
   * The HTMLLabelElement.htmlFor property reflects the value of the for content property. That means that this script-accessible property is used to set and read the value of the content property for, which is the ID of the label's associated control element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLabelElement/htmlFor">HTMLLabelElement.htmlFor - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-label-htmlfor">htmlFor - HTML Living Standard</a>
   */
  @JsNonNull
  public String htmlFor;

  protected HTMLLabelElement() {
  }

  /**
   * The read-only HTMLLabelElement.control property returns a reference to the control (in the form of an object of type HTMLElement or one of its derivatives) with which the label element is associated, or null if the label isn't associated with a control.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLabelElement/control">HTMLLabelElement.control - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-label-control">control - HTML Living Standard</a>
   */
  @JsProperty(
      name = "control"
  )
  @Nullable
  public native HTMLElement control();

  /**
   * The read-only HTMLLabelElement.form property returns an HTMLFormElement object which represents the form of which the label's associated control is a part, or null if there is either no associated control, or if that control isn't in a form.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLabelElement/form">HTMLLabelElement.form - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-label-form">form - HTML Living Standard</a>
   */
  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();
}
