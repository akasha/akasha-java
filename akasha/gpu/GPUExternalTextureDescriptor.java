package akasha.gpu;

import akasha.HTMLVideoElement;
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
    name = "GPUExternalTextureDescriptor"
)
@ApiStatus.Experimental
public interface GPUExternalTextureDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder source(@Nonnull final HTMLVideoElement source) {
    final Builder $gpuExternalTextureDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuExternalTextureDescriptor.setSource( source );
    return Js.uncheckedCast( $gpuExternalTextureDescriptor );
  }

  @JsProperty(
      name = "source"
  )
  @JsNonNull
  HTMLVideoElement source();

  @JsProperty
  void setSource(@JsNonNull HTMLVideoElement source);

  @JsProperty(
      name = "colorSpace"
  )
  @GPUPredefinedColorSpace
  String colorSpace();

  @JsProperty
  void setColorSpace(@GPUPredefinedColorSpace @JsNonNull String colorSpace);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUExternalTextureDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUExternalTextureDescriptor {
    @JsOverlay
    @Nonnull
    default Builder colorSpace(@GPUPredefinedColorSpace @Nonnull final String colorSpace) {
      setColorSpace( colorSpace );
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
