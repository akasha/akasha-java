package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The PermissionStatus interface of the Permissions API provides the state of an object and an event handler for monitoring changes to said state.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PermissionStatus">PermissionStatus - MDN</a>
 * @see <a href="https://w3c.github.io/permissions/#permissionstatus-interface"># permissionstatus-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PermissionStatus"
)
public class PermissionStatus extends EventTarget {
  /**
   * The onchange event handler of the PermissionStatus interface is called whenever the PermissionStatus.state property changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PermissionStatus/onchange">PermissionStatus.onchange - MDN</a>
   */
  @JsNullable
  public EventHandler onchange;

  protected PermissionStatus() {
  }

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The state read-only property of the PermissionStatus interface returns the state of a requested permission. This property returns one of 'granted', 'denied', or 'prompt'.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PermissionStatus/state">PermissionStatus.state - MDN</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  @PermissionState
  public native String state();

  @JsOverlay
  public final void addChangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "change", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addChangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "change", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addChangeListener(@Nonnull final EventListener callback) {
    addEventListener( "change", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeChangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "change", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeChangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "change", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeChangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "change", Js.cast( callback ) );
  }
}
