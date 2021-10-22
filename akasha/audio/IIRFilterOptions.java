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
  static Step1 feedforward(@Nonnull final JsArray<Double> feedforward) {
    final Builder $iirFilterOptions = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $iirFilterOptions.setFeedforward( feedforward );
    return Js.uncheckedCast( $iirFilterOptions );
  }

  @JsOverlay
  @Nonnull
  static Step1 feedforward(@Nonnull final double... feedforward) {
    final Builder $iirFilterOptions = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $iirFilterOptions.setFeedforward( feedforward );
    return Js.uncheckedCast( $iirFilterOptions );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IIRFilterOptions"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder feedback(@Nonnull JsArray<Double> feedback) {
      Js.<IIRFilterOptions>uncheckedCast( this ).setFeedback( feedback );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Builder feedback(@Nonnull double... feedback) {
      Js.<IIRFilterOptions>uncheckedCast( this ).setFeedback( feedback );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IIRFilterOptions"
  )
  interface Builder extends IIRFilterOptions {
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
