package akasha;

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
    name = "EventModifierInit"
)
public interface EventModifierInit extends UIEventInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "altKey"
  )
  boolean altKey();

  @JsProperty
  void setAltKey(boolean altKey);

  @JsProperty(
      name = "ctrlKey"
  )
  boolean ctrlKey();

  @JsProperty
  void setCtrlKey(boolean ctrlKey);

  @JsProperty(
      name = "metaKey"
  )
  boolean metaKey();

  @JsProperty
  void setMetaKey(boolean metaKey);

  @JsProperty(
      name = "modifierAltGraph"
  )
  boolean modifierAltGraph();

  @JsProperty
  void setModifierAltGraph(boolean modifierAltGraph);

  @JsProperty(
      name = "modifierCapsLock"
  )
  boolean modifierCapsLock();

  @JsProperty
  void setModifierCapsLock(boolean modifierCapsLock);

  @JsProperty(
      name = "modifierFn"
  )
  boolean modifierFn();

  @JsProperty
  void setModifierFn(boolean modifierFn);

  @JsProperty(
      name = "modifierFnLock"
  )
  boolean modifierFnLock();

  @JsProperty
  void setModifierFnLock(boolean modifierFnLock);

  @JsProperty(
      name = "modifierHyper"
  )
  boolean modifierHyper();

  @JsProperty
  void setModifierHyper(boolean modifierHyper);

  @JsProperty(
      name = "modifierNumLock"
  )
  boolean modifierNumLock();

  @JsProperty
  void setModifierNumLock(boolean modifierNumLock);

  @JsProperty(
      name = "modifierScrollLock"
  )
  boolean modifierScrollLock();

  @JsProperty
  void setModifierScrollLock(boolean modifierScrollLock);

  @JsProperty(
      name = "modifierSuper"
  )
  boolean modifierSuper();

  @JsProperty
  void setModifierSuper(boolean modifierSuper);

  @JsProperty(
      name = "modifierSymbol"
  )
  boolean modifierSymbol();

  @JsProperty
  void setModifierSymbol(boolean modifierSymbol);

  @JsProperty(
      name = "modifierSymbolLock"
  )
  boolean modifierSymbolLock();

  @JsProperty
  void setModifierSymbolLock(boolean modifierSymbolLock);

  @JsProperty(
      name = "shiftKey"
  )
  boolean shiftKey();

  @JsProperty
  void setShiftKey(boolean shiftKey);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EventModifierInit"
  )
  interface Builder extends EventModifierInit {
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
