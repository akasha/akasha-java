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
    name = "GPUImageCopyTexture"
)
@ApiStatus.Experimental
public interface GPUImageCopyTexture {
  @JsOverlay
  @Nonnull
  static Builder texture(@Nonnull final GPUTexture texture) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).texture( texture );
  }

  @JsProperty(
      name = "texture"
  )
  @JsNonNull
  GPUTexture texture();

  @JsProperty
  void setTexture(@JsNonNull GPUTexture texture);

  @JsProperty(
      name = "aspect"
  )
  @GPUTextureAspect
  String aspect();

  @JsProperty
  void setAspect(@GPUTextureAspect @JsNonNull String aspect);

  @JsProperty(
      name = "mipLevel"
  )
  int mipLevel();

  @JsProperty
  void setMipLevel(int mipLevel);

  @JsProperty(
      name = "origin"
  )
  GPUOrigin3D origin();

  @JsProperty
  void setOrigin(@JsNonNull GPUOrigin3D origin);

  @JsOverlay
  default void setOrigin(@Nonnull final JsArray<Double> origin) {
    setOrigin( GPUOrigin3D.of( origin ) );
  }

  @JsOverlay
  default void setOrigin(@Nonnull final double... origin) {
    setOrigin( GPUOrigin3D.of( origin ) );
  }

  @JsOverlay
  default void setOrigin(@Nonnull final GPUOrigin3DDict origin) {
    setOrigin( GPUOrigin3D.of( origin ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUImageCopyTexture"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUImageCopyTexture {
    @JsOverlay
    @Nonnull
    default Builder texture(@Nonnull final GPUTexture texture) {
      setTexture( texture );
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
    default Builder origin(@Nonnull final double... origin) {
      setOrigin( origin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder origin(@Nonnull final GPUOrigin3DDict origin) {
      setOrigin( origin );
      return this;
    }
  }
}
