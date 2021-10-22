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
    name = "GPUBindGroupLayoutEntry"
)
@ApiStatus.Experimental
public interface GPUBindGroupLayoutEntry {
  @JsOverlay
  @Nonnull
  static Step1 binding(final int binding) {
    final Builder $gpuBindGroupLayoutEntry = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuBindGroupLayoutEntry.setBinding( binding );
    return Js.uncheckedCast( $gpuBindGroupLayoutEntry );
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
  @GPUShaderStageFlags
  @JsNonNull
  int visibility();

  @JsProperty
  void setVisibility(@GPUShaderStageFlags @JsNonNull int visibility);

  @JsProperty(
      name = "buffer"
  )
  GPUBufferBindingLayout buffer();

  @JsProperty
  void setBuffer(@JsNonNull GPUBufferBindingLayout buffer);

  @JsProperty(
      name = "externalTexture"
  )
  GPUExternalTextureBindingLayout externalTexture();

  @JsProperty
  void setExternalTexture(@JsNonNull GPUExternalTextureBindingLayout externalTexture);

  @JsProperty(
      name = "sampler"
  )
  GPUSamplerBindingLayout sampler();

  @JsProperty
  void setSampler(@JsNonNull GPUSamplerBindingLayout sampler);

  @JsProperty(
      name = "storageTexture"
  )
  GPUStorageTextureBindingLayout storageTexture();

  @JsProperty
  void setStorageTexture(@JsNonNull GPUStorageTextureBindingLayout storageTexture);

  @JsProperty(
      name = "texture"
  )
  GPUTextureBindingLayout texture();

  @JsProperty
  void setTexture(@JsNonNull GPUTextureBindingLayout texture);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBindGroupLayoutEntry"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder visibility(@GPUShaderStageFlags int visibility) {
      Js.<GPUBindGroupLayoutEntry>uncheckedCast( this ).setVisibility( visibility );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBindGroupLayoutEntry"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUBindGroupLayoutEntry {
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
