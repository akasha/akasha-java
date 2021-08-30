package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NavigatorOrWorkerNavigatorUnion"
)
@ApiStatus.Internal
interface NavigatorOrWorkerNavigatorUnion {
  @JsOverlay
  @Nonnull
  static NavigatorOrWorkerNavigatorUnion of(@Nonnull final Navigator value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static NavigatorOrWorkerNavigatorUnion of(@Nonnull final WorkerNavigator value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isNavigator() {
    return ( (Object) this ) instanceof Navigator;
  }

  @JsOverlay
  default Navigator asNavigator() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isWorkerNavigator() {
    return ( (Object) this ) instanceof WorkerNavigator;
  }

  @JsOverlay
  default WorkerNavigator asWorkerNavigator() {
    return Js.cast( this );
  }
}
