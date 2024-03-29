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
    name = "GPUImageCopyTextureTagged"
)
@ApiStatus.Experimental
public interface GPUImageCopyTextureTagged extends GPUImageCopyTexture {
  @JsOverlay
  @Nonnull
  static Builder texture(@Nonnull final GPUTexture texture) {
    final Builder $gpuImageCopyTextureTagged = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuImageCopyTextureTagged.setTexture( texture );
    return Js.uncheckedCast( $gpuImageCopyTextureTagged );
  }

  @JsProperty(
      name = "colorSpace"
  )
  @GPUPredefinedColorSpace
  String colorSpace();

  @JsProperty
  void setColorSpace(@GPUPredefinedColorSpace @JsNonNull String colorSpace);

  @JsProperty(
      name = "premultipliedAlpha"
  )
  boolean premultipliedAlpha();

  @JsProperty
  void setPremultipliedAlpha(boolean premultipliedAlpha);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUImageCopyTextureTagged"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUImageCopyTextureTagged {
    @JsOverlay
    @Nonnull
    default Builder colorSpace(@GPUPredefinedColorSpace @Nonnull final String colorSpace) {
      setColorSpace( colorSpace );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder premultipliedAlpha(final boolean premultipliedAlpha) {
      setPremultipliedAlpha( premultipliedAlpha );
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
    default Builder mipLevel(final int mipLevel) {
      setMipLevel( mipLevel );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder origin(@Nonnull final GPUOrigin3D origin) {
      setOrigin( origin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder origin(@Nonnull final JsArray<Double> origin) {
      setOrigin( origin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder origin(@Nonnull final GPUOrigin3DDict origin) {
      setOrigin( origin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder origin(@Nonnull final double... origin) {
      setOrigin( origin );
      return this;
    }
  }
}
