package akasha;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
    name = "Object"
)
public interface TouchEventInit extends EventModifierInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "changedTouches"
  )
  JsArray<Touch> changedTouches();

  @JsProperty
  void setChangedTouches(@Nonnull JsArray<Touch> changedTouches);

  @JsOverlay
  default void setChangedTouches(@Nonnull final Touch... changedTouches) {
    setChangedTouches( Js.<JsArray<Touch>>uncheckedCast( changedTouches ) );
  }

  @JsProperty(
      name = "targetTouches"
  )
  JsArray<Touch> targetTouches();

  @JsProperty
  void setTargetTouches(@Nonnull JsArray<Touch> targetTouches);

  @JsOverlay
  default void setTargetTouches(@Nonnull final Touch... targetTouches) {
    setTargetTouches( Js.<JsArray<Touch>>uncheckedCast( targetTouches ) );
  }

  @JsProperty(
      name = "touches"
  )
  JsArray<Touch> touches();

  @JsProperty
  void setTouches(@Nonnull JsArray<Touch> touches);

  @JsOverlay
  default void setTouches(@Nonnull final Touch... touches) {
    setTouches( Js.<JsArray<Touch>>uncheckedCast( touches ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends TouchEventInit {
    @JsOverlay
    @Nonnull
    default Builder changedTouches(@Nonnull final JsArray<Touch> changedTouches) {
      setChangedTouches( changedTouches );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder changedTouches(@Nonnull final Touch... changedTouches) {
      setChangedTouches( changedTouches );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder targetTouches(@Nonnull final JsArray<Touch> targetTouches) {
      setTargetTouches( targetTouches );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder targetTouches(@Nonnull final Touch... targetTouches) {
      setTargetTouches( targetTouches );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder touches(@Nonnull final JsArray<Touch> touches) {
      setTouches( touches );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder touches(@Nonnull final Touch... touches) {
      setTouches( touches );
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
