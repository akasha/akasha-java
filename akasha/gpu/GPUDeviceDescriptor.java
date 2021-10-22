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
    name = "GPUDeviceDescriptor"
)
@ApiStatus.Experimental
public interface GPUDeviceDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "requiredFeatures"
  )
  JsArray<String> requiredFeatures();

  @JsProperty
  void setRequiredFeatures(@JsNonNull JsArray<String> requiredFeatures);

  @JsOverlay
  default void setRequiredFeatures(@Nonnull final String... requiredFeatures) {
    setRequiredFeatures( Js.<JsArray<String>>uncheckedCast( requiredFeatures ) );
  }

  @JsProperty(
      name = "requiredLimits"
  )
  JsPropertyMap<Double> requiredLimits();

  @JsProperty
  void setRequiredLimits(@JsNonNull JsPropertyMap<Double> requiredLimits);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUDeviceDescriptor"
  )
  @ApiStatus.Experimental
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
