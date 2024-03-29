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
 * The MediaDevices interface's getDisplayMedia() method prompts the user to select and grant permission to capture the contents of a display or portion thereof (such as a window) as a MediaStream.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints">DisplayMediaStreamConstraints - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-mediadevices-getdisplaymedia"># dom-mediadevices-getdisplaymedia</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DisplayMediaStreamConstraints"
)
public interface DisplayMediaStreamConstraints {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The DisplayMediaStreamConstraints dictionary's audio property is used to specify whether or not to request that the MediaStream containing screen display contents also include an audio track. This value may simply be a Boolean, where true indicates that an audio track should be included an false (the default) indicates that no audio should be included in the stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/audio">DisplayMediaStreamConstraints.audio - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-audio">DisplayMediaStreamConstraints.audio - Screen Capture</a>
   */
  @JsProperty(
      name = "audio"
  )
  BooleanOrMediaTrackConstraintsUnion audio();

  /**
   * The DisplayMediaStreamConstraints dictionary's audio property is used to specify whether or not to request that the MediaStream containing screen display contents also include an audio track. This value may simply be a Boolean, where true indicates that an audio track should be included an false (the default) indicates that no audio should be included in the stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/audio">DisplayMediaStreamConstraints.audio - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-audio">DisplayMediaStreamConstraints.audio - Screen Capture</a>
   */
  @JsProperty
  void setAudio(@JsNonNull BooleanOrMediaTrackConstraintsUnion audio);

  /**
   * The DisplayMediaStreamConstraints dictionary's audio property is used to specify whether or not to request that the MediaStream containing screen display contents also include an audio track. This value may simply be a Boolean, where true indicates that an audio track should be included an false (the default) indicates that no audio should be included in the stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/audio">DisplayMediaStreamConstraints.audio - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-audio">DisplayMediaStreamConstraints.audio - Screen Capture</a>
   */
  @JsOverlay
  default void setAudio(final boolean audio) {
    setAudio( BooleanOrMediaTrackConstraintsUnion.of( audio ) );
  }

  /**
   * The DisplayMediaStreamConstraints dictionary's audio property is used to specify whether or not to request that the MediaStream containing screen display contents also include an audio track. This value may simply be a Boolean, where true indicates that an audio track should be included an false (the default) indicates that no audio should be included in the stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/audio">DisplayMediaStreamConstraints.audio - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-audio">DisplayMediaStreamConstraints.audio - Screen Capture</a>
   */
  @JsOverlay
  default void setAudio(@Nonnull final MediaTrackConstraints audio) {
    setAudio( BooleanOrMediaTrackConstraintsUnion.of( audio ) );
  }

  /**
   * The DisplayMediaStreamConstraints dictionary's video property is used to configure the video track in the stream returned by getDisplayMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/video">DisplayMediaStreamConstraints.video - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-video">DisplayMediaStreamConstraints.video - Screen Capture</a>
   */
  @JsProperty(
      name = "video"
  )
  BooleanOrMediaTrackConstraintsUnion video();

  /**
   * The DisplayMediaStreamConstraints dictionary's video property is used to configure the video track in the stream returned by getDisplayMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/video">DisplayMediaStreamConstraints.video - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-video">DisplayMediaStreamConstraints.video - Screen Capture</a>
   */
  @JsProperty
  void setVideo(@JsNonNull BooleanOrMediaTrackConstraintsUnion video);

  /**
   * The DisplayMediaStreamConstraints dictionary's video property is used to configure the video track in the stream returned by getDisplayMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/video">DisplayMediaStreamConstraints.video - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-video">DisplayMediaStreamConstraints.video - Screen Capture</a>
   */
  @JsOverlay
  default void setVideo(final boolean video) {
    setVideo( BooleanOrMediaTrackConstraintsUnion.of( video ) );
  }

