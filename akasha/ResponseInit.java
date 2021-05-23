package akasha;

import akasha.lang.JsArray;
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
    name = "ResponseInit"
)
public interface ResponseInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "headers"
  )
  HeadersInit headers();

  @JsProperty
  void setHeaders(@Nonnull HeadersInit headers);

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
      name = "status"
  )
  int status();

  @JsProperty
  void setStatus(int status);

  @JsProperty(
      name = "statusText"
  )
  String statusText();

  @JsProperty
  void setStatusText(@Nonnull String statusText);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ResponseInit"
  )
  interface Builder extends ResponseInit {
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
    default Builder status(final int status) {
      setStatus( status );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder statusText(@Nonnull final String statusText) {
      setStatusText( statusText );
      return this;
    }
  }
}
