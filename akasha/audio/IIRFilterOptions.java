package akasha.audio;

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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IIRFilterOptions"
)
public interface IIRFilterOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<Double> feedforward,
      @Nonnull final JsArray<Double> feedback) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).feedforward( feedforward ).feedback( feedback );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final double[] feedforward,
      @Nonnull final JsArray<Double> feedback) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).feedforward( feedforward ).feedback( feedback );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<Double> feedforward,
      @Nonnull final double... feedback) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).feedforward( feedforward ).feedback( feedback );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final double[] feedforward, @Nonnull final double... feedback) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).feedforward( feedforward ).feedback( feedback );
  }

  @JsProperty(
      name = "feedforward"
  )
  @JsNonNull
  JsArray<Double> feedforward();

  @JsProperty
  void setFeedforward(@JsNonNull JsArray<Double> feedforward);

  @JsOverlay
  default void setFeedforward(@Nonnull final double... feedforward) {
    setFeedforward( Js.<JsArray<Double>>uncheckedCast( feedforward ) );
  }

  @JsProperty(
      name = "feedback"
  )
  @JsNonNull
  JsArray<Double> feedback();

  @JsProperty
  void setFeedback(@JsNonNull JsArray<Double> feedback);

  @JsOverlay
  default void setFeedback(@Nonnull final double... feedback) {
    setFeedback( Js.<JsArray<Double>>uncheckedCast( feedback ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IIRFilterOptions"
  )
  interface Builder extends IIRFilterOptions {
    @JsOverlay
    @Nonnull
    default Builder feedforward(@Nonnull final JsArray<Double> feedforward) {
      setFeedforward( feedforward );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder feedforward(@Nonnull final double... feedforward) {
      setFeedforward( feedforward );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder feedback(@Nonnull final JsArray<Double> feedback) {
      setFeedback( feedback );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder feedback(@Nonnull final double... feedback) {
      setFeedback( feedback );
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
