package akasha.gpu;

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
    name = "GPUBindGroupLayoutEntry"
)
@ApiStatus.Experimental
public interface GPUBindGroupLayoutEntry {
  @JsOverlay
  @Nonnull
  static Builder create(final int binding, final int visibility) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).binding( binding ).visibility( visibility );
  }

  @JsProperty(
      name = "binding"
  )
  int binding();

  @JsProperty
  void setBinding(int binding);

  @JsProperty(
      name = "visibility"
  )
  int visibility();

  @JsProperty
  void setVisibility(int visibility);

  @JsProperty(
      name = "buffer"
  )
  GPUBufferBindingLayout buffer();

  @JsProperty
  void setBuffer(@Nonnull GPUBufferBindingLayout buffer);

  @JsProperty(
      name = "externalTexture"
  )
  GPUExternalTextureBindingLayout externalTexture();

  @JsProperty
  void setExternalTexture(@Nonnull GPUExternalTextureBindingLayout externalTexture);

  @JsProperty(
      name = "sampler"
  )
  GPUSamplerBindingLayout sampler();

  @JsProperty
  void setSampler(@Nonnull GPUSamplerBindingLayout sampler);

  @JsProperty(
      name = "storageTexture"
  )
  GPUStorageTextureBindingLayout storageTexture();

  @JsProperty
  void setStorageTexture(@Nonnull GPUStorageTextureBindingLayout storageTexture);

  @JsProperty(
      name = "texture"
  )
  GPUTextureBindingLayout texture();

  @JsProperty
  void setTexture(@Nonnull GPUTextureBindingLayout texture);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBindGroupLayoutEntry"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUBindGroupLayoutEntry {
    @JsOverlay
    @Nonnull
    default Builder binding(final int binding) {
      setBinding( binding );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder visibility(final int visibility) {
      setVisibility( visibility );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder buffer(@Nonnull final GPUBufferBindingLayout buffer) {
      setBuffer( buffer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder externalTexture(
        @Nonnull final GPUExternalTextureBindingLayout externalTexture) {
      setExternalTexture( externalTexture );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampler(@Nonnull final GPUSamplerBindingLayout sampler) {
      setSampler( sampler );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder storageTexture(@Nonnull final GPUStorageTextureBindingLayout storageTexture) {
      setStorageTexture( storageTexture );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder texture(@Nonnull final GPUTextureBindingLayout texture) {
      setTexture( texture );
      return this;
    }
  }
}
