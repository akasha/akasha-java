package akasha.media;

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
    name = "MediaStreamTrackEventInit"
)
public interface MediaStreamTrackEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final MediaStreamTrack track) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).track( track );
  }

  @JsProperty(
      name = "track"
  )
  @Nonnull
  MediaStreamTrack track();

  @JsProperty
  void setTrack(@Nonnull MediaStreamTrack track);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaStreamTrackEventInit"
  )
  interface Builder extends MediaStreamTrackEventInit {
    @JsOverlay
    @Nonnull
    default Builder track(@Nonnull final MediaStreamTrack track) {
      setTrack( track );
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
