package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface OscillatorOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "detune"
  )
  float detune();

  @JsProperty
  void setDetune(float detune);

  @JsProperty(
      name = "frequency"
  )
  float frequency();

  @JsProperty
  void setFrequency(float frequency);

  @JsProperty(
      name = "periodicWave"
  )
  PeriodicWave periodicWave();

  @JsProperty
  void setPeriodicWave(@Nonnull PeriodicWave periodicWave);

  @JsProperty(
      name = "type"
  )
  @OscillatorType
  String type();

  @JsProperty
  void setType(@OscillatorType @Nonnull String type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends OscillatorOptions {
    @JsOverlay
    @Nonnull
    default Builder detune(final float detune) {
      setDetune( detune );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frequency(final float frequency) {
      setFrequency( frequency );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder periodicWave(@Nonnull final PeriodicWave periodicWave) {
      setPeriodicWave( periodicWave );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@OscillatorType @Nonnull final String type) {
      setType( type );
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
