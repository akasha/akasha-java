package akasha.audio;

import akasha.AddEventListenerOptions;
import akasha.EventHandler;
import akasha.EventListener;
import akasha.EventListenerOptions;
import akasha.EventTarget;
import akasha.core.ArrayBuffer;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The BaseAudioContext interface of the Web Audio API acts as a base definition for online and offline audio-processing graphs, as represented by AudioContext and OfflineAudioContext respectively. You wouldn't use BaseAudioContext directly &mdash; you'd use its features via one of these two inheriting interfaces.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext">BaseAudioContext - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#BaseAudioContext"># BaseAudioContext</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BaseAudioContext"
)
public class BaseAudioContext extends EventTarget {
  @JsNullable
  public EventHandler onstatechange;

  protected BaseAudioContext() {
  }

  /**
   * The audioWorklet read-only property of the BaseAudioContext interface returns an instance of AudioWorklet that can be used for adding AudioWorkletProcessor-derived classes which implement custom audio processing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/audioWorklet">BaseAudioContext.audioWorklet - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-audioworklet">audioWorklet - Web Audio API</a>
   */
  @JsProperty(
      name = "audioWorklet"
  )
  @Nonnull
  public native AudioWorklet audioWorklet();

  /**
   * The currentTime read-only property of the BaseAudioContext interface returns a double representing an ever-increasing hardware timestamp in seconds that can be used for scheduling audio playback, visualizing timelines, etc. It starts at 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/currentTime">BaseAudioContext.currentTime - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-currenttime">currentTime - Web Audio API</a>
   */
  @JsProperty(
      name = "currentTime"
  )
  public native double currentTime();

  /**
   * An AudioDestinationNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/destination">BaseAudioContext.destination - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-destination">destination - Web Audio API</a>
   */
  @JsProperty(
      name = "destination"
  )
  @Nonnull
  public native AudioDestinationNode destination();

  /**
   * An AudioListener object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/listener">BaseAudioContext.listener - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-listener">listener - Web Audio API</a>
   */
  @JsProperty(
      name = "listener"
  )
  @Nonnull
  public native AudioListener listener();

  /**
   * The sampleRate property of the BaseAudioContext interface returns a floating point number representing the sample rate, in samples per second, used by all nodes in this audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/sampleRate">BaseAudioContext.sampleRate - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-samplerate">sampleRate - Web Audio API</a>
   */
  @JsProperty(
      name = "sampleRate"
  )
  public native float sampleRate();

  /**
   * A DOMString. Possible values are:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/state">BaseAudioContext.state - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-state">state - Web Audio API</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  @AudioContextState
  public native String state();

  /**
   * The createAnalyser() method of the BaseAudioContext interface creates an AnalyserNode, which can be used to expose audio time and frequency data and create data visualisations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createAnalyser">BaseAudioContext.createAnalyser - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createanalyser">createAnalyser() - Web Audio API</a>
   */
  @JsNonNull
  public native AnalyserNode createAnalyser();

  /**
   * A BiquadFilterNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createBiquadFilter">BaseAudioContext.createBiquadFilter - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createbiquadfilter">createBiquadFilter() - Web Audio API</a>
   */
  @JsNonNull
  public native BiquadFilterNode createBiquadFilter();

  /**
   * An AudioBuffer configured based on the specified options.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createBuffer">BaseAudioContext.createBuffer - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createbuffer">createBuffer() - Web Audio API</a>
   */
  @JsNonNull
  public native AudioBuffer createBuffer(int numberOfChannels, int length, float sampleRate);

  /**
   * An AudioBufferSourceNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createBufferSource">BaseAudioContext.createBufferSource - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createbuffersource">createBufferSource() - Web Audio API</a>
   */
  @JsNonNull
  public native AudioBufferSourceNode createBufferSource();

  /**
   * A ChannelMergerNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createChannelMerger">BaseAudioContext.createChannelMerger - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createchannelmerger">createChannelMerger() - Web Audio API</a>
   */
  @JsNonNull
  public native ChannelMergerNode createChannelMerger(int numberOfInputs);

  /**
   * A ChannelMergerNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createChannelMerger">BaseAudioContext.createChannelMerger - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createchannelmerger">createChannelMerger() - Web Audio API</a>
   */
  @JsNonNull
  public native ChannelMergerNode createChannelMerger();

  /**
   * A ChannelSplitterNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createChannelSplitter">BaseAudioContext.createChannelSplitter - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createchannelsplitter">createChannelSplitter() - Web Audio API</a>
   */
  @JsNonNull
  public native ChannelSplitterNode createChannelSplitter(int numberOfOutputs);

