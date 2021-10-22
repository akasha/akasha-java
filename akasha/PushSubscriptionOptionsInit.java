package akasha;

import akasha.core.BufferSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
    name = "PushSubscriptionOptionsInit"
)
public interface PushSubscriptionOptionsInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "applicationServerKey"
  )
  @JsNullable
  BufferSourceOrStringUnion applicationServerKey();

  @JsProperty
  void setApplicationServerKey(@JsNullable BufferSourceOrStringUnion applicationServerKey);

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final BufferSource applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final String applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsProperty(
      name = "userVisibleOnly"
  )
  boolean userVisibleOnly();

  @JsProperty
  void setUserVisibleOnly(boolean userVisibleOnly);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PushSubscriptionOptionsInit"
  )
  interface Builder extends PushSubscriptionOptionsInit {
    @JsOverlay
    @Nonnull
    default Builder applicationServerKey(
        @Nullable final BufferSourceOrStringUnion applicationServerKey) {
      setApplicationServerKey( applicationServerKey );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder applicationServerKey(@Nonnull final BufferSource applicationServerKey) {
      setApplicationServerKey( applicationServerKey );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder applicationServerKey(@Nonnull final String applicationServerKey) {
      setApplicationServerKey( applicationServerKey );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder userVisibleOnly(final boolean userVisibleOnly) {
      setUserVisibleOnly( userVisibleOnly );
      return this;
    }
  }
}
