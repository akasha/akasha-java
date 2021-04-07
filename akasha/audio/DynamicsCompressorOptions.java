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
public interface DynamicsCompressorOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "attack"
  )
  float attack();

  @JsProperty
  void setAttack(float attack);

  @JsProperty(
      name = "knee"
  )
  float knee();

  @JsProperty
  void setKnee(float knee);

  @JsProperty(
      name = "ratio"
  )
  float ratio();

  @JsProperty
  void setRatio(float ratio);

  @JsProperty(
      name = "release"
  )
  float release();

  @JsProperty
  void setRelease(float release);

  @JsProperty(
      name = "threshold"
  )
  float threshold();

  @JsProperty
  void setThreshold(float threshold);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends DynamicsCompressorOptions {
    @JsOverlay
    @Nonnull
    default Builder attack(final float attack) {
      setAttack( attack );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder knee(final float knee) {
      setKnee( knee );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ratio(final float ratio) {
      setRatio( ratio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder release(final float release) {
      setRelease( release );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder threshold(final float threshold) {
      setThreshold( threshold );
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
