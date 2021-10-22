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
    name = "GPUTextureDescriptor"
)
@ApiStatus.Experimental
public interface GPUTextureDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Step1 size(@Nonnull final GPUExtent3D size) {
    final Builder $gpuTextureDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuTextureDescriptor.setSize( size );
    return Js.uncheckedCast( $gpuTextureDescriptor );
  }

  @JsOverlay
  @Nonnull
  static Step1 size(@Nonnull final JsArray<Double> size) {
    final Builder $gpuTextureDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuTextureDescriptor.setSize( size );
    return Js.uncheckedCast( $gpuTextureDescriptor );
  }

  @JsOverlay
  @Nonnull
  static Step1 size(@Nonnull final GPUExtent3DDict size) {
    final Builder $gpuTextureDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuTextureDescriptor.setSize( size );
    return Js.uncheckedCast( $gpuTextureDescriptor );
  }

  @JsOverlay
  @Nonnull
  static Step1 size(@Nonnull final double... size) {
    final Builder $gpuTextureDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuTextureDescriptor.setSize( size );
    return Js.uncheckedCast( $gpuTextureDescriptor );
  }

  @JsProperty(
      name = "size"
  )
  @JsNonNull
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
      name = "dimension"
  )
  @GPUTextureDimension
  String dimension();

  @JsProperty
  void setDimension(@GPUTextureDimension @JsNonNull String dimension);

  @JsProperty(
      name = "mipLevelCount"
  )
  int mipLevelCount();

  @JsProperty
  void setMipLevelCount(int mipLevelCount);

  @JsProperty(
      name = "sampleCount"
  )
  int sampleCount();

  @JsProperty
  void setSampleCount(int sampleCount);

  @JsProperty(
      name = "format"
  )
  @GPUTextureFormat
  @JsNonNull
  String format();

  @JsProperty
  void setFormat(@GPUTextureFormat @JsNonNull String format);

  @JsProperty(
      name = "usage"
  )
  @GPUTextureUsageFlags
  @JsNonNull
  int usage();

  @JsProperty
  void setUsage(@GPUTextureUsageFlags @JsNonNull int usage);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUTextureDescriptor"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 format(@GPUTextureFormat @Nonnull String format) {
      Js.<GPUTextureDescriptor>uncheckedCast( this ).setFormat( format );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUTextureDescriptor"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder usage(@GPUTextureUsageFlags int usage) {
      Js.<GPUTextureDescriptor>uncheckedCast( this ).setUsage( usage );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUTextureDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUTextureDescriptor {
    @JsOverlay
    @Nonnull
    default Builder dimension(@GPUTextureDimension @Nonnull final String dimension) {
      setDimension( dimension );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mipLevelCount(final int mipLevelCount) {
      setMipLevelCount( mipLevelCount );
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
