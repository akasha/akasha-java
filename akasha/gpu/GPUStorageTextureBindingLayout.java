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
    name = "GPUStorageTextureBindingLayout"
)
@ApiStatus.Experimental
public interface GPUStorageTextureBindingLayout {
  @JsOverlay
  @Nonnull
  static Builder format(@GPUTextureFormat @Nonnull final String format) {
    final Builder $gpuStorageTextureBindingLayout = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuStorageTextureBindingLayout.setFormat( format );
    return Js.uncheckedCast( $gpuStorageTextureBindingLayout );
  }

  @JsProperty(
      name = "access"
  )
  @GPUStorageTextureAccess
  String access();

  @JsProperty
  void setAccess(@GPUStorageTextureAccess @JsNonNull String access);

  @JsProperty(
      name = "format"
  )
  @GPUTextureFormat
  @JsNonNull
  String format();

  @JsProperty
  void setFormat(@GPUTextureFormat @JsNonNull String format);

  @JsProperty(
      name = "viewDimension"
  )
  @GPUTextureViewDimension
  String viewDimension();

  @JsProperty
  void setViewDimension(@GPUTextureViewDimension @JsNonNull String viewDimension);

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
    default Builder viewDimension(@GPUTextureViewDimension @Nonnull final String viewDimension) {
      setViewDimension( viewDimension );
      return this;
    }
  }
}
