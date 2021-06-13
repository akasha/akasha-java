package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ShadowRootInit"
)
public interface ShadowRootInit {
  @JsOverlay
  @Nonnull
  static Builder create(@ShadowRootMode @Nonnull final String mode) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).mode( mode );
  }

  @JsProperty(
      name = "delegatesFocus"
  )
  boolean delegatesFocus();

  @JsProperty
  void setDelegatesFocus(boolean delegatesFocus);

  @JsProperty(
      name = "mode"
  )
  @ShadowRootMode
  @Nonnull
  String mode();

  @JsProperty
  void setMode(@ShadowRootMode @Nonnull String mode);

  @JsProperty(
      name = "slotAssignment"
  )
  @SlotAssignmentMode
  String slotAssignment();

  @JsProperty
  void setSlotAssignment(@SlotAssignmentMode @Nonnull String slotAssignment);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ShadowRootInit"
  )
  interface Builder extends ShadowRootInit {
    @JsOverlay
    @Nonnull
    default Builder delegatesFocus(final boolean delegatesFocus) {
      setDelegatesFocus( delegatesFocus );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mode(@ShadowRootMode @Nonnull final String mode) {
      setMode( mode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder slotAssignment(@SlotAssignmentMode @Nonnull final String slotAssignment) {
      setSlotAssignment( slotAssignment );
      return this;
    }
  }
}
