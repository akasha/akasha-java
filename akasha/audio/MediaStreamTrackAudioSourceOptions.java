package akasha.audio;

import akasha.media.MediaStreamTrack;
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
 * The MediaStreamTrackAudioSourceNode interface is a type of AudioNode which represents a source of audio data taken from a specific MediaStreamTrack obtained through the WebRTC or Media Capture and Streams APIs.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrackAudioSourceOptions">MediaStreamTrackAudioSourceOptions - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#MediaStreamTrackAudioSourceNode"># MediaStreamTrackAudioSourceNode</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaStreamTrackAudioSourceOptions"
)
public interface MediaStreamTrackAudioSourceOptions {
  @JsOverlay
  @Nonnull
  static MediaStreamTrackAudioSourceOptions mediaStreamTrack(
      @Nonnull final MediaStreamTrack mediaStreamTrack) {
    final MediaStreamTrackAudioSourceOptions $mediaStreamTrackAudioSourceOptions = Js.<MediaStreamTrackAudioSourceOptions>uncheckedCast( JsPropertyMap.of() );
    $mediaStreamTrackAudioSourceOptions.setMediaStreamTrack( mediaStreamTrack );
    return Js.uncheckedCast( $mediaStreamTrackAudioSourceOptions );
  }

  /**
   * The MediaStreamTrackAudioSourceOptions dictionary's mediaStreamTrack property must contain a reference to the MediaStreamTrack from which the MediaStreamTrackAudioSourceNode being created using the MediaStreamTrackAudioSourceNode() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrackAudioSourceOptions/mediaStreamTrack">MediaStreamTrackAudioSourceOptions.mediaStreamTrack - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediastreamtrackaudiosourceoptions-mediastreamtrack">MediaStreamTrackAudioSourceOptions.mediaStream - Web Audio API</a>
   */
  @JsProperty(
      name = "mediaStreamTrack"
  )
  @JsNonNull
  MediaStreamTrack mediaStreamTrack();

  /**
   * The MediaStreamTrackAudioSourceOptions dictionary's mediaStreamTrack property must contain a reference to the MediaStreamTrack from which the MediaStreamTrackAudioSourceNode being created using the MediaStreamTrackAudioSourceNode() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrackAudioSourceOptions/mediaStreamTrack">MediaStreamTrackAudioSourceOptions.mediaStreamTrack - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediastreamtrackaudiosourceoptions-mediastreamtrack">MediaStreamTrackAudioSourceOptions.mediaStream - Web Audio API</a>
   */
  @JsProperty
  void setMediaStreamTrack(@JsNonNull MediaStreamTrack mediaStreamTrack);
}
