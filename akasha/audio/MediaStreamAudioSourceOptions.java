package akasha.audio;

import akasha.media.MediaStream;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The MediaStreamAudioSourceOptions dictionary provides configuration options used when creating a MediaStreamAudioSourceNode using its constructor.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioSourceOptions">MediaStreamAudioSourceOptions - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#dictdef-mediastreamaudiosourceoptions">MediaStreamAudioSourceOptions - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface MediaStreamAudioSourceOptions {
  @JsOverlay
  @Nonnull
  static MediaStreamAudioSourceOptions create(@Nonnull final MediaStream mediaStream) {
    return Js.<MediaStreamAudioSourceOptions>uncheckedCast( JsPropertyMap.of() ).mediaStream( mediaStream );
  }

  /**
   * The MediaStreamAudioSourceOptions dictionary's mediaStream property must specify the MediaStream from which to retrieve audio data when instantiating a MediaStreamAudioSourceNode using the MediaStreamAudioSourceNode() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioSourceOptions/mediaStream">MediaStreamAudioSourceOptions.mediaStream - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediastreamaudiosourceoptions-mediastream">MediaStreamAudioSourceOptions.mediaStream - Web Audio API</a>
   */
  @JsProperty(
      name = "mediaStream"
  )
  @Nonnull
  MediaStream mediaStream();

  /**
   * The MediaStreamAudioSourceOptions dictionary's mediaStream property must specify the MediaStream from which to retrieve audio data when instantiating a MediaStreamAudioSourceNode using the MediaStreamAudioSourceNode() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioSourceOptions/mediaStream">MediaStreamAudioSourceOptions.mediaStream - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediastreamaudiosourceoptions-mediastream">MediaStreamAudioSourceOptions.mediaStream - Web Audio API</a>
   */
  @JsProperty
  void setMediaStream(@Nonnull MediaStream mediaStream);

  /**
   * The MediaStreamAudioSourceOptions dictionary's mediaStream property must specify the MediaStream from which to retrieve audio data when instantiating a MediaStreamAudioSourceNode using the MediaStreamAudioSourceNode() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioSourceOptions/mediaStream">MediaStreamAudioSourceOptions.mediaStream - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediastreamaudiosourceoptions-mediastream">MediaStreamAudioSourceOptions.mediaStream - Web Audio API</a>
   */
  @JsOverlay
  @Nonnull
  default MediaStreamAudioSourceOptions mediaStream(@Nonnull final MediaStream mediaStream) {
    setMediaStream( mediaStream );
    return this;
  }
}
