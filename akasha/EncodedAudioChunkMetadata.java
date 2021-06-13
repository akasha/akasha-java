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
    name = "EncodedAudioChunkMetadata"
)
public interface EncodedAudioChunkMetadata {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "decoderConfig"
  )
  AudioDecoderConfig decoderConfig();

  @JsProperty
  void setDecoderConfig(@Nonnull AudioDecoderConfig decoderConfig);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EncodedAudioChunkMetadata"
  )
  interface Builder extends EncodedAudioChunkMetadata {
    @JsOverlay
    @Nonnull
    default Builder decoderConfig(@Nonnull final AudioDecoderConfig decoderConfig) {
      setDecoderConfig( decoderConfig );
      return this;
    }
  }
}
