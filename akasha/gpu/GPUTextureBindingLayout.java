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
    name = "GPUTextureBindingLayout"
)
@ApiStatus.Experimental
public interface GPUTextureBindingLayout {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "multisampled"
  )
  boolean multisampled();

  @JsProperty
  void setMultisampled(boolean multisampled);

  @JsProperty(
      name = "sampleType"
  )
  @GPUTextureSampleType
  String sampleType();

  @JsProperty
  void setSampleType(@GPUTextureSampleType @JsNonNull String sampleType);

  @JsProperty(
      name = "viewDimension"
  )
  @GPUTextureViewDimension
  String viewDimension();

  @JsProperty
  void setViewDimension(@GPUTextureViewDimension @JsNonNull String viewDimension);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUTextureBindingLayout"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUTextureBindingLayout {
    @JsOverlay
    @Nonnull
    default Builder multisampled(final boolean multisampled) {
      setMultisampled( multisampled );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleType(@GPUTextureSampleType @Nonnull final String sampleType) {
      setSampleType( sampleType );
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
