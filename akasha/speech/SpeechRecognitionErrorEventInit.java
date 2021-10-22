package akasha.speech;

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
    name = "SpeechRecognitionErrorEventInit"
)
public interface SpeechRecognitionErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder error(@SpeechRecognitionErrorCode @Nonnull final String error) {
    final Builder $speechRecognitionErrorEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $speechRecognitionErrorEventInit.setError( error );
    return Js.uncheckedCast( $speechRecognitionErrorEventInit );
  }

  @JsProperty(
      name = "error"
  )
  @SpeechRecognitionErrorCode
  @JsNonNull
  String error();

  @JsProperty
  void setError(@SpeechRecognitionErrorCode @JsNonNull String error);

  @JsProperty(
      name = "message"
  )
  String message();

  @JsProperty
  void setMessage(@JsNonNull String message);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SpeechRecognitionErrorEventInit"
  )
  interface Builder extends SpeechRecognitionErrorEventInit {
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
