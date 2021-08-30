package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
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
    name = "PushSubscriptionJSON"
)
public interface PushSubscriptionJSON {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "endpoint"
  )
  String endpoint();

  @JsProperty
  void setEndpoint(@JsNonNull String endpoint);

  @JsProperty(
      name = "expirationTime"
  )
  @JsNullable
  int expirationTime();

  @JsProperty
  void setExpirationTime(@JsNullable int expirationTime);

  @JsProperty(
      name = "keys"
  )
  JsPropertyMap<String> keys();

  @JsProperty
  void setKeys(@JsNonNull JsPropertyMap<String> keys);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PushSubscriptionJSON"
  )
  interface Builder extends PushSubscriptionJSON {
    @JsOverlay
    @Nonnull
    default Builder endpoint(@Nonnull final String endpoint) {
      setEndpoint( endpoint );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder expirationTime(final int expirationTime) {
      setExpirationTime( expirationTime );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder keys(@Nonnull final JsPropertyMap<String> keys) {
      setKeys( keys );
      return this;
    }
  }
}
