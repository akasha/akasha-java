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
    name = "VideoDecoderSupport"
)
public interface VideoDecoderSupport {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "config"
  )
  VideoDecoderConfig config();

  @JsProperty
  void setConfig(@Nonnull VideoDecoderConfig config);

  @JsProperty(
      name = "supported"
  )
  boolean supported();

  @JsProperty
  void setSupported(boolean supported);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoDecoderSupport"
  )
  interface Builder extends VideoDecoderSupport {
    @JsOverlay
    @Nonnull
    default Builder config(@Nonnull final VideoDecoderConfig config) {
      setConfig( config );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder supported(final boolean supported) {
      setSupported( supported );
      return this;
    }
  }
}
