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
    name = "WindowOrWorkerGlobalScopeUnion"
)
@ApiStatus.Internal
interface WindowOrWorkerGlobalScopeUnion {
  @JsOverlay
  @Nonnull
  static WindowOrWorkerGlobalScopeUnion of(@Nonnull final Window value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static WindowOrWorkerGlobalScopeUnion of(@Nonnull final WorkerGlobalScope value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isWindow() {
    return ( (Object) this ) instanceof Window;
  }

  @JsOverlay
  default Window asWindow() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isWorkerGlobalScope() {
    return ( (Object) this ) instanceof WorkerGlobalScope;
  }

  @JsOverlay
  default WorkerGlobalScope asWorkerGlobalScope() {
    return Js.cast( this );
  }
}