  /**
   * A ChannelSplitterNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createChannelSplitter">BaseAudioContext.createChannelSplitter - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createchannelsplitter">createChannelSplitter() - Web Audio API</a>
   */
  @JsNonNull
  public native ChannelSplitterNode createChannelSplitter();

  /**
   * The createConstantSource() property of the BaseAudioContext interface creates a ConstantSourceNode object, which is an audio source that continuously outputs a monaural (one-channel) sound signal whose samples all have the same value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createConstantSource">BaseAudioContext.createConstantSource - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createconstantsource">createConstantSource() - Web Audio API</a>
   */
  @JsNonNull
  public native ConstantSourceNode createConstantSource();

  /**
   * A ConvolverNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createConvolver">BaseAudioContext.createConvolver - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createconvolver">createConvolver() - Web Audio API</a>
   */
  @JsNonNull
  public native ConvolverNode createConvolver();

  /**
   * The createDelay() method of the BaseAudioContext Interface is used to create a DelayNode, which is used to delay the incoming audio signal by a certain amount of time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createDelay">BaseAudioContext.createDelay - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createdelay">createDelay() - Web Audio API</a>
   */
  @JsNonNull
  public native DelayNode createDelay(double maxDelayTime);

  /**
   * The createDelay() method of the BaseAudioContext Interface is used to create a DelayNode, which is used to delay the incoming audio signal by a certain amount of time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createDelay">BaseAudioContext.createDelay - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createdelay">createDelay() - Web Audio API</a>
   */
  @JsNonNull
  public native DelayNode createDelay();

  /**
   * Compression lowers the volume of the loudest parts of the signal and raises the volume of the softest parts. Overall, a louder, richer, and fuller sound can be achieved. It is especially important in games and musical applications where large numbers of individual sounds are played simultaneously, where you want to control the overall signal level and help avoid clipping (distorting) of the audio output.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createDynamicsCompressor">BaseAudioContext.createDynamicsCompressor - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createdynamicscompressor">createDynamicsCompressor() - Web Audio API</a>
   */
  @JsNonNull
  public native DynamicsCompressorNode createDynamicsCompressor();

  /**
   * A GainNode which takes as input one or more audio sources and outputs audio whose volume has been adjusted in gain (volume) to a level specified by the node's GainNode.gain a-rate parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createGain">BaseAudioContext.createGain - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-creategain">createGain() - Web Audio API</a>
   */
  @JsNonNull
  public native GainNode createGain();

  /**
   * The createIIRFilter() method of the BaseAudioContext interface creates an IIRFilterNode, which represents a general infinite impulse response (IIR) filter which can be configured to serve as various types of filter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createIIRFilter">BaseAudioContext.createIIRFilter - MDN</a>
   */
  @JsNonNull
  public native IIRFilterNode createIIRFilter(@Nonnull JsArray<Double> feedforward,
      @Nonnull JsArray<Double> feedback);

  /**
   * The createIIRFilter() method of the BaseAudioContext interface creates an IIRFilterNode, which represents a general infinite impulse response (IIR) filter which can be configured to serve as various types of filter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createIIRFilter">BaseAudioContext.createIIRFilter - MDN</a>
   */
  @JsNonNull
  public native IIRFilterNode createIIRFilter(@Nonnull double[] feedforward,
      @Nonnull JsArray<Double> feedback);

  /**
   * The createIIRFilter() method of the BaseAudioContext interface creates an IIRFilterNode, which represents a general infinite impulse response (IIR) filter which can be configured to serve as various types of filter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createIIRFilter">BaseAudioContext.createIIRFilter - MDN</a>
   */
  @JsOverlay
  @JsNonNull
  public final IIRFilterNode createIIRFilter(@Nonnull final JsArray<Double> feedforward,
      @Nonnull final double... feedback) {
    return _createIIRFilter( feedforward, feedback );
  }

  @JsMethod(
      name = "createIIRFilter"
  )
  @JsNonNull
  private native IIRFilterNode _createIIRFilter(@Nonnull JsArray<Double> feedforward,
      @Nonnull double[] feedback);

  /**
   * The createIIRFilter() method of the BaseAudioContext interface creates an IIRFilterNode, which represents a general infinite impulse response (IIR) filter which can be configured to serve as various types of filter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createIIRFilter">BaseAudioContext.createIIRFilter - MDN</a>
   */
  @JsOverlay
  @JsNonNull
  public final IIRFilterNode createIIRFilter(@Nonnull final double[] feedforward,
      @Nonnull final double... feedback) {
    return _createIIRFilter( feedforward, feedback );
  }

