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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BiquadFilterOptions"
)
public interface BiquadFilterOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "Q"
  )
  float Q();

  @JsProperty
  void setQ(float Q);

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
      name = "gain"
  )
  float gain();

  @JsProperty
  void setGain(float gain);

  @JsProperty(
      name = "type"
  )
  @BiquadFilterType
  String type();

  @JsProperty
  void setType(@BiquadFilterType @JsNonNull String type);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "BiquadFilterOptions"
  )
  interface Builder extends BiquadFilterOptions {
    @JsOverlay
    @Nonnull
    default Builder Q(final float Q) {
      setQ( Q );
      return this;
    }

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
    default Builder gain(final float gain) {
      setGain( gain );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@BiquadFilterType @Nonnull final String type) {
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
