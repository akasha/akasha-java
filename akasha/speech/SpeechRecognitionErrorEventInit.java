package akasha.speech;

import akasha.EventInit;
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
    name = "Object"
)
public interface SpeechRecognitionErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@SpeechRecognitionErrorCode @Nonnull final String error) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).error( error );
  }

  @JsProperty(
      name = "error"
  )
  @SpeechRecognitionErrorCode
  @Nonnull
  String error();

  @JsProperty
  void setError(@SpeechRecognitionErrorCode @Nonnull String error);

  @JsProperty(
      name = "message"
  )
  String message();

  @JsProperty
  void setMessage(@Nonnull String message);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends SpeechRecognitionErrorEventInit {
    @JsOverlay
    @Nonnull
    default Builder error(@SpeechRecognitionErrorCode @Nonnull final String error) {
      setError( error );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder message(@Nonnull final String message) {
      setMessage( message );
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
