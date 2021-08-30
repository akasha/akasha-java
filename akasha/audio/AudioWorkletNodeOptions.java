package akasha.audio;

import akasha.core.JsObject;
import akasha.lang.JsArray;
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
 * The AudioWorkletNode() constructor creates a new AudioWorkletNode object, which represents an AudioNode that uses a JavaScript function to perform custom audio processing.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNodeOptions">AudioWorkletNodeOptions - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioworkletnode-audioworkletnode"># dom-audioworkletnode-audioworkletnode</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioWorkletNodeOptions"
)
public interface AudioWorkletNodeOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "numberOfInputs"
  )
  int numberOfInputs();

  @JsProperty
  void setNumberOfInputs(int numberOfInputs);

  @JsProperty(
      name = "numberOfOutputs"
  )
  int numberOfOutputs();

  @JsProperty
  void setNumberOfOutputs(int numberOfOutputs);

  @JsProperty(
      name = "outputChannelCount"
  )
  JsArray<Double> outputChannelCount();

  @JsProperty
  void setOutputChannelCount(@JsNonNull JsArray<Double> outputChannelCount);

  @JsOverlay
  default void setOutputChannelCount(@Nonnull final double... outputChannelCount) {
    setOutputChannelCount( Js.<JsArray<Double>>uncheckedCast( outputChannelCount ) );
  }

  @JsProperty(
      name = "parameterData"
  )
  JsPropertyMap<Double> parameterData();

  @JsProperty
  void setParameterData(@JsNonNull JsPropertyMap<Double> parameterData);

  @JsProperty(
      name = "processorOptions"
  )
  JsObject processorOptions();

  @JsProperty
  void setProcessorOptions(@JsNonNull JsObject processorOptions);

  /**
   * The AudioWorkletNode() constructor creates a new AudioWorkletNode object, which represents an AudioNode that uses a JavaScript function to perform custom audio processing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNodeOptions">AudioWorkletNodeOptions - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioworkletnode-audioworkletnode"># dom-audioworkletnode-audioworkletnode</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioWorkletNodeOptions"
  )
  interface Builder extends AudioWorkletNodeOptions {
    @JsOverlay
    @Nonnull
    default Builder numberOfInputs(final int numberOfInputs) {
      setNumberOfInputs( numberOfInputs );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder numberOfOutputs(final int numberOfOutputs) {
      setNumberOfOutputs( numberOfOutputs );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder outputChannelCount(@Nonnull final JsArray<Double> outputChannelCount) {
      setOutputChannelCount( outputChannelCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder outputChannelCount(@Nonnull final double... outputChannelCount) {
      setOutputChannelCount( outputChannelCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder parameterData(@Nonnull final JsPropertyMap<Double> parameterData) {
      setParameterData( parameterData );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder processorOptions(@Nonnull final JsObject processorOptions) {
      setProcessorOptions( processorOptions );
      return this;
    }

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
