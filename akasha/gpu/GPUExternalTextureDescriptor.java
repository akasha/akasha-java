package akasha.gpu;

import akasha.HTMLVideoElement;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUExternalTextureDescriptor"
)
public interface GPUExternalTextureDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final HTMLVideoElement source) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).source( source );
  }

  @JsProperty(
      name = "colorSpace"
  )
  @GPUPredefinedColorSpace
  String colorSpace();

  @JsProperty
  void setColorSpace(@GPUPredefinedColorSpace @Nonnull String colorSpace);

  @JsProperty(
      name = "source"
  )
  @Nonnull
  HTMLVideoElement source();

  @JsProperty
  void setSource(@Nonnull HTMLVideoElement source);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUExternalTextureDescriptor"
  )
  interface Builder extends GPUExternalTextureDescriptor {
    @JsOverlay
    @Nonnull
    default Builder colorSpace(@GPUPredefinedColorSpace @Nonnull final String colorSpace) {
      setColorSpace( colorSpace );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder source(@Nonnull final HTMLVideoElement source) {
      setSource( source );
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
