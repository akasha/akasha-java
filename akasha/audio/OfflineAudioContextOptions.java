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
public interface OfflineAudioContextOptions {
  @JsOverlay
  @Nonnull
  static Builder create(final int length, final float sampleRate) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).length( length ).sampleRate( sampleRate );
  }

  @JsProperty(
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  @JsProperty(
      name = "numberOfChannels"
  )
  int numberOfChannels();

  @JsProperty
  void setNumberOfChannels(int numberOfChannels);

  @JsProperty(
      name = "sampleRate"
  )
  float sampleRate();

  @JsProperty
  void setSampleRate(float sampleRate);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends OfflineAudioContextOptions {
    @JsOverlay
    @Nonnull
    default Builder length(final int length) {
      setLength( length );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder numberOfChannels(final int numberOfChannels) {
      setNumberOfChannels( numberOfChannels );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleRate(final float sampleRate) {
      setSampleRate( sampleRate );
      return this;
    }
  }
}
