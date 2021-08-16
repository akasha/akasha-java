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
    name = "AudioDecoderSupport"
)
public interface AudioDecoderSupport {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "config"
  )
  AudioDecoderConfig config();

  @JsProperty
  void setConfig(@Nonnull AudioDecoderConfig config);

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
      name = "AudioDecoderSupport"
  )
  interface Builder extends AudioDecoderSupport {
    @JsOverlay
    @Nonnull
    default Builder config(@Nonnull final AudioDecoderConfig config) {
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