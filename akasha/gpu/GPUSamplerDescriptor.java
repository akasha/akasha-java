package akasha.gpu;

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
    name = "GPUSamplerDescriptor"
)
@ApiStatus.Experimental
public interface GPUSamplerDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "addressModeU"
  )
  @GPUAddressMode
  String addressModeU();

  @JsProperty
  void setAddressModeU(@GPUAddressMode @JsNonNull String addressModeU);

  @JsProperty(
      name = "addressModeV"
  )
  @GPUAddressMode
  String addressModeV();

  @JsProperty
  void setAddressModeV(@GPUAddressMode @JsNonNull String addressModeV);

  @JsProperty(
      name = "addressModeW"
  )
  @GPUAddressMode
  String addressModeW();

  @JsProperty
  void setAddressModeW(@GPUAddressMode @JsNonNull String addressModeW);

  @JsProperty(
      name = "compare"
  )
  @GPUCompareFunction
  String compare();

  @JsProperty
  void setCompare(@GPUCompareFunction @JsNonNull String compare);

  @JsProperty(
      name = "lodMaxClamp"
  )
  float lodMaxClamp();

  @JsProperty
  void setLodMaxClamp(float lodMaxClamp);

  @JsProperty(
      name = "lodMinClamp"
  )
  float lodMinClamp();

  @JsProperty
  void setLodMinClamp(float lodMinClamp);

  @JsProperty(
      name = "magFilter"
  )
  @GPUFilterMode
  String magFilter();

  @JsProperty
  void setMagFilter(@GPUFilterMode @JsNonNull String magFilter);

  @JsProperty(
      name = "maxAnisotropy"
  )
  int maxAnisotropy();

  @JsProperty
  void setMaxAnisotropy(int maxAnisotropy);

  @JsProperty(
      name = "minFilter"
  )
  @GPUFilterMode
  String minFilter();

  @JsProperty
  void setMinFilter(@GPUFilterMode @JsNonNull String minFilter);

  @JsProperty(
      name = "mipmapFilter"
  )
  @GPUFilterMode
  String mipmapFilter();

  @JsProperty
  void setMipmapFilter(@GPUFilterMode @JsNonNull String mipmapFilter);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUSamplerDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUSamplerDescriptor {
    @JsOverlay
    @Nonnull
    default Builder addressModeU(@GPUAddressMode @Nonnull final String addressModeU) {
      setAddressModeU( addressModeU );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder addressModeV(@GPUAddressMode @Nonnull final String addressModeV) {
      setAddressModeV( addressModeV );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder addressModeW(@GPUAddressMode @Nonnull final String addressModeW) {
      setAddressModeW( addressModeW );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder compare(@GPUCompareFunction @Nonnull final String compare) {
      setCompare( compare );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder lodMaxClamp(final float lodMaxClamp) {
      setLodMaxClamp( lodMaxClamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder lodMinClamp(final float lodMinClamp) {
      setLodMinClamp( lodMinClamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder magFilter(@GPUFilterMode @Nonnull final String magFilter) {
      setMagFilter( magFilter );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder maxAnisotropy(final int maxAnisotropy) {
      setMaxAnisotropy( maxAnisotropy );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder minFilter(@GPUFilterMode @Nonnull final String minFilter) {
      setMinFilter( minFilter );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mipmapFilter(@GPUFilterMode @Nonnull final String mipmapFilter) {
      setMipmapFilter( mipmapFilter );
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
