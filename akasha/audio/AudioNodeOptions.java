package akasha.audio;

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
 * The AudioNode interface is a generic interface for representing an audio processing module.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNodeOptions">AudioNodeOptions - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#AudioNode"># AudioNode</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioNodeOptions"
)
public interface AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "channelCount"
  )
  int channelCount();

  @JsProperty
  void setChannelCount(int channelCount);

  @JsProperty(
      name = "channelCountMode"
  )
  @ChannelCountMode
  String channelCountMode();

  @JsProperty
  void setChannelCountMode(@ChannelCountMode @JsNonNull String channelCountMode);

  @JsProperty(
      name = "channelInterpretation"
  )
  @ChannelInterpretation
  String channelInterpretation();

  @JsProperty
  void setChannelInterpretation(@ChannelInterpretation @JsNonNull String channelInterpretation);

  /**
   * The AudioNode interface is a generic interface for representing an audio processing module.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNodeOptions">AudioNodeOptions - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#AudioNode"># AudioNode</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioNodeOptions"
  )
  interface Builder extends AudioNodeOptions {
    @JsOverlay
    @Nonnull
    default Builder channelCount(final int channelCount) {
      setChannelCount( channelCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder channelCountMode(@ChannelCountMode @Nonnull final String channelCountMode) {
      setChannelCountMode( channelCountMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder channelInterpretation(
        @ChannelInterpretation @Nonnull final String channelInterpretation) {
      setChannelInterpretation( channelInterpretation );
      return this;
    }
  }
}
