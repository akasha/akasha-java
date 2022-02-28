package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ElementInternals interface of the Document_Object_Model gives web developers a way to allow custom elements to fully participate in HTML forms. It provides utilities for working with these elements in the same way you would work with any standard HTML form element, and also exposes the Accessibility Object Model to the element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ElementInternals">ElementInternals - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/custom-elements.html#the-elementinternals-interface"># the-elementinternals-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ElementInternals"
)
public class ElementInternals extends JsObject {
  @JsNullable
  public String ariaAtomic;

  @JsNullable
  public String ariaAutoComplete;

  @JsNullable
  public String ariaBusy;

  @JsNullable
  public String ariaChecked;

  @JsNullable
  public String ariaColCount;

  @JsNullable
  public String ariaColIndex;

  @JsNullable
  public String ariaColIndexText;

  @JsNullable
  public String ariaColSpan;

  @JsNullable
  public String ariaCurrent;

  @JsNullable
  public String ariaDescription;

  @JsNullable
  public String ariaDisabled;

  @JsNullable
  public String ariaExpanded;

  @JsNullable
  public String ariaHasPopup;

  @JsNullable
  public String ariaHidden;

  @JsNullable
  public String ariaInvalid;

  @JsNullable
  public String ariaKeyShortcuts;

  @JsNullable
  public String ariaLabel;

  @JsNullable
  public String ariaLevel;

  @JsNullable
  public String ariaLive;

  @JsNullable
  public String ariaModal;

  @JsNullable
  public String ariaMultiLine;

  @JsNullable
  public String ariaMultiSelectable;

  @JsNullable
  public String ariaOrientation;

  @JsNullable
  public String ariaPlaceholder;

  @JsNullable
  public String ariaPosInSet;

  @JsNullable
  public String ariaPressed;

  @JsNullable
  public String ariaReadOnly;

  @JsNullable
  public String ariaRequired;

  @JsNullable
  public String ariaRoleDescription;

  @JsNullable
  public String ariaRowCount;

  @JsNullable
  public String ariaRowIndex;

  @JsNullable
  public String ariaRowIndexText;

  @JsNullable
  public String ariaRowSpan;

  @JsNullable
  public String ariaSelected;

  @JsNullable
  public String ariaSetSize;

  @JsNullable
  public String ariaSort;

  @JsNullable
  public String ariaValueMax;

  @JsNullable
  public String ariaValueMin;

  @JsNullable
  public String ariaValueNow;

  @JsNullable
  public String ariaValueText;

  @JsNullable
  public String role;

  protected ElementInternals() {
  }

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();

  @JsProperty(
      name = "shadowRoot"
  )
  @Nullable
  public native ShadowRoot shadowRoot();

  @JsProperty(
      name = "validationMessage"
  )
  @Nonnull
  public native String validationMessage();

  @JsProperty(
      name = "validity"
  )
  @Nonnull
  public native ValidityState validity();

  @JsProperty(
      name = "willValidate"
  )
  public native boolean willValidate();

  public native boolean checkValidity();

  public native boolean reportValidity();

  public native void setFormValue(@Nonnull File value, @Nonnull File state);

  public native void setFormValue(@Nonnull String value, @Nonnull File state);

  public native void setFormValue(@Nonnull FormData value, @Nonnull File state);

  public native void setFormValue(@Nonnull File value, @Nonnull String state);

  public native void setFormValue(@Nonnull String value, @Nonnull String state);

  public native void setFormValue(@Nonnull FormData value, @Nonnull String state);

  public native void setFormValue(@Nonnull File value, @Nonnull FormData state);

  public native void setFormValue(@Nonnull String value, @Nonnull FormData state);

  public native void setFormValue(@Nonnull FormData value, @Nonnull FormData state);

  public native void setFormValue(@Nonnull File value);

  public native void setFormValue(@Nonnull String value);

  public native void setFormValue(@Nonnull FormData value);

  public native void setValidity(@Nonnull ValidityStateFlags flags, @Nonnull String message,
      @Nonnull HTMLElement anchor);

  public native void setValidity(@Nonnull ValidityStateFlags flags, @Nonnull String message);

  public native void setValidity(@Nonnull ValidityStateFlags flags);

  public native void setValidity();
}