  /**
   * The DisplayMediaStreamConstraints dictionary's video property is used to configure the video track in the stream returned by getDisplayMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/video">DisplayMediaStreamConstraints.video - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-video">DisplayMediaStreamConstraints.video - Screen Capture</a>
   */
  @JsOverlay
  default void setVideo(@Nonnull final MediaTrackConstraints video) {
    setVideo( BooleanOrMediaTrackConstraintsUnion.of( video ) );
  }

  /**
   * The MediaDevices interface's getDisplayMedia() method prompts the user to select and grant permission to capture the contents of a display or portion thereof (such as a window) as a MediaStream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints">DisplayMediaStreamConstraints - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-mediadevices-getdisplaymedia"># dom-mediadevices-getdisplaymedia</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "DisplayMediaStreamConstraints"
  )
  interface Builder extends DisplayMediaStreamConstraints {
    /**
     * The DisplayMediaStreamConstraints dictionary's audio property is used to specify whether or not to request that the MediaStream containing screen display contents also include an audio track. This value may simply be a Boolean, where true indicates that an audio track should be included an false (the default) indicates that no audio should be included in the stream.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/audio">DisplayMediaStreamConstraints.audio - MDN</a>
     * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-audio">DisplayMediaStreamConstraints.audio - Screen Capture</a>
     */
    @JsOverlay
    @Nonnull
    default Builder audio(@Nonnull final BooleanOrMediaTrackConstraintsUnion audio) {
      setAudio( audio );
      return this;
    }

    /**
     * The DisplayMediaStreamConstraints dictionary's audio property is used to specify whether or not to request that the MediaStream containing screen display contents also include an audio track. This value may simply be a Boolean, where true indicates that an audio track should be included an false (the default) indicates that no audio should be included in the stream.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/audio">DisplayMediaStreamConstraints.audio - MDN</a>
     * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-audio">DisplayMediaStreamConstraints.audio - Screen Capture</a>
     */
    @JsOverlay
    @Nonnull
    default Builder audio(final boolean audio) {
      setAudio( audio );
      return this;
    }

    /**
     * The DisplayMediaStreamConstraints dictionary's audio property is used to specify whether or not to request that the MediaStream containing screen display contents also include an audio track. This value may simply be a Boolean, where true indicates that an audio track should be included an false (the default) indicates that no audio should be included in the stream.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/audio">DisplayMediaStreamConstraints.audio - MDN</a>
     * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-audio">DisplayMediaStreamConstraints.audio - Screen Capture</a>
     */
    @JsOverlay
    @Nonnull
    default Builder audio(@Nonnull final MediaTrackConstraints audio) {
      setAudio( audio );
      return this;
    }

    /**
     * The DisplayMediaStreamConstraints dictionary's video property is used to configure the video track in the stream returned by getDisplayMedia().
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/video">DisplayMediaStreamConstraints.video - MDN</a>
     * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-video">DisplayMediaStreamConstraints.video - Screen Capture</a>
     */
    @JsOverlay
    @Nonnull
    default Builder video(@Nonnull final BooleanOrMediaTrackConstraintsUnion video) {
      setVideo( video );
      return this;
    }

    /**
     * The DisplayMediaStreamConstraints dictionary's video property is used to configure the video track in the stream returned by getDisplayMedia().
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/video">DisplayMediaStreamConstraints.video - MDN</a>
     * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-video">DisplayMediaStreamConstraints.video - Screen Capture</a>
     */
    @JsOverlay
    @Nonnull
    default Builder video(final boolean video) {
      setVideo( video );
      return this;
    }

    /**
     * The DisplayMediaStreamConstraints dictionary's video property is used to configure the video track in the stream returned by getDisplayMedia().
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DisplayMediaStreamConstraints/video">DisplayMediaStreamConstraints.video - MDN</a>
     * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-video">DisplayMediaStreamConstraints.video - Screen Capture</a>
     */
    @JsOverlay
    @Nonnull
    default Builder video(@Nonnull final MediaTrackConstraints video) {
      setVideo( video );
      return this;
    }
  }
}
