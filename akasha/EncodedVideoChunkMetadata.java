package akasha;

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
    name = "EncodedVideoChunkMetadata"
)
public interface EncodedVideoChunkMetadata {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "decoderConfig"
  )
  VideoDecoderConfig decoderConfig();

  @JsProperty
  void setDecoderConfig(@Nonnull VideoDecoderConfig decoderConfig);

  @JsProperty(
      name = "temporalLayerId"
  )
  int temporalLayerId();

  @JsProperty
  void setTemporalLayerId(int temporalLayerId);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EncodedVideoChunkMetadata"
  )
  interface Builder extends EncodedVideoChunkMetadata {
    @JsOverlay
    @Nonnull
    default Builder decoderConfig(@Nonnull final VideoDecoderConfig decoderConfig) {
      setDecoderConfig( decoderConfig );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder temporalLayerId(final int temporalLayerId) {
      setTemporalLayerId( temporalLayerId );
      return this;
    }
  }
}
