package akasha.media;

import akasha.DOMException;
import akasha.EventInit;
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
    name = "MediaRecorderErrorEventInit"
)
public interface MediaRecorderErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder error(@Nonnull final DOMException error) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).error( error );
  }

  @JsProperty(
      name = "error"
  )
  @JsNonNull
  DOMException error();

  @JsProperty
  void setError(@JsNonNull DOMException error);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaRecorderErrorEventInit"
  )
  interface Builder extends MediaRecorderErrorEventInit {
    @JsOverlay
    @Nonnull
    default Builder error(@Nonnull final DOMException error) {
      setError( error );
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
