package akasha.notifications;

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
    name = "NotificationAction"
)
public interface NotificationAction {
  @JsOverlay
  @Nonnull
  static Step1 action(@Nonnull final String action) {
    final Builder $notificationAction = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $notificationAction.setAction( action );
    return Js.uncheckedCast( $notificationAction );
  }

  @JsProperty(
      name = "action"
  )
  @JsNonNull
  String action();

  @JsProperty
  void setAction(@JsNonNull String action);

  @JsProperty(
      name = "title"
  )
  @JsNonNull
  String title();

  @JsProperty
  void setTitle(@JsNonNull String title);

  @JsProperty(
      name = "icon"
  )
  String icon();

  @JsProperty
  void setIcon(@JsNonNull String icon);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "NotificationAction"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder title(@Nonnull String title) {
      Js.<NotificationAction>uncheckedCast( this ).setTitle( title );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "NotificationAction"
  )
  interface Builder extends NotificationAction {
    @JsOverlay
    @Nonnull
    default Builder icon(@Nonnull final String icon) {
      setIcon( icon );
      return this;
    }
  }
}
