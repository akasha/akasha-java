package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The AudioNodeOptions dictionary of the Web Audio API specifies options that can be used when creating new AudioNode objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNodeOptions">AudioNodeOptions - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#AudioNodeOptions"># AudioNodeOptions</a>
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
  static Builder create() {
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
  void setChannelCountMode(@ChannelCountMode @Nonnull String channelCountMode);

  @JsProperty(
      name = "channelInterpretation"
  )
  @ChannelInterpretation
  String channelInterpretation();

  @JsProperty
  void setChannelInterpretation(@ChannelInterpretation @Nonnull String channelInterpretation);

  /**
   * The AudioNodeOptions dictionary of the Web Audio API specifies options that can be used when creating new AudioNode objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNodeOptions">AudioNodeOptions - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#AudioNodeOptions"># AudioNodeOptions</a>
   */
  @Generated("org.realityforge.webtack")
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
