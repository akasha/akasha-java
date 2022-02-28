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
    name = "GPUImageCopyExternalImage"
)
@ApiStatus.Experimental
public interface GPUImageCopyExternalImage {
  @JsOverlay
  @Nonnull
  static Builder source(@Nonnull final GPUImageCopyExternalImageSource source) {
    final Builder $gpuImageCopyExternalImage = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuImageCopyExternalImage.setSource( source );
    return Js.uncheckedCast( $gpuImageCopyExternalImage );
  }

  @JsProperty(
      name = "source"
  )
  @JsNonNull
  GPUImageCopyExternalImageSource source();

  @JsProperty
  void setSource(@JsNonNull GPUImageCopyExternalImageSource source);

  @JsProperty(
      name = "flipY"
  )
  boolean flipY();

  @JsProperty
  void setFlipY(boolean flipY);

  @JsProperty(
      name = "origin"
  )
  GPUOrigin2D origin();

  @JsProperty
  void setOrigin(@JsNonNull GPUOrigin2D origin);

  @JsOverlay
  default void setOrigin(@Nonnull final JsArray<Double> origin) {
    setOrigin( GPUOrigin2D.of( origin ) );
  }

  @JsOverlay
  default void setOrigin(@Nonnull final GPUOrigin2DDict origin) {
    setOrigin( GPUOrigin2D.of( origin ) );
  }

  @JsOverlay
  default void setOrigin(@Nonnull final double... origin) {
    setOrigin( GPUOrigin2D.of( origin ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUImageCopyExternalImage"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUImageCopyExternalImage {
    @JsOverlay
    @Nonnull
    default Builder flipY(final boolean flipY) {
      setFlipY( flipY );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder origin(@Nonnull final GPUOrigin2D origin) {
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
    default Builder origin(@Nonnull final GPUOrigin2DDict origin) {
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
