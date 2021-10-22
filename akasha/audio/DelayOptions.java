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
    name = "DelayOptions"
)
public interface DelayOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "delayTime"
  )
  double delayTime();

  @JsProperty
  void setDelayTime(double delayTime);

  @JsProperty(
      name = "maxDelayTime"
  )
  double maxDelayTime();

  @JsProperty
  void setMaxDelayTime(double maxDelayTime);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "DelayOptions"
  )
  interface Builder extends DelayOptions {
    @JsOverlay
    @Nonnull
    default Builder delayTime(final double delayTime) {
      setDelayTime( delayTime );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder maxDelayTime(final double maxDelayTime) {
      setMaxDelayTime( maxDelayTime );
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
