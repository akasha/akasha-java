package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
  static Builder mode(@ShadowRootMode @Nonnull final String mode) {
    final Builder $shadowRootInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $shadowRootInit.setMode( mode );
    return Js.uncheckedCast( $shadowRootInit );
  }

  @JsProperty(
      name = "mode"
  )
  @ShadowRootMode
  @JsNonNull
  String mode();

  @JsProperty
  void setMode(@ShadowRootMode @JsNonNull String mode);

  @JsProperty(
      name = "delegatesFocus"
  )
  boolean delegatesFocus();

  @JsProperty
  void setDelegatesFocus(boolean delegatesFocus);

  @JsProperty(
      name = "slotAssignment"
  )
  @SlotAssignmentMode
  String slotAssignment();

  @JsProperty
  void setSlotAssignment(@SlotAssignmentMode @JsNonNull String slotAssignment);

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
    default Builder slotAssignment(@SlotAssignmentMode @Nonnull final String slotAssignment) {
      setSlotAssignment( slotAssignment );
      return this;
    }
  }
}
