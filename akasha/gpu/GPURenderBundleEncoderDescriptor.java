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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPURenderBundleEncoderDescriptor"
)
public interface GPURenderBundleEncoderDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<String> colorFormats) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).colorFormats( colorFormats );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String[] colorFormats) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).colorFormats( colorFormats );
  }

  @JsProperty(
      name = "colorFormats"
  )
  @Nonnull
  JsArray<String> colorFormats();

  @JsProperty
  void setColorFormats(@Nonnull JsArray<String> colorFormats);

  @JsOverlay
  default void setColorFormats(@Nonnull final String... colorFormats) {
    setColorFormats( Js.<JsArray<String>>uncheckedCast( colorFormats ) );
  }

  @JsProperty(
      name = "depthStencilFormat"
  )
  @GPUTextureFormat
  String depthStencilFormat();

  @JsProperty
  void setDepthStencilFormat(@GPUTextureFormat @Nonnull String depthStencilFormat);

  @JsProperty(
      name = "sampleCount"
  )
  int sampleCount();

  @JsProperty
  void setSampleCount(int sampleCount);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderBundleEncoderDescriptor"
  )
  interface Builder extends GPURenderBundleEncoderDescriptor {
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
