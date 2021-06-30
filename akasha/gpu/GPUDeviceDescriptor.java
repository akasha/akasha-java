package akasha.gpu;

import akasha.lang.JsArray;
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
    name = "GPUDeviceDescriptor"
)
@ApiStatus.Experimental
public interface GPUDeviceDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "nonGuaranteedFeatures"
  )
  JsArray<String> nonGuaranteedFeatures();

  @JsProperty
  void setNonGuaranteedFeatures(@Nonnull JsArray<String> nonGuaranteedFeatures);

  @JsOverlay
  default void setNonGuaranteedFeatures(@Nonnull final String... nonGuaranteedFeatures) {
    setNonGuaranteedFeatures( Js.<JsArray<String>>uncheckedCast( nonGuaranteedFeatures ) );
  }

  @JsProperty(
      name = "nonGuaranteedLimits"
  )
  JsPropertyMap<Double> nonGuaranteedLimits();

  @JsProperty
  void setNonGuaranteedLimits(@Nonnull JsPropertyMap<Double> nonGuaranteedLimits);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUDeviceDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUDeviceDescriptor {
    @JsOverlay
    @Nonnull
    default Builder nonGuaranteedFeatures(@Nonnull final JsArray<String> nonGuaranteedFeatures) {
      setNonGuaranteedFeatures( nonGuaranteedFeatures );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder nonGuaranteedFeatures(@Nonnull final String... nonGuaranteedFeatures) {
      setNonGuaranteedFeatures( nonGuaranteedFeatures );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder nonGuaranteedLimits(@Nonnull final JsPropertyMap<Double> nonGuaranteedLimits) {
      setNonGuaranteedLimits( nonGuaranteedLimits );
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
