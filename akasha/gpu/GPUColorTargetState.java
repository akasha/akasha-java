package akasha.gpu;

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
    name = "GPUColorTargetState"
)
public interface GPUColorTargetState {
  @JsOverlay
  @Nonnull
  static Builder create(@GPUTextureFormat @Nonnull final String format) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).format( format );
  }

  @JsProperty(
      name = "blend"
  )
  GPUBlendState blend();

  @JsProperty
  void setBlend(@Nonnull GPUBlendState blend);

  @JsProperty(
      name = "format"
  )
  @GPUTextureFormat
  @Nonnull
  String format();

  @JsProperty
  void setFormat(@GPUTextureFormat @Nonnull String format);

  @JsProperty(
      name = "writeMask"
  )
  int writeMask();

  @JsProperty
  void setWriteMask(int writeMask);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUColorTargetState"
  )
  interface Builder extends GPUColorTargetState {
    @JsOverlay
    @Nonnull
    default Builder blend(@Nonnull final GPUBlendState blend) {
      setBlend( blend );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder format(@GPUTextureFormat @Nonnull final String format) {
      setFormat( format );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder writeMask(final int writeMask) {
      setWriteMask( writeMask );
      return this;
    }
  }
}
