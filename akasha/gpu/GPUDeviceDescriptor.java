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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUDeviceDescriptor"
)
public interface GPUDeviceDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "requiredFeatures"
  )
  JsArray<String> requiredFeatures();

  @JsProperty
  void setRequiredFeatures(@Nonnull JsArray<String> requiredFeatures);

  @JsOverlay
  default void setRequiredFeatures(@Nonnull final String... requiredFeatures) {
    setRequiredFeatures( Js.<JsArray<String>>uncheckedCast( requiredFeatures ) );
  }

  @JsProperty(
      name = "requiredLimits"
  )
  JsPropertyMap<Double> requiredLimits();

  @JsProperty
  void setRequiredLimits(@Nonnull JsPropertyMap<Double> requiredLimits);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUDeviceDescriptor"
  )
  interface Builder extends GPUDeviceDescriptor {
    @JsOverlay
    @Nonnull
    default Builder requiredFeatures(@Nonnull final JsArray<String> requiredFeatures) {
      setRequiredFeatures( requiredFeatures );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder requiredFeatures(@Nonnull final String... requiredFeatures) {
      setRequiredFeatures( requiredFeatures );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder requiredLimits(@Nonnull final JsPropertyMap<Double> requiredLimits) {
      setRequiredLimits( requiredLimits );
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