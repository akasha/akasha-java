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
public interface IIRFilterOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<Double> feedback,
      @Nonnull final JsArray<Double> feedforward) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).feedback( feedback ).feedforward( feedforward );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final double[] feedback,
      @Nonnull final JsArray<Double> feedforward) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).feedback( feedback ).feedforward( feedforward );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<Double> feedback,
      @Nonnull final double[] feedforward) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).feedback( feedback ).feedforward( feedforward );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final double[] feedback, @Nonnull final double[] feedforward) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).feedback( feedback ).feedforward( feedforward );
  }

  @JsProperty(
      name = "feedback"
  )
  @Nonnull
  JsArray<Double> feedback();

  @JsProperty
  void setFeedback(@Nonnull JsArray<Double> feedback);

  @JsOverlay
  default void setFeedback(@Nonnull final double... feedback) {
    setFeedback( Js.<JsArray<Double>>uncheckedCast( feedback ) );
  }

  @JsProperty(
      name = "feedforward"
  )
  @Nonnull
  JsArray<Double> feedforward();

  @JsProperty
  void setFeedforward(@Nonnull JsArray<Double> feedforward);

  @JsOverlay
  default void setFeedforward(@Nonnull final double... feedforward) {
    setFeedforward( Js.<JsArray<Double>>uncheckedCast( feedforward ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends IIRFilterOptions {
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
