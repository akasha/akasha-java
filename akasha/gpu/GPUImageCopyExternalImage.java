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
  static Builder create(@Nonnull final GPUImageCopyExternalImageSource source) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).source( source );
  }

  @JsProperty(
      name = "source"
  )
  @JsNonNull
  GPUImageCopyExternalImageSource source();

  @JsProperty
  void setSource(@JsNonNull GPUImageCopyExternalImageSource source);

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
  default void setOrigin(@Nonnull final double... origin) {
    setOrigin( GPUOrigin2D.of( origin ) );
  }

  @JsOverlay
  default void setOrigin(@Nonnull final GPUOrigin2DDict origin) {
    setOrigin( GPUOrigin2D.of( origin ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUImageCopyExternalImage"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUImageCopyExternalImage {
    @JsOverlay
    @Nonnull
    default Builder source(@Nonnull final GPUImageCopyExternalImageSource source) {
      setSource( source );
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
    default Builder origin(@Nonnull final double... origin) {
      setOrigin( origin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder origin(@Nonnull final GPUOrigin2DDict origin) {
      setOrigin( origin );
      return this;
    }
  }
}
