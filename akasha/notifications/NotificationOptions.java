package akasha.notifications;

import akasha.VibratePattern;
import akasha.lang.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NotificationOptions"
)
public interface NotificationOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "actions"
  )
  JsArray<NotificationAction> actions();

  @JsProperty
  void setActions(@JsNonNull JsArray<NotificationAction> actions);

  @JsOverlay
  default void setActions(@Nonnull final NotificationAction... actions) {
    setActions( Js.<JsArray<NotificationAction>>uncheckedCast( actions ) );
  }

  @JsProperty(
      name = "badge"
  )
  String badge();

  @JsProperty
  void setBadge(@JsNonNull String badge);

  @JsProperty(
      name = "body"
  )
  String body();

  @JsProperty
  void setBody(@JsNonNull String body);

  @JsProperty(
      name = "data"
  )
  @JsNullable
  Any data();

  @JsProperty
  void setData(@DoNotAutobox @JsNullable Object data);

  @JsProperty(
      name = "dir"
  )
  @NotificationDirection
  String dir();

  @JsProperty
  void setDir(@NotificationDirection @JsNonNull String dir);

  @JsProperty(
      name = "icon"
  )
  String icon();

  @JsProperty
  void setIcon(@JsNonNull String icon);

  @JsProperty(
      name = "image"
  )
  String image();

  @JsProperty
  void setImage(@JsNonNull String image);

  @JsProperty(
      name = "lang"
  )
  String lang();

  @JsProperty
  void setLang(@JsNonNull String lang);

  @JsProperty(
      name = "renotify"
  )
  boolean renotify();

  @JsProperty
  void setRenotify(boolean renotify);

  @JsProperty(
      name = "requireInteraction"
  )
  boolean requireInteraction();

  @JsProperty
  void setRequireInteraction(boolean requireInteraction);

  @JsProperty(
      name = "silent"
  )
  boolean silent();

  @JsProperty
  void setSilent(boolean silent);

  @JsProperty(
      name = "tag"
  )
  String tag();

  @JsProperty
  void setTag(@JsNonNull String tag);

  @JsProperty(
      name = "timestamp"
  )
  int timestamp();

  @JsProperty
  void setTimestamp(int timestamp);

  @JsProperty(
      name = "vibrate"
  )
  VibratePattern vibrate();

  @JsProperty
  void setVibrate(@JsNonNull VibratePattern vibrate);

  @JsOverlay
  default void setVibrate(final int vibrate) {
    setVibrate( VibratePattern.of( vibrate ) );
  }

  @JsOverlay
  default void setVibrate(@Nonnull final JsArray<Double> vibrate) {
    setVibrate( VibratePattern.of( vibrate ) );
  }

  @JsOverlay
  default void setVibrate(@Nonnull final double... vibrate) {
    setVibrate( VibratePattern.of( vibrate ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "NotificationOptions"
  )
  interface Builder extends NotificationOptions {
    @JsOverlay
    @Nonnull
    default Builder actions(@Nonnull final JsArray<NotificationAction> actions) {
      setActions( actions );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder actions(@Nonnull final NotificationAction... actions) {
      setActions( actions );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder badge(@Nonnull final String badge) {
      setBadge( badge );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder body(@Nonnull final String body) {
      setBody( body );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder data(@DoNotAutobox @Nullable final Object data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder dir(@NotificationDirection @Nonnull final String dir) {
      setDir( dir );
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
    default Builder image(@Nonnull final String image) {
      setImage( image );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder lang(@Nonnull final String lang) {
      setLang( lang );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder renotify(final boolean renotify) {
      setRenotify( renotify );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder requireInteraction(final boolean requireInteraction) {
      setRequireInteraction( requireInteraction );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder silent(final boolean silent) {
      setSilent( silent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder tag(@Nonnull final String tag) {
      setTag( tag );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder timestamp(final int timestamp) {
      setTimestamp( timestamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder vibrate(@Nonnull final VibratePattern vibrate) {
      setVibrate( vibrate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder vibrate(final int vibrate) {
      setVibrate( vibrate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder vibrate(@Nonnull final JsArray<Double> vibrate) {
      setVibrate( vibrate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder vibrate(@Nonnull final double... vibrate) {
      setVibrate( vibrate );
      return this;
    }
  }
}
