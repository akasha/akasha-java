package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoTrackOrAudioTrackOrTextTrackUnion"
)
public interface VideoTrackOrAudioTrackOrTextTrackUnion {
  @JsOverlay
  @Nonnull
  static VideoTrackOrAudioTrackOrTextTrackUnion of(@Nonnull final VideoTrack value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static VideoTrackOrAudioTrackOrTextTrackUnion of(@Nonnull final AudioTrack value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static VideoTrackOrAudioTrackOrTextTrackUnion of(@Nonnull final TextTrack value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isAudioTrack() {
    return ( (Object) this ) instanceof AudioTrack;
  }

  @JsOverlay
  default AudioTrack asAudioTrack() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isTextTrack() {
    return ( (Object) this ) instanceof TextTrack;
  }

  @JsOverlay
  default TextTrack asTextTrack() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isVideoTrack() {
    return ( (Object) this ) instanceof VideoTrack;
  }

  @JsOverlay
  default VideoTrack asVideoTrack() {
    return Js.cast( this );
  }
}
