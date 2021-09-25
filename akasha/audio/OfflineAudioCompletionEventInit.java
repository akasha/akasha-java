package akasha.audio;

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
    name = "OfflineAudioCompletionEventInit"
)
public interface OfflineAudioCompletionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder renderedBuffer(@Nonnull final AudioBuffer renderedBuffer) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).renderedBuffer( renderedBuffer );
  }

  @JsProperty(
      name = "renderedBuffer"
  )
  @JsNonNull
  AudioBuffer renderedBuffer();

  @JsProperty
  void setRenderedBuffer(@JsNonNull AudioBuffer renderedBuffer);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "OfflineAudioCompletionEventInit"
  )
  interface Builder extends OfflineAudioCompletionEventInit {
    @JsOverlay
    @Nonnull
    default Builder renderedBuffer(@Nonnull final AudioBuffer renderedBuffer) {
      setRenderedBuffer( renderedBuffer );
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
