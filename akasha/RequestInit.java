package akasha;

import akasha.core.BufferSource;
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
    name = "RequestInit"
)
public interface RequestInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "body"
  )
  @JsNullable
  BodyInit body();

  @JsProperty
  void setBody(@JsNullable BodyInit body);

  @JsOverlay
  default void setBody(@Nonnull final ReadableStream body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  default void setBody(@Nonnull final XMLHttpRequestBodyInit body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  default void setBody(@Nonnull final Blob body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  default void setBody(@Nonnull final BufferSource body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  default void setBody(@Nonnull final FormData body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  default void setBody(@Nonnull final URLSearchParams body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  default void setBody(@Nonnull final String body) {
    setBody( BodyInit.of( body ) );
  }

  @JsProperty(
      name = "cache"
  )
  @RequestCache
  String cache();

  @JsProperty
  void setCache(@RequestCache @JsNonNull String cache);

  @JsProperty(
      name = "credentials"
  )
  @RequestCredentials
  String credentials();

  @JsProperty
  void setCredentials(@RequestCredentials @JsNonNull String credentials);

  @JsProperty(
      name = "headers"
  )
  HeadersInit headers();

  @JsProperty
  void setHeaders(@JsNonNull HeadersInit headers);

  @JsOverlay
  default void setHeaders(@Nonnull final JsArray<JsArray<String>> headers) {
    setHeaders( HeadersInit.of( headers ) );
  }

  @JsOverlay
  @SuppressWarnings("unchecked")
  default void setHeaders(@Nonnull final JsArray<String>... headers) {
    setHeaders( HeadersInit.of( headers ) );
  }

  @JsOverlay
  default void setHeaders(@Nonnull final JsPropertyMap<String> headers) {
    setHeaders( HeadersInit.of( headers ) );
  }

  @JsProperty(
      name = "integrity"
  )
  String integrity();

  @JsProperty
  void setIntegrity(@JsNonNull String integrity);

  @JsProperty(
      name = "keepalive"
  )
  boolean keepalive();

  @JsProperty
  void setKeepalive(boolean keepalive);

  @JsProperty(
      name = "method"
  )
  String method();

  @JsProperty
  void setMethod(@JsNonNull String method);

  @JsProperty(
      name = "mode"
  )
  @RequestMode
  String mode();

  @JsProperty
  void setMode(@RequestMode @JsNonNull String mode);

  @JsProperty(
      name = "redirect"
  )
  @RequestRedirect
  String redirect();

  @JsProperty
  void setRedirect(@RequestRedirect @JsNonNull String redirect);

  @JsProperty(
      name = "referrer"
  )
  String referrer();

  @JsProperty
  void setReferrer(@JsNonNull String referrer);

  @JsProperty(
      name = "referrerPolicy"
  )
  @ReferrerPolicy
  String referrerPolicy();

  @JsProperty
  void setReferrerPolicy(@ReferrerPolicy @JsNonNull String referrerPolicy);

  @JsProperty(
      name = "signal"
  )
  @JsNullable
  AbortSignal signal();

  @JsProperty
  void setSignal(@JsNullable AbortSignal signal);

  @JsProperty(
      name = "window"
  )
  @JsNullable
  Any window();

  @JsProperty
  void setWindow(@DoNotAutobox @JsNullable Object window);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RequestInit"
  )
  interface Builder extends RequestInit {
    @JsOverlay
    @Nonnull
    default Builder body(@Nullable final BodyInit body) {
      setBody( body );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder body(@Nonnull final ReadableStream body) {
      setBody( body );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder body(@Nonnull final XMLHttpRequestBodyInit body) {
      setBody( body );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder body(@Nonnull final Blob body) {
      setBody( body );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder body(@Nonnull final BufferSource body) {
      setBody( body );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder body(@Nonnull final FormData body) {
      setBody( body );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder body(@Nonnull final URLSearchParams body) {
      setBody( body );
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
    default Builder cache(@RequestCache @Nonnull final String cache) {
      setCache( cache );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder credentials(@RequestCredentials @Nonnull final String credentials) {
      setCredentials( credentials );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder headers(@Nonnull final HeadersInit headers) {
      setHeaders( headers );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder headers(@Nonnull final JsArray<JsArray<String>> headers) {
      setHeaders( headers );
      return this;
    }

    @JsOverlay
    @Nonnull
    @SuppressWarnings("unchecked")
    default Builder headers(@Nonnull final JsArray<String>... headers) {
      setHeaders( headers );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder headers(@Nonnull final JsPropertyMap<String> headers) {
      setHeaders( headers );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder integrity(@Nonnull final String integrity) {
      setIntegrity( integrity );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder keepalive(final boolean keepalive) {
      setKeepalive( keepalive );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder method(@Nonnull final String method) {
      setMethod( method );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mode(@RequestMode @Nonnull final String mode) {
      setMode( mode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder redirect(@RequestRedirect @Nonnull final String redirect) {
      setRedirect( redirect );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder referrer(@Nonnull final String referrer) {
      setReferrer( referrer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder referrerPolicy(@ReferrerPolicy @Nonnull final String referrerPolicy) {
      setReferrerPolicy( referrerPolicy );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder signal(@Nullable final AbortSignal signal) {
      setSignal( signal );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder window(@DoNotAutobox @Nullable final Object window) {
      setWindow( window );
      return this;
    }
  }
}
