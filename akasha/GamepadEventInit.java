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
    name = "GamepadEventInit"
)
public interface GamepadEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder gamepad(@Nonnull final Gamepad gamepad) {
    final Builder $gamepadEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gamepadEventInit.setGamepad( gamepad );
    return Js.uncheckedCast( $gamepadEventInit );
  }

  @JsProperty(
      name = "gamepad"
  )
  @JsNonNull
  Gamepad gamepad();

  @JsProperty
  void setGamepad(@JsNonNull Gamepad gamepad);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GamepadEventInit"
  )
  interface Builder extends GamepadEventInit {
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
