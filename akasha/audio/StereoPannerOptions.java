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
public interface StereoPannerOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "pan"
  )
  float pan();

  @JsProperty
  void setPan(float pan);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends StereoPannerOptions {
    @JsOverlay
    @Nonnull
    default Builder pan(final float pan) {
      setPan( pan );
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
