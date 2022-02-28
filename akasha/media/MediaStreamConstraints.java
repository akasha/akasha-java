package akasha.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The MediaDevices.getUserMedia() method prompts the user for permission to use a media input which produces a MediaStream with tracks containing the requested types of media.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamConstraints">MediaStreamConstraints - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediadevices-getusermedia"># dom-mediadevices-getusermedia</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaStreamConstraints"
)
public interface MediaStreamConstraints {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "audio"
  )
  BooleanOrMediaTrackConstraintsUnion audio();

  @JsProperty
  void setAudio(@JsNonNull BooleanOrMediaTrackConstraintsUnion audio);

  @JsOverlay
  default void setAudio(final boolean audio) {
    setAudio( BooleanOrMediaTrackConstraintsUnion.of( audio ) );
  }

  @JsOverlay
  default void setAudio(@Nonnull final MediaTrackConstraints audio) {
    setAudio( BooleanOrMediaTrackConstraintsUnion.of( audio ) );
  }

  @JsProperty(
      name = "video"
  )
  BooleanOrMediaTrackConstraintsUnion video();

  @JsProperty
  void setVideo(@JsNonNull BooleanOrMediaTrackConstraintsUnion video);

  @JsOverlay
  default void setVideo(final boolean video) {
    setVideo( BooleanOrMediaTrackConstraintsUnion.of( video ) );
  }

  @JsOverlay
  default void setVideo(@Nonnull final MediaTrackConstraints video) {
    setVideo( BooleanOrMediaTrackConstraintsUnion.of( video ) );
  }

  @JsProperty(
      name = "peerIdentity"
  )
  String peerIdentity();

  @JsProperty
  void setPeerIdentity(@JsNonNull String peerIdentity);

  /**
   * The MediaDevices.getUserMedia() method prompts the user for permission to use a media input which produces a MediaStream with tracks containing the requested types of media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamConstraints">MediaStreamConstraints - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediadevices-getusermedia"># dom-mediadevices-getusermedia</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaStreamConstraints"
  )
  interface Builder extends MediaStreamConstraints {
    @JsOverlay
    @Nonnull
    default Builder audio(@Nonnull final BooleanOrMediaTrackConstraintsUnion audio) {
      setAudio( audio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder audio(final boolean audio) {
      setAudio( audio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder audio(@Nonnull final MediaTrackConstraints audio) {
      setAudio( audio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder video(@Nonnull final BooleanOrMediaTrackConstraintsUnion video) {
      setVideo( video );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder video(final boolean video) {
      setVideo( video );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder video(@Nonnull final MediaTrackConstraints video) {
      setVideo( video );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder peerIdentity(@Nonnull final String peerIdentity) {
      setPeerIdentity( peerIdentity );
      return this;
    }
  }
}
