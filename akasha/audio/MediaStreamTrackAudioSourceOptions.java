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
 * The MediaStreamTrackAudioSourceOptions dictionary is used when specifying options to the MediaStreamTrackAudioSourceNode() constructor.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrackAudioSourceOptions">MediaStreamTrackAudioSourceOptions - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#MediaStreamTrackAudioSourceOptions"># MediaStreamTrackAudioSourceOptions</a>
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
  static Builder mediaStreamTrack(@Nonnull final MediaStreamTrack mediaStreamTrack) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).mediaStreamTrack( mediaStreamTrack );
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

  /**
   * The MediaStreamTrackAudioSourceOptions dictionary is used when specifying options to the MediaStreamTrackAudioSourceNode() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrackAudioSourceOptions">MediaStreamTrackAudioSourceOptions - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#MediaStreamTrackAudioSourceOptions"># MediaStreamTrackAudioSourceOptions</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaStreamTrackAudioSourceOptions"
  )
  interface Builder extends MediaStreamTrackAudioSourceOptions {
    /**
     * The MediaStreamTrackAudioSourceOptions dictionary's mediaStreamTrack property must contain a reference to the MediaStreamTrack from which the MediaStreamTrackAudioSourceNode being created using the MediaStreamTrackAudioSourceNode() constructor.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrackAudioSourceOptions/mediaStreamTrack">MediaStreamTrackAudioSourceOptions.mediaStreamTrack - MDN</a>
     * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediastreamtrackaudiosourceoptions-mediastreamtrack">MediaStreamTrackAudioSourceOptions.mediaStream - Web Audio API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder mediaStreamTrack(@Nonnull final MediaStreamTrack mediaStreamTrack) {
      setMediaStreamTrack( mediaStreamTrack );
      return this;
    }
  }
}
