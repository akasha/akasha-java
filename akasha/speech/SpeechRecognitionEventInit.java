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
    name = "SpeechRecognitionEventInit"
)
public interface SpeechRecognitionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder results(@Nonnull final SpeechRecognitionResultList results) {
    final Builder $speechRecognitionEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $speechRecognitionEventInit.setResults( results );
    return Js.uncheckedCast( $speechRecognitionEventInit );
  }

  @JsProperty(
      name = "resultIndex"
  )
  int resultIndex();

  @JsProperty
  void setResultIndex(int resultIndex);

  @JsProperty(
      name = "results"
  )
  @JsNonNull
  SpeechRecognitionResultList results();

  @JsProperty
  void setResults(@JsNonNull SpeechRecognitionResultList results);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SpeechRecognitionEventInit"
  )
  interface Builder extends SpeechRecognitionEventInit {
    @JsOverlay
    @Nonnull
    default Builder resultIndex(final int resultIndex) {
      setResultIndex( resultIndex );
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
