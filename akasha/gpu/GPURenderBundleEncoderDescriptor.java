package akasha.gpu;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPURenderBundleEncoderDescriptor"
)
@ApiStatus.Experimental
public interface GPURenderBundleEncoderDescriptor extends GPURenderPassLayout {
  @JsOverlay
  @Nonnull
  static Builder colorFormats(@Nonnull final JsArray<String> colorFormats) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).colorFormats( colorFormats );
  }

  @JsOverlay
  @Nonnull
  static Builder colorFormats(@Nonnull final String... colorFormats) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).colorFormats( colorFormats );
  }

  @JsProperty(
      name = "depthReadOnly"
  )
  boolean depthReadOnly();

  @JsProperty
  void setDepthReadOnly(boolean depthReadOnly);

  @JsProperty(
      name = "stencilReadOnly"
  )
  boolean stencilReadOnly();

  @JsProperty
  void setStencilReadOnly(boolean stencilReadOnly);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderBundleEncoderDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPURenderBundleEncoderDescriptor {
    @JsOverlay
    @Nonnull
    default Builder depthReadOnly(final boolean depthReadOnly) {
      setDepthReadOnly( depthReadOnly );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilReadOnly(final boolean stencilReadOnly) {
      setStencilReadOnly( stencilReadOnly );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder colorFormats(@Nonnull final JsArray<String> colorFormats) {
      setColorFormats( colorFormats );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder colorFormats(@Nonnull final String... colorFormats) {
      setColorFormats( colorFormats );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthStencilFormat(@GPUTextureFormat @Nonnull final String depthStencilFormat) {
      setDepthStencilFormat( depthStencilFormat );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleCount(final int sampleCount) {
      setSampleCount( sampleCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }
  }
}
