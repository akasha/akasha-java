package akasha.notifications;

import akasha.ExtendableEventInit;
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
    name = "NotificationEventInit"
)
public interface NotificationEventInit extends ExtendableEventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final Notification notification) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).notification( notification );
  }

  @JsProperty(
      name = "action"
  )
  String action();

  @JsProperty
  void setAction(@JsNonNull String action);

  @JsProperty(
      name = "notification"
  )
  @JsNonNull
  Notification notification();

  @JsProperty
  void setNotification(@JsNonNull Notification notification);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "NotificationEventInit"
  )
  interface Builder extends NotificationEventInit {
    @JsOverlay
    @Nonnull
    default Builder action(@Nonnull final String action) {
      setAction( action );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder notification(@Nonnull final Notification notification) {
      setNotification( notification );
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
