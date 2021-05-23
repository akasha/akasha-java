package akasha.notifications;

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
    name = "GetNotificationOptions"
)
public interface GetNotificationOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "tag"
  )
  String tag();

  @JsProperty
  void setTag(@Nonnull String tag);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GetNotificationOptions"
  )
  interface Builder extends GetNotificationOptions {
    @JsOverlay
    @Nonnull
    default Builder tag(@Nonnull final String tag) {
      setTag( tag );
      return this;
    }
  }
}
