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
public interface SpeechSynthesisEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final SpeechSynthesisUtterance utterance) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).utterance( utterance );
  }

  @JsProperty(
      name = "charIndex"
  )
  int charIndex();

  @JsProperty
  void setCharIndex(int charIndex);

  @JsProperty(
      name = "charLength"
  )
  int charLength();

  @JsProperty
  void setCharLength(int charLength);

  @JsProperty(
      name = "elapsedTime"
  )
  float elapsedTime();

  @JsProperty
  void setElapsedTime(float elapsedTime);

  @JsProperty(
      name = "name"
  )
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsProperty(
      name = "utterance"
  )
  @Nonnull
  SpeechSynthesisUtterance utterance();

  @JsProperty
  void setUtterance(@Nonnull SpeechSynthesisUtterance utterance);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends SpeechSynthesisEventInit {
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
