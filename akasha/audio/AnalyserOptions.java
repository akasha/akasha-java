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
public interface AnalyserOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "fftSize"
  )
  int fftSize();

  @JsProperty
  void setFftSize(int fftSize);

  @JsProperty(
      name = "maxDecibels"
  )
  double maxDecibels();

  @JsProperty
  void setMaxDecibels(double maxDecibels);

  @JsProperty(
      name = "minDecibels"
  )
  double minDecibels();

  @JsProperty
  void setMinDecibels(double minDecibels);

  @JsProperty(
      name = "smoothingTimeConstant"
  )
  double smoothingTimeConstant();

  @JsProperty
  void setSmoothingTimeConstant(double smoothingTimeConstant);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends AnalyserOptions {
    @JsOverlay
    @Nonnull
    default Builder fftSize(final int fftSize) {
      setFftSize( fftSize );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder maxDecibels(final double maxDecibels) {
      setMaxDecibels( maxDecibels );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder minDecibels(final double minDecibels) {
      setMinDecibels( minDecibels );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder smoothingTimeConstant(final double smoothingTimeConstant) {
      setSmoothingTimeConstant( smoothingTimeConstant );
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
