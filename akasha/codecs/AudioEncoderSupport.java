package akasha.codecs;

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
    name = "AudioEncoderSupport"
)
public interface AudioEncoderSupport {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "config"
  )
  AudioEncoderConfig config();

  @JsProperty
  void setConfig(@JsNonNull AudioEncoderConfig config);

  @JsProperty(
      name = "supported"
  )
  boolean supported();

  @JsProperty
  void setSupported(boolean supported);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioEncoderSupport"
  )
  interface Builder extends AudioEncoderSupport {
    @JsOverlay
    @Nonnull
    default Builder config(@Nonnull final AudioEncoderConfig config) {
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
