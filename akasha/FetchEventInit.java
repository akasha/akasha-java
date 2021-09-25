package akasha;

import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "FetchEventInit"
)
public interface FetchEventInit extends ExtendableEventInit {
  @JsOverlay
  @Nonnull
  static Builder request(@Nonnull final Request request) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).request( request );
  }

  @JsProperty(
      name = "request"
  )
  @JsNonNull
  Request request();

  @JsProperty
  void setRequest(@JsNonNull Request request);

  @JsProperty(
      name = "clientId"
  )
  String clientId();

  @JsProperty
  void setClientId(@JsNonNull String clientId);

  @JsProperty(
      name = "handled"
  )
  Promise<Void> handled();

  @JsProperty
  void setHandled(@JsNonNull Promise<Void> handled);

  @JsProperty(
      name = "preloadResponse"
  )
  Promise<Any> preloadResponse();

  @JsProperty
  void setPreloadResponse(@JsNonNull Promise<Any> preloadResponse);

  @JsProperty(
      name = "replacesClientId"
  )
  String replacesClientId();

  @JsProperty
  void setReplacesClientId(@JsNonNull String replacesClientId);

  @JsProperty(
      name = "resultingClientId"
  )
  String resultingClientId();

  @JsProperty
  void setResultingClientId(@JsNonNull String resultingClientId);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FetchEventInit"
  )
  interface Builder extends FetchEventInit {
    @JsOverlay
    @Nonnull
    default Builder request(@Nonnull final Request request) {
      setRequest( request );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder clientId(@Nonnull final String clientId) {
      setClientId( clientId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder handled(@Nonnull final Promise<Void> handled) {
      setHandled( handled );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder preloadResponse(@Nonnull final Promise<Any> preloadResponse) {
      setPreloadResponse( preloadResponse );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder replacesClientId(@Nonnull final String replacesClientId) {
      setReplacesClientId( replacesClientId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder resultingClientId(@Nonnull final String resultingClientId) {
      setResultingClientId( resultingClientId );
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
