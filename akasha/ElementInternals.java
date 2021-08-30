package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ElementInternals interface of the Document_Object_Model gives web developers a way to allow custom elements to fully participate in HTML forms. It provides utilities for working with these elements in the same way you would work with any standard HTML form element, and also exposes the Accessibility Object Model to the element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ElementInternals">ElementInternals - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/custom-elements.html#the-elementinternals-interface">(HTML) # the-elementinternals-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ElementInternals"
)
public class ElementInternals extends JsObject {
  @JsNonNull
  public String ariaAtomic;

  @JsNonNull
  public String ariaAutoComplete;

  @JsNonNull
  public String ariaBusy;

  @JsNonNull
  public String ariaChecked;

  @JsNonNull
  public String ariaColCount;

  @JsNonNull
  public String ariaColIndex;

  @JsNonNull
  public String ariaColIndexText;

  @JsNonNull
  public String ariaColSpan;

  @JsNonNull
  public String ariaCurrent;

  @JsNonNull
  public String ariaDescription;

  @JsNonNull
  public String ariaDisabled;

  @JsNonNull
  public String ariaExpanded;

  @JsNonNull
  public String ariaHasPopup;

  @JsNonNull
  public String ariaHidden;

  @JsNonNull
  public String ariaInvalid;

  @JsNonNull
  public String ariaKeyShortcuts;

  @JsNonNull
  public String ariaLabel;

  @JsNonNull
  public String ariaLevel;

  @JsNonNull
  public String ariaLive;

  @JsNonNull
  public String ariaModal;

  @JsNonNull
  public String ariaMultiLine;

  @JsNonNull
  public String ariaMultiSelectable;

  @JsNonNull
  public String ariaOrientation;

  @JsNonNull
  public String ariaPlaceholder;

  @JsNonNull
  public String ariaPosInSet;

  @JsNonNull
  public String ariaPressed;

  @JsNonNull
  public String ariaReadOnly;

  @JsNonNull
  public String ariaRequired;

  @JsNonNull
  public String ariaRoleDescription;

  @JsNonNull
  public String ariaRowCount;

  @JsNonNull
  public String ariaRowIndex;

  @JsNonNull
  public String ariaRowIndexText;

  @JsNonNull
  public String ariaRowSpan;

  @JsNonNull
  public String ariaSelected;

  @JsNonNull
  public String ariaSetSize;

  @JsNonNull
  public String ariaSort;

  @JsNonNull
  public String ariaValueMax;

  @JsNonNull
  public String ariaValueMin;

  @JsNonNull
  public String ariaValueNow;

  @JsNonNull
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
