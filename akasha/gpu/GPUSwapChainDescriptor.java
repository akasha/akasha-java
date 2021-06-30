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
    name = "GPUSwapChainDescriptor"
)
@ApiStatus.Experimental
public interface GPUSwapChainDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUDevice device,
      @GPUTextureFormat @Nonnull final String format) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).device( device ).format( format );
  }

  @JsProperty(
      name = "compositingAlphaMode"
  )
  @GPUCanvasCompositingAlphaMode
  String compositingAlphaMode();

  @JsProperty
  void setCompositingAlphaMode(@GPUCanvasCompositingAlphaMode @Nonnull String compositingAlphaMode);

  @JsProperty(
      name = "device"
  )
  @Nonnull
  GPUDevice device();

  @JsProperty
  void setDevice(@Nonnull GPUDevice device);

  @JsProperty(
      name = "format"
  )
  @GPUTextureFormat
  @Nonnull
  String format();

  @JsProperty
  void setFormat(@GPUTextureFormat @Nonnull String format);

  @JsProperty(
      name = "size"
  )
  GPUExtent3D size();

  @JsProperty
  void setSize(@Nonnull GPUExtent3D size);

  @JsOverlay
  default void setSize(@Nonnull final JsArray<Double> size) {
    setSize( GPUExtent3D.of( size ) );
  }

  @JsOverlay
  default void setSize(@Nonnull final double... size) {
    setSize( GPUExtent3D.of( size ) );
  }

  @JsOverlay
  default void setSize(@Nonnull final GPUExtent3DDict size) {
    setSize( GPUExtent3D.of( size ) );
  }

  @JsProperty(
      name = "usage"
  )
  int usage();

  @JsProperty
  void setUsage(int usage);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUSwapChainDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUSwapChainDescriptor {
    @JsOverlay
    @Nonnull
    default Builder compositingAlphaMode(
        @GPUCanvasCompositingAlphaMode @Nonnull final String compositingAlphaMode) {
      setCompositingAlphaMode( compositingAlphaMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder device(@Nonnull final GPUDevice device) {
      setDevice( device );
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
    default Builder size(@Nonnull final GPUExtent3D size) {
      setSize( size );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder size(@Nonnull final JsArray<Double> size) {
      setSize( size );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder size(@Nonnull final double... size) {
      setSize( size );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder size(@Nonnull final GPUExtent3DDict size) {
      setSize( size );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder usage(final int usage) {
      setUsage( usage );
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
