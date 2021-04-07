package akasha.audio;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The AudioWorkletNodeOptions dictionary of the Web Audio API is used to specify configuration options when constructing a new AudioWorkletNode object for custom audio processing.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNodeOptions">AudioWorkletNodeOptions - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#dictdef-audioworkletnodeoptions">AudioWorkletNodeOptions - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
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
  void setOutputChannelCount(@Nonnull JsArray<Double> outputChannelCount);

  @JsOverlay
  default void setOutputChannelCount(@Nonnull final double... outputChannelCount) {
    setOutputChannelCount( Js.<JsArray<Double>>uncheckedCast( outputChannelCount ) );
  }

  @JsProperty(
      name = "parameterData"
  )
  JsPropertyMap<Double> parameterData();

  @JsProperty
  void setParameterData(@Nonnull JsPropertyMap<Double> parameterData);

  @JsProperty(
      name = "processorOptions"
  )
  Object processorOptions();

  @JsProperty
  void setProcessorOptions(@Nonnull Object processorOptions);

  /**
   * The AudioWorkletNodeOptions dictionary of the Web Audio API is used to specify configuration options when constructing a new AudioWorkletNode object for custom audio processing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNodeOptions">AudioWorkletNodeOptions - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dictdef-audioworkletnodeoptions">AudioWorkletNodeOptions - Web Audio API</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
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
    default Builder processorOptions(@Nonnull final Object processorOptions) {
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
