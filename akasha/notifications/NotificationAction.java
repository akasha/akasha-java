package akasha.notifications;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The NotificationAction interface of the Notifications API is used to represent action buttons the user can click to interact with notifications.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NotificationAction">NotificationAction - MDN</a>
 * @see <a href="https://notifications.spec.whatwg.org/">Notifications API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NotificationAction"
)
public interface NotificationAction {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String action, @Nonnull final String title) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).action( action ).title( title );
  }

  @JsProperty(
      name = "action"
  )
  @Nonnull
  String action();

  @JsProperty
  void setAction(@Nonnull String action);

  @JsProperty(
      name = "icon"
  )
  String icon();

  @JsProperty
  void setIcon(@Nonnull String icon);

  @JsProperty(
      name = "title"
  )
  @Nonnull
  String title();

  @JsProperty
  void setTitle(@Nonnull String title);

  /**
   * The NotificationAction interface of the Notifications API is used to represent action buttons the user can click to interact with notifications.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NotificationAction">NotificationAction - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/">Notifications API</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "NotificationAction"
  )
  interface Builder extends NotificationAction {
    @JsOverlay
    @Nonnull
    default Builder action(@Nonnull final String action) {
      setAction( action );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder icon(@Nonnull final String icon) {
      setIcon( icon );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder title(@Nonnull final String title) {
      setTitle( title );
      return this;
    }
  }
}
