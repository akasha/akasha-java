package akasha.gpu;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "GPUCanvasConfiguration"
)
@ApiStatus.Experimental
public interface GPUCanvasConfiguration {
  @JsOverlay
  @Nonnull
  static Step1 device(@Nonnull final GPUDevice device) {
    final Builder $gpuCanvasConfiguration = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuCanvasConfiguration.setDevice( device );
    return Js.uncheckedCast( $gpuCanvasConfiguration );
  }

  @JsProperty(
      name = "device"
  )
  @JsNonNull
  GPUDevice device();

  @JsProperty
  void setDevice(@JsNonNull GPUDevice device);

  @JsProperty(
      name = "format"
  )
  @GPUTextureFormat
  @JsNonNull
  String format();

  @JsProperty
  void setFormat(@GPUTextureFormat @JsNonNull String format);

  @JsProperty(
      name = "colorSpace"
  )
  @GPUPredefinedColorSpace
  String colorSpace();

  @JsProperty
  void setColorSpace(@GPUPredefinedColorSpace @JsNonNull String colorSpace);

  @JsProperty(
      name = "compositingAlphaMode"
  )
  @GPUCanvasCompositingAlphaMode
  String compositingAlphaMode();

  @JsProperty
  void setCompositingAlphaMode(
      @GPUCanvasCompositingAlphaMode @JsNonNull String compositingAlphaMode);

  @JsProperty(
      name = "size"
  )
  GPUExtent3D size();

  @JsProperty
  void setSize(@JsNonNull GPUExtent3D size);

  @JsOverlay
  default void setSize(@Nonnull final JsArray<Double> size) {
    setSize( GPUExtent3D.of( size ) );
  }

  @JsOverlay
  default void setSize(@Nonnull final GPUExtent3DDict size) {
    setSize( GPUExtent3D.of( size ) );
  }

  @JsOverlay
  default void setSize(@Nonnull final double... size) {
    setSize( GPUExtent3D.of( size ) );
  }

  @JsProperty(
      name = "usage"
  )
  @GPUTextureUsageFlags
  int usage();

  @JsProperty
  void setUsage(@GPUTextureUsageFlags @JsNonNull int usage);

  @JsProperty(
      name = "viewFormats"
  )
  JsArray<String> viewFormats();

  @JsProperty
  void setViewFormats(@JsNonNull JsArray<String> viewFormats);

  @JsOverlay
  default void setViewFormats(@Nonnull final String... viewFormats) {
    setViewFormats( Js.<JsArray<String>>uncheckedCast( viewFormats ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUCanvasConfiguration"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder format(@GPUTextureFormat @Nonnull String format) {
      Js.<GPUCanvasConfiguration>uncheckedCast( this ).setFormat( format );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUCanvasConfiguration"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUCanvasConfiguration {
    @JsOverlay
    @Nonnull
    default Builder colorSpace(@GPUPredefinedColorSpace @Nonnull final String colorSpace) {
      setColorSpace( colorSpace );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder compositingAlphaMode(
        @GPUCanvasCompositingAlphaMode @Nonnull final String compositingAlphaMode) {
      setCompositingAlphaMode( compositingAlphaMode );
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
    default Builder size(@Nonnull final GPUExtent3DDict size) {
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
    default Builder usage(@GPUTextureUsageFlags final int usage) {
      setUsage( usage );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder viewFormats(@Nonnull final JsArray<String> viewFormats) {
      setViewFormats( viewFormats );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder viewFormats(@Nonnull final String... viewFormats) {
      setViewFormats( viewFormats );
      return this;
    }
  }
}
