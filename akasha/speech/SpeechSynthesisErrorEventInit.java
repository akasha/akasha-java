package akasha.speech;

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
    name = "SpeechSynthesisErrorEventInit"
)
public interface SpeechSynthesisErrorEventInit extends SpeechSynthesisEventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final SpeechSynthesisUtterance utterance,
      @SpeechSynthesisErrorCode @Nonnull final String error) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).utterance( utterance ).error( error );
  }

  @JsProperty(
      name = "error"
  )
  @SpeechSynthesisErrorCode
  @JsNonNull
  String error();

  @JsProperty
  void setError(@SpeechSynthesisErrorCode @JsNonNull String error);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SpeechSynthesisErrorEventInit"
  )
  interface Builder extends SpeechSynthesisErrorEventInit {
    @JsOverlay
    @Nonnull
    default Builder error(@SpeechSynthesisErrorCode @Nonnull final String error) {
      setError( error );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder charIndex(final int charIndex) {
      setCharIndex( charIndex );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder charLength(final int charLength) {
      setCharLength( charLength );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder elapsedTime(final float elapsedTime) {
      setElapsedTime( elapsedTime );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder name(@Nonnull final String name) {
      setName( name );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder utterance(@Nonnull final SpeechSynthesisUtterance utterance) {
      setUtterance( utterance );
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
