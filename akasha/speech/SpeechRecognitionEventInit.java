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
public interface SpeechRecognitionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final SpeechRecognitionResultList results) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).results( results );
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
  @Nonnull
  SpeechRecognitionResultList results();

  @JsProperty
  void setResults(@Nonnull SpeechRecognitionResultList results);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
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
    default Builder results(@Nonnull final SpeechRecognitionResultList results) {
      setResults( results );
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
