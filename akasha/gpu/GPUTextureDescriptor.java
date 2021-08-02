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
    name = "GPUTextureDescriptor"
)
@ApiStatus.Experimental
public interface GPUTextureDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUExtent3D size,
      @GPUTextureFormat @Nonnull final String format, @GPUTextureUsageFlags final int usage) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).size( size ).format( format ).usage( usage );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<Double> size,
      @GPUTextureFormat @Nonnull final String format, @GPUTextureUsageFlags final int usage) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).size( size ).format( format ).usage( usage );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final double[] size,
      @GPUTextureFormat @Nonnull final String format, @GPUTextureUsageFlags final int usage) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).size( size ).format( format ).usage( usage );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUExtent3DDict size,
      @GPUTextureFormat @Nonnull final String format, @GPUTextureUsageFlags final int usage) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).size( size ).format( format ).usage( usage );
  }

  @JsProperty(
      name = "size"
  )
  @Nonnull
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
      name = "dimension"
  )
  @GPUTextureDimension
  String dimension();

  @JsProperty
  void setDimension(@GPUTextureDimension @Nonnull String dimension);

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
  @Nonnull
  String format();

  @JsProperty
  void setFormat(@GPUTextureFormat @Nonnull String format);

  @JsProperty(
      name = "usage"
  )
  @GPUTextureUsageFlags
  @Nonnull
  int usage();

  @JsProperty
  void setUsage(@GPUTextureUsageFlags @Nonnull int usage);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUTextureDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUTextureDescriptor {
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
    default Builder format(@GPUTextureFormat @Nonnull final String format) {
      setFormat( format );
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
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }
  }
}
