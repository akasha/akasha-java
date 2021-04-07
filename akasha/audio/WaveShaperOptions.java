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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface WaveShaperOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "curve"
  )
  JsArray<Double> curve();

  @JsProperty
  void setCurve(@Nonnull JsArray<Double> curve);

  @JsOverlay
  default void setCurve(@Nonnull final double... curve) {
    setCurve( Js.<JsArray<Double>>uncheckedCast( curve ) );
  }

  @JsProperty(
      name = "oversample"
  )
  @OverSampleType
  String oversample();

  @JsProperty
  void setOversample(@OverSampleType @Nonnull String oversample);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends WaveShaperOptions {
    @JsOverlay
    @Nonnull
    default Builder curve(@Nonnull final JsArray<Double> curve) {
      setCurve( curve );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder curve(@Nonnull final double... curve) {
      setCurve( curve );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder oversample(@OverSampleType @Nonnull final String oversample) {
      setOversample( oversample );
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
