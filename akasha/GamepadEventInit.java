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
    name = "Object"
)
public interface GamepadEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final Gamepad gamepad) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).gamepad( gamepad );
  }

  @JsProperty(
      name = "gamepad"
  )
  @Nonnull
  Gamepad gamepad();

  @JsProperty
  void setGamepad(@Nonnull Gamepad gamepad);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends GamepadEventInit {
    @JsOverlay
    @Nonnull
    default Builder gamepad(@Nonnull final Gamepad gamepad) {
      setGamepad( gamepad );
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