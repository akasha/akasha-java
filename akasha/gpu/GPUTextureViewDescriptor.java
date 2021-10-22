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
    name = "GPUTextureViewDescriptor"
)
@ApiStatus.Experimental
public interface GPUTextureViewDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "arrayLayerCount"
  )
  int arrayLayerCount();

  @JsProperty
  void setArrayLayerCount(int arrayLayerCount);

  @JsProperty(
      name = "aspect"
  )
  @GPUTextureAspect
  String aspect();

  @JsProperty
  void setAspect(@GPUTextureAspect @JsNonNull String aspect);

  @JsProperty(
      name = "baseArrayLayer"
  )
  int baseArrayLayer();

  @JsProperty
  void setBaseArrayLayer(int baseArrayLayer);

  @JsProperty(
      name = "baseMipLevel"
  )
  int baseMipLevel();

  @JsProperty
  void setBaseMipLevel(int baseMipLevel);

  @JsProperty(
      name = "dimension"
  )
  @GPUTextureViewDimension
  String dimension();

  @JsProperty
  void setDimension(@GPUTextureViewDimension @JsNonNull String dimension);

  @JsProperty(
      name = "format"
  )
  @GPUTextureFormat
  String format();

  @JsProperty
  void setFormat(@GPUTextureFormat @JsNonNull String format);

  @JsProperty(
      name = "mipLevelCount"
  )
  int mipLevelCount();

  @JsProperty
  void setMipLevelCount(int mipLevelCount);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUTextureViewDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUTextureViewDescriptor {
    @JsOverlay
    @Nonnull
    default Builder arrayLayerCount(final int arrayLayerCount) {
      setArrayLayerCount( arrayLayerCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder aspect(@GPUTextureAspect @Nonnull final String aspect) {
      setAspect( aspect );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder baseArrayLayer(final int baseArrayLayer) {
      setBaseArrayLayer( baseArrayLayer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder baseMipLevel(final int baseMipLevel) {
      setBaseMipLevel( baseMipLevel );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder dimension(@GPUTextureViewDimension @Nonnull final String dimension) {
      setDimension( dimension );
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
    default Builder mipLevelCount(final int mipLevelCount) {
      setMipLevelCount( mipLevelCount );
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
