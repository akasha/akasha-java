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
    name = "GPUStorageTextureBindingLayout"
)
@ApiStatus.Experimental
public interface GPUStorageTextureBindingLayout {
  @JsOverlay
  @Nonnull
  static Builder create(@GPUStorageTextureAccess @Nonnull final String access,
      @GPUTextureFormat @Nonnull final String format) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).access( access ).format( format );
  }

  @JsProperty(
      name = "access"
  )
  @GPUStorageTextureAccess
  @Nonnull
  String access();

  @JsProperty
  void setAccess(@GPUStorageTextureAccess @Nonnull String access);

  @JsProperty(
      name = "format"
  )
  @GPUTextureFormat
  @Nonnull
  String format();

  @JsProperty
  void setFormat(@GPUTextureFormat @Nonnull String format);

  @JsProperty(
      name = "viewDimension"
  )
  @GPUTextureViewDimension
  String viewDimension();

  @JsProperty
  void setViewDimension(@GPUTextureViewDimension @Nonnull String viewDimension);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUStorageTextureBindingLayout"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUStorageTextureBindingLayout {
    @JsOverlay
    @Nonnull
    default Builder access(@GPUStorageTextureAccess @Nonnull final String access) {
      setAccess( access );
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
    default Builder viewDimension(@GPUTextureViewDimension @Nonnull final String viewDimension) {
      setViewDimension( viewDimension );
      return this;
    }
  }
}
