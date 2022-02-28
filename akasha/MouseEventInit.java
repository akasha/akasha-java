package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
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
    name = "MouseEventInit"
)
public interface MouseEventInit extends EventModifierInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "button"
  )
  short button();

  @JsProperty
  void setButton(short button);

  @JsProperty(
      name = "buttons"
  )
  int buttons();

  @JsProperty
  void setButtons(int buttons);

  @JsProperty(
      name = "relatedTarget"
  )
  @JsNullable
  EventTarget relatedTarget();

  @JsProperty
  void setRelatedTarget(@JsNullable EventTarget relatedTarget);

  @JsProperty(
      name = "clientX"
  )
  double clientX();

  @JsProperty
  void setClientX(double clientX);

  @JsProperty(
      name = "clientY"
  )
  double clientY();

  @JsProperty
  void setClientY(double clientY);

  @JsProperty(
      name = "screenX"
  )
  double screenX();

  @JsProperty
  void setScreenX(double screenX);

  @JsProperty(
      name = "screenY"
  )
  double screenY();

  @JsProperty
  void setScreenY(double screenY);

  @JsProperty(
      name = "movementX"
  )
  double movementX();

  @JsProperty
  void setMovementX(double movementX);

  @JsProperty(
      name = "movementY"
  )
  double movementY();

  @JsProperty
  void setMovementY(double movementY);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MouseEventInit"
  )
  interface Builder extends MouseEventInit {
    @JsOverlay
    @Nonnull
    default Builder button(final short button) {
      setButton( button );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder buttons(final int buttons) {
      setButtons( buttons );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder relatedTarget(@Nullable final EventTarget relatedTarget) {
      setRelatedTarget( relatedTarget );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder clientX(final double clientX) {
      setClientX( clientX );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder clientY(final double clientY) {
      setClientY( clientY );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder screenX(final double screenX) {
      setScreenX( screenX );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder screenY(final double screenY) {
      setScreenY( screenY );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder movementX(final double movementX) {
      setMovementX( movementX );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder movementY(final double movementY) {
      setMovementY( movementY );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder altKey(final boolean altKey) {
      setAltKey( altKey );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ctrlKey(final boolean ctrlKey) {
      setCtrlKey( ctrlKey );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder metaKey(final boolean metaKey) {
      setMetaKey( metaKey );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder modifierAltGraph(final boolean modifierAltGraph) {
      setModifierAltGraph( modifierAltGraph );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder modifierCapsLock(final boolean modifierCapsLock) {
      setModifierCapsLock( modifierCapsLock );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder modifierFn(final boolean modifierFn) {
      setModifierFn( modifierFn );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder modifierFnLock(final boolean modifierFnLock) {
      setModifierFnLock( modifierFnLock );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder modifierHyper(final boolean modifierHyper) {
      setModifierHyper( modifierHyper );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder modifierNumLock(final boolean modifierNumLock) {
      setModifierNumLock( modifierNumLock );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder modifierScrollLock(final boolean modifierScrollLock) {
      setModifierScrollLock( modifierScrollLock );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder modifierSuper(final boolean modifierSuper) {
      setModifierSuper( modifierSuper );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder modifierSymbol(final boolean modifierSymbol) {
      setModifierSymbol( modifierSymbol );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder modifierSymbolLock(final boolean modifierSymbolLock) {
      setModifierSymbolLock( modifierSymbolLock );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder shiftKey(final boolean shiftKey) {
      setShiftKey( shiftKey );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder detail(final int detail) {
      setDetail( detail );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder view(@Nullable final Window view) {
      setView( view );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder which(final int which) {
      setWhich( which );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
