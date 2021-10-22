package akasha.codecs;

import akasha.core.BufferSource;
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
    name = "EncodedVideoChunkMetadata"
)
public interface EncodedVideoChunkMetadata {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "alphaSideData"
  )
  BufferSource alphaSideData();

  @JsProperty
  void setAlphaSideData(@JsNonNull BufferSource alphaSideData);

  @JsProperty(
      name = "decoderConfig"
  )
  VideoDecoderConfig decoderConfig();

  @JsProperty
  void setDecoderConfig(@JsNonNull VideoDecoderConfig decoderConfig);

  @JsProperty(
      name = "svc"
  )
  SvcOutputMetadata svc();

  @JsProperty
  void setSvc(@JsNonNull SvcOutputMetadata svc);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EncodedVideoChunkMetadata"
  )
  interface Builder extends EncodedVideoChunkMetadata {
    @JsOverlay
    @Nonnull
    default Builder alphaSideData(@Nonnull final BufferSource alphaSideData) {
      setAlphaSideData( alphaSideData );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder decoderConfig(@Nonnull final VideoDecoderConfig decoderConfig) {
      setDecoderConfig( decoderConfig );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder svc(@Nonnull final SvcOutputMetadata svc) {
      setSvc( svc );
      return this;
    }
  }
}
