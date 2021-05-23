package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
    name = "ConvolverOptions"
)
public interface ConvolverOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "buffer"
  )
  @Nullable
  AudioBuffer buffer();

  @JsProperty
  void setBuffer(@Nullable AudioBuffer buffer);

  @JsProperty(
      name = "disableNormalization"
  )
  boolean disableNormalization();

  @JsProperty
  void setDisableNormalization(boolean disableNormalization);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ConvolverOptions"
  )
  interface Builder extends ConvolverOptions {
    @JsOverlay
    @Nonnull
    default Builder buffer(@Nullable final AudioBuffer buffer) {
      setBuffer( buffer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder disableNormalization(final boolean disableNormalization) {
      setDisableNormalization( disableNormalization );
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