  @JsMethod(
      name = "createIIRFilter"
  )
  @JsNonNull
  private native IIRFilterNode _createIIRFilter(@Nonnull double[] feedforward,
      @Nonnull double[] feedback);

  /**
   * The createOscillator() method of the BaseAudioContext interface creates an OscillatorNode, a source representing a periodic waveform. It basically generates a constant tone.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createOscillator">BaseAudioContext.createOscillator - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createoscillator">createOscillator - Web Audio API</a>
   */
  @JsNonNull
  public native OscillatorNode createOscillator();

  /**
   * The panner node is spatialized in relation to the AudioContext's AudioListener (defined by the AudioContext.listener attribute), which represents the position and orientation of the person listening to the audio.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createPanner">BaseAudioContext.createPanner - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createpanner">createPanner() - Web Audio API</a>
   */
  @JsNonNull
  public native PannerNode createPanner();

  /**
   * The createPeriodicWave() method of the BaseAudioContext Interface is used to create a PeriodicWave, which is used to define a periodic waveform that can be used to shape the output of an OscillatorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createPeriodicWave">BaseAudioContext.createPeriodicWave - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createperiodicwave">createPeriodicWave - Web Audio API</a>
   */
  @JsNonNull
  public native PeriodicWave createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull JsArray<Double> imag, @Nonnull PeriodicWaveConstraints constraints);

  /**
   * The createPeriodicWave() method of the BaseAudioContext Interface is used to create a PeriodicWave, which is used to define a periodic waveform that can be used to shape the output of an OscillatorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createPeriodicWave">BaseAudioContext.createPeriodicWave - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createperiodicwave">createPeriodicWave - Web Audio API</a>
   */
  @JsNonNull
  public native PeriodicWave createPeriodicWave(@Nonnull double[] real,
      @Nonnull JsArray<Double> imag, @Nonnull PeriodicWaveConstraints constraints);

  /**
   * The createPeriodicWave() method of the BaseAudioContext Interface is used to create a PeriodicWave, which is used to define a periodic waveform that can be used to shape the output of an OscillatorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createPeriodicWave">BaseAudioContext.createPeriodicWave - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createperiodicwave">createPeriodicWave - Web Audio API</a>
   */
  @JsNonNull
  public native PeriodicWave createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull double[] imag, @Nonnull PeriodicWaveConstraints constraints);

  /**
   * The createPeriodicWave() method of the BaseAudioContext Interface is used to create a PeriodicWave, which is used to define a periodic waveform that can be used to shape the output of an OscillatorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createPeriodicWave">BaseAudioContext.createPeriodicWave - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createperiodicwave">createPeriodicWave - Web Audio API</a>
   */
  @JsNonNull
  public native PeriodicWave createPeriodicWave(@Nonnull double[] real, @Nonnull double[] imag,
      @Nonnull PeriodicWaveConstraints constraints);

  /**
   * The createPeriodicWave() method of the BaseAudioContext Interface is used to create a PeriodicWave, which is used to define a periodic waveform that can be used to shape the output of an OscillatorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createPeriodicWave">BaseAudioContext.createPeriodicWave - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createperiodicwave">createPeriodicWave - Web Audio API</a>
   */
  @JsNonNull
  public native PeriodicWave createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull JsArray<Double> imag);

  /**
   * The createPeriodicWave() method of the BaseAudioContext Interface is used to create a PeriodicWave, which is used to define a periodic waveform that can be used to shape the output of an OscillatorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createPeriodicWave">BaseAudioContext.createPeriodicWave - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createperiodicwave">createPeriodicWave - Web Audio API</a>
   */
  @JsNonNull
  public native PeriodicWave createPeriodicWave(@Nonnull double[] real,
      @Nonnull JsArray<Double> imag);

  /**
   * The createPeriodicWave() method of the BaseAudioContext Interface is used to create a PeriodicWave, which is used to define a periodic waveform that can be used to shape the output of an OscillatorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createPeriodicWave">BaseAudioContext.createPeriodicWave - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createperiodicwave">createPeriodicWave - Web Audio API</a>
   */
  @JsOverlay
  @JsNonNull
  public final PeriodicWave createPeriodicWave(@Nonnull final JsArray<Double> real,
      @Nonnull final double... imag) {
    return _createPeriodicWave( real, imag );
  }

  @JsMethod(
      name = "createPeriodicWave"
  )
  @JsNonNull
  private native PeriodicWave _createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull double[] imag);

  /**
   * The createPeriodicWave() method of the BaseAudioContext Interface is used to create a PeriodicWave, which is used to define a periodic waveform that can be used to shape the output of an OscillatorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createPeriodicWave">BaseAudioContext.createPeriodicWave - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createperiodicwave">createPeriodicWave - Web Audio API</a>
   */
  @JsOverlay
  @JsNonNull
  public final PeriodicWave createPeriodicWave(@Nonnull final double[] real,
      @Nonnull final double... imag) {
    return _createPeriodicWave( real, imag );
  }

  @JsMethod(
      name = "createPeriodicWave"
  )
  @JsNonNull
  private native PeriodicWave _createPeriodicWave(@Nonnull double[] real, @Nonnull double[] imag);

  /**
   * A ScriptProcessorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createScriptProcessor">BaseAudioContext.createScriptProcessor - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createscriptprocessor">createScriptProcessor - Web Audio API</a>
   */
  @JsNonNull
  public native ScriptProcessorNode createScriptProcessor(int bufferSize, int numberOfInputChannels,
      int numberOfOutputChannels);

  /**
   * A ScriptProcessorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createScriptProcessor">BaseAudioContext.createScriptProcessor - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createscriptprocessor">createScriptProcessor - Web Audio API</a>
   */
  @JsNonNull
  public native ScriptProcessorNode createScriptProcessor(int bufferSize,
      int numberOfInputChannels);

  /**
   * A ScriptProcessorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createScriptProcessor">BaseAudioContext.createScriptProcessor - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createscriptprocessor">createScriptProcessor - Web Audio API</a>
   */
  @JsNonNull
  public native ScriptProcessorNode createScriptProcessor(int bufferSize);

  /**
   * A ScriptProcessorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createScriptProcessor">BaseAudioContext.createScriptProcessor - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createscriptprocessor">createScriptProcessor - Web Audio API</a>
   */
  @JsNonNull
  public native ScriptProcessorNode createScriptProcessor();

  /**
   * A StereoPannerNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createStereoPanner">BaseAudioContext.createStereoPanner - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createstereopanner">createStereoPanner() - Web Audio API</a>
   */
  @JsNonNull
  public native StereoPannerNode createStereoPanner();

  /**
   * A WaveShaperNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createWaveShaper">BaseAudioContext.createWaveShaper - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-createwaveshaper">createWaveShaper() - Web Audio API</a>
   */
  @JsNonNull
  public native WaveShaperNode createWaveShaper();

  /**
   * The decodeAudioData() method of the BaseAudioContext Interface is used to asynchronously decode audio file data contained in an ArrayBuffer. In this case the ArrayBuffer is loaded from XMLHttpRequest and FileReader. The decoded AudioBuffer is resampled to the AudioContext's sampling rate, then passed to a callback or promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/decodeAudioData">BaseAudioContext.decodeAudioData - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-decodeaudiodata">decodeAudioData() - Web Audio API</a>
   */
  @JsNonNull
  public native Promise<AudioBuffer> decodeAudioData(@Nonnull ArrayBuffer audioData,
      @Nullable DecodeSuccessCallback successCallback, @Nullable DecodeErrorCallback errorCallback);

  /**
   * The decodeAudioData() method of the BaseAudioContext Interface is used to asynchronously decode audio file data contained in an ArrayBuffer. In this case the ArrayBuffer is loaded from XMLHttpRequest and FileReader. The decoded AudioBuffer is resampled to the AudioContext's sampling rate, then passed to a callback or promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/decodeAudioData">BaseAudioContext.decodeAudioData - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-decodeaudiodata">decodeAudioData() - Web Audio API</a>
   */
  @JsNonNull
  public native Promise<AudioBuffer> decodeAudioData(@Nonnull ArrayBuffer audioData,
      @Nullable DecodeSuccessCallback successCallback);

  /**
   * The decodeAudioData() method of the BaseAudioContext Interface is used to asynchronously decode audio file data contained in an ArrayBuffer. In this case the ArrayBuffer is loaded from XMLHttpRequest and FileReader. The decoded AudioBuffer is resampled to the AudioContext's sampling rate, then passed to a callback or promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/decodeAudioData">BaseAudioContext.decodeAudioData - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-baseaudiocontext-decodeaudiodata">decodeAudioData() - Web Audio API</a>
   */
  @JsNonNull
  public native Promise<AudioBuffer> decodeAudioData(@Nonnull ArrayBuffer audioData);

  @JsOverlay
  public final void addStatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "statechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addStatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "statechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addStatechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "statechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeStatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "statechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeStatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "statechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeStatechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "statechange", Js.cast( callback ) );
  }
}
